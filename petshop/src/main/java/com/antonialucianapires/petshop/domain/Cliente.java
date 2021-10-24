package com.antonialucianapires.petshop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Cliente extends Pessoa {

    private static final long serialVersionUID = 3734383798286329349L;
    private String tipo;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Servico> servicos;

    public Cliente() {
    }

    public Cliente(int id, String nome, String email, String codigoNacional, String tipo) {
        super(id, nome, email, codigoNacional);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        Cliente cliente = (Cliente) o;
        return Objects.equals(tipo, cliente.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }
}
