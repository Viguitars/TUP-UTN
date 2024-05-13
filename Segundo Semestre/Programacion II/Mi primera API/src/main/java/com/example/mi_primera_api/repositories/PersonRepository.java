package com.example.mi_primera_api.repositories;

import com.example.mi_primera_api.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Anotación @Repository indica que esta interfaz es un bean de repositorio
// gestionado por Spring
@Repository
// Extiende JpaRepository, que proporciona métodos predefinidos para
// operaciones CRUD en la base de datos
// para la entidad Person. El primer parámetro de JpaRepository es el tipo de
// entidad (Person) y el segundo
// es el tipo de la clave primaria (Long).
public interface PersonRepository extends JpaRepository<Person, Long> {
}
