package com.antonialucianapires.petshop.domain;

import com.antonialucianapires.petshop.enums.SituacaoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoDinheiro extends Pagamento {
    private static final long serialVersionUID = -841505989033718966L;

    private Date dataPagamento;
    private double desconto;

    public PagamentoDinheiro() {
    }


    public PagamentoDinheiro(int id, double valor, SituacaoPagamento situacao, Servico servico, Date dataPagamento, double desconto) {
        super(id, valor, situacao, servico);
        this.dataPagamento = dataPagamento;
        this.desconto = desconto;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
