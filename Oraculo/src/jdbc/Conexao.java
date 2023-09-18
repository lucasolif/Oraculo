
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private final String nameDataBase = "oraculo";
    private final String nameUser = "root";
    private final String password = "";
    public static SQLException conexao = null;
    
    public Connection getConexao(){
        try{
            if(conexao == null){
                conexao = (SQLException) DriverManager.getConnection("jdbc:mysql://localhost/"+nameDataBase+"?userSSL=false",nameUser, password);
                return (Connection) conexao;   
            }
            else{
                return (Connection) conexao;
            }

            
        }catch(SQLException ex){
            System.out.println("Erro ao tentar se conectar ao banco de dados");
            throw new RuntimeException(ex);
        }
    }
    
}
