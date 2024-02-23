package com.generation.Pruebatecnica.Repository;

import com.generation.Pruebatecnica.Model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva , Integer> {
}
