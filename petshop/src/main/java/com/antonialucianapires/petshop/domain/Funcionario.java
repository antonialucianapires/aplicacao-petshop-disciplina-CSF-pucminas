package com.antonialucianapires.petshop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Funcionario extends Pessoa {
    private static final long serialVersionUID = -5113291554649495949L;
    private String funcao;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario")
    private List<Servico> servicos;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String email, String codigoNacional, String funcao) {
        super(id, nome, email, codigoNacional);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(funcao, that.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), funcao);
    }
}
