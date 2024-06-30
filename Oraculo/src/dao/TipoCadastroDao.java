
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
import model.TipoCadastro;


public class TipoCadastroDao {
    
    public List<TipoCadastro> consultarTipoCadastro(){
        
        List<TipoCadastro> listaTipoCadastro = new ArrayList<>();
        
        try{
            String sql="SELECT * FROM tipo_cadastro";
            Connection conexao = new Conexao().iniciarConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                TipoCadastro tipoCadastro = new TipoCadastro();
                tipoCadastro.setCodigo(rs.getInt("Codigo"));
                tipoCadastro.setDescricao(rs.getString("Descricao"));

                listaTipoCadastro.add(tipoCadastro);
            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar os Tipos de Cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaTipoCadastro;
    }
    
    public void adicionar(TipoCadastro tipoCadastro){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO tipo_cadastro (Descricao,DataCadastro)VALUES (?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, tipoCadastro.getDescricao());
            ps.setString(2,tipoCadastro.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Tipo de Cadastro cadastrado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o Tipo de Cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void alterar(TipoCadastro tipoCadastro){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE tipo_cadastro SET Descricao=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, tipoCadastro.getDescricao());
            ps.setInt(2, tipoCadastro.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();

            JOptionPane.showMessageDialog(null, "Tipo de Cadastro "+tipoCadastro.getDescricao()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o Tipo de Cadastro "+tipoCadastro.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public List<TipoCadastro> consultarTpCadastro(String tipoCadastro){
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<TipoCadastro> listaFormaPagto = new ArrayList<>();

        if(tipoCadastro.length() >= 0){
            if(verificarNumero(tipoCadastro)){
                sql = "SELECT * FROM tipo_cadastro WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM tipo_cadastro WHERE Descricao LIKE ?";
            }   
        }else{
            sql = "SELECT * FROM tipo_cadastro";
        }
 
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + tipoCadastro + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                TipoCadastro tpCadastro = new TipoCadastro();
                tpCadastro.setCodigo(rs.getInt("Codigo"));
                tpCadastro.setDescricao(rs.getString("Descricao"));
                tpCadastro.setDataCadastro(rs.getString("DataCadastro"));

                listaFormaPagto.add(tpCadastro);
            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o Tipo de Cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return listaFormaPagto;
    }
    
    //Consultando a tabela de tipo de cadastro, pra pegar a descrição com base no código
    public String consultarDescTpCadastro(int cod){
        String sql = "SELECT Descricao FROM tipo_cadastro WHERE Codigo=?";
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
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar a descrição do tipo de cadastro", "Erro", JOptionPane.WARNING_MESSAGE);
        }
 
        return nome;
    }
    
    public void remover(TipoCadastro tipoCadastro){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM tipo_cadastro WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, tipoCadastro.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Tipo de Cadastro "+tipoCadastro.getDescricao()+" excluído com sucesso", "Concluí­do", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o Tipo de Cadastro "+tipoCadastro.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
  
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
