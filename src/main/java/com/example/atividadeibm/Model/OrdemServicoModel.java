package com.example.atividadeibm.Model;

import javax.persistence.*;

@Entity
@Table(name="ordem")
public class OrdemServicoModel {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    private String hora_entrada;
    private String hora_saida;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }
}
