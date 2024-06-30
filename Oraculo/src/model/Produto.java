
package model;

import java.util.Calendar;
import java.util.Objects;

public class Produto {
    
    private String descricao, codEan, codGtin, marca, codBarras, ncm, cst, cest, csosn, dataCadastro;
    private Double peso, ipi, custo, frete, margemLucro, outrasDespesas, valorUnitario, desconto, valorTotal; 
    private int codigo, quantidade;
    private Unidades unidade;

    public Produto() {
    }
    
    //Construtur produtos OS
    public Produto(int codigo, String descricao, Unidades unidade, Double valorUnitario, int quantidade, Double valorTotal) {
        this.descricao = descricao;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.codigo = codigo;
        this.quantidade = quantidade;
    } 
    
    //Construtor padrão cadastrar produto
    public Produto(String descricaoProduto, String codEan, String codGtin, Unidades unidadeProduto, String marca, String codBarras, String ncm, String cst, String cest, String csosn, String dataCadastro, Double peso, Double ipi, Double custo, Double frete, Double margemLucro, Double outrasDespesas, Double valorUnitario, Double desconto) {
        this.descricao = descricaoProduto;
        this.codEan = codEan;
        this.codGtin = codGtin;
        this.unidade = unidadeProduto;
        this.marca = marca;
        this.codBarras = codBarras;
        this.ncm = ncm;
        this.cst = cst;
        this.cest = cest;
        this.csosn = csosn;
        this.dataCadastro = dataCadastro;
        this.peso = peso;
        this.ipi = ipi;
        this.custo = custo;
        this.frete = frete;
        this.margemLucro = margemLucro;
        this.outrasDespesas = outrasDespesas;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
    }
    
    public Produto(int cod, String descricaoProduto, String codEan, String codGtin, Unidades unidadeProduto, String marca, String codBarras, String ncm, String cst, String cest, String csosn, String dataCadastro, Double peso, Double ipi, Double custo, Double frete, Double margemLucro, Double outrasDespesas, Double precoVenda, Double desconto) {
        this.codigo = cod;
        this.descricao = descricaoProduto;
        this.codEan = codEan;
        this.codGtin = codGtin;
        this.unidade = unidadeProduto;
        this.marca = marca;
        this.codBarras = codBarras;
        this.ncm = ncm;
        this.cst = cst;
        this.cest = cest;
        this.csosn = csosn;
        this.dataCadastro = dataCadastro;
        this.peso = peso;
        this.ipi = ipi;
        this.custo = custo;
        this.frete = frete;
        this.margemLucro = margemLucro;
        this.outrasDespesas = outrasDespesas;
        this.valorUnitario = precoVenda;
        this.desconto = desconto;
    }

    //Construtor
    public Produto(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    
    //Construtor para os produtos da tela de venda
    public Produto(int codigo, String descricao, Double precoVenda, int quantidade, Double desconto, Double valorTotal) {
        this.descricao = descricao;
        this.valorUnitario = precoVenda;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodEan() {
        return codEan;
    }

    public void setCodEan(String codEan) {
        this.codEan = codEan;
    }

    public String getCodGtin() {
        return codGtin;
    }

    public void setCodGtin(String codGtin) {
        this.codGtin = codGtin;
    }

    public Unidades getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidades unidade) {
        this.unidade = unidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(Double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
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
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.descricao);
        hash = 89 * hash + Objects.hashCode(this.codEan);
        hash = 89 * hash + Objects.hashCode(this.codGtin);
        hash = 89 * hash + Objects.hashCode(this.marca);
        hash = 89 * hash + Objects.hashCode(this.codBarras);
        hash = 89 * hash + Objects.hashCode(this.ncm);
        hash = 89 * hash + Objects.hashCode(this.cst);
        hash = 89 * hash + Objects.hashCode(this.cest);
        hash = 89 * hash + Objects.hashCode(this.csosn);
        hash = 89 * hash + Objects.hashCode(this.dataCadastro);
        hash = 89 * hash + Objects.hashCode(this.peso);
        hash = 89 * hash + Objects.hashCode(this.ipi);
        hash = 89 * hash + Objects.hashCode(this.custo);
        hash = 89 * hash + Objects.hashCode(this.frete);
        hash = 89 * hash + Objects.hashCode(this.margemLucro);
        hash = 89 * hash + Objects.hashCode(this.outrasDespesas);
        hash = 89 * hash + Objects.hashCode(this.valorUnitario);
        hash = 89 * hash + Objects.hashCode(this.desconto);
        hash = 89 * hash + Objects.hashCode(this.valorTotal);
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + this.quantidade;
        hash = 89 * hash + Objects.hashCode(this.unidade);
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
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.codEan, other.codEan)) {
            return false;
        }
        if (!Objects.equals(this.codGtin, other.codGtin)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.codBarras, other.codBarras)) {
            return false;
        }
        if (!Objects.equals(this.ncm, other.ncm)) {
            return false;
        }
        if (!Objects.equals(this.cst, other.cst)) {
            return false;
        }
        if (!Objects.equals(this.cest, other.cest)) {
            return false;
        }
        if (!Objects.equals(this.csosn, other.csosn)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.ipi, other.ipi)) {
            return false;
        }
        if (!Objects.equals(this.custo, other.custo)) {
            return false;
        }
        if (!Objects.equals(this.frete, other.frete)) {
            return false;
        }
        if (!Objects.equals(this.margemLucro, other.margemLucro)) {
            return false;
        }
        if (!Objects.equals(this.outrasDespesas, other.outrasDespesas)) {
            return false;
        }
        if (!Objects.equals(this.valorUnitario, other.valorUnitario)) {
            return false;
        }
        if (!Objects.equals(this.desconto, other.desconto)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        return Objects.equals(this.unidade, other.unidade);
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", codEan=" + codEan + ", codGtin=" + codGtin + ", marca=" + marca + ", codBarras=" + codBarras + ", ncm=" + ncm + ", cst=" + cst + ", cest=" + cest + ", csosn=" + csosn + ", dataCadastro=" + dataCadastro + ", peso=" + peso + ", ipi=" + ipi + ", custo=" + custo + ", frete=" + frete + ", margemLucro=" + margemLucro + ", outrasDespesas=" + outrasDespesas + ", valorUnitario=" + valorUnitario + ", desconto=" + desconto + ", valorTotal=" + valorTotal + ", codigo=" + codigo + ", quantidade=" + quantidade + ", unidade=" + unidade + '}';
    }
    
}
