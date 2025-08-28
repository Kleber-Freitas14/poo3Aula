package org.model;


import java.util.Date;

public class Locacao {
    private long id;
    private Date dateRetirada;
    private Date dateDevolucao;
    private float valorLocacao;
    private Ocorrencia ocorrencia;
    private Veiculo veiculo;

    public Locacao() {
        this.id = id;
        this.dateRetirada = dateRetirada;
        this.dateDevolucao = dateDevolucao;
        this.valorLocacao = valorLocacao;
        this.ocorrencia = ocorrencia;
        this.veiculo = veiculo;
    }

    public Locacao(long id, Date dateRetirada, Date dateDevolucao, float valorLocacao,
                   Ocorrencia ocorrencia, Veiculo veiculo) {
        this.id = id;
        this.dateRetirada = dateRetirada;
        this.dateDevolucao = dateDevolucao;
        this.valorLocacao = valorLocacao;
        this.ocorrencia = ocorrencia;
        this.veiculo = veiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateRetirada() {
        return dateRetirada;
    }

    public void setDateRetirada(Date dateRetirada) {
        this.dateRetirada = dateRetirada;
    }

    public Date getDateDevolucao() {
        return dateDevolucao;
    }

    public void setDateDevolucao(Date dateDevolucao) {
        this.dateDevolucao = dateDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
