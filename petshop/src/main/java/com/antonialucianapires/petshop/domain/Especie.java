package com.antonialucianapires.petshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Especie implements Serializable {
    private static final long serialVersionUID = -4131582956254654148L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;

    @OneToMany(mappedBy = "especie")
    private List<Pet> pets = new ArrayList<>();

    public Especie() {
    }

    public Especie(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especie especie = (Especie) o;
        return id == especie.id && Objects.equals(descricao, especie.descricao) && Objects.equals(pets, especie.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, pets);
    }
}
