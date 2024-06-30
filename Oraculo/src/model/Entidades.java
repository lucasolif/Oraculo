
package model;

import java.util.Objects;


public class Entidades {
    private String descricao, dataCadastro;
    private int codigo;

    public Entidades(String descricao, String dataCadastro) {
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    public Entidades(String descricao, String dataCadastro, int codigo) {
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.codigo = codigo;
    }

    public Entidades(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Entidades() {
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.descricao);
        hash = 59 * hash + Objects.hashCode(this.dataCadastro);
        hash = 59 * hash + this.codigo;
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
        final Entidades other = (Entidades) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.dataCadastro, other.dataCadastro);
    }

    @Override
    public String toString() {
        return descricao;
    }

}
