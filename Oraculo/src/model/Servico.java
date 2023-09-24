
package model;

import java.util.Calendar;
import java.util.Objects;


public class Servico {
    
    private String codigo;
    private String descricao;
    private Double preco;
    private double iss;
    private String data;

    public Servico(String codigo, String descricao, Double preco, double iss, String data) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.iss = iss;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double getIss() {
        return iss;
    }

    public void setIss(double iss) {
        this.iss = iss;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.descricao);
        hash = 89 * hash + Objects.hashCode(this.preco);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.iss) ^ (Double.doubleToLongBits(this.iss) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.data);
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
        final Servico other = (Servico) obj;
        if (Double.doubleToLongBits(this.iss) != Double.doubleToLongBits(other.iss)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.preco, other.preco);
    }

    @Override
    public String toString() {
        return "Servico{" + "codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", iss=" + iss + ", data=" + data + '}';
    }
    
}
