
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.DadosFiscais;

public class DadosFiscaisDao {
    
    public List<DadosFiscais> buscarCst(){
        
        List<DadosFiscais> listaCst = new ArrayList<>();
        
        try{
            String sql="SELECT * FROM cst";
            Connection conexao = new Conexao().iniciarConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                DadosFiscais cst = new DadosFiscais();
                cst.setCodigoFiscal(rs.getString("CodigoFiscal"));
                cst.setDescricao(rs.getString("Descricao"));

                listaCst.add(cst);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar o CST", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        

        return listaCst;
    }  
    
    public List<DadosFiscais> buscarCsosn(){
    
        List<DadosFiscais> listaCsosn = new ArrayList<>();
        
        try{
            
            String sql="SELECT * FROM csosn";
            Connection conexao = new Conexao().iniciarConexao();

            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                DadosFiscais csosn = new DadosFiscais();
                csosn.setCodigoFiscal(rs.getString("CodigoFiscal"));
                csosn.setDescricao(rs.getString("Descricao"));

                listaCsosn.add(csosn);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar o CSOSN", "Erro", JOptionPane.ERROR_MESSAGE);
        } 

        return listaCsosn;
    }
    
}
