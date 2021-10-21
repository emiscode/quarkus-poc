package com.example.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;

    private String status;

    @Column(name = "user_id")
    private Long userId;

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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }
}
