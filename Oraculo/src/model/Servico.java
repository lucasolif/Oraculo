
package model;

import java.util.Objects;


public class Servico {
    
    private String descricao, codAtividadeServico;
    private double valorUnitario, valorTotal;
    private int codigo, quantidade;
    private Unidades unidade;
    
    //Construtor serviços OS
    public Servico(int codigo, String descricao, double valorServico, int quantidade, double valorTotal) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.valorUnitario = valorServico;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
    }
    

    //Construtor cadastro serviço
    public Servico(String descricao, String codAtividadeServico, double valorServico) {
        this.descricao = descricao;
        this.codAtividadeServico = codAtividadeServico;
        this.valorUnitario = valorServico;
    }

    //Construtor consulta serviços
    public Servico(String descricao, String codServico, double valorServico, int codigo) {
        this.descricao = descricao;
        this.codAtividadeServico = codServico;
        this.valorUnitario = valorServico;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodAtividadeServico() {
        return codAtividadeServico;
    }

    public void setCodAtividadeServico(String codAtividadeServico) {
        this.codAtividadeServico = codAtividadeServico;
    }

    public Unidades getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidades unidade) {
        this.unidade = unidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + Objects.hashCode(this.codAtividadeServico);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorUnitario) ^ (Double.doubleToLongBits(this.valorUnitario) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 61 * hash + this.codigo;
        hash = 61 * hash + this.quantidade;
        hash = 61 * hash + Objects.hashCode(this.unidade);
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
        if (Double.doubleToLongBits(this.valorUnitario) != Double.doubleToLongBits(other.valorUnitario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.codAtividadeServico, other.codAtividadeServico)) {
            return false;
        }
        return Objects.equals(this.unidade, other.unidade);
    }

    @Override
    public String toString() {
        return "Servico{" + "descricao=" + descricao + ", codServico=" + codAtividadeServico + ", valorServico=" + valorUnitario + ", valorTotal=" + valorTotal + ", codigo=" + codigo + ", quantidade=" + quantidade + ", unidade=" + unidade + '}';
    }

}
