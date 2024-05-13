package com.example.mi_primera_api.contollers;

import com.example.mi_primera_api.entities.Person;
import com.example.mi_primera_api.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Anotación @RestController indica que esta clase es un controlador REST
@RestController
// Anotación @CrossOrigin permite solicitudes desde cualquier origen
@CrossOrigin(origins = "*")
// Anotación @RequestMapping define la raíz de la URL para este controlador
@RequestMapping(path = "api/v1/persona")
public class PersonController {
    private PersonService personService;

    // Constructor que recibe una instancia de PersonService
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // Manejador para la solicitud GET que devuelve todas las personas
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(personService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    // Manejador para la solicitud GET que devuelve una persona por su ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(personService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    // Manejador para la solicitud POST que guarda una nueva persona
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Person entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(personService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    // Manejador para la solicitud PUT que actualiza una persona existente
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Person entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(personService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    // Manejador para la solicitud DELETE que elimina una persona por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT)
                    .body(personService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
}
