package hn.unah.lenguajes.examen_unidad2_lenguajes.services;

import java.util.List;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Cliente;

public interface ClienteService {
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente getClienteById(int idCliente);
}
