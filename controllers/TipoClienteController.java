package hn.unah.lenguajes.examen_unidad2_lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.TipoCliente;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl.TipoClienteServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody String descripcionTipoCliente) {
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcionTipoCliente);
    }

}
