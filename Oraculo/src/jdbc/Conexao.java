
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    public static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private final String nameDataBase = "oraculo";
    private final String nameUser = "root";
    private final String password = "";
    
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/"+nameDataBase+"?userSSL=false",nameUser, password);
        }catch(SQLException ex){
            System.out.println("Erro ao tentar se conectar ao banco de dados");
            throw new RuntimeException(ex);
        }
    }
    
}
