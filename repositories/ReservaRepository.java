package hn.unah.lenguajes.examen_unidad2_lenguajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
