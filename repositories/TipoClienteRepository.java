package hn.unah.lenguajes.examen_unidad2_lenguajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}
