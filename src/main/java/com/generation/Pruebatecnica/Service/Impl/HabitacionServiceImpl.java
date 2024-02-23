package com.generation.Pruebatecnica.Service.Impl;

import com.generation.Pruebatecnica.Model.Habitacion;
import com.generation.Pruebatecnica.Repository.HabitacionRepository;
import com.generation.Pruebatecnica.Service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

    @Override
    public List<Habitacion> listarHabitaciones() {
        return habitacionRepository.findAll();
    }

    @Override
    public Habitacion actualizarHabitacion(Integer id, Habitacion habitacion) {

        Habitacion habitacionBuscada = habitacionRepository.findById(id).orElse(null);

        if (habitacionBuscada != null){
            habitacionBuscada.setTipo(habitacion.getTipo());
            habitacionBuscada.setPrecio(habitacion.getPrecio());
            return habitacionRepository.save(habitacionBuscada);
        }
        else {
            throw new RuntimeException("No su pudo actualizar la habitacion");
        }

    }

    @Override
    public String eliminarHabitacion(Integer id) {
        Habitacion habitacionBuscada = habitacionRepository.findById(id).orElse(null);

        if (habitacionBuscada != null){
            habitacionRepository.deleteById(id);
            return "Se elimino exitosamente la habitacion";
        }
        else {
            return "No se pudo eliminar, la habitacion no existe";
        }
    }

}
