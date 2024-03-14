import javax.swing.JOptionPane;

public class Persona {

    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private static int id = 0;

    public Persona() {
        id = id + 1;

    }

    public Persona(String nombre, String apellido, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        id = id + 1;

    }

    public void decirNombre() {
        JOptionPane.showMessageDialog(null, "Mi nombre es: " + nombre);

    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido: " + apellido + "\nTeléfono: " + telefono
                + "\nEdad: " + edad + " años");

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String getNombre() {
        return nombre;
    }

    public String llamarNombre() {
        return getNombre();
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public static int getId() {
        return id;
    }

}
