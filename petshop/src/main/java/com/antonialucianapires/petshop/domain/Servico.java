package com.antonialucianapires.petshop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Servico implements Serializable {
    private static final long serialVersionUID = -3621952144825727760L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dataEntrada;
    private Date dataSaida;
    private String descricao;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "servico")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_pet")
    private Pet pet;

    @ManyToMany
    @JoinTable(name = "servico_produto",
            joinColumns = @JoinColumn(name = "id_servico"),
            inverseJoinColumns = @JoinColumn(name = "id_produto"))
    private List<Produto> produtos = new ArrayList<>();

    public Servico() {
    }

    public Servico(int id, Date dataEntrada, Date dataSaida, String descricao, Pagamento pagamento, Cliente cliente, Funcionario funcionario, Pet pet) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.descricao = descricao;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servico servico = (Servico) o;
        return id == servico.id && Objects.equals(dataEntrada, servico.dataEntrada) && Objects.equals(dataSaida, servico.dataSaida) && Objects.equals(descricao, servico.descricao) && Objects.equals(pagamento, servico.pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataEntrada, dataSaida, descricao, pagamento);
    }
}
