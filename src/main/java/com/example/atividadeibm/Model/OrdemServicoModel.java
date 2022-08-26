package com.example.atividadeibm.Model;

public class OrdemServicoModel {
    private Integer id;
    private Double valo;
    private String hora_entrada;
    private String hora_retirada;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValo() {
        return valo;
    }

    public void setValo(Double valo) {
        this.valo = valo;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_retirada() {
        return hora_retirada;
    }

    public void setHora_retirada(String hora_retirada) {
        this.hora_retirada = hora_retirada;
    }
}
