
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.Entidades;
import model.Unidades;


public class UnidadeDao {
    
    //Método para consultar as unidades e popular o JComboBox
    public List<Unidades> consultarUnidades(){
        
        List<Unidades> listaUnidades = new ArrayList<>();
        
        try{
            String sql="SELECT * FROM unidades";
            Connection conexao = new Conexao().iniciarConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);  
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Unidades unidades = new Unidades();
                unidades.setCodigo(rs.getInt("Codigo"));
                unidades.setDescricao(rs.getString("Descricao"));

                listaUnidades.add(unidades);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar as unidades de medida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaUnidades;
    }
    
    public void adicionar(Unidades unidade){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO unidades (Descricao,DataCadastro)VALUES (?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, unidade.getDescricao());
            ps.setString(2,unidade.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Unidade de medida cadastrada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar a unidade de medida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void alterar(Unidades unidade){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE unidades SET Descricao=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, unidade.getDescricao());
            ps.setInt(2, unidade.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        
            JOptionPane.showMessageDialog(null, "Unidade de medida "+unidade.getDescricao()+" alterar com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a unidade de medida "+unidade.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Consultar as unidades para ser listadas na tabela
    public List<Unidades> consultarUnidades(String unidade){
        
        List<Unidades> listaUnidades = new ArrayList<>();
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;

        if(unidade.length() >= 0){
            if(verificarNumero(unidade)){
                sql = "SELECT * FROM unidades WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM unidades WHERE Descricao LIKE ?";
            }     
        }else{
            sql = "SELECT * FROM unidades";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + unidade + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Unidades uni = new Unidades();
                uni.setCodigo(rs.getInt("Codigo"));
                uni.setDescricao(rs.getString("Descricao"));
                uni.setDataCadastro(rs.getString("DataCadastro"));

                listaUnidades.add(uni);
            }
                    
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a unidade de medida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaUnidades;
    }
    
    //Consultando a tabela de tipo de cadastro, pra pegar a descrição com base no código
    public String consultarDescUnidade(int cod){
        String sql = "SELECT Descricao FROM unidades WHERE Codigo=?";
        Connection conexao = new Conexao().iniciarConexao();
        String nome = null;
                    
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cod);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                nome = rs.getString("Descricao");
            }

            ps.execute();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar a descri??o da unidade de medida", "Erro", JOptionPane.WARNING_MESSAGE);
        }
 
        return nome;
    }   
    
    public void remover(Unidades unidades){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM unidades WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, unidades.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Unidade de medida "+unidades.getDescricao()+" excluída com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir a unidade de medida "+unidades.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Verificar se o valor passado é um número ou não
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
    
}
