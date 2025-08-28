package org.model;

public class Funcionario {
    private long id;
    private String name;
    private String cpf;

    public Funcionario() {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public Funcionario(long id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
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
}
