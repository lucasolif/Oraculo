
package dao;

import jdbc.Conexao;
import model.Servico;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLDataException;

public class ServicoDao {
    
    public void adicionar(Servico servico) throws SQLException{
        
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into servicos (codigo,descricao,preco,iss,data) value (?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, servico.getCodigo());
        ps.setString(2, servico.getDescricao());
        ps.setDouble(3, servico.getPreco());
        ps.setDouble(4, servico.getIss());
        ps.setString(5, servico.getData());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
}
