package org.model;

import java.util.Date;

public class Cliente {
    private long id;
    private String name;
    private String cpf;
    private Date dn;
    private String fone;


    public Cliente() {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dn = dn;
        this.fone = fone;
    }

    public Cliente(long id, String name, String cpf, Date dn, String fone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dn = dn;
        this.fone = fone;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDn() {
        return dn;
    }

    public void setDn(Date dn) {
        this.dn = dn;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
