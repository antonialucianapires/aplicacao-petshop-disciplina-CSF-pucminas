package com.antonialucianapires.petshop.enums;

public enum SituacaoPagamento {

    QUITADO(1, "Quitado"),
    CANCELADO(2, "Cancelado"),
    PENDENTE(3, "Pendente");

    private int codigo;
    private String descricao;

    SituacaoPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static SituacaoPagamento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (SituacaoPagamento situacao : SituacaoPagamento.values()) {
            if (codigo.equals(situacao.codigo)) {
                return situacao;
            }
        }

        throw new IllegalArgumentException();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
