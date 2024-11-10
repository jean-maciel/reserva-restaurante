package com.restaurante.restaurantreservationapi.restaurant_reservation_api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Mesa {

    @Id
    private UUID id;
    @NotNull
    private Integer numero;
    @NotNull
    @Min(1)
    private Integer capacidade;

    public Mesa() {
    }

    public Mesa(Integer numero, Integer capacidade) {
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public UUID getId() {
        return id;
    }

    public @NotNull Integer getNumero() {
        return numero;
    }

    public void setNumero(@NotNull Integer numero) {
        this.numero = numero;
    }

    public @NotNull @Min(1) Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(@NotNull @Min(1) Integer capacidade) {
        this.capacidade = capacidade;
    }
}
