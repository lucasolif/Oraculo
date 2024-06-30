
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.Checklist;
import model.Data;
import model.Pessoa;
import model.Endereco;
import model.Entidades;
import model.OrdemServico;
import model.Produto;
import model.Servico;
import model.Unidades;
import model.Usuario;
import model.Veiculo;
import model.Vendas;




public class OrdemServicoDao {
    
    VendasDao vendaDao = new VendasDao();
    
    //Método para cadastrar a OS
    public void cadastrarOs(OrdemServico os){
        
        gerarCodAssociacao(os); //Chama o método que insere a data na tabela de assosiação, e gera o código de associacao.
        int codAssoc = buscarUltimoCodAssociacao();  //Chama o método que pega o último código de assosiação
        
        inserirChecklistOs(os,codAssoc);//Chamando método que inseri os dados do checklist na tabela
        int codCheck = buscarCodChecklist();
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "INSERT INTO os (IdAssociacao,Cliente,Status,DataAbertura,Observacao,Tecnico,Veiculo,CorVeiculo,PlacaVeiculo,AnoVeiculo,MarcaVeiculo,KMVeiculo,ChassiVeiculo,CRLVVeiculo,Prioridade,Checklist,Produtos,Servicos) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);    

            ps.setInt(1, codAssoc);
            ps.setInt(2, os.getCliente().getCodigo());
            ps.setString(3,os.getStatus());
            ps.setString(4,os.getDataAbertura());
            ps.setString(5,os.getObservacao());
            ps.setInt(6, os.getTecnico().getCodigo());
            ps.setString(7,os.getVeiculo().getNomeVeiculo());
            ps.setString(8,os.getVeiculo().getCorVeiculo());
            ps.setString(9,os.getVeiculo().getPlacaVeiculo());
            ps.setString(10,os.getVeiculo().getAnoVeiculo());
            ps.setString(11,os.getVeiculo().getMarcaVeiculo());
            ps.setString(12,os.getVeiculo().getKmVeiculo());
            ps.setString(13,os.getVeiculo().getChassiVeiculo());
            ps.setString(14,os.getVeiculo().getCrlvVeiculo());
            ps.setString(15,os.getPrioridadeOS());
            ps.setInt(16,codCheck);
            ps.setInt(17,codAssoc);
            ps.setInt(18,codAssoc);

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS foi aberta", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace(); //Exceção caso o produto não seja adicionado por algum erro
            JOptionPane.showMessageDialog(null, "Erro ao tentar abrir a OS", "Erro", JOptionPane.ERROR_MESSAGE);
        } 

    }
    
    //Método para alterar a OS
    public void alterarOs(OrdemServico os){
              
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE os SET Cliente=?,Status=?,Observacao=?,TotalProdutos=?,TotalServicos=?,Tecnico=?,Veiculo=?,CorVeiculo=?,PlacaVeiculo=?,AnoVeiculo=?,MarcaVeiculo=?,KMVeiculo=?,ChassiVeiculo=?,CRLVVeiculo=?,Prioridade=?" + " WHERE NumeroOS=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, os.getCliente().getCodigo());
            ps.setString(2, os.getStatus());
            ps.setString(3, os.getObservacao());
            ps.setDouble(4, os.getTotalProdutos());
            ps.setDouble(5, os.getTotalServicos());
            ps.setInt(6, os.getTecnico().getCodigo());
            ps.setString(7, os.getVeiculo().getNomeVeiculo());
            ps.setString(8, os.getVeiculo().getCorVeiculo());
            ps.setString(9, os.getVeiculo().getPlacaVeiculo());
            ps.setString(10, os.getVeiculo().getAnoVeiculo());
            ps.setString(11, os.getVeiculo().getMarcaVeiculo());
            ps.setString(12, os.getVeiculo().getKmVeiculo());
            ps.setString(13, os.getVeiculo().getChassiVeiculo());
            ps.setString(14, os.getVeiculo().getCrlvVeiculo());
            ps.setString(15, os.getPrioridadeOS());
            ps.setInt(16, os.getNumOS());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS de N°"+os.getNumOS()+" alterada com sucesso" , "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar os dados da OS de N° "+os.getNumOS(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        adicionarAlterarProdutosOs(os.getProdutos(), os.getCodAssociacao()); //Metodo para alterar os produtos
        adicionarAlterarServicosOs(os.getServicos(), os.getCodAssociacao()); //Método para alterar os serviços
        alterarChecklist(os.getChecklist()); //Método para alterar alguns dados do checklist
    }
    
    //Método para excluir OS
    public void excluirOs(OrdemServico os){
   
        Connection conexao = new Conexao().iniciarConexao();
        
        try{
            String sqlServ = "DELETE FROM servicos_os WHERE IdAssociacao="+os.getCodAssociacao();
            String sqlProd = "DELETE FROM produtos_os WHERE IdAssociacao="+os.getCodAssociacao();
            String sqlCheck = "DELETE FROM checklist WHERE IdAssociacao="+os.getCodAssociacao();
            String sqlAssoc = "DELETE FROM associacao_os WHERE IdAssociacao="+os.getCodAssociacao();
            String sqlOs = "DELETE FROM os WHERE IdAssociacao="+os.getCodAssociacao();
            
            java.sql.Statement stmt = conexao.createStatement();
            
            stmt.addBatch(sqlServ);
            stmt.addBatch(sqlProd);
            stmt.addBatch(sqlCheck);
            stmt.addBatch(sqlAssoc);
            stmt.addBatch(sqlOs);
            
            stmt.executeBatch();
            stmt.clearBatch();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS de N° "+os.getNumOS()+" excluída com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir OS N° "+os.getNumOS(), "Erro", JOptionPane.ERROR_MESSAGE);
        }  
        
    }
    
    //Fechamento da OS
    public void fechamentoOs(OrdemServico os){
        
        Connection conexao = new Conexao().iniciarConexao();
        
        try{
            String sqlOs = "UPDATE os SET Status=?,DataFechamento=? WHERE NumeroOS=?";
            PreparedStatement ps = conexao.prepareStatement(sqlOs);

            
            ps.setString(1, os.getStatus());
            ps.setString(2, os.getDataFechamento());
            ps.setInt(3, os.getNumOS());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS de N° "+os.getNumOS()+" fechada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar fechar OS de N° "+os.getNumOS(), "Erro", JOptionPane.ERROR_MESSAGE);
        }  
        
       vendaDao.adicionarVendaOs(os.getVenda(), os.getNumOS()); //Chamando método que gera a venda a partir da OS
       saidaProdutoOs(os); //Chamando método para movimentar o produto da OS
    }
    
    //Cancelamento OS
    public void cancelarOs(OrdemServico os){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE os SET Status=?,DataCancelamento=?" + " WHERE NumeroOS=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, os.getStatus());
            ps.setString(2, os.getDataCancelamento());
            ps.setInt(3, os.getNumOS());
           
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS de N°"+os.getNumOS()+" cancelada com sucesso" , "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cancelar os dados da OS de N° "+os.getNumOS(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Méotod para dar saída dos produtos na OS
    public void saidaProdutoOs(OrdemServico os){
        //Conexao com o banco de dados
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM estoque WHERE CodigoProduto=? AND CodigoEstoque=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        MovimentoEstoqueDao movEstoqueDao = new MovimentoEstoqueDao();
        Data data = new Data();
        String dataAtual = data.conversaoData();
 
        for(Produto prod : os.getProdutos()){
            try{
                ps = conexao.prepareStatement(sql);
                ps.setInt(1, prod.getCodigo());
                ps.setInt(2, os.getVenda().getEstoque().getCodigo());
                rs = ps.executeQuery();


                if(!rs.next()){//Verificando se o produto não existe na tabela estoque
                    int confirm = JOptionPane.showConfirmDialog(null,"Você não tem o produto "+prod.getDescricao()+" no estoque,  seu estoque ficará negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION){
                        movEstoqueDao.adicionarProdutoEstoque(prod, os.getVenda().getEstoque(), -prod.getQuantidade());
                    }else if(confirm == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                        return;
                    }
                }else{
                    //Verificando se o saldo é 0 ou menor que a quantidade que será movimentada
                    if(rs.getInt("Quantidade") == 0 || prod.getQuantidade() > rs.getInt("Quantidade")){
                        int confirm = JOptionPane.showConfirmDialog(null,"O produto "+prod.getDescricao()+" não tem a quantidade solicitada, seu estoque ficará negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                        if(confirm == JOptionPane.YES_OPTION){
                            movEstoqueDao.alterarProdutoEstoque(prod, os.getVenda().getEstoque(), rs.getInt("Quantidade") - prod.getQuantidade());
                        }else if(confirm == JOptionPane.NO_OPTION){
                            JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                            return;
                        }
                    }
                    else{ //Realizando a operação quando o saldo não for  menor que a quantidade ou zerado
                        movEstoqueDao.alterarProdutoEstoque(prod, os.getVenda().getEstoque(), rs.getInt("Quantidade") - prod.getQuantidade());
                    }
                }   
                
                rs.close();
                ps.close();


            }catch(SQLException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao tentar movimentar o produto", "Erro", JOptionPane.ERROR_MESSAGE);
            }          

        }
        
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //Consultar um única OS
    public OrdemServico consultarOs(String os){
        
        PessoasDao pessoaDao = new PessoasDao();
        UsuarioDao usuarioDao = new UsuarioDao();
        OrdemServico ordemServico = null;
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;

        if(os.length() >= 0){
            if(verificarNumero(os)){
                sql = "SELECT * FROM os WHERE NumeroOS LIKE ?";
            }else{
                sql = "SELECT * FROM os WHERE Cliente LIKE ?";
            }
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + os + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                List<Produto> listaProduto = consultarProdutosOs(rs.getInt("Produtos"));
                List<Servico> listaServico = consultarServicoOs(rs.getInt("Servicos"));
                Checklist checklist = consultarChecklistOS(rs.getInt("Checklist"));
                Pessoa cliente = pessoaDao.consultarCodigo(rs.getInt("Cliente"));
                Pessoa tecnico = pessoaDao.consultarCodigo(rs.getInt("Tecnico"));
                Veiculo veiculo = new Veiculo(rs.getString("Veiculo"), rs.getString("CorVeiculo"), rs.getString("PlacaVeiculo"), rs.getString("AnoVeiculo"), rs.getString("MarcaVeiculo"), rs.getString("KMVeiculo"), rs.getString("ChassiVeiculo"), rs.getString("CRLVVeiculo"));
                
                ordemServico = new OrdemServico(rs.getInt("NumeroOS"), rs.getInt("IdAssociacao"), cliente, rs.getString("Status"), rs.getString("DataAbertura"), rs.getString("DataFechamento"), rs.getString("DataCancelamento"), rs.getString("Observacao"), rs.getDouble("TotalProdutos"), rs.getDouble("TotalServicos"), tecnico, veiculo, rs.getString("Prioridade"), checklist, listaProduto, listaServico);
            }

            rs.close();
            ps.close();
            conexao.close();
            
        }catch (SQLException ex) {
            ex.printStackTrace(); //Exceção caso o produto não seja adicionado por algum erro
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }   

        return ordemServico;
    }
    
    //Consultar varias OS
    public List<OrdemServico> listaConsultarOs(String os){
        
        PessoasDao pessoaDao = new PessoasDao();
        UsuarioDao usuarioDao = new UsuarioDao();
        List<OrdemServico> listaOs = new ArrayList<>();
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;

        if(os.length() >= 0){
            if(verificarNumero(os)){
                sql = "SELECT * FROM os WHERE NumeroOS LIKE ?";
            }else{
                sql = "SELECT * FROM os WHERE Cliente LIKE ?";
            }          
        }else{
            sql = "SELECT * FROM os";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + os + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                List<Produto> listaProduto = consultarProdutosOs(rs.getInt("Produtos"));
                List<Servico> listaServico = consultarServicoOs(rs.getInt("Servicos"));
                Checklist checklist = consultarChecklistOS(rs.getInt("Checklist"));
                Pessoa cliente = pessoaDao.consultarCodigo(rs.getInt("Cliente"));
                Pessoa tecnico = pessoaDao.consultarCodigo(rs.getInt("Tecnico"));
                Veiculo veiculo = new Veiculo(rs.getString("Veiculo"), rs.getString("CorVeiculo"), rs.getString("PlacaVeiculo"), rs.getString("AnoVeiculo"), rs.getString("MarcaVeiculo"), rs.getString("KMVeiculo"), rs.getString("ChassiVeiculo"), rs.getString("CRLVVeiculo"));
                
                OrdemServico ordemServico = new OrdemServico(rs.getInt("NumeroOS"), rs.getInt("IdAssociacao"), cliente, rs.getString("Status"), rs.getString("DataAbertura"), rs.getString("DataFechamento"), rs.getString("DataCancelamento"), rs.getString("Observacao"), rs.getDouble("TotalProdutos"), rs.getDouble("TotalServicos"), tecnico, veiculo, rs.getString("Prioridade"), checklist, listaProduto, listaServico);
                listaOs.add(ordemServico);
            }

            rs.close();
            ps.close();
            conexao.close();
            
        }catch (SQLException ex) {
            ex.printStackTrace(); //Exceção caso o produto não seja adicionado por algum erro
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar OS", "Erro", JOptionPane.ERROR_MESSAGE);
        }   

        return listaOs;
    }
    
    //Gerar o ID de associação
    private void gerarCodAssociacao(OrdemServico os){
 
        Connection conexao = new Conexao().iniciarConexao();
        
        String sql= "INSERT INTO associacao_os (Data)VALUES (?)";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, os.getDataAbertura());

            ps.execute();
            ps.close();
            conexao.close();
            
        } catch (SQLException ex) {
                ex.printStackTrace(); //Exceção caso o produto não seja adicionado por algum erro
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados na tabela de assosiação", "Erro", JOptionPane.ERROR_MESSAGE);
        }    

    }
    
    //Busca o ID de associação entre a tabela de OS e tabela de produtos, serviços e checklist
    private int buscarUltimoCodAssociacao(){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM associacao_os";
        int codAssoc = 0;
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultadoConsulta = ps.executeQuery();

            while(resultadoConsulta.next()){
                int cod = resultadoConsulta.getInt("IdAssociacao");
                if(cod > codAssoc){
                    codAssoc = cod;
                }
            }
            
            resultadoConsulta.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o último código de assosiação", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return codAssoc;
    }
    
    //Insetir os dados na tabela checklist
    private void inserirChecklistOs(OrdemServico os, int codAssoc){
        Connection conexao = new Conexao().iniciarConexao();

        try{
            String sql = "INSERT INTO checklist (IdAssociacao,ProblemaInformado,ProblemaConstatado,KmAtual,NivelCombustivel,PneusDianteiro,PneusTraseiro,PneuEstepe,Bateria,Radio,Calotas,Antena,Manual,Documentos,Acendedor,Tapetes,Iluminacao,Extintor,LimpadorVidro,ArCondicionado,Painel,Chaves,Macaco,Triangulo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, codAssoc);
            ps.setString(2, os.getChecklist().getProblemaInformado());
            ps.setString(3, os.getChecklist().getProblemaConstatado());
            ps.setString(4, os.getChecklist().getKmAtual());
            ps.setString(5, os.getChecklist().getNivelCombustivel());
            ps.setString(6, os.getChecklist().getPneusDianteiro());
            ps.setString(7, os.getChecklist().getPneusTraseiro());
            ps.setString(8, os.getChecklist().getPneuEstepe());
            ps.setInt(9, os.getChecklist().getBateria());
            ps.setInt(10, os.getChecklist().getRadio());
            ps.setInt(11, os.getChecklist().getCalotas());
            ps.setInt(12, os.getChecklist().getAntena());
            ps.setInt(13, os.getChecklist().getManual());
            ps.setInt(14, os.getChecklist().getDocumentos());
            ps.setInt(15, os.getChecklist().getAcendedor());
            ps.setInt(16, os.getChecklist().getTapetes());
            ps.setInt(17, os.getChecklist().getIluminacao());
            ps.setInt(18, os.getChecklist().getExtintor());
            ps.setInt(19, os.getChecklist().getLimpadorVidro());
            ps.setInt(20, os.getChecklist().getArCondicionado());
            ps.setInt(21, os.getChecklist().getPainel());
            ps.setInt(22, os.getChecklist().getChaves());
            ps.setInt(23, os.getChecklist().getMacaco());
            ps.setInt(24, os.getChecklist().getTriangulo());

            ps.execute();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); //Exceção caso o produto não seja adicionado por algum erro
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar checklist", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    //Método para consultar o checklist com base no Id do checklist
    private Checklist consultarChecklistOS(int idChecklist){
        Checklist checklist = null;
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM checklist WHERE Id=?";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idChecklist);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){                
                checklist = new Checklist(rs.getInt("Id"),rs.getInt("Bateria"), rs.getInt("Radio"), rs.getInt("Calotas"), rs.getInt("Antena"), rs.getInt("Manual"), rs.getInt("Documentos"), rs.getInt("Acendedor"), rs.getInt("Tapetes"), rs.getInt("Iluminacao"), rs.getInt("ArCondicionado"), rs.getInt("Painel"), rs.getInt("Chaves"), rs.getInt("Macaco"), rs.getInt("Triangulo"), rs.getInt("Extintor"), rs.getInt("LimpadorVidro"), rs.getString("ProblemaInformado"), rs.getString("ProblemaConstatado"), rs.getString("KmAtual"), rs.getString("NivelCombustivel"), rs.getString("PneusDianteiro"), rs.getString("PneusTraseiro"), rs.getString("PneuEstepe"));
            }
            
            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o checklist da OS", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return checklist;
    }
    
    //Buscar o ID do último checklist adicionado
    private int buscarCodChecklist(){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT Id FROM checklist";
        int codCheck = 0;
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultadoConsulta = ps.executeQuery();

            while(resultadoConsulta.next()){
                int cod = resultadoConsulta.getInt("Id");
                if(cod > codCheck){
                    codCheck = cod;
                }
            }
            
            resultadoConsulta.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o último código do checklist", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return codCheck;
    }
    
    //Alterar checklist
    private void alterarChecklist(Checklist check){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE checklist SET ProblemaInformado=?,ProblemaConstatado=? WHERE Id=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, check.getProblemaInformado());
            ps.setString(2, check.getProblemaConstatado());
            ps.setInt(3, check.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o checklist", "Erro", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    //Adicionar ou Alterar os produtos da OS
    private void adicionarAlterarProdutosOs(List<Produto> produtosOs, int idAssoc){
        
        for(Produto prod : produtosOs){
            if(verificarProduto(prod.getCodigo(), idAssoc)){ //Verifica se o produto já está na tabela
                try{
                    Connection conexao = new Conexao().iniciarConexao();
                    String sql= "UPDATE produtos_os SET Unidade=?,Quantidade=?,ValorUnitario=?,ValorTotal=? WHERE Produto=? AND IdAssociacao=?";
                    PreparedStatement ps = conexao.prepareStatement(sql);

                    ps.setInt(1, prod.getUnidade().getCodigo());
                    ps.setInt(2, prod.getQuantidade());
                    ps.setDouble(3, prod.getValorUnitario());
                    ps.setDouble(4, prod.getValorTotal());
                    ps.setInt(5, prod.getCodigo());
                    ps.setInt(6, idAssoc);

                    ps.executeUpdate();
                    ps.close();
                    conexao.close();

                }catch(SQLException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao tentar alterar os produtos da OS", "Erro", JOptionPane.ERROR_MESSAGE);
                }  
            }else{
                adicionarProdutosOs(prod, idAssoc);
            } 
        }
    }
    
    //Adiciona os produtos da OS na tabela de produtos da OS.
    private void adicionarProdutosOs(Produto produto, int codAssoc){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "INSERT INTO produtos_os (IdAssociacao,Produto,DescricaoProduto,Unidade,Quantidade,ValorUnitario,ValorTotal) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql); 

            ps.setInt(1, codAssoc);
            ps.setInt(2, produto.getCodigo());
            ps.setString(3, produto.getDescricao());
            ps.setInt(4, produto.getUnidade().getCodigo());
            ps.setInt(5, produto.getQuantidade());
            ps.setDouble(6, produto.getValorUnitario());
            ps.setDouble(7, produto.getValorTotal());
            
            ps.execute();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar os produtos da OS", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Verficar se o produto já está na tabela
    private boolean verificarProduto(int codProduto, int idAssoc){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM produtos_os WHERE IdAssociacao=? AND Produto=?";
        boolean contem = false;
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idAssoc);
            ps.setInt(2, codProduto);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                contem = true;
            }
            
            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os produtos da OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return contem;
    }
    
    //Método para consultar os produtos da OS com base no ID de associacao
    private List<Produto> consultarProdutosOs(int idAssoc){
        UnidadeDao unidadeDao = new UnidadeDao();
        List<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM produtos_os WHERE IdAssociacao=?";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idAssoc);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String descUnidade = unidadeDao.consultarDescUnidade(rs.getInt("Unidade")); //COnsultando a descrição da unidade e atribuindo a variável
                int codUnidade = rs.getInt("Unidade");
                Unidades unidade = new Unidades(descUnidade, codUnidade);
                
                Produto produto = new Produto(rs.getInt("Produto"), rs.getString("DescricaoProduto"), unidade, rs.getDouble("ValorUnitario"), rs.getInt("Quantidade"), rs.getDouble("ValorTotal"));
                listaProdutos.add(produto);
            }
            
            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os produtos da OS  de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaProdutos;
    }
    
    //Método para remover o produto
    public void excluirProduto(int codProd, int codAssoc){
         
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM produtos_os WHERE Produto=? AND IdAssociacao=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codProd);
            ps.setInt(2, codAssoc);

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto código "+codProd+" excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o produto de código "+codProd, "Erro", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    //Adicionar ou alterar os serviços da OS
    private void adicionarAlterarServicosOs(List<Servico> servicosOs, int idAssoc){

        for(Servico serv : servicosOs){
            if(verificarServico(serv.getCodigo(), idAssoc)){
                try{
                    Connection conexao = new Conexao().iniciarConexao();
                    String sql= "UPDATE servicos_os SET Quantidade=?,ValorUnitario=?,ValorTotal=? WHERE Servico=? AND IdAssociacao=?";
                    PreparedStatement ps = conexao.prepareStatement(sql);

                    ps.setInt(1, serv.getQuantidade());
                    ps.setDouble(2, serv.getValorUnitario());
                    ps.setDouble(3, serv.getValorTotal());
                    ps.setInt(4, serv.getCodigo());
                    ps.setInt(5, idAssoc);

                    ps.executeUpdate();
                    ps.close();
                    conexao.close();

                }catch(SQLException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao tentar alterar os serviços da OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
                }   
            }else{
                adicionarServicoOs(serv, idAssoc);
            }
        }  
    }
    
    //Adiciona os produtos da OS na tabela de produtos da OS.
    private void adicionarServicoOs(Servico servico, int codAssoc){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "INSERT INTO servicos_os (IdAssociacao,Servico,DescricaoServico,Quantidade,ValorUnitario,ValorTotal) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql); 

            ps.setInt(1, codAssoc);
            ps.setInt(2, servico.getCodigo());
            ps.setString(3, servico.getDescricao());
            ps.setInt(4, servico.getQuantidade());
            ps.setDouble(5, servico.getValorUnitario());
            ps.setDouble(6, servico.getValorTotal());
            
            ps.execute();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar os serviços da OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Verficar se o serviço já está na tabela
    private boolean verificarServico(int codServico, int idAssoc){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM servicos_os WHERE IdAssociacao=? AND Servico=?";
        boolean contem = false;
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idAssoc);
            ps.setInt(2, codServico);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                contem = true;
            }
            
            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os serviços da OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return contem;
    }
    
    //Método para consultar os serviços da OS com base no ID de associacao
    private List<Servico> consultarServicoOs(int idAssoc){
        List<Servico> listaServico = new ArrayList<>();
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM servicos_os WHERE IdAssociacao=?";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idAssoc);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Servico servico = new Servico(rs.getInt("Servico"), rs.getString("DescricaoServico"), rs.getDouble("ValorUnitario"), rs.getInt("Quantidade"), rs.getDouble("ValorTotal"));
                listaServico.add(servico);
            }
            
            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os serviços da OS de N°", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaServico;
    }
    
    //Método para remover o produto
    public void excluirServico(int codServ, int codAssoc){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM servicos_os WHERE Servico=? AND IdAssociacao=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codServ);
            ps.setInt(2, codAssoc);

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Serviço código "+codServ+" excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o serviço código "+codServ, "Erro", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    //Verifica se o valor recebido é um número
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
    
}
