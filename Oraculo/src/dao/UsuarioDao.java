package dao;

import jdbc.Conexao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsuarioDao {
    
    public void adicionarUsuario(Usuario usuario, String data){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "INSERT INTO usuario (Login,Senha,Nome,Sobrenome,Email,Celular,Setor,Sexo,DataCadastro) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getSobrenome());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getCelular());
            ps.setString(7, usuario.getSetor());
            ps.setString(8, usuario.getSexo());
            ps.setString(9, data);

            ps.execute();
            ps.close();
            conexao.close();   
            
            JOptionPane.showMessageDialog(null, "Usuário "+usuario.getLogin()+" cadastrado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastro o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
        }
          
    }
    
    public List<Usuario> buscarUsuario(String user){
        Connection conexao = new Conexao().iniciarConexao();
        List<Usuario> listaUsuario = new ArrayList<>();
        String sql = null;
        
        if(user.length() >= 0){
            if(verificarNumero(user)){
                sql = "SELECT * FROM usuario WHERE Id Like ?";
            }else{
                sql = "SELECT * FROM usuario WHERE Login LIKE ?";
            }   
        }
        else{
            sql = "SELECT * FROM usuario";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%"+user+"%");
            ResultSet consulta = ps.executeQuery();
            
            while(consulta.next()){
                Usuario usuario = new Usuario(consulta.getString("Login"),consulta.getString("Senha"),consulta.getString("Nome"),consulta.getString("Sobrenome"),consulta.getString("Email"),consulta.getString("Celular"),consulta.getString("Setor"),consulta.getString("Sexo"), consulta.getString("DataCadastro"),consulta.getInt("Id") );
                listaUsuario.add(usuario);
            }

            consulta.close();
            ps.close();
            conexao.close();

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
        }
         
        return listaUsuario;
    }    
    
    //Consultar usuário OS
    public Usuario buscarUsuario(int cod){
        
        Connection conexao = new Conexao().iniciarConexao();
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE Id=?";

        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                usuario.setLogin(rs.getString("Login"));
                usuario.setNome(rs.getString("Nome"));
                        
            }

            rs.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o usuário", "Erro", JOptionPane.WARNING_MESSAGE);
        }

        return usuario;
    }
    
    public Usuario validarLogin(String login, String senha){
 
        Usuario usuario = null;
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "SELECT * FROM usuario WHERE Login=? AND Senha=?";

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                usuario = new Usuario();
                usuario.setLogin(rs.getString("Login"));
                usuario.setSenha(rs.getString("Senha"));
            }

            rs.close();
            ps.close();
            conexao.close();

        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Login ou senha inválida", "Erro",JOptionPane.ERROR_MESSAGE);
        }        
        
        return usuario;

    }
    
    public void alterar(Usuario usuario){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "UPDATE usuario SET Login=?,Senha=?,Nome=?,Sobrenome=?,Email=?,Celular=?,Setor=?,Sexo=?" + "WHERE Id=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getSobrenome());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getCelular());
            ps.setString(7, usuario.getSetor());
            ps.setString(8, usuario.getSexo());
            ps.setInt(9, usuario.getCod());

            ps.executeUpdate();
            ps.close();
            conexao.close();   
            
            JOptionPane.showMessageDialog(null, "Usuário "+usuario.getLogin()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o usuário "+usuario.getLogin(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void remover(int codigo){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM usuario WHERE Id=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Verifica se é String é um número
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }

}
