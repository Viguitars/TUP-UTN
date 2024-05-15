package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un componente de servicio de Spring
public class EmpleadoService {

    @Autowired // Inyecta el EmpleadoRepository automáticamente
    private EmpleadoRepository empleadoRepository;

    // Método para crear un nuevo empleado
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(
                empleado); // Guarda el empleado en la base de datos y lo
        // devuelve
    }

    // Método para buscar un empleado por su ID
    public Empleado buscarEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id)
                .orElse(null); // Busca un empleado por su ID y lo devuelve
    }

    // Método para listar todos los empleados
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll(); // Devuelve una lista de todos
        // los empleados en la base de datos
    }

    // Método para actualizar un empleado
    public Empleado actualizarEmpleado(Empleado empleado) {
        return empleadoRepository.save(
                empleado); // Actualiza el empleado en la base de datos y lo
        // devuelve
    }

    // Método para eliminar un empleado por su ID
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(
                id); // Elimina un empleado de la base de datos por su ID
    }

}
