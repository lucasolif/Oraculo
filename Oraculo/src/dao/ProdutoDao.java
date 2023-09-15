
package dao;

import jdbc.Conexao;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDao {
    
    public void adicionar(Produto produto) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into produto (descricaoProduto,codEan,codGtin,unidadeProduto,marca,codBarras,ncm,cst,cest,csosn,peso,ipi,custo,frete,margemLucro,outrasDespesas,precoVenda,desconto) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, produto.getDescricaoProduto());
        ps.setString(2, produto.getCodEan());
        ps.setString(3, produto.getCodGtin());
        ps.setString(4, produto.getUnidadeProduto());
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
        ps.setDouble(17, produto.getPrecoVenda());
        ps.setDouble(18, produto.getDesconto());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    

}
