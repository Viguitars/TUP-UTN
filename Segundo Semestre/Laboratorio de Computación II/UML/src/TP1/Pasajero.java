package TP1;

public class Pasajero {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerInformacionCompleta() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nEdad" + ": " + edad;
    }

    public boolean esMenorDeEdad() {
        return edad < 18;
    }


}
