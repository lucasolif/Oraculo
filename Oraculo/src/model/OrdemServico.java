
package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;


public class OrdemServico {
    
    private int NumOS, codAssociacao;
    private Pessoa cliente, tecnico;
    private String status, dataAbertura, dataFechamento, dataCancelamento, observacao;
    private double totalProdutos, totalServicos;
    private Veiculo veiculo;
    private String prioridadeOS;
    private Checklist checklist;
    private List<Produto> produtos;
    private List<Servico> servicos;
    private Vendas venda;

    public OrdemServico() {
    }

    //Construtor para consultar OS
    public OrdemServico(int NumOS, int codAssociacao, Pessoa cliente, String status, String dataAbertura, String dataFechamento, String dataCancelamento, String observacao, double totalProdutos, double totalServicos, Pessoa tecnico, Veiculo veiculo, String prioridadeOS, Checklist checklist, List<Produto> produtos, List<Servico> servicos) {
        this.NumOS = NumOS;
        this.codAssociacao = codAssociacao;
        this.cliente = cliente;
        this.status = status;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.dataCancelamento = dataCancelamento;
        this.observacao = observacao;
        this.totalProdutos = totalProdutos;
        this.totalServicos = totalServicos;
        this.tecnico = tecnico;
        this.veiculo = veiculo;
        this.prioridadeOS = prioridadeOS;
        this.checklist = checklist;
        this.produtos = produtos;
        this.servicos = servicos;
    }

    //Construtor para abertura OS
    public OrdemServico(Pessoa cliente, String status, String dataAbertura, String observacao, Pessoa tecnico, Veiculo veiculo, String prioridadeOS, Checklist checklist) {
        this.cliente = cliente;
        this.status = status;
        this.dataAbertura = dataAbertura;
        this.observacao = observacao;

        this.tecnico = tecnico;
        this.veiculo = veiculo;
        this.prioridadeOS = prioridadeOS;
        this.checklist = checklist;
    }

    public int getNumOS() {
        return NumOS;
    }

    public void setNumOS(int NumOS) {
        this.NumOS = NumOS;
    }

    public int getCodAssociacao() {
        return codAssociacao;
    }

    public void setCodAssociacao(int codAssociacao) {
        this.codAssociacao = codAssociacao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getTecnico() {
        return tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(double totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public double getTotalServicos() {
        return totalServicos;
    }

    public void setTotalServicos(double totalServicos) {
        this.totalServicos = totalServicos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getPrioridadeOS() {
        return prioridadeOS;
    }

    public void setPrioridadeOS(String prioridadeOS) {
        this.prioridadeOS = prioridadeOS;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.NumOS;
        hash = 59 * hash + this.codAssociacao;
        hash = 59 * hash + Objects.hashCode(this.cliente);
        hash = 59 * hash + Objects.hashCode(this.tecnico);
        hash = 59 * hash + Objects.hashCode(this.status);
        hash = 59 * hash + Objects.hashCode(this.dataAbertura);
        hash = 59 * hash + Objects.hashCode(this.dataFechamento);
        hash = 59 * hash + Objects.hashCode(this.dataCancelamento);
        hash = 59 * hash + Objects.hashCode(this.observacao);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalProdutos) ^ (Double.doubleToLongBits(this.totalProdutos) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalServicos) ^ (Double.doubleToLongBits(this.totalServicos) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.veiculo);
        hash = 59 * hash + Objects.hashCode(this.prioridadeOS);
        hash = 59 * hash + Objects.hashCode(this.checklist);
        hash = 59 * hash + Objects.hashCode(this.produtos);
        hash = 59 * hash + Objects.hashCode(this.servicos);
        hash = 59 * hash + Objects.hashCode(this.venda);
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
        final OrdemServico other = (OrdemServico) obj;
        if (this.NumOS != other.NumOS) {
            return false;
        }
        if (this.codAssociacao != other.codAssociacao) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalProdutos) != Double.doubleToLongBits(other.totalProdutos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalServicos) != Double.doubleToLongBits(other.totalServicos)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.dataAbertura, other.dataAbertura)) {
            return false;
        }
        if (!Objects.equals(this.dataFechamento, other.dataFechamento)) {
            return false;
        }
        if (!Objects.equals(this.dataCancelamento, other.dataCancelamento)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.prioridadeOS, other.prioridadeOS)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.tecnico, other.tecnico)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.checklist, other.checklist)) {
            return false;
        }
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        if (!Objects.equals(this.servicos, other.servicos)) {
            return false;
        }
        return Objects.equals(this.venda, other.venda);
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "NumOS=" + NumOS + ", codAssociacao=" + codAssociacao + ", cliente=" + cliente + ", tecnico=" + tecnico + ", status=" + status + ", dataAbertura=" + dataAbertura + ", dataFechamento=" + dataFechamento + ", dataCancelamento=" + dataCancelamento + ", observacao=" + observacao + ", totalProdutos=" + totalProdutos + ", totalServicos=" + totalServicos + ", veiculo=" + veiculo + ", prioridadeOS=" + prioridadeOS + ", checklist=" + checklist + ", produtos=" + produtos + ", servicos=" + servicos + ", venda=" + venda + '}';
    }


    
}
