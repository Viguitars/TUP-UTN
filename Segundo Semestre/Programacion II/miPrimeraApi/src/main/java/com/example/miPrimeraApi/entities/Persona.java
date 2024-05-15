package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity // Indica que esta clase es una entidad persistente
@Table(name = "personas") // Especifica el nombre de la tabla en la base de datos
@Data // Genera getters, setters, toString, hashCode y equals automáticamente
@AllArgsConstructor // Genera un constructor con todos los argumentos
@NoArgsConstructor // Genera un constructor sin argumentos
@SuperBuilder
// Permite usar el patrón de diseño Builder para construir instancias de
// clases heredadas
@Inheritance(strategy = InheritanceType.JOINED)
// Define la estrategia de herencia
public abstract class Persona
        implements Serializable { // Clase abstracta Persona que es serializable

    @Id // Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Genera valores de ID autoincrementales
    protected Long id; // Atributo que representa el ID de la persona

    protected String nombre; // Atributo que representa el nombre de la persona
    protected String apellido;
            // Atributo que representa el apellido de la persona
    protected Integer edad; // Atributo que representa la edad de la persona

}
