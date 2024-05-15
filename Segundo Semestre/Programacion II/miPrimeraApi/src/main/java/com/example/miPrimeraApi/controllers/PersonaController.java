package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Persona;
import com.example.miPrimeraApi.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/personas")
// Define la ruta base para todos los endpoints en este controlador
public class PersonaController {

    @Autowired // Inyecta el servicio PersonaService en el controlador
    private PersonaService personaService;

    // Endpoint para crear una nueva persona
    @PostMapping() // Maneja las solicitudes POST en la ruta /personas
    public Persona crearPersona(@RequestBody
                                Persona persona) { // Recibe un objeto Persona
        // en el cuerpo de la solicitud
        return personaService.crearPersona(
                persona); // Llama al método crearPersona del servicio
        // PersonaService
    }

    // Endpoint para buscar una persona por su ID
    @GetMapping("/{id}") // Maneja las solicitudes GET en la ruta /personas/{id}
    public Persona buscarPersonaPorId(@PathVariable
                                      Long id) { // Recibe el ID de la persona
        // como parte de la URL
        return personaService.buscarPersonaPorId(
                id); // Llama al método buscarPersonaPorId del servicio
        // PersonaService
    }

    // Endpoint para listar todas las personas
    @GetMapping() // Maneja las solicitudes GET en la ruta /personas
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas(); // Llama al método
        // listarPersonas del servicio PersonaService
    }

    // Endpoint para actualizar una persona existente
    @PutMapping() // Maneja las solicitudes PUT en la ruta /personas
    public Persona actualizarPersona(@RequestBody
                                     Persona persona) { // Recibe un objeto
        // Persona actualizado en el cuerpo de la solicitud
        return personaService.actualizarPersona(
                persona); // Llama al método actualizarPersona del servicio
        // PersonaService
    }

    // Endpoint para eliminar una persona por su ID
    @DeleteMapping("/{id}")
    // Maneja las solicitudes DELETE en la ruta /personas/{id}
    public void eliminarPersona(@PathVariable
                                Long id) { // Recibe el ID de la persona como
        // parte de la URL
        personaService.eliminarPersona(
                id); // Llama al método eliminarPersona del servicio
        // PersonaService
    }

}
