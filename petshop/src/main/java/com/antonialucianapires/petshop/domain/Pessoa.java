package com.antonialucianapires.petshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 4249333578608062696L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String codigoNacional;

    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "telefones", joinColumns = @JoinColumn(name = "id_pessoa"))
    private Set<String> telefones = new HashSet<>();

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String email, String codigoNacional) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.codigoNacional = codigoNacional;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoNacional() {
        return codigoNacional;
    }

    public void setCodigoNacional(String codigoNacional) {
        this.codigoNacional = codigoNacional;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<String> telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email) && Objects.equals(codigoNacional, pessoa.codigoNacional) && Objects.equals(enderecos, pessoa.enderecos) && Objects.equals(telefones, pessoa.telefones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, codigoNacional, enderecos, telefones);
    }
}
