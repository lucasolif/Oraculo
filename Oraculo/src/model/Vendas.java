
package model;

import java.util.List;
import java.util.Objects;


public class Vendas {
    
    private int codigo, parcelas;
    private double totalVenda, totalDesconto;
    private Pessoa cliente;
    private List<Produto> produtos;
    private ContaCaixa contaCaixa;
    private FormaPagto formaPagto;
    private Estoque estoque;
    private String data, tipoVenda;

    public Vendas() {
    }

    public Vendas(int parcelas, String tipoVenda, double totalVenda, double totalDesconto, Pessoa cliente, List<Produto> produtos, ContaCaixa contaCaixa, FormaPagto formaPagto, Estoque estoque, String data) {
        this.parcelas = parcelas;
        this.tipoVenda = tipoVenda;
        this.totalVenda = totalVenda;
        this.totalDesconto = totalDesconto;
        this.cliente = cliente;
        this.produtos = produtos;
        this.contaCaixa = contaCaixa;
        this.formaPagto = formaPagto;
        this.estoque = estoque;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public ContaCaixa getContaCaixa() {
        return contaCaixa;
    }

    public void setContaCaixa(ContaCaixa contaCaixa) {
        this.contaCaixa = contaCaixa;
    }

    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
        hash = 37 * hash + this.parcelas;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalVenda) ^ (Double.doubleToLongBits(this.totalVenda) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalDesconto) ^ (Double.doubleToLongBits(this.totalDesconto) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.cliente);
        hash = 37 * hash + Objects.hashCode(this.produtos);
        hash = 37 * hash + Objects.hashCode(this.contaCaixa);
        hash = 37 * hash + Objects.hashCode(this.formaPagto);
        hash = 37 * hash + Objects.hashCode(this.estoque);
        hash = 37 * hash + Objects.hashCode(this.data);
        hash = 37 * hash + Objects.hashCode(this.tipoVenda);
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
        final Vendas other = (Vendas) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.parcelas != other.parcelas) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalVenda) != Double.doubleToLongBits(other.totalVenda)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalDesconto) != Double.doubleToLongBits(other.totalDesconto)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.tipoVenda, other.tipoVenda)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        if (!Objects.equals(this.contaCaixa, other.contaCaixa)) {
            return false;
        }
        if (!Objects.equals(this.formaPagto, other.formaPagto)) {
            return false;
        }
        return Objects.equals(this.estoque, other.estoque);
    }

    @Override
    public String toString() {
        return "Vendas{" + "codigo=" + codigo + ", parcelas=" + parcelas + ", totalVenda=" + totalVenda + ", totalDesconto=" + totalDesconto + ", cliente=" + cliente + ", produtos=" + produtos + ", contaCaixa=" + contaCaixa + ", formaPagto=" + formaPagto + ", estoque=" + estoque + ", data=" + data + ", tipoVenda=" + tipoVenda + '}';
    }
   
}
