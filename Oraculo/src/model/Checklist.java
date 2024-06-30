
package model;

import java.util.Objects;


public class Checklist {
    
    private int codigo, bateria, radio, calotas, antena, manual, documentos, acendedor, tapetes, iluminacao, arCondicionado, painel, chaves, macaco, triangulo, extintor, limpadorVidro;
    private String problemaInformado, problemaConstatado, kmAtual, nivelCombustivel, pneusDianteiro, pneusTraseiro, pneuEstepe;

    public Checklist() {
    }

    //Construtor para cadastrar o checklist
    public Checklist(int bateria, int radio, int calotas, int antena, int manual, int documentos, int acendedor, int tapetes, int iluminacao, int arCondicionado, int painel, int chaves, int macaco, int triangulo, int extintor, int limpadorVidro, String problemaInformado, String problemaConstatado, String kmAtual, String nivelCombustivel, String pneusDianteiro, String pneusTraseiro, String pneuEstepe) {
        this.bateria = bateria;
        this.radio = radio;
        this.calotas = calotas;
        this.antena = antena;
        this.manual = manual;
        this.documentos = documentos;
        this.acendedor = acendedor;
        this.tapetes = tapetes;
        this.iluminacao = iluminacao;
        this.arCondicionado = arCondicionado;
        this.painel = painel;
        this.chaves = chaves;
        this.macaco = macaco;
        this.triangulo = triangulo;
        this.extintor = extintor;
        this.limpadorVidro = limpadorVidro;
        this.problemaInformado = problemaInformado;
        this.problemaConstatado = problemaConstatado;
        this.kmAtual = kmAtual;
        this.nivelCombustivel = nivelCombustivel;
        this.pneusDianteiro = pneusDianteiro;
        this.pneusTraseiro = pneusTraseiro;
        this.pneuEstepe = pneuEstepe;
    }

