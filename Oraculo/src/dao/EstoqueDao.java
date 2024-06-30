
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.Estoque;
import model.FormaPagto;
import model.Produto;
import model.Unidades;


public class EstoqueDao {
    
    UnidadeDao unidadeDao = new UnidadeDao();
    

    public void adicionar(Estoque estoque){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO tipo_estoque (Descricao,DataCadastro)VALUES (?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, estoque.getDescricao());
            ps.setString(2,estoque.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastra o tipo de estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
      
    //Busca o estoque pelo código, descrição ou todos os estoque cadastrados
    public List<Estoque> consultarEstoque(String estoq){
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<Estoque> listaEstoque = new ArrayList<>();

        if(estoq.length() >= 0){
            if(verificarNumero(estoq)){
                sql = "SELECT * FROM tipo_estoque WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM tipo_estoque WHERE Descricao LIKE ?";
            }
        }else{
            sql = "SELECT * FROM tipo_estoque";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + estoq + "%");
            ResultSet resultadoConsulta = ps.executeQuery();
            
            while(resultadoConsulta.next()){
                Estoque estoque = new Estoque(resultadoConsulta.getString("Descricao"), resultadoConsulta.getString("DataCadastro"), resultadoConsulta.getInt("Codigo"));
                listaEstoque.add(estoque);
            }

            resultadoConsulta.close();
            ps.close();
            conexao.close();
        
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o tipo estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaEstoque;
    }
    
    //Alterar um tipo estoque
    public void alterar(Estoque estoque){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE tipo_estoque SET Descricao=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, estoque.getDescricao());
            ps.setInt(2, estoque.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Tipo de estoque "+estoque.getDescricao()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o tipo estoque "+estoque.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
  
    }
    
    //Consultar estoque na tela de movimentação
    public List<Produto> consultarEstoque(Produto produto, Estoque estoque){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT produtos.Codigo, produtos.Descricao, produtos.Marca, produtos.Unidade, estoque.Quantidade, produtos.PrecoVenda FROM produtos FULL JOIN estoque on produtos.Codigo = ?";
        List<Produto> listaProdutos = new ArrayList<>();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            //ps.setInt(2, movimentacao.getEstoque().getCodigo());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Unidades unidade = new Unidades();
                unidade.setCodigo(rs.getInt("Unidade"));
                unidade.setDescricao(unidadeDao.consultarDescUnidade(rs.getInt("Unidade")));
                
                Produto produtos = new Produto();
                produtos.setCodigo(rs.getInt("Codigo"));
                produtos.setDescricao(rs.getString("Descricao"));
                produtos.setMarca(rs.getString("Marca"));
                produtos.setUnidade(unidade);
                produtos.setQuantidade(rs.getInt("Quantidade"));
                produtos.setValorUnitario(rs.getDouble("PrecoVenda"));
                
                listaProdutos.add(produtos);
            }   
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaProdutos;
    }
    
    //Consultar os tipos de estoque pra popular o JComboBox
    public List<Estoque> buscarTipoEstoques(){
        
        List<Estoque> listaEstoque = new ArrayList<>();
        
        try{
            String sql="SELECT * FROM tipo_estoque";
            Connection conexao = new Conexao().iniciarConexao();

            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Estoque estoque = new Estoque();
                estoque.setCodigo(rs.getInt("Codigo"));
                estoque.setDescricao(rs.getString("Descricao"));
                listaEstoque.add(estoque);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar tipos de estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaEstoque;
    }
    
    //Excluir um estoque
    public void remover(Estoque estoque){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM tipo_estoque WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, estoque.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Tipo de estoque "+estoque.getDescricao()+" removido com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o tipo estoque "+estoque.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
   
    //Verificar se o valor passado é um número
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
