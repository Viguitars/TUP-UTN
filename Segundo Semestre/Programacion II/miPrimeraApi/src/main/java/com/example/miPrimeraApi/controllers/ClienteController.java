package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/clientes") // Define la ruta base para todos los endpoints
// en este controlador
public class ClienteController {

    @Autowired // Inyecta el servicio ClienteService en el controlador
    private ClienteService clienteService;

    // Endpoint para crear un nuevo cliente
    @PostMapping() // Maneja las solicitudes POST en la ruta /clientes
    public Cliente crearCliente(
            @RequestBody Cliente cliente) { // Recibe un objeto Cliente
        // en el cuerpo de la solicitud
        return clienteService.crearCliente(
                cliente); // Llama al método crearCliente del servicio
        // ClienteService
    }

    // Endpoint para buscar un cliente por su ID
    @GetMapping("/{id}") // Maneja las solicitudes GET en la ruta /clientes/{id}
    public Cliente buscarClientePorId(
            @PathVariable Long id) { // Recibe el ID del cliente
        // como parte de la URL
        return clienteService.buscarClientePorId(
                id); // Llama al método buscarClientePorId del servicio
        // ClienteService
    }

    // Endpoint para listar todos los clientes
    @GetMapping() // Maneja las solicitudes GET en la ruta /clientes
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes(); // Llama al método
        // listarClientes del servicio ClienteService
    }

    // Endpoint para actualizar un cliente existente
    @PutMapping() // Maneja las solicitudes PUT en la ruta /clientes
    public Cliente actualizarCliente(
            @RequestBody Cliente cliente) { // Recibe un objeto
        // Cliente actualizado en el cuerpo de la solicitud
        return clienteService.actualizarCliente(
                cliente); // Llama al método actualizarCliente del servicio
        // ClienteService
    }

    // Endpoint para eliminar un cliente por su ID
    @DeleteMapping("/{id}")
    // Maneja las solicitudes DELETE en la ruta /clientes/{id}
    public void eliminarCliente(
            @PathVariable Long id) { // Recibe el ID del cliente como
        // parte de la URL
        clienteService.eliminarCliente(
                id); // Llama al método eliminarCliente del servicio
        // ClienteService
    }
}
