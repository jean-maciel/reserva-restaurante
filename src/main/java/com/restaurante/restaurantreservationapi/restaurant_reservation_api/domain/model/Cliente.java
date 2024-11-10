package com.restaurante.restaurantreservationapi.restaurant_reservation_api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Entity
public class Cliente {

    @Id
    @GeneratedValue()
    private UUID id;
    @NotBlank
    @Size(max = 100)
    private String nome;
    @NotBlank
    @Size(max = 15)
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String telefone) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
    }

    public UUID getId() {
        return id;
    }

    public @NotBlank @Size(max = 100) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank @Size(max = 100) String nome) {
        this.nome = nome;
    }

    public @NotBlank @Size(max = 15) String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank @Size(max = 15) String telefone) {
        this.telefone = telefone;
    }
}
