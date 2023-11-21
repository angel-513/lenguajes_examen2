package hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.TipoCliente;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.TipoClienteRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {
    @Autowired
    TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(tipoCliente);
    }
}
