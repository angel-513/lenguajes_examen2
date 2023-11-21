package hn.unah.lenguajes.examen_unidad2_lenguajes.services;

import java.util.List;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Vehiculo;

public interface VehiculoService {
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerVehiculos();

    public Vehiculo getVehiculoById(int idVehiculo);
}
