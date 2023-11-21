package hn.unah.lenguajes.examen_unidad2_lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl.ReservaServiceImpl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/crear/{idcliente}/{idvehiculo}/{dias}")
    public String crearReserva(@PathVariable(name = "idcliente") int idCliente,
            @PathVariable(name = "idvehiculo") int idVehiculo, @PathVariable(name = "dias") int dias) {
        return this.reservaServiceImpl.crearReserva(idCliente, idVehiculo, dias);
    }

}
