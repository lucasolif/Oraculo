
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
import model.FormaPagto;


public class FormaPagtoDao {
    
    //Consulta para popular o JComboBox
    public List<FormaPagto> consultarFormaPagto(){
        
        List<FormaPagto> listaFormaPagto = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM formas_pagamento";
            Connection conexao = new Conexao().iniciarConexao();

            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                FormaPagto formasPagto = new FormaPagto();
                formasPagto.setCodigo(rs.getInt("Codigo"));
                formasPagto.setDescricao(rs.getString("Descricao"));

                listaFormaPagto.add(formasPagto);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar as formas de pagamento", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaFormaPagto;
    }
    
    public void adicionar(FormaPagto formaPagto){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO formas_pagamento (Descricao,DataCadastro)VALUES (?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, formaPagto.getDescricao());
            ps.setString(2,formaPagto.getDataCadastro());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Forma de Pagamento cadastrada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar a forma de pagamento", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void alterar(FormaPagto formaPagto){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE formas_pagamento SET Descricao=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, formaPagto.getDescricao());
            ps.setInt(2, formaPagto.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();   
            
            JOptionPane.showMessageDialog(null, "Forma de Pagamento "+formaPagto.getDescricao()+" alterada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a forma de pagamento "+formaPagto.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    //Consulta para listar todas as formas de pagamento na tabela
    public List<FormaPagto> consultarFormaPagto(String formaPagto){
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<FormaPagto> listaFormaPagto = new ArrayList<>();

        if(formaPagto.length() >= 0){
            if(verificarNumero(formaPagto)){
                sql = "SELECT * FROM formas_pagamento WHERE Codigo LIKE ?";
            }else{
                sql = "SELECT * FROM formas_pagamento WHERE Descricao LIKE ?";
            } 
        }else{
            sql = "SELECT * FROM formas_pagamento";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + formaPagto + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                FormaPagto pagto = new FormaPagto();
                pagto.setCodigo(rs.getInt("Codigo"));
                pagto.setDescricao(rs.getString("Descricao"));
                pagto.setDataCadastro(rs.getString("DataCadastro"));

                listaFormaPagto.add(pagto);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar as formas de pagamento", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaFormaPagto;
    }
    
    public void remover(FormaPagto formaPagto){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM formas_pagamento WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, formaPagto.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Forma de Pagamento "+formaPagto.getDescricao()+" excluída com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir a forma de pagamento "+formaPagto.getDescricao(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
