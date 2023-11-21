package hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.TipoVehiculo;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

}
