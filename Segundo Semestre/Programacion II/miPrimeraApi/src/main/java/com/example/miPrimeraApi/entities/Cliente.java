package com.example.miPrimeraApi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

import java.io.Serializable;

@Entity // Indica que esta clase es una entidad persistente
@Table(name = "clientes") // Especifica el nombre de la tabla en la base de datos
@Builder
// Permite usar el patrón de diseño Builder para construir instancias de la clase
public class Cliente extends Persona
        implements Serializable { // Extiende la clase Persona y es serializable

}
