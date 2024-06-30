
package dao;

import jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.Endereco;
import model.Entidades;
import model.TipoCadastro;


public class PessoasDao {
    
    private TipoCadastroDao tpCadastroDao = new TipoCadastroDao();
    
    //Método para adicionar pessoa juridica
    public void adicionarPessoaJuridica(Pessoa pessoaJuridica, String data){
        Connection conexao = new Conexao().iniciarConexao();
        
        try{
            String sql = "insert into clientes (TipoCadastro,TipoPessoa,nome,nomeFantasia,cpfCnpj,inscricaoEstadual,inscricaoMunicipal,telefone,celular,email,logradouro,numeroCasa,cep,bairro,cidade,estado,complemento,dataCadastro) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, pessoaJuridica.getTipoCadastro().getCodigo());
            ps.setString(2, pessoaJuridica.getTipoPessoa());
            ps.setString(3, pessoaJuridica.getRazaoSocial());
            ps.setString(4, pessoaJuridica.getNomeFantasia());
            ps.setString(5, pessoaJuridica.getCpfCnpj());
            ps.setString(6, pessoaJuridica.getInscricaoEstadual());
            ps.setString(7, pessoaJuridica.getInscricaoMunicipal());
            ps.setString(8, pessoaJuridica.getTelefone());
            ps.setString(9, pessoaJuridica.getCelular());
            ps.setString(10, pessoaJuridica.getEmail());
            ps.setString(11, pessoaJuridica.getEndereco().getRua());
            ps.setString(12, pessoaJuridica.getEndereco().getNumero());
            ps.setString(13, pessoaJuridica.getEndereco().getCep());
            ps.setString(14, pessoaJuridica.getEndereco().getBairro());
            ps.setString(15, pessoaJuridica.getEndereco().getCidade());
            ps.setString(16, pessoaJuridica.getEndereco().getEstado());
            ps.setString(17, pessoaJuridica.getEndereco().getComplemento());
            ps.setString(18, data);
        
        
            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Cliente pessoa juridica cadastrada com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o cliente pessoa juridica", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }  
    
    //Método para adicionar pessoa física
    public void adicionarPessoaFisica(Pessoa pessoaFisica, String data){
        
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "INSERT INTO clientes (tipoCadastro,TipoPessoa,nome,nomeFantasia,cpfCnpj,rg,sexo,dataNascimento,telefone,celular,email,logradouro,numeroCasa,cep,bairro,cidade,estado,complemento,dataCadastro) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, pessoaFisica.getTipoCadastro().getCodigo());
            ps.setString(2, pessoaFisica.getTipoPessoa());
            ps.setString(3, pessoaFisica.getRazaoSocial());
            ps.setString(4, pessoaFisica.getNomeFantasia());
            ps.setString(5, pessoaFisica.getCpfCnpj());
            ps.setString(6, pessoaFisica.getRg());
            ps.setString(7, pessoaFisica.getSexo());
            ps.setString(8, pessoaFisica.getDataNascimento());
            ps.setString(9, pessoaFisica.getTelefone());
            ps.setString(10, pessoaFisica.getCelular());
            ps.setString(11, pessoaFisica.getEmail());
            ps.setString(12, pessoaFisica.getEndereco().getRua());
            ps.setString(13, pessoaFisica.getEndereco().getNumero());
            ps.setString(14, pessoaFisica.getEndereco().getCep());
            ps.setString(15, pessoaFisica.getEndereco().getBairro());
            ps.setString(16, pessoaFisica.getEndereco().getCidade());
            ps.setString(17, pessoaFisica.getEndereco().getEstado());
            ps.setString(18, pessoaFisica.getEndereco().getComplemento());
            ps.setString(19, data);


            ps.execute();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Cliente pessoa juridica fisica com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o cliente pessoa física", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Método para consultar cliente e listar na tabela
    public List<Pessoa> consultarNomeCodigo(String nome){
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = null;
        List<Pessoa> listaClienteFornecedor = new ArrayList<>();
        
        if(nome.length() >= 0){
            if(verificarNumero(nome)){
                sql = "SELECT * FROM clientes WHERE Codigo Like ?";
            }else{
                sql = "SELECT * FROM clientes WHERE Nome LIKE ?";
            }   
        }
        else{
            sql = "SELECT * FROM clientes";
        }
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%"+nome+"%");
            ResultSet consulta = ps.executeQuery();

            while(consulta.next()){
                Endereco endereco = new Endereco(consulta.getString("Logradouro"),consulta.getString("NumeroCasa"),consulta.getString("CEP"),consulta.getString("Bairro"),consulta.getString("Cidade"),consulta.getString("Estado"),consulta.getString("Complemento"));
                TipoCadastro tpCadastro = new TipoCadastro(tpCadastroDao.consultarDescTpCadastro(consulta.getInt("TipoCadastro")), consulta.getInt("TipoCadastro"));
                Pessoa clienteFornecedor = new Pessoa(consulta.getInt("Codigo"), consulta.getString("Nome"),consulta.getString("NomeFantasia"),consulta.getString("CPFCNPJ"),consulta.getString("DataNascimento"),consulta.getString("RG"),consulta.getString("Sexo"),consulta.getString("Telefone"),consulta.getString("Celular"),consulta.getString("Email"),consulta.getString("InscricaoMunicipal"),consulta.getString("InscricaoEstadual"),tpCadastro, endereco,consulta.getString("TipoPessoa"));
                listaClienteFornecedor.add(clienteFornecedor);
            }

            consulta.close();
            ps.close();
            conexao.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar buscar cliente na base de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaClienteFornecedor;     
    }
    
    //Método para consultar cliente e técnico das OS
    public Pessoa consultarCodigo(int cod) {
        
        Connection conexao = new Conexao().iniciarConexao();
        String sql = "SELECT * FROM clientes WHERE Codigo=?";
        Pessoa pessoas = null;
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet consulta = ps.executeQuery();

            while(consulta.next()){
                Endereco endereco = new Endereco(consulta.getString("Logradouro"),consulta.getString("NumeroCasa"),consulta.getString("CEP"),consulta.getString("Bairro"),consulta.getString("Cidade"),consulta.getString("Estado"),consulta.getString("Complemento"));
                TipoCadastro tpCadastro = new TipoCadastro(tpCadastroDao.consultarDescTpCadastro(consulta.getInt("TipoCadastro")), consulta.getInt("TipoCadastro"));
                pessoas = new Pessoa(consulta.getInt("Codigo"), consulta.getString("Nome"),consulta.getString("NomeFantasia"),consulta.getString("CPFCNPJ"),consulta.getString("DataNascimento"),consulta.getString("RG"),consulta.getString("Sexo"),consulta.getString("Telefone"),consulta.getString("Celular"),consulta.getString("Email"),consulta.getString("InscricaoMunicipal"),consulta.getString("InscricaoEstadual"),tpCadastro, endereco,consulta.getString("TipoPessoa"));
            }

            consulta.close();
            ps.close();
            conexao.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o cliente/técnico", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return pessoas;
        
    }
    
    //Alterar o cadastro das pessoas
    public void alterar(Pessoa pessoa, String tipoPessoa){
        Connection conexao = new Conexao().iniciarConexao();
        PreparedStatement ps = null;
        String sql = null;
        
        try{
            if(tipoPessoa.equalsIgnoreCase("fisica")){
                sql= "UPDATE clientes SET TipoCadastro=?,TipoPessoa=?,Nome=?,NomeFantasia=?,CPFCNPJ=?,RG=?,Sexo=?,DataNascimento=?,Telefone=?,Celular=?,Email=?,Logradouro=?,NumeroCasa=?,CEP=?,Bairro=?,Cidade=?,Estado=?,Complemento=?" + " WHERE Codigo=?";
                ps = conexao.prepareStatement(sql);

                ps.setInt(1, pessoa.getTipoCadastro().getCodigo());
                ps.setString(2, pessoa.getTipoPessoa());
                ps.setString(3, pessoa.getRazaoSocial());
                ps.setString(4, pessoa.getNomeFantasia());
                ps.setString(5, pessoa.getCpfCnpj());
                ps.setString(6, pessoa.getRg());
                ps.setString(7, pessoa.getSexo());
                ps.setString(8, pessoa.getDataNascimento());
                ps.setString(9, pessoa.getTelefone());
                ps.setString(10, pessoa.getCelular());
                ps.setString(11, pessoa.getEmail());
                ps.setString(12, pessoa.getEndereco().getRua());
                ps.setString(13, pessoa.getEndereco().getNumero());
                ps.setString(14, pessoa.getEndereco().getCep());
                ps.setString(15, pessoa.getEndereco().getBairro());
                ps.setString(16, pessoa.getEndereco().getCidade());
                ps.setString(17, pessoa.getEndereco().getEstado());
                ps.setString(18, pessoa.getEndereco().getComplemento());
                ps.setInt(19, pessoa.getCodigo());
            }
            if(tipoPessoa.equalsIgnoreCase("juridica")){

                sql= "UPDATE clientes SET TipoCadastro=?,TipoPessoa=?,Nome=?,NomeFantasia=?,CPFCNPJ=?,InscricaoEstadual=?,InscricaoMunicipal=?,Telefone=?,Celular=?,Email=?,Logradouro=?,NumeroCasa=?,CEP=?,Bairro=?,Cidade=?,Estado=?,Complemento=?" + " WHERE Codigo=?";
                ps = conexao.prepareStatement(sql);

                ps.setInt(1, pessoa.getTipoCadastro().getCodigo());
                ps.setString(2, pessoa.getTipoPessoa());
                ps.setString(3, pessoa.getRazaoSocial());
                ps.setString(4, pessoa.getNomeFantasia());
                ps.setString(5, pessoa.getCpfCnpj());
                ps.setString(6, pessoa.getInscricaoEstadual());
                ps.setString(7, pessoa.getInscricaoMunicipal());
                ps.setString(8, pessoa.getTelefone());
                ps.setString(9, pessoa.getCelular());
                ps.setString(10, pessoa.getEmail());
                ps.setString(11, pessoa.getEndereco().getRua());
                ps.setString(12, pessoa.getEndereco().getNumero());
                ps.setString(13, pessoa.getEndereco().getCep());
                ps.setString(14, pessoa.getEndereco().getBairro());
                ps.setString(15, pessoa.getEndereco().getCidade());
                ps.setString(16, pessoa.getEndereco().getEstado());
                ps.setString(17, pessoa.getEndereco().getComplemento());
                ps.setInt(18, pessoa.getCodigo());
            }

            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Cliente "+ pessoa.getCodigo()+" alterado com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar o cliente "+pessoa.getCodigo(), "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    //Remover o cadastro das pessoas
    public void remover(int codigo){
        try{
            Connection conexao = new Conexao().iniciarConexao();
            String sql = "DELETE FROM clientes WHERE Codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.executeUpdate();
            ps.close();
            conexao.close();   
            
            JOptionPane.showMessageDialog(null, "Cliente "+codigo+" excluído com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o cliente "+codigo, "Erro", JOptionPane.ERROR_MESSAGE);
        
            return;
        }
    }
    
    //Verifica se é String é um número
    private static boolean verificarNumero(String valor) {
        return valor != null && valor.matches("[0-9]*");
    }
}
