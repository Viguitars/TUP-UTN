package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un componente de servicio de Spring
public class ClienteService {

    @Autowired // Inyecta el ClienteRepository automáticamente
    private ClienteRepository clienteRepository;

    // Método para crear un nuevo cliente
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(
                cliente); // Guarda el cliente en la base de datos y lo devuelve
    }

    // Método para buscar un cliente por su ID
    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id)
                .orElse(null); // Busca un cliente por su ID y lo devuelve
    }

    // Método para listar todos los clientes
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll(); // Devuelve una lista de todos los
        // clientes en la base de datos
    }

    // Método para actualizar un cliente
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(
                cliente); // Actualiza el cliente en la base de datos y lo
        // devuelve
    }

    // Método para eliminar un cliente por su ID
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(
                id); // Elimina un cliente de la base de datos por su ID
    }

}
