package org.model;

public class Ocorrencia {
    private String acidGrava;
    private String carroVelho;
    private char vendas;

    public Ocorrencia() {
        this.acidGrava = acidGrava;
        this.carroVelho = carroVelho;
        this.vendas = vendas;
    }

    public Ocorrencia(String acidGrava, String carroVelho, char vendas) {
        this.acidGrava = acidGrava;
        this.carroVelho = carroVelho;
        this.vendas = vendas;
    }

    public String getAcidGrava() {
        return acidGrava;
    }

    public void setAcidGrava(String acidGrava) {
        this.acidGrava = acidGrava;
    }

    public String getCarroVelho() {
        return carroVelho;
    }

    public void setCarroVelho(String carroVelho) {
        this.carroVelho = carroVelho;
    }

    public char getVendas() {
        return vendas;
    }

    public void setVendas(char vendas) {
        this.vendas = vendas;
    }
}
