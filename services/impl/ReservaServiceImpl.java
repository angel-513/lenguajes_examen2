package hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Reserva;
import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Vehiculo;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.ReservaRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.VehiculoRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public String crearReserva(int idCliente, int idVehiculo, int dias) {
        Vehiculo vehiculoReservado = this.vehiculoRepository.findById(idVehiculo).get();

        if (vehiculoReservado.getDisponible()) {
            vehiculoReservado.setDisponible(false);
            double totalRenta = this.calcularTotalRenta(vehiculoReservado.getTipoVehiculo().getPrecioXhora(), dias);
            Reserva reserva = new Reserva();
            reserva.setDias(dias);
            reserva.setIdCliente(idCliente);
            reserva.setIdVehiculo(idVehiculo);
            reserva.setTotal(totalRenta);
            return "Reserva hecha.";
        } else {
            return "El vehiculo se encuentra reservado.";
        }
    }

    public double calcularTotalRenta(double precioXhora, int dias) {
        return precioXhora * (dias * 24);
    }
}
