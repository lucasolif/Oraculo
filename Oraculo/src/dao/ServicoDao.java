
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import model.Servico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicoDao {
    
    public void adicionar(Servico servico){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO servicos (Descricao,CodServico,Preco)VALUES (?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, servico.getDescricao());
            ps.setString(2, servico.getCodAtividadeServico());
            ps.setDouble(3, servico.getValorUnitario());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o serviço", "Erro", JOptionPane.ERROR_MESSAGE);
        }   

    }
    
    public List<Servico> consultarServico(String serv){
        
        List<Servico> listaServico = new ArrayList<>();
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = null;

            if(serv.length() >= 0){
                if(verificarNumero(serv)){
                    sql = "SELECT * FROM servicos WHERE Codigo LIKE ?";
                }else{
                    sql = "SELECT * FROM servicos WHERE Descricao LIKE ?";
                }  
            }else{
                sql = "SELECT * FROM servicos";
            }

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + serv + "%");
            ResultSet resultadoConsulta = ps.executeQuery();         

            while(resultadoConsulta.next()){
                Servico servico = new Servico(resultadoConsulta.getString("Descricao"), resultadoConsulta.getString("CodServico"), resultadoConsulta.getDouble("Preco"), resultadoConsulta.getInt("Codigo"));
                listaServico.add(servico);
            }

            resultadoConsulta.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o serviço", "Erro", JOptionPane.ERROR_MESSAGE);
        }   
        
        
        return listaServico;
    }
    
    public void alterar(Servico servico){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "UPDATE servicos SET Descricao=?,CodServico=?,Preco=?" + " WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, servico.getDescricao());
            ps.setString(2, servico.getCodAtividadeServico());
            ps.setDouble(3, servico.getValorUnitario());
            ps.setInt(4, servico.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Serviço "+servico.getCodigo()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o serviço "+servico.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE);
        }   
        

        
    }
    
    public void remover(int codigo){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM servicos WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Serviço "+codigo+" excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o serviço "+codigo, "Erro", JOptionPane.ERROR_MESSAGE);
        }   
    }
 
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
