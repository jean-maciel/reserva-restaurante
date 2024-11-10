package com.restaurante.restaurantreservationapi.restaurant_reservation_api.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Reserva {

    @Id
    @GeneratedValue
    private UUID id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "mesa_id", nullable = false)
    private Mesa mesa;
    @NotNull
    private LocalDateTime horario;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Mesa mesa, LocalDateTime horario) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.mesa = mesa;
        this.horario = horario;
    }

    public UUID getId() {
        return id;
    }

    public @NotNull Cliente getCliente() {
        return cliente;
    }

    public void setCliente(@NotNull Cliente cliente) {
        this.cliente = cliente;
    }

    public @NotNull Mesa getMesa() {
        return mesa;
    }

    public void setMesa(@NotNull Mesa mesa) {
        this.mesa = mesa;
    }

    public @NotNull LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(@NotNull LocalDateTime horario) {
        this.horario = horario;
    }
}
