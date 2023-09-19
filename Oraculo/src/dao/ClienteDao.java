
package dao;

import jdbc.Conexao;
import model.Empresa;
import model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    
    public void adicionarEmpresa(Empresa empresa) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into empresa (nome,nomeFantasia,cpfCnpj,rg,inscricaoEstadual,inscricaoMunicipal,sexo,dataNascimento,telefone,celular,email,endereco,numeroCasa,cep,bairro,cidade,estado,complemento) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, empresa.getRazaoSocial());
        ps.setString(2, empresa.getNomeFantasia());
        ps.setString(3, empresa.getCnpj());
        ps.setString(4, "");
        ps.setString(5, empresa.getInscricaoEstadual());
        ps.setString(6, empresa.getInscricaoMunicipal());
        ps.setString(7, "");
        ps.setString(8, "");
        ps.setString(9, empresa.getTelefone());
        ps.setString(10, empresa.getCelular());
        ps.setString(11, empresa.getEmail());
        ps.setString(12, empresa.getEndereco().getRua());
        ps.setString(13, empresa.getEndereco().getNumero());
        ps.setString(14, empresa.getEndereco().getCep());
        ps.setString(15, empresa.getEndereco().getBairro());
        ps.setString(16, empresa.getEndereco().getCidade());
        ps.setString(17, empresa.getEndereco().getEstado());
        ps.setString(18, empresa.getEndereco().getComplemento());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    
    public void adicionarPessoa(Pessoa pessoa) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into empresa (nome,nomeFantasia,cpfCnpj,rg,inscricaoEstadual,inscricaoMunicipal,sexo,dataNascimento,telefone,celular,email,endereco,numeroCasa,cep,bairro,cidade,estado,complemento) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getNomeFantasia());
        ps.setString(3, pessoa.getCpf());
        ps.setString(4, pessoa.getRg());
        ps.setString(5, "");
        ps.setString(6, "");
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
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
}
