package com.generation.Pruebatecnica.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhabitaciones")
    private Integer id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "precio")
    private double precio;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "habitacion")
    @JsonIgnore
    private List<Reserva> reservas;
}
