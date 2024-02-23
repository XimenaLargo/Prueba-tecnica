package com.generation.Pruebatecnica.Controller;

import com.generation.Pruebatecnica.Model.Habitacion;
import com.generation.Pruebatecnica.Service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;


    @PostMapping("/save")
    public ResponseEntity<Habitacion> saveHabitacion (@RequestBody Habitacion habitacion){
        return ResponseEntity.ok(habitacionService.crearHabitacion(habitacion));
    }

    @GetMapping
    public List<Habitacion> listarHabitaciones (){
        return habitacionService.listarHabitaciones();
    }

    @PutMapping("/{id}")
    public Habitacion updateHabitacion (@PathVariable Integer id , @RequestBody Habitacion habitacion){
        return habitacionService.actualizarHabitacion(id,habitacion);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHabitacion (@PathVariable Integer id){
        return habitacionService.eliminarHabitacion(id);
    }


}
