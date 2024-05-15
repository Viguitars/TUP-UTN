package Ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Grupo <T> {
    private String nombre;
    private List<T> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(T alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("Alumnos del grupo " + nombre + ":");
        for (T alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
