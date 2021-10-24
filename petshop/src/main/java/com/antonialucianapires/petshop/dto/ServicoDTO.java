package com.antonialucianapires.petshop.dto;

import com.antonialucianapires.petshop.domain.Servico;

import java.io.Serializable;
import java.util.Date;

public class ServicoDTO implements Serializable {
    private static final long serialVersionUID = 8147824111789846569L;
    private Date dataEntrada;
    private Date dataSaida;
    private String descricao;

    public ServicoDTO() {
    }

    public ServicoDTO(Servico servico) {
        this.dataEntrada = servico.getDataEntrada();
        this.dataSaida = servico.getDataSaida();
        this.descricao = servico.getDescricao();
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public String getDescricao() {
        return descricao;
    }
}
