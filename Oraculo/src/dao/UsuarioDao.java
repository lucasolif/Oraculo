package dao;

import jdbc.Conexao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
    
    public void adicionarUsuario(Usuario usuario) throws SQLException{
        
        Connection conexao = new Conexao().getConexao();
        String sqk = "insert into usuario (login,senha,nome,sobrenome,email,celular,setor,codigo,sexo) value (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sqk);
        
        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getNome());
        ps.setString(4, usuario.getSobrenome());
        ps.setString(5, usuario.getEmail());
        ps.setString(6, usuario.getCelular());
        ps.setString(7, usuario.getSetor());
        ps.setString(8, usuario.getCodigo());
        ps.setString(9, usuario.getSexo());
        
        ps.execute();
        ps.close();
        conexao.close();
        
    }
    
    public Usuario logar(String login, String senha) throws SQLException{
        
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM usuario WHERE login=? and senha=?";
        PreparedStatement ps = Conexao.prepareStatement(sql);
        
        ps.setString(1, login);
        ps.setString(2, senha);
        
        ResultSet rs = ps.executeQuery();
        
                //enquanto estiver dado na tabela
        Usuario usuario = null;
        while(rs.next()){
            usuario = new Usuario();
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return usuario;
    }
}
