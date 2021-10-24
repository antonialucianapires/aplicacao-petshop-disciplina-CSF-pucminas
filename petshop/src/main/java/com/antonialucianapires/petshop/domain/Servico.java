package com.antonialucianapires.petshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Servico implements Serializable {
    private static final long serialVersionUID = -3621952144825727760L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dataEntrada;
    private Date dataSaida;
    private String descricao;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "servico")
    private Pagamento pagamento;

    public Servico() {
    }

    public Servico(int id, Date dataEntrada, Date dataSaida, String descricao, Pagamento pagamento) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.descricao = descricao;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servico servico = (Servico) o;
        return id == servico.id && Objects.equals(dataEntrada, servico.dataEntrada) && Objects.equals(dataSaida, servico.dataSaida) && Objects.equals(descricao, servico.descricao) && Objects.equals(pagamento, servico.pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataEntrada, dataSaida, descricao, pagamento);
    }
}
