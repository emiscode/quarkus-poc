package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class BitcoinModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("preco")
    private Double preco;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("data")
    private LocalDate data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
