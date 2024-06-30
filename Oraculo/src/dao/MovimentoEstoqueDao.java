
package dao;

import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;

import jdbc.Conexao;
import model.Estoque;
import model.MovimentoEstoque;
import model.Produto;



public class MovimentoEstoqueDao {
    
    //Método para adicionar produto no estoque
    public void adicionarProdutoEstoque(Produto produto, Estoque estoque, int quantidade){

        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql= "INSERT INTO estoque (CodigoProduto,Quantidade,CodigoEstoque)VALUES (?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, produto.getCodigo());
            ps.setInt(2, quantidade);
            ps.setInt(3, estoque.getCodigo());

            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado ao estoque", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar adicionar o produto no estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método que movimenta o produto no estoque
    public void movimentarProdutoEstoque(MovimentoEstoque movimentacao){
        //Conexao com o banco de dados
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM estoque WHERE CodigoProduto=? AND CodigoEstoque=?";
 
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, movimentacao.getProduto().getCodigo());
            ps.setInt(2, movimentacao.getEstoque().getCodigo());
            ResultSet resultadoConsulta = ps.executeQuery();

            if(!movimentacao.isMovimento()){ //Verificando se o tipo de movimento é saída.
                if(!resultadoConsulta.next()){//Verificando se o produto não existe na tabela estoque
                    int confirm = JOptionPane.showConfirmDialog(null,"Você não tem esse produto no estoque, seu estoque ficará negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION){
                        adicionarProdutoEstoque(movimentacao.getProduto(), movimentacao.getEstoque(), -movimentacao.getQuantidade());
                    }else if(confirm == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                        return;
                    }
                }else{
                    //Verificando se o saldo é 0 ou menor que a quantidade que será movimentada
                    if(resultadoConsulta.getInt("Quantidade") == 0 || movimentacao.getQuantidade() > resultadoConsulta.getInt("Quantidade")){
                        int confirm = JOptionPane.showConfirmDialog(null,"O estoque não tem a quantidade solicitada, seu estoque ficará negativo. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                        if(confirm == JOptionPane.YES_OPTION){
                            alterarProdutoEstoque(movimentacao.getProduto(), movimentacao.getEstoque(), resultadoConsulta.getInt("Quantidade") - movimentacao.getQuantidade());
                        }else if(confirm == JOptionPane.NO_OPTION){
                            JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                            return;
                        }
                    }
                    else{ //Realizando a operação quando o saldo não for  menor que a quantidade ou zerado
                        alterarProdutoEstoque(movimentacao.getProduto(), movimentacao.getEstoque(), resultadoConsulta.getInt("Quantidade") - movimentacao.getQuantidade());
                    }
                }   
            }
            else if(movimentacao.isMovimento()){//Verificando se o tipo de movimento é entrada
                if(!resultadoConsulta.next()){//Verificando se o produto existe na tabela estoque
                    int confirm = JOptionPane.showConfirmDialog(null,"Você não tem esse produto no estoque. Adiciona-lo? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION){
                        adicionarProdutoEstoque(movimentacao.getProduto(), movimentacao.getEstoque(), movimentacao.getQuantidade());
                    }else if(confirm == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                        return;
                    }
                }else{
                    int confirm = JOptionPane.showConfirmDialog(null,"Adicionar o produto ao estoque?. Continuar? ", "Confirmar", JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION){
                        alterarProdutoEstoque(movimentacao.getProduto(), movimentacao.getEstoque(), resultadoConsulta.getInt("Quantidade") + movimentacao.getQuantidade());
                    }else if(confirm == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Operação cancelada!"); 
                        return;
                    }
                } 
            }
            resultadoConsulta.close();
            ps.close();
            conexao.close();
            
            //movimentacaoRealizada(movimentacao, data);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar movimentar o produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }      

    //Método para alterar quantidade do produto, quando o produto já tem no estoque
    public void alterarProdutoEstoque(Produto produto, Estoque estoque, int quantidade){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sqlAtualiza = "UPDATE estoque SET Quantidade=?" + " WHERE CodigoProduto=? AND CodigoEstoque=?";
            PreparedStatement ps  = conexao.prepareStatement(sqlAtualiza);

            ps.setInt(1, quantidade);
            ps.setInt(2, produto.getCodigo());
            ps.setInt(3, estoque.getCodigo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Produto "+produto.getCodigo()+ " movimentado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar movimentar o produto "+produto.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
} 



