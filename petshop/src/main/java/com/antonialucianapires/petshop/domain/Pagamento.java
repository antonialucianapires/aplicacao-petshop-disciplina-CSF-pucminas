package com.antonialucianapires.petshop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 3745810382302237768L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valor;
    private int situacao;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_servico")
    @MapsId
    private Servico servico;

    public Pagamento() {
    }

    public Pagamento(int id, double valor, int situacao, Servico servico) {
        this.id = id;
        this.valor = valor;
        this.situacao = situacao;
        this.servico = servico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return id == pagamento.id && Double.compare(pagamento.valor, valor) == 0 && situacao == pagamento.situacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, situacao);
    }
}
