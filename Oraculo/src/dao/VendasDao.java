
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
import model.Data;
import model.Estoque;
import model.Produto;
import model.Servico;
import model.Vendas;


public class VendasDao {
    
    //Gear o c�digo de associa��o
    private void gerarCodAssociacao(Vendas venda){
 
        Connection conexao = new Conexao().iniciarConexao();
        String sql= "INSERT INTO associacao_produto_venda (Data)VALUES (?)";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, venda.getData());

            ps.execute();
            ps.close();
            conexao.close();
            
        } catch (SQLException ex) {
                ex.printStackTrace(); //Exce��o caso o produto n�o seja adicionado por algum erro
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados na tabela de assosia��o", "Erro", JOptionPane.ERROR_MESSAGE);
        }   
  
    }
    
    //Busca o c�digo de associa��o entre a tabela de vendas e tabela de produtos da venda
    private int buscarCodAssociacao(){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM associacao_produto_venda";
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
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o �ltimo c�digo de assosia��o", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return codAssoc;
    }
    
    //M�todo para adicionarVenda todos os dados e concluir a venda
    public void adicionarVenda(Vendas venda){
    
        gerarCodAssociacao(venda); //Chama o m�todo que insere a data na tabela de assosia��o e gera o c�digo
        int codAssoc = buscarCodAssociacao(); //Chama o m�todo que pega o �ltimo c�digo de assosia��o
        
        Connection conexao = new Conexao().iniciarConexao();
        
        try{
            String sql= "INSERT INTO vendas (Cliente,IdAssociacaoProduto,TipoVenda,TotalVenda,TotalDesconto,ContaCaixa,FormaPagto,Parcelas,Estoque,Data)VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, venda.getCliente().getCodigo());
            ps.setInt(2, codAssoc);
            ps.setString(3, venda.getTipoVenda());
            ps.setDouble(4, venda.getTotalVenda());
            ps.setDouble(5, venda.getTotalDesconto());
            ps.setInt(6, venda.getContaCaixa().getCodigo());
            ps.setInt(7, venda.getFormaPagto().getCodigo());
            ps.setInt(8, venda.getParcelas());
            ps.setInt(9, venda.getEstoque().getCodigo());
            ps.setString(10, venda.getData());

            ps.execute();
            ps.close();
            conexao.close();
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar concluir a venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        adicionarProdutoVenda(venda, codAssoc);//Chama o m�todo que adiciona os produtos na tabela de venda
        saidaProdutoVenda(venda); //Chama o m�todo que dar sa�da dos produtos vendido, no estoque.
        
        JOptionPane.showMessageDialog(null, "Venda conclu�da com sucesso", "Conclu�do", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //M�todo que adiciona venda da OS
    public void adicionarVendaOs(Vendas venda, int numOs){
        
        Connection conexao = new Conexao().iniciarConexao();
        
        try{
            String sql= "INSERT INTO vendas (Cliente,NumOS,TipoVenda,TotalVenda,TotalDesconto,ContaCaixa,FormaPagto,Parcelas,Estoque,Data)VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, venda.getCliente().getCodigo());
            ps.setInt(2, numOs);
            ps.setString(3, venda.getTipoVenda());
            ps.setDouble(4, venda.getTotalVenda());
            ps.setDouble(5, venda.getTotalDesconto());
            ps.setInt(6, venda.getContaCaixa().getCodigo());
            ps.setInt(7, venda.getFormaPagto().getCodigo());
            ps.setInt(8, venda.getParcelas());
            ps.setInt(9, venda.getEstoque().getCodigo());
            ps.setString(10, venda.getData());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "OS Fechada, e gerado uma venda", "Conclu�do", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar concluir a venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //M�todo para adicionar os dados do produto da venda na tabela Venda
    private void adicionarProdutoVenda(Vendas venda, int codAssoc){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            PreparedStatement ps = null;

            for(Produto prod : venda.getProdutos()){
                String sql= "INSERT INTO produtos_venda (IdAssociacaoProduto,IdProduto,DescricaoProduto,ValorUnitario,Quantidade,Desconto,ValorTotal,Data)VALUES (?,?,?,?,?,?,?,?)";
                ps = conexao.prepareStatement(sql);

                ps.setInt(1, codAssoc);
                ps.setInt(2, prod.getCodigo());
                ps.setString(3, prod.getDescricao());
                ps.setDouble(4, prod.getValorUnitario());
                ps.setDouble(5, prod.getQuantidade());
                ps.setDouble(6, prod.getDesconto());
                ps.setDouble(7, prod.getValorTotal());
                ps.setString(8, venda.getData());

                ps.execute();
            }
            
            ps.close();
            //conexao.close();
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar adicionar o produto da venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //M�todo para dar ssa�do nos produtos vendidos
    private void saidaProdutoVenda(Vendas venda){
        //Conexao com o banco de dados
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM estoque WHERE CodigoProduto=? AND CodigoEstoque=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        MovimentoEstoqueDao movEstoqueDao = new MovimentoEstoqueDao();
        Data data = new Data();
        String dataAtual = data.conversaoData();
 
        for(Produto prod : venda.getProdutos()){
            try{
                ps = conexao.prepareStatement(sql);
                ps.setInt(1, prod.getCodigo());
                ps.setInt(2, venda.getEstoque().getCodigo());
                rs = ps.executeQuery();


                if(!rs.next()){//Verificando se o produto n�o existe na tabela estoque
                    int confirm = JOptionPane.showConfirmDialog(null,"Voc� n�o tem o produto "+prod.getDescricao()+" no estoque,  seu estoque ficar� negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION){
                        movEstoqueDao.adicionarProdutoEstoque(prod, venda.getEstoque(), -prod.getQuantidade());
                    }else if(confirm == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Opera��o cancelada!"); 
                        return;
                    }
                }else{
                    //Verificando se o saldo � 0 ou menor que a quantidade que ser� movimentada
                    if(rs.getInt("Quantidade") == 0 || prod.getQuantidade() > rs.getInt("Quantidade")){
                        int confirm = JOptionPane.showConfirmDialog(null,"O produto "+prod.getDescricao()+" n�o tem a quantidade solicitada, seu estoque ficar� negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                        if(confirm == JOptionPane.YES_OPTION){
                            movEstoqueDao.alterarProdutoEstoque(prod, venda.getEstoque(), rs.getInt("Quantidade") - prod.getQuantidade());
                            JOptionPane.showMessageDialog(null, "Produto "+prod.getDescricao()+" foi vendido");
                        }else if(confirm == JOptionPane.NO_OPTION){
                            JOptionPane.showMessageDialog(null, "Opera��o cancelada!"); 
                            return;
                        }
                    }
                    else{ //Realizando a opera��o quando o saldo n�o for  menor que a quantidade ou zerado
                        movEstoqueDao.alterarProdutoEstoque(prod, venda.getEstoque(), rs.getInt("Quantidade") - prod.getQuantidade());
                        JOptionPane.showMessageDialog(null, "Produtos movimentado com sucesso");

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
}
