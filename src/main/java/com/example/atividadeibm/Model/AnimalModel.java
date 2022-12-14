package com.example.atividadeibm.Model;

import javax.persistence.*;

@Entity
@Table(name="animal")
public class AnimalModel {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer peso;
    private Integer idade;
    private Integer id_client;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getId_cliente() {
        return id_client;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_client = id_cliente;
    }
}
