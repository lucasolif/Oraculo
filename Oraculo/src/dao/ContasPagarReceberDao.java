
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import jdbc.Conexao;
import model.ContasPagarReceber;
import model.Data;


public class ContasPagarReceberDao {
    
    public void adicionar(ContasPagarReceber contas, int operacao, int qtdParcelas) throws SQLException, ParseException{
        Connection conexao = new Conexao().iniciarConexao();
        PreparedStatement ps = null;
        
        int contParcelas = 0;
        Data data = new Data();
        LocalDate dataVencimento = contas.getDataVencimento();
        
        //Validando a operação que vai ser realizada, para colocar o cadastro na tabela correta
        if(operacao == 1){
            
            String sql= "INSERT INTO contas_receber (Cliente,NumeroBoleto,NumeroNota,DataEmissao,FormaPagamento,StatusPagamento,Parcela,DataVencimento,ValorBoleto,Observacao,Usuario)VALUES (?,?,?)";
            
            //Utilizando while para gerar as parcelas e somar as datas de cada parcela de acordo com a quantidade de parcelas.
            while(contParcelas < qtdParcelas){
                
                //Se for a primeira parcela ele não soma nada na data
                if(contParcelas > 0){
                    dataVencimento = dataVencimento.plusMonths(1);
                }

                ps = conexao.prepareStatement(sql);
                
                ps.setInt(1, contas.getCodCliente());
                ps.setString(2, contas.getNumBoleto());
                ps.setString(3, contas.getNumNota());
                ps.setDate(4, (Date) contas.getDataEmissao());
                ps.setInt(5, contas.getFormaPagto());
                ps.setInt(6, contas.getStatusPagamento());
                ps.setInt(7, contParcelas+1);
                ps.setDate(8, (Date) data.conversaoLocalDataParaDate( dataVencimento));
                ps.setDouble(9, contas.getValorBoleto()/qtdParcelas);
                ps.setString(10, contas.getObservacao());
                ps.setString(11, contas.getUsuario());


                ps.execute();
                contParcelas++;
            }
            
            ps.close();
            conexao.close();

        }else{

            String sql= "INSERT INTO contas_receber (Cliente,NumeroBoleto,NumeroNota,DataEmissao,FormaPagamento,StatusPagamento,Parcela,DataVencimento,ValorBoleto,Observacao,Usuario)VALUES (?,?,?)";
            
            //Utilizando while para gerar as parcelas e somar as datas de cada parcela de acordo com a quantidade de parcelas.
            while(contParcelas < qtdParcelas){
                
                //Se for a primeira parcela ele não soma nada na data
                if(contParcelas > 0){
                    dataVencimento = dataVencimento.plusMonths(1);
                }

                ps = conexao.prepareStatement(sql);
                
                ps.setInt(1, contas.getCodCliente());
                ps.setString(2, contas.getNumBoleto());
                ps.setString(3, contas.getNumNota());
                ps.setDate(4, (Date) contas.getDataEmissao());
                ps.setInt(5, contas.getFormaPagto());
                ps.setInt(6, contas.getStatusPagamento());
                ps.setInt(7, contParcelas+1);
                ps.setDate(8, (Date) data.conversaoLocalDataParaDate( dataVencimento));
                ps.setDouble(9, contas.getValorBoleto()/qtdParcelas);
                ps.setString(10, contas.getObservacao());
                ps.setString(11, contas.getUsuario());


                ps.execute();
                contParcelas++;
            }
            
            ps.close();
            conexao.close();
        }

    }

    
}
