
package model;

import java.util.Objects;


public class DadosFiscais{
    private int codInterno;
    private String codigoFiscal, descricao, dataCadastro;

    public DadosFiscais() {
    }

    public DadosFiscais(int codInterno, String codigoFiscal, String descricao, String dataCadastro) {
        this.codInterno = codInterno;
        this.codigoFiscal = codigoFiscal;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    public int getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(int codInterno) {
        this.codInterno = codInterno;
    }

    public String getCodigoFiscal() {
        return codigoFiscal;
    }

    public void setCodigoFiscal(String codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codInterno;
        hash = 17 * hash + Objects.hashCode(this.codigoFiscal);
        hash = 17 * hash + Objects.hashCode(this.descricao);
        hash = 17 * hash + Objects.hashCode(this.dataCadastro);
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
        final DadosFiscais other = (DadosFiscais) obj;
        if (this.codInterno != other.codInterno) {
            return false;
        }
        if (!Objects.equals(this.codigoFiscal, other.codigoFiscal)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.dataCadastro, other.dataCadastro);
    }

    @Override
    public String toString() {
        return codigoFiscal+" - "+descricao;
    }
    
    
}
