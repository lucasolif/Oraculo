
package model;

public class PessoaFisica extends Pessoa{

    public PessoaFisica(String nome, String sobrenome, String cpf, String dataNascimento, String rg, String sexo, String telefone, String celular, String email, Endereco endereco) {
        super(nome, sobrenome, cpf, dataNascimento, rg, sexo, telefone, celular, email, endereco);
    }
   
}
