package com.example.mi_primera_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

// Anotación @Entity indica que esta clase es una entidad JPA, que se mapeará
// a una tabla en la base de datos
@Entity
// Define el nombre de la tabla en la base de datos
@Table(name = "person")
// Anotaciones Lombok para generar automáticamente constructores, getters y
// setters
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// Anotación @Audited de Hibernate Envers para realizar auditoría de la entidad
@Audited
public class Person implements Serializable {

    // Identificador de la entidad, generado automáticamente y configurado
    // como clave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Columnas de la tabla en la base de datos, con sus respectivos nombres
    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "id_document")
    private int idDocument;
}
