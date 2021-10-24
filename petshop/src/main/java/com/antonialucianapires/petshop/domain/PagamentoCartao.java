package com.antonialucianapires.petshop.domain;

import com.antonialucianapires.petshop.enums.SituacaoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoCartao extends Pagamento {
    private static final long serialVersionUID = -3330619085180066422L;

    private int parcelas;

    public PagamentoCartao() {
    }

    public PagamentoCartao(int id, double valor, SituacaoPagamento situacao, Servico servico, int parcelas) {
        super(id, valor, situacao, servico);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
