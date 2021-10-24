package com.antonialucianapires.petshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Raca implements Serializable {
    private static final long serialVersionUID = -5859318511168749200L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    @OneToMany(mappedBy = "raca")
    private List<Pet> pets = new ArrayList<>();

    public Raca() {
    }

    public Raca(int id, String descricao) {
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
        Raca raca = (Raca) o;
        return id == raca.id && Objects.equals(descricao, raca.descricao) && Objects.equals(pets, raca.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, pets);
    }
}
