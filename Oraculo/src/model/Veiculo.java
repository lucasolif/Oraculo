
package model;

import java.util.Objects;


public class Veiculo {

    private String nomeVeiculo;
    private String corVeiculo;
    private String placaVeiculo;
    private String anoVeiculo;
    private String marcaVeiculo;
    private String kmVeiculo;
    private String chassiVeiculo;
    private String crlvVeiculo;

    public Veiculo(String nomeVeiculo, String corVeiculo, String placaVeiculo, String anoVeiculo, String marcaVeiculo, String kmVeiculo, String chassiVeiculo, String crlvVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
        this.corVeiculo = corVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.kmVeiculo = kmVeiculo;
        this.chassiVeiculo = chassiVeiculo;
        this.crlvVeiculo = crlvVeiculo;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(String anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getKmVeiculo() {
        return kmVeiculo;
    }

    public void setKmVeiculo(String kmVeiculo) {
        this.kmVeiculo = kmVeiculo;
    }

    public String getChassiVeiculo() {
        return chassiVeiculo;
    }

    public void setChassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
    }

    public String getCrlvVeiculo() {
        return crlvVeiculo;
    }

    public void setCrlvVeiculo(String crlvVeiculo) {
        this.crlvVeiculo = crlvVeiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeVeiculo);
        hash = 97 * hash + Objects.hashCode(this.corVeiculo);
        hash = 97 * hash + Objects.hashCode(this.placaVeiculo);
        hash = 97 * hash + Objects.hashCode(this.anoVeiculo);
        hash = 97 * hash + Objects.hashCode(this.marcaVeiculo);
        hash = 97 * hash + Objects.hashCode(this.kmVeiculo);
        hash = 97 * hash + Objects.hashCode(this.chassiVeiculo);
        hash = 97 * hash + Objects.hashCode(this.crlvVeiculo);
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
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.nomeVeiculo, other.nomeVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.corVeiculo, other.corVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.placaVeiculo, other.placaVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.anoVeiculo, other.anoVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.marcaVeiculo, other.marcaVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.kmVeiculo, other.kmVeiculo)) {
            return false;
        }
        if (!Objects.equals(this.chassiVeiculo, other.chassiVeiculo)) {
            return false;
        }
        return Objects.equals(this.crlvVeiculo, other.crlvVeiculo);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nomeVeiculo=" + nomeVeiculo + ", corVeiculo=" + corVeiculo + ", placaVeiculo=" + placaVeiculo + ", anoVeiculo=" + anoVeiculo + ", marcaVeicula=" + marcaVeiculo + ", kmVeiculo=" + kmVeiculo + ", chassiVeiculo=" + chassiVeiculo + ", crlvVeiculo=" + crlvVeiculo + '}';
    }
   
}
