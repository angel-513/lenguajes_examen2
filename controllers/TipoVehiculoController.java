package hn.unah.lenguajes.examen_unidad2_lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.TipoVehiculo;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
}
