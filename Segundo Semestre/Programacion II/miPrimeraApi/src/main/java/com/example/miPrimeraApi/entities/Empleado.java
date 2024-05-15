package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.TipoEmpleado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity // Indica que esta clase es una entidad persistente
@Table(name = "empleados")
// Especifica el nombre de la tabla en la base de datos
@AllArgsConstructor // Genera un constructor con todos los argumentos
@NoArgsConstructor // Genera un constructor sin argumentos
@Builder
// Permite usar el patrón de diseño Builder para construir instancias de la clase
public class Empleado extends Persona
        implements Serializable { // Extiende la clase Persona y es serializable

    @Column(name = "tipo_empleado")
    // Especifica el nombre de la columna en la tabla
    private TipoEmpleado tipoEmpleado;
            // Atributo que representa el tipo de empleado

}
