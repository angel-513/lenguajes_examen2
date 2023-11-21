package hn.unah.lenguajes.examen_unidad2_lenguajes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen_unidad2_lenguajes.models.Cliente;
import hn.unah.lenguajes.examen_unidad2_lenguajes.repositories.ClienteRepository;
import hn.unah.lenguajes.examen_unidad2_lenguajes.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(int idCliente) {
        return this.clienteRepository.findById(idCliente).get();
    }

}
