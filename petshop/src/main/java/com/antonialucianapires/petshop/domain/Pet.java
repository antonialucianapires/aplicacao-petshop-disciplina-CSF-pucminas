package com.antonialucianapires.petshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Pet implements Serializable {
    private static final long serialVersionUID = -8644883722971090535L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "id_especie")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "id_raca")
    private Raca raca;

    @OneToMany(mappedBy = "pet")
    private List<Servico> servicos = new ArrayList<>();

    public Pet() {
    }

    public Pet(int id, String nome, int idade, Especie especie, Raca raca) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id && idade == pet.idade && Objects.equals(nome, pet.nome) && Objects.equals(especie, pet.especie) && Objects.equals(raca, pet.raca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, especie, raca);
    }
}
