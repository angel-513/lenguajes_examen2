package hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Vehiculo;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.VehiculoRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo getVehiculoById(int idVehiculo) {
        return this.vehiculoRepository.findById(idVehiculo).get();
    }

}
