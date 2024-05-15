package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/empleados")
// Define la ruta base para todos los endpoints en este controlador
public class EmpleadoController {

    @Autowired // Inyecta el servicio EmpleadoService en el controlador
    private EmpleadoService empleadoService;

    // Endpoint para crear un nuevo empleado
    @PostMapping() // Maneja las solicitudes POST en la ruta /empleados
    public Empleado crearEmpleado(@RequestBody
                                  Empleado empleado) { // Recibe un objeto
        // Empleado en el cuerpo de la solicitud
        return empleadoService.crearEmpleado(
                empleado); // Llama al método crearEmpleado del servicio
        // EmpleadoService
    }

    // Endpoint para buscar un empleado por su ID
    @GetMapping("/{id}") // Maneja las solicitudes GET en la ruta /empleados/{id}
    public Empleado buscarEmpleadoPorId(@PathVariable
                                        Long id) { // Recibe el ID del
        // empleado como parte de la URL
        return empleadoService.buscarEmpleadoPorId(
                id); // Llama al método buscarEmpleadoPorId del servicio
        // EmpleadoService
    }

    // Endpoint para listar todos los empleados
    @GetMapping() // Maneja las solicitudes GET en la ruta /empleados
    public List<Empleado> listarEmpleados() {
        return empleadoService.listarEmpleados(); // Llama al método
        // listarEmpleados del servicio EmpleadoService
    }

    // Endpoint para actualizar un empleado existente
    @PutMapping() // Maneja las solicitudes PUT en la ruta /empleados
    public Empleado actualizarEmpleado(@RequestBody
                                       Empleado empleado) { // Recibe un
        // objeto Empleado actualizado en el cuerpo de la solicitud
        return empleadoService.actualizarEmpleado(
                empleado); // Llama al método actualizarEmpleado del servicio
        // EmpleadoService
    }

    // Endpoint para eliminar un empleado por su ID
    @DeleteMapping("/{id}")
    // Maneja las solicitudes DELETE en la ruta /empleados/{id}
    public void eliminarEmpleado(@PathVariable
                                 Long id) { // Recibe el ID del empleado como
        // parte de la URL
        empleadoService.eliminarEmpleado(
                id); // Llama al método eliminarEmpleado del servicio
        // EmpleadoService
    }
}