    //Construtor para consultar o checklist
    public Checklist(int codigo, int bateria, int radio, int calotas, int antena, int manual, int documentos, int acendedor, int tapetes, int iluminacao, int arCondicionado, int painel, int chaves, int macaco, int triangulo, int extintor, int limpadorVidro, String problemaInformado, String problemaConstatado, String kmAtual, String nivelCombustivel, String pneusDianteiro, String pneusTraseiro, String pneuEstepe) {
        this.codigo = codigo;
        this.bateria = bateria;
        this.radio = radio;
        this.calotas = calotas;
        this.antena = antena;
        this.manual = manual;
        this.documentos = documentos;
        this.acendedor = acendedor;
        this.tapetes = tapetes;
        this.iluminacao = iluminacao;
        this.arCondicionado = arCondicionado;
        this.painel = painel;
        this.chaves = chaves;
        this.macaco = macaco;
        this.triangulo = triangulo;
        this.extintor = extintor;
        this.limpadorVidro = limpadorVidro;
        this.problemaInformado = problemaInformado;
        this.problemaConstatado = problemaConstatado;
        this.kmAtual = kmAtual;
        this.nivelCombustivel = nivelCombustivel;
        this.pneusDianteiro = pneusDianteiro;
        this.pneusTraseiro = pneusTraseiro;
        this.pneuEstepe = pneuEstepe;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getCalotas() {
        return calotas;
    }

    public void setCalotas(int calotas) {
        this.calotas = calotas;
    }

    public int getAntena() {
        return antena;
    }

    public void setAntena(int antena) {
        this.antena = antena;
    }

    public int getManual() {
        return manual;
    }

    public void setManual(int manual) {
        this.manual = manual;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    public int getAcendedor() {
        return acendedor;
    }

    public void setAcendedor(int acendedor) {
        this.acendedor = acendedor;
    }

    public int getTapetes() {
        return tapetes;
    }

    public void setTapetes(int tapetes) {
        this.tapetes = tapetes;
    }

    public int getIluminacao() {
        return iluminacao;
    }

    public void setIluminacao(int iluminacao) {
        this.iluminacao = iluminacao;
    }

    public int getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(int arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getPainel() {
        return painel;
    }

    public void setPainel(int painel) {
        this.painel = painel;
    }

    public int getChaves() {
        return chaves;
    }

    public void setChaves(int chaves) {
        this.chaves = chaves;
    }

    public int getMacaco() {
        return macaco;
    }

    public void setMacaco(int macaco) {
        this.macaco = macaco;
    }

    public int getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(int triangulo) {
        this.triangulo = triangulo;
    }

    public int getExtintor() {
        return extintor;
    }

    public void setExtintor(int extintor) {
        this.extintor = extintor;
    }

    public int getLimpadorVidro() {
        return limpadorVidro;
    }

    public void setLimpadorVidro(int limpadorVidro) {
        this.limpadorVidro = limpadorVidro;
    }

    public String getProblemaInformado() {
        return problemaInformado;
    }

    public void setProblemaInformado(String problemaInformado) {
        this.problemaInformado = problemaInformado;
    }

    public String getProblemaConstatado() {
        return problemaConstatado;
    }

    public void setProblemaConstatado(String problemaConstatado) {
        this.problemaConstatado = problemaConstatado;
    }

    public String getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(String kmAtual) {
        this.kmAtual = kmAtual;
    }

    public String getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(String nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public String getPneusDianteiro() {
        return pneusDianteiro;
    }

    public void setPneusDianteiro(String pneusDianteiro) {
        this.pneusDianteiro = pneusDianteiro;
    }

    public String getPneusTraseiro() {
        return pneusTraseiro;
    }

    public void setPneusTraseiro(String pneusTraseiro) {
        this.pneusTraseiro = pneusTraseiro;
    }

    public String getPneuEstepe() {
        return pneuEstepe;
    }

    public void setPneuEstepe(String pneuEstepe) {
        this.pneuEstepe = pneuEstepe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.codigo;
        hash = 73 * hash + this.bateria;
        hash = 73 * hash + this.radio;
        hash = 73 * hash + this.calotas;
        hash = 73 * hash + this.antena;
        hash = 73 * hash + this.manual;
        hash = 73 * hash + this.documentos;
        hash = 73 * hash + this.acendedor;
        hash = 73 * hash + this.tapetes;
        hash = 73 * hash + this.iluminacao;
        hash = 73 * hash + this.arCondicionado;
        hash = 73 * hash + this.painel;
        hash = 73 * hash + this.chaves;
        hash = 73 * hash + this.macaco;
        hash = 73 * hash + this.triangulo;
        hash = 73 * hash + this.extintor;
        hash = 73 * hash + this.limpadorVidro;
        hash = 73 * hash + Objects.hashCode(this.problemaInformado);
        hash = 73 * hash + Objects.hashCode(this.problemaConstatado);
        hash = 73 * hash + Objects.hashCode(this.kmAtual);
        hash = 73 * hash + Objects.hashCode(this.nivelCombustivel);
        hash = 73 * hash + Objects.hashCode(this.pneusDianteiro);
        hash = 73 * hash + Objects.hashCode(this.pneusTraseiro);
        hash = 73 * hash + Objects.hashCode(this.pneuEstepe);
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
        final Checklist other = (Checklist) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.bateria != other.bateria) {
            return false;
        }
        if (this.radio != other.radio) {
            return false;
        }
        if (this.calotas != other.calotas) {
            return false;
        }
        if (this.antena != other.antena) {
            return false;
        }
        if (this.manual != other.manual) {
            return false;
        }
        if (this.documentos != other.documentos) {
            return false;
        }
        if (this.acendedor != other.acendedor) {
            return false;
        }
        if (this.tapetes != other.tapetes) {
            return false;
        }
        if (this.iluminacao != other.iluminacao) {
            return false;
        }
        if (this.arCondicionado != other.arCondicionado) {
            return false;
        }
        if (this.painel != other.painel) {
            return false;
        }
        if (this.chaves != other.chaves) {
            return false;
        }
        if (this.macaco != other.macaco) {
            return false;
        }
        if (this.triangulo != other.triangulo) {
            return false;
        }
        if (this.extintor != other.extintor) {
            return false;
        }
        if (this.limpadorVidro != other.limpadorVidro) {
            return false;
        }
        if (!Objects.equals(this.problemaInformado, other.problemaInformado)) {
            return false;
        }
        if (!Objects.equals(this.problemaConstatado, other.problemaConstatado)) {
            return false;
        }
        if (!Objects.equals(this.kmAtual, other.kmAtual)) {
            return false;
        }
        if (!Objects.equals(this.nivelCombustivel, other.nivelCombustivel)) {
            return false;
        }
        if (!Objects.equals(this.pneusDianteiro, other.pneusDianteiro)) {
            return false;
        }
        if (!Objects.equals(this.pneusTraseiro, other.pneusTraseiro)) {
            return false;
        }
        return Objects.equals(this.pneuEstepe, other.pneuEstepe);
    }

    @Override
    public String toString() {
        return "Checklist{" + "codigo=" + codigo + ", bateria=" + bateria + ", radio=" + radio + ", calotas=" + calotas + ", antena=" + antena + ", manual=" + manual + ", documentos=" + documentos + ", acendedor=" + acendedor + ", tapetes=" + tapetes + ", iluminacao=" + iluminacao + ", arCondicionado=" + arCondicionado + ", painel=" + painel + ", chaves=" + chaves + ", macaco=" + macaco + ", triangulo=" + triangulo + ", extintor=" + extintor + ", limpadorVidro=" + limpadorVidro + ", problemaInformado=" + problemaInformado + ", problemaConstatado=" + problemaConstatado + ", kmAtual=" + kmAtual + ", nivelCombustivel=" + nivelCombustivel + ", pneusDianteiro=" + pneusDianteiro + ", pneusTraseiro=" + pneusTraseiro + ", pneuEstepe=" + pneuEstepe + '}';
    }
}
