package model;




import java.util.Objects;

public class Empresa {
    
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    private String celular;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Empresa(String razaoSocial, String nomeFantasia, String cnpj, String inscricaoMunicipal, String inscricaoEstadual, String celular, String telefone, String email, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.razaoSocial);
        hash = 37 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 37 * hash + Objects.hashCode(this.cnpj);
        hash = 37 * hash + Objects.hashCode(this.inscricaoMunicipal);
        hash = 37 * hash + Objects.hashCode(this.inscricaoEstadual);
        hash = 37 * hash + Objects.hashCode(this.celular);
        hash = 37 * hash + Objects.hashCode(this.telefone);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.endereco);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoMunicipal, other.inscricaoMunicipal)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoEstadual, other.inscricaoEstadual)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }

    @Override
    public String toString() {
        return "Empresa{" + "razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", inscricaoMunicipal=" + inscricaoMunicipal + ", inscricaoEstadual=" + inscricaoEstadual + ", celular=" + celular + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + '}';
    }

    
   
}
