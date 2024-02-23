package com.generation.Pruebatecnica.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idreservas;

    @Column
    private LocalDate fecha_inicio;

    @Column
    private LocalDate fecha_fin;

    @ManyToOne
    @JoinColumn(name = "reservas_habitaciones" , nullable = false)
    @JsonManagedReference
    private Habitacion habitacion;
}
