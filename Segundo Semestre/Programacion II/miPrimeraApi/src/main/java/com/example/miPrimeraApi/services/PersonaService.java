package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Persona;
import com.example.miPrimeraApi.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un componente de servicio de Spring
public class PersonaService {

    @Autowired // Inyecta el PersonaRepository automáticamente
    private PersonaRepository personaRepository;

    // Método para crear una nueva persona
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(
                persona); // Guarda la persona en la base de datos y la devuelve
    }

    // Método para buscar una persona por su ID
    public Persona buscarPersonaPorId(Long id) {
        return personaRepository.findById(id)
                .orElse(null); // Busca una persona por su ID y la devuelve
    }

    // Método para listar todas las personas
    public List<Persona> listarPersonas() {
        return personaRepository.findAll(); // Devuelve una lista de todas las
        // personas en la base de datos
    }

    // Método para actualizar una persona
    public Persona actualizarPersona(Persona persona) {
        return personaRepository.save(
                persona); // Actualiza la persona en la base de datos y la
        // devuelve
    }

    // Método para eliminar una persona por su ID
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(
                id); // Elimina una persona de la base de datos por su ID
    }

}
