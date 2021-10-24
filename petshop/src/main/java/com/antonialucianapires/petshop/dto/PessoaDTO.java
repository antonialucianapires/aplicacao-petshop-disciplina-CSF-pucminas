package com.antonialucianapires.petshop.dto;

import com.antonialucianapires.petshop.domain.Pessoa;

import java.io.Serializable;

public class PessoaDTO implements Serializable {
    private static final long serialVersionUID = 4232590514786527483L;

    private String nome;
    private String email;
    private String codigoNacional;

    public PessoaDTO() {}

    public PessoaDTO(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.codigoNacional = pessoa.getCodigoNacional();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCodigoNacional() {
        return codigoNacional;
    }
}
