
package dao;

import jdbc.Conexao;
import model.Empresa;
import model.Endereco;
import model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    
    public void adicionarEmpresa(Empresa empresa) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into empresa (nome,nomeFantasia,cpfCnpj,inscricaoEstadual,inscricaoMunicipal,telefone,celular,email,endereco,numeroCasa,cep,bairro,cidade,estado,complemento) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, empresa.getRazaoSocial());
        ps.setString(2, empresa.getNomeFantasia());
        ps.setInt(3, empresa.getCnpj());
        ps.setString(4, empresa.getInscricaoEstadual());
        ps.setString(5, empresa.getInscricaoMunicipal());
        ps.setString(6, empresa.getTelefone());
        ps.setString(7, empresa.getCelular());
        ps.setString(8, empresa.getEmail());
        ps.setString(9, empresa.getEndereco().getRua());
        ps.setString(10, empresa.getEndereco().getNumero());
        ps.setString(11, empresa.getEndereco().getCep());
        ps.setString(12, empresa.getEndereco().getBairro());
        ps.setString(13, empresa.getEndereco().getCidade());
        ps.setString(14, empresa.getEndereco().getEstado());
        ps.setString(15, empresa.getEndereco().getComplemento());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    
    public void adicionarPessoa(Pessoa pessoa) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into empresa (nome,nomeFantasia,cpfCnpj,rg,sexo,dataNascimento,telefone,celular,email,endereco,numeroCasa,cep,bairro,cidade,estado,complemento) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getNomeFantasia());
        ps.setInt(3, pessoa.getCpf());
        ps.setString(4, pessoa.getRg());
        ps.setString(5, pessoa.getSexo());
        ps.setString(6, pessoa.getDataNascimento());
        ps.setString(7, pessoa.getTelefone());
        ps.setString(8, pessoa.getCelular());
        ps.setString(9, pessoa.getEmail());
        ps.setString(10, pessoa.getEndereco().getRua());
        ps.setString(11, pessoa.getEndereco().getNumero());
        ps.setString(12, pessoa.getEndereco().getCep());
        ps.setString(13, pessoa.getEndereco().getBairro());
        ps.setString(14, pessoa.getEndereco().getCidade());
        ps.setString(15, pessoa.getEndereco().getEstado());
        ps.setString(16, pessoa.getEndereco().getComplemento());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
}
