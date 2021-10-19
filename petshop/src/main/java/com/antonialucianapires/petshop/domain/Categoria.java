package com.antonialucianapires.petshop.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;

    public Categoria() {
    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return id == categoria.id && Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
