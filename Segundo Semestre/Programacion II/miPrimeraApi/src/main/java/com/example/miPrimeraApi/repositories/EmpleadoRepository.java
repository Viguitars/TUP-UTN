package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// @Repository de Spring

@Repository // Indica que esta interfaz es un componente de repositorio de Spring
public interface EmpleadoRepository extends
        JpaRepository<Empleado, Long> { // Extiende JpaRepository para
    // operaciones de base de datos

}
