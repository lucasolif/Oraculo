
package model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;


public class ContasPagarReceber {
    
    private int codigo;
    private int codCliente;
    private String numBoleto;
    private String numNota;
    private Date dataEmissao;
    private int formaPagto;
    private int statusPagamento;
    private int numParcela;
    private LocalDate dataVencimento;
    private double valorBoleto;
    private Date dataPagamento;
    private String observacao;
    private String usuario;

    public ContasPagarReceber(int codigo, int codCliente, String numBoleto, String numNota, Date dataEmissao, int formaPagto, int statusPagamento, int numParcela, LocalDate dataVencimento, double valorBoleto, Date dataPagamento, String observacao, String usuario) {
        this.codigo = codigo;
        this.codCliente = codCliente;
        this.numBoleto = numBoleto;
        this.numNota = numNota;
        this.dataEmissao = dataEmissao;
        this.formaPagto = formaPagto;
        this.statusPagamento = statusPagamento;
        this.numParcela = numParcela;
        this.dataVencimento = dataVencimento;
        this.valorBoleto = valorBoleto;
        this.dataPagamento = dataPagamento;
        this.observacao = observacao;
        this.usuario = usuario;
    }

    //Construtor para adicionar os dados no banco
    public ContasPagarReceber(int codCliente, String numBoleto, String numNota, Date dataEmissao, int formaPagto, int statusPagamento, LocalDate dataVencimento, double valorBoleto, String observacao, String usuario) {
        this.codCliente = codCliente;
        this.numBoleto = numBoleto;
        this.numNota = numNota;
        this.dataEmissao = dataEmissao;
        this.formaPagto = formaPagto;
        this.statusPagamento = statusPagamento;
        this.dataVencimento = dataVencimento;
        this.valorBoleto = valorBoleto;
        this.observacao = observacao;
        this.usuario = usuario;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNumBoleto() {
        return numBoleto;
    }

    public void setNumBoleto(String numBoleto) {
        this.numBoleto = numBoleto;
    }

    public String getNumNota() {
        return numNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(int formaPagto) {
        this.formaPagto = formaPagto;
    }

    public int getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(int statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + this.codCliente;
        hash = 47 * hash + Objects.hashCode(this.numBoleto);
        hash = 47 * hash + Objects.hashCode(this.numNota);
        hash = 47 * hash + Objects.hashCode(this.dataEmissao);
        hash = 47 * hash + this.formaPagto;
        hash = 47 * hash + this.statusPagamento;
        hash = 47 * hash + this.numParcela;
        hash = 47 * hash + Objects.hashCode(this.dataVencimento);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.valorBoleto) ^ (Double.doubleToLongBits(this.valorBoleto) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.dataPagamento);
        hash = 47 * hash + Objects.hashCode(this.observacao);
        hash = 47 * hash + Objects.hashCode(this.usuario);
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
        final ContasPagarReceber other = (ContasPagarReceber) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.codCliente != other.codCliente) {
            return false;
        }
        if (this.formaPagto != other.formaPagto) {
            return false;
        }
        if (this.statusPagamento != other.statusPagamento) {
            return false;
        }
        if (this.numParcela != other.numParcela) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorBoleto) != Double.doubleToLongBits(other.valorBoleto)) {
            return false;
        }
        if (!Objects.equals(this.numBoleto, other.numBoleto)) {
            return false;
        }
        if (!Objects.equals(this.numNota, other.numNota)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.dataEmissao, other.dataEmissao)) {
            return false;
        }
        if (!Objects.equals(this.dataVencimento, other.dataVencimento)) {
            return false;
        }
        return Objects.equals(this.dataPagamento, other.dataPagamento);
    }

    @Override
    public String toString() {
        return "ContasPagarReceber{" + "codigo=" + codigo + ", codCliente=" + codCliente + ", numBoleto=" + numBoleto + ", numNota=" + numNota + ", dataEmissao=" + dataEmissao + ", formaPagto=" + formaPagto + ", statusPagamento=" + statusPagamento + ", numParcela=" + numParcela + ", dataVencimento=" + dataVencimento + ", valorBoleto=" + valorBoleto + ", dataPagamento=" + dataPagamento + ", observacao=" + observacao + ", usuario=" + usuario + '}';
    }
     
}
