package dao;

import jdbc.Conexao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {
    
    public void adicionarUsuario(Usuario usuario) throws SQLException{
        
        Connection conexao = new Conexao().getConexao();
        String sqk = "insert into usuario (login,senha,codigo,nome,sobrenome,email,celular,setor) value (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sqk);
        
        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getCod());
        ps.setString(4, usuario.getNome());
        ps.setString(4, usuario.getSobrenome());
        ps.setString(6, usuario.getEmail());
        ps.setString(7, usuario.getCelular());
        ps.setString(7, usuario.getSetor());
        
        ps.execute();
        ps.close();
        conexao.close();
        
    }
}
