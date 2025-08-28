package org.model;

import java.util.Date;

public class Modelo {
    private long id;
    private String name;
    private Date anoModelo;
    private int qtModelos;

    public Modelo(){
        this.id = 0;
        this.name = "";
        this.anoModelo = new Date();
    }

    public Modelo(long id, String name, Date anoModelo, int qtModelos) {
        this.id = id;
        this.name = name;
        this.anoModelo = anoModelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAnoModelo(Date date) {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQtModelos() {
        return qtModelos;
    }

    public void setQtModelos(int qtModelos) {
        this.qtModelos = qtModelos;
    }


}
