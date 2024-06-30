
package model;

import java.util.Objects;


public class Pessoa {
    
    private String razaoSocial, nomeFantasia, cpfCnpj, dataNascimento, rg, telefone, celular, email, inscricaoMunicipal, inscricaoEstadual, tipoPessoa, sexo; 
    private TipoCadastro tipoCadastro;
    private Endereco endereco;
    private int codigo;

    public Pessoa() {
    }
    
    //Construtor para receber os valore da consultar no banco de dados
    public Pessoa(int codigo, String razaoSocial, String nomeFantasia, String cpfCnpj, String dataNascimento, String rg, String sexo, String telefone, String celular, String email, String inscricaoMunicipal, String inscricaoEstadual, TipoCadastro tipoCadastro, Endereco endereco, String tipoPessoa) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.tipoCadastro = tipoCadastro;
        this.endereco = endereco;
        this.codigo = codigo;
        this.tipoPessoa = tipoPessoa;
    }

    //Construtor para pessoa física
    public Pessoa(String razaoSocial, String nomeFantasia, String cpfCnpj, String dataNascimento, String rg, String sexo, String telefone, String celular, String email, TipoCadastro tipoCadastro, Endereco endereco, String tipoPessoa) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.tipoCadastro = tipoCadastro;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }

    //Construtro para pessoa juridica
    public Pessoa(String razaoSocial, String nomeFantasia, String cpfCnpj, String telefone, String celular, String email, String inscricaoMunicipal, String inscricaoEstadual, TipoCadastro tipoCadastro, Endereco endereco, String tipoPessoa) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.tipoCadastro = tipoCadastro;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }

    //Construtor para abertura OS
    public Pessoa(String razaoSocial, String nomeFantasia, String cpfCnpj, String celular, String email, Endereco endereco, int codigo) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cpfCnpj = cpfCnpj;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.codigo = codigo;
    }

    //Construtor para técnico OS
    public Pessoa(String razaoSocial, int codigo) {
        this.razaoSocial = razaoSocial;
        this.codigo = codigo;
    }
    
    //Construtor Cliente Venda
    public Pessoa(int codigo, String razaoSocial, String cpfCnpj) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cpfCnpj = cpfCnpj;
    }
    
 
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public TipoCadastro getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(TipoCadastro tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.razaoSocial);
        hash = 13 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 13 * hash + Objects.hashCode(this.cpfCnpj);
        hash = 13 * hash + Objects.hashCode(this.dataNascimento);
        hash = 13 * hash + Objects.hashCode(this.rg);
        hash = 13 * hash + Objects.hashCode(this.telefone);
        hash = 13 * hash + Objects.hashCode(this.celular);
        hash = 13 * hash + Objects.hashCode(this.email);
        hash = 13 * hash + Objects.hashCode(this.inscricaoMunicipal);
        hash = 13 * hash + Objects.hashCode(this.inscricaoEstadual);
        hash = 13 * hash + Objects.hashCode(this.tipoPessoa);
        hash = 13 * hash + Objects.hashCode(this.sexo);
        hash = 13 * hash + Objects.hashCode(this.tipoCadastro);
        hash = 13 * hash + Objects.hashCode(this.endereco);
        hash = 13 * hash + this.codigo;
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
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.cpfCnpj, other.cpfCnpj)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
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
        if (!Objects.equals(this.inscricaoMunicipal, other.inscricaoMunicipal)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoEstadual, other.inscricaoEstadual)) {
            return false;
        }
        if (!Objects.equals(this.tipoPessoa, other.tipoPessoa)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.tipoCadastro, other.tipoCadastro)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }

    @Override
    public String toString() {
        return "ClienteFornecedor{" + "razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", cpfCnpj=" + cpfCnpj + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", inscricaoMunicipal=" + inscricaoMunicipal + ", inscricaoEstadual=" + inscricaoEstadual + ", tipoPessoa=" + tipoPessoa + ", sexo=" + sexo + ", tipoCadastro=" + tipoCadastro + ", endereco=" + endereco + ", codigo=" + codigo + '}';
    }    
}
