
package dao;

import jdbc.Conexao;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Unidades;

public class ProdutoDao {
    
    UnidadeDao unidadeDao = new UnidadeDao();
    
    //Cadastrar produto na tabela de produtos
    public void cadastrarProduto(Produto produto){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();

            String sql = "INSERT INTO Produtos (descricao,codEan,codGtin,unidade,marca,codBarras,ncm,cst,cest,csosn,peso,ipi,custo,frete,margemLucro,outrasDespesas,precoVenda,desconto, dataCadastro) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, produto.getDescricao());
            ps.setString(2, produto.getCodEan());
            ps.setString(3, produto.getCodGtin());
            ps.setInt(4, produto.getUnidade().getCodigo());
            ps.setString(5, produto.getMarca());
            ps.setString(6, produto.getCodBarras());
            ps.setString(7, produto.getNcm());
            ps.setString(8, produto.getCst());
            ps.setString(9, produto.getCest());
            ps.setString(10, produto.getCsosn());
            ps.setDouble(11, produto.getPeso());
            ps.setDouble(12, produto.getIpi());
            ps.setDouble(13, produto.getCusto());
            ps.setDouble(14, produto.getFrete());
            ps.setDouble(15, produto.getMargemLucro());
            ps.setDouble(16, produto.getOutrasDespesas());
            ps.setDouble(17, produto.getValorUnitario());
            ps.setDouble(18, produto.getDesconto());
            ps.setString(19, produto.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }
    
    //Consulta produto para ser listado na tabela na consulta de produtos
    public List<Produto> consultarProduto(String produto){

        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<Produto> listaProduto = new ArrayList<>();

        if(produto.length() >= 0){
            if(verificarNumero(produto)){
                sql = "SELECT * FROM produtos WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM produtos WHERE Descricao LIKE ?";
            }  
        }else{
            sql = "SELECT * FROM produtos";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + produto + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Unidades unidade = new Unidades(unidadeDao.consultarDescUnidade(rs.getInt("Unidade")), rs.getInt("Unidade"));
                Produto prod = new Produto(rs.getInt("Codigo"), rs.getString("Descricao"), rs.getString("CodEan"), rs.getString("CodGtin"), unidade, rs.getString("Marca"), rs.getString("CodBarras"), rs.getString("NCM"), rs.getString("CST"), rs.getString("CEST"), rs.getString("CSOSN"), rs.getString("DataCadastro"), rs.getDouble("Peso"), rs.getDouble("IPI"), rs.getDouble("Custo"), rs.getDouble("Frete"), rs.getDouble("MargemLucro"), rs.getDouble("OutrasDespesas"), rs.getDouble("PrecoVenda"), rs.getDouble("Desconto"));
                listaProduto.add(prod);
            }

            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o produto" , "Erro", JOptionPane.ERROR_MESSAGE);
        } 

        return listaProduto;
    }
    
    //Altera o produto
    public void alterar(Produto produto){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE produtos SET Descricao=?,CodEan=?,CodGtin=?,Unidade=?,Marca=?,CodBarras=?,NCM=?,CST=?,CEST=?,CSOSN=?,Peso=?,IPI=?,Custo=?,Frete=?,MargemLucro=?,OutrasDespesas=?,PrecoVenda=?,Desconto=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, produto.getDescricao());
            ps.setString(2, produto.getCodEan());
            ps.setString(3, produto.getCodGtin());
            ps.setInt(4, produto.getUnidade().getCodigo());
            ps.setString(5, produto.getMarca());
            ps.setString(6, produto.getCodBarras());
            ps.setString(7, produto.getNcm());
            ps.setString(8, produto.getCst());
            ps.setString(9, produto.getCest());
            ps.setString(10, produto.getCsosn());
            ps.setDouble(11, produto.getPeso());
            ps.setDouble(12, produto.getIpi());
            ps.setDouble(13, produto.getCusto());
            ps.setDouble(14, produto.getFrete());
            ps.setDouble(15, produto.getMargemLucro());
            ps.setDouble(16, produto.getOutrasDespesas());
            ps.setDouble(17, produto.getValorUnitario());
            ps.setDouble(18, produto.getDesconto());
            ps.setInt(19, produto.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto de Cod: "+produto.getCodigo()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o produto de Cod: "+produto.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void remover(int codigo){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM produtos WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto de Cod: "+codigo+" excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o produto  de Cod: "+codigo, "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
