package org.model;

public class Veiculo {
   private long id;
   private Enum status;
   private String palca;
   private String chassi;
   private String renavam;
   private String cor;
   private Modelo modelo;

    public Veiculo() {
        this.id = id;
        this.palca = palca;
        this.chassi = chassi;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Veiculo(long id, String palca, String chassi,
                   String renavam, String cor, Modelo modelo) {
        this.id = id;
        this.palca = palca;
        this.chassi = chassi;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlca() {
        return palca;
    }

    public void setPlca(String plca) {
        this.palca = plca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
