
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.ContaCaixa;
import model.Entidades;


public class ContaCaixaDao {
    
    public void adicionar(ContaCaixa contaCaixa){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO caixa (Descricao,DataCadastro)VALUES (?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, contaCaixa.getDescricao());
            ps.setString(2,contaCaixa.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Conta Caixa cadastrada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar a Conta Caixa", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void alterar(ContaCaixa contaCaixa){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE caixa SET Descricao=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, contaCaixa.getDescricao());
            ps.setInt(2, contaCaixa.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Conta caixa "+contaCaixa.getDescricao()+" alterada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a Conta Caixa "+contaCaixa.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    //Consulta para popular o JComboBox
    public List<ContaCaixa> consultarCaixa(){
        String sql = "SELECT * FROM caixa";
        Connection conexao = new Conexao().iniciarConexao();
        List<ContaCaixa> listaCaixas = new ArrayList<>();
 
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                ContaCaixa caixa = new ContaCaixa();
                caixa.setCodigo(rs.getInt("Codigo"));
                caixa.setDescricao(rs.getString("Descricao"));
                caixa.setDataCadastro(rs.getString("DataCadastro"));

                listaCaixas.add(caixa);
            }

            ps.execute();
            ps.close();
            conexao.close();
          
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar as Contas Caixa", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaCaixas;
    }
    
    //Consultar para mostra na tabela todos os caixas cadastrados
    public List<ContaCaixa> consultarCaixa(String conta){
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<ContaCaixa> listaCaixas = new ArrayList<>();

        if(conta.length() >= 0){
            if(verificarNumero(conta)){
                sql = "SELECT * FROM caixa WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM caixa WHERE Descricao LIKE ?";
            }
        }else{
            sql = "SELECT * FROM caixa";
        }
 
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + conta + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                ContaCaixa caixa = new ContaCaixa();
                caixa.setCodigo(rs.getInt("Codigo"));
                caixa.setDescricao(rs.getString("Descricao"));
                caixa.setDataCadastro(rs.getString("DataCadastro"));

                listaCaixas.add(caixa);
            }
            
            ps.execute();
            ps.close();
            conexao.close(); 
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a Conta Caixa", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaCaixas;
    }
    
    public void remover(ContaCaixa contaCaixa){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM caixa WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, contaCaixa.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();  
            
            JOptionPane.showMessageDialog(null, "Conta Caixa "+contaCaixa.getDescricao()+" excluída com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir a Conta Caixa "+contaCaixa.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
