
package model;

import java.util.Objects;

public class Produto {
    
    private String descricaoProduto, codEan, codGtin, unidadeProduto, marca, codBarras, ncm, cst, cest, csosn;
    private Double peso, ipi, custo, frete, margemLucro, outrasDespesas, precoVenda, desconto; 

    public Produto(String descricaoProduto, String codEan, String codGtin, String unidadeProduto, String marca, String codbarras, String ncm, String cst, String cest, String csosn, Double peso, Double ipi, Double custo, Double frete, Double margemLucro, Double outrasDespesas, Double precoVenda, Double desconto) {
        this.descricaoProduto = descricaoProduto;
        this.codEan = codEan;
        this.codGtin = codGtin;
        this.unidadeProduto = unidadeProduto;
        this.marca = marca;
        this.codBarras = codbarras;
        this.ncm = ncm;
        this.cst = cst;
        this.cest = cest;
        this.csosn = csosn;
        this.peso = peso;
        this.ipi = ipi;
        this.custo = custo;
        this.frete = frete;
        this.margemLucro = margemLucro;
        this.outrasDespesas = outrasDespesas;
        this.precoVenda = precoVenda;
        this.desconto = desconto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public String getCodEan() {
        return codEan;
    }

    public String getCodGtin() {
        return codGtin;
    }

    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public String getNcm() {
        return ncm;
    }

    public String getCst() {
        return cst;
    }

    public String getCest() {
        return cest;
    }

    public String getCsosn() {
        return csosn;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getIpi() {
        return ipi;
    }

    public Double getCusto() {
        return custo;
    }

    public Double getFrete() {
        return frete;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public Double getOutrasDespesas() {
        return outrasDespesas;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public Double getDesconto() {
        return desconto;
    }

    
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setCodEan(String codEan) {
        this.codEan = codEan;
    }

    public void setCodGtin(String codGtin) {
        this.codGtin = codGtin;
    }

    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public void setOutrasDespesas(Double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.descricaoProduto);
        hash = 11 * hash + Objects.hashCode(this.codEan);
        hash = 11 * hash + Objects.hashCode(this.codGtin);
        hash = 11 * hash + Objects.hashCode(this.unidadeProduto);
        hash = 11 * hash + Objects.hashCode(this.marca);
        hash = 11 * hash + Objects.hashCode(this.codBarras);
        hash = 11 * hash + Objects.hashCode(this.ncm);
        hash = 11 * hash + Objects.hashCode(this.cst);
        hash = 11 * hash + Objects.hashCode(this.cest);
        hash = 11 * hash + Objects.hashCode(this.csosn);
        hash = 11 * hash + Objects.hashCode(this.peso);
        hash = 11 * hash + Objects.hashCode(this.ipi);
        hash = 11 * hash + Objects.hashCode(this.custo);
        hash = 11 * hash + Objects.hashCode(this.frete);
        hash = 11 * hash + Objects.hashCode(this.margemLucro);
        hash = 11 * hash + Objects.hashCode(this.outrasDespesas);
        hash = 11 * hash + Objects.hashCode(this.precoVenda);
        hash = 11 * hash + Objects.hashCode(this.desconto);
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
        if (!Objects.equals(this.descricaoProduto, other.descricaoProduto)) {
            return false;
        }
        if (!Objects.equals(this.codEan, other.codEan)) {
            return false;
        }
        if (!Objects.equals(this.codGtin, other.codGtin)) {
            return false;
        }
        if (!Objects.equals(this.unidadeProduto, other.unidadeProduto)) {
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
        if (!Objects.equals(this.precoVenda, other.precoVenda)) {
            return false;
        }
        return Objects.equals(this.desconto, other.desconto);
    }

    @Override
    public String toString() {
        return "Produto{" + "descricaoProduto=" + descricaoProduto + ", codEan=" + codEan + ", codGtin=" + codGtin + ", unidadeProduto=" + unidadeProduto + ", marca=" + marca + ", codBarras=" + codBarras + ", ncm=" + ncm + ", cst=" + cst + ", cest=" + cest + ", csosn=" + csosn + ", peso=" + peso + ", ipi=" + ipi + ", custo=" + custo + ", frete=" + frete + ", margemLucro=" + margemLucro + ", outrasDespesas=" + outrasDespesas + ", precoVenda=" + precoVenda + ", desconto=" + desconto + '}';
    }
      
}
