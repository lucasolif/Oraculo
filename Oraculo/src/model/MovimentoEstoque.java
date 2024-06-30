
package model;

import java.util.Objects;

public class MovimentoEstoque {
    
    private int quantidade; 
    private String observaco;
    Produto produto;
    Estoque estoque;
    boolean movimento;
    String data;

    public MovimentoEstoque() {
    }

    public MovimentoEstoque(int quantidade, String observacao, Produto produto, Estoque estoque, boolean movimento, String data) {
        this.quantidade = quantidade;
        this.observaco = observacao;
        this.produto = produto;
        this.estoque = estoque;
        this.movimento = movimento;
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservaco() {
        return observaco;
    }

    public void setObservaco(String observaco) {
        this.observaco = observaco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public boolean isMovimento() {
        return movimento;
    }

    public void setMovimento(boolean movimento) {
        this.movimento = movimento;
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
        hash = 47 * hash + this.quantidade;
        hash = 47 * hash + Objects.hashCode(this.observaco);
        hash = 47 * hash + Objects.hashCode(this.produto);
        hash = 47 * hash + Objects.hashCode(this.estoque);
        hash = 47 * hash + (this.movimento ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.data);
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
        final MovimentoEstoque other = (MovimentoEstoque) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (this.movimento != other.movimento) {
            return false;
        }
        if (!Objects.equals(this.observaco, other.observaco)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return Objects.equals(this.estoque, other.estoque);
    }

    @Override
    public String toString() {
        return "MovimentoEstoque{" + "quantidade=" + quantidade + ", observaco=" + observaco + ", produto=" + produto + ", estoque=" + estoque + ", movimento=" + movimento + ", data=" + data + '}';
    }


}
