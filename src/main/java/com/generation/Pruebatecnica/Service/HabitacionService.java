package com.generation.Pruebatecnica.Service;

import com.generation.Pruebatecnica.Model.Habitacion;

import java.util.List;

public interface HabitacionService {

    Habitacion crearHabitacion (Habitacion habitacion);

    List<Habitacion> listarHabitaciones ();

    Habitacion actualizarHabitacion  (Integer id, Habitacion habitacion);

    String eliminarHabitacion (Integer id);

}
