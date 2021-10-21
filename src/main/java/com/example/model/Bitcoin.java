package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Bitcoin {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("preco")
    private Double preco;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("data")
    private LocalDate data;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(final Double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(final LocalDate data) {
        this.data = data;
    }
}
