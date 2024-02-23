package com.generation.Pruebatecnica.Repository;

import com.generation.Pruebatecnica.Model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion , Integer> {
}
