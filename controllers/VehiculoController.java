package hn.unah.lenguajes.examen_unidad2_lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Vehiculo;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtenertodos")
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/obtenerporid")
    public Vehiculo obtenerVehiculoById(@RequestParam(name = "id") int id) {
        return this.vehiculoServiceImpl.getVehiculoById(id);
    }
}
