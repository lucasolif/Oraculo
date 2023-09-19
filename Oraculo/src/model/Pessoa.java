
package model;

import java.util.Objects;

public class Pessoa {
    
    private String nome;
    private String nomeFantasia;
    private String cpf;
    private String dataNascimento;
    private String rg;
    private String sexo;
    private String telefone;
    private String celular;
    private String email; 
    private Endereco endereco;

    public Pessoa(String nome, String nomeFantasia, String cpf, String dataNascimento, String rg, String sexo, String telefone, String celular, String email, Endereco endereco) {
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 71 * hash + Objects.hashCode(this.cpf);
        hash = 71 * hash + Objects.hashCode(this.dataNascimento);
        hash = 71 * hash + Objects.hashCode(this.rg);
        hash = 71 * hash + Objects.hashCode(this.sexo);
        hash = 71 * hash + Objects.hashCode(this.telefone);
        hash = 71 * hash + Objects.hashCode(this.celular);
        hash = 71 * hash + Objects.hashCode(this.email);
        hash = 71 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nomeFantasia=" + nomeFantasia + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", sexo=" + sexo + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", endereco=" + endereco + '}';
    }

    
    
}
