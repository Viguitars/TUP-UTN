package com.example.mi_primera_api.services;

import java.util.List;

// Interfaz genérica que define métodos básicos para operaciones CRUD (Crear,
// Leer, Actualizar, Eliminar)
public interface BaseService<E> {
    // Método para obtener una lista de todas las entidades de tipo E (por
    // ejemplo, Person)
    // presentes en la base de datos
    public List<E> findAll() throws Exception;

    // Método para obtener una entidad de tipo E por su ID
    public E findById(Long id) throws Exception;

    // Método para guardar una nueva entidad de tipo E en la base de datos
    public E save(E entity) throws Exception;

    // Método para actualizar una entidad de tipo E en la base de datos
    public E update(Long id, E entity) throws Exception;

    // Método para eliminar una entidad de tipo E de la base de datos por su ID
    public boolean delete(Long id) throws Exception;
}
