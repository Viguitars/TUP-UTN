package com.example.mi_primera_api.services;

import com.example.mi_primera_api.entities.Person;
import com.example.mi_primera_api.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements BaseService<Person> {

    private PersonRepository personRepository;

    // Constructor que recibe una instancia de PersonRepository
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Método para obtener todas las personas registradas
    @Override
    @Transactional
    public List<Person> findAll() throws Exception {
        try {
            // Obtiene todas las personas de la base de datos
            List<Person> entities = personRepository.findAll();
            return entities;
        } catch (Exception e) {
            // Maneja cualquier excepción lanzada y la relanza
            throw new Exception(e.getMessage());
        }
    }

    // Método para encontrar una persona por su ID
    @Override
    @Transactional
    public Person findById(Long id) throws Exception {
        try {
            // Busca una persona por su ID
            Optional<Person> entityOptional = personRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    // Método para guardar una nueva persona o actualizar una existente
    @Override
    @Transactional
    public Person save(Person entity) throws Exception {
        try {
            // Guarda la persona en la base de datos
            entity = personRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    // Método para actualizar una persona existente
    @Override
    @Transactional
    public Person update(Long id, Person entity) throws Exception {
        try {
            // Busca la persona por su ID
            Optional<Person> entityOptional = personRepository.findById(id);
            Person person = entityOptional.get();
            // Actualiza la información de la persona
            person = personRepository.save(person);
            return person;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    // Método para eliminar una persona por su ID
    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            // Verifica si la persona existe por su ID
            if (personRepository.existsById(id)) {
                // Si existe, la elimina de la base de datos
                personRepository.deleteById(id);
                return true;
            } else {
                // Si no existe, lanza una excepción
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
