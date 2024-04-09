package clases.clase05_0904.ExepcionPersona;

public class Persona {
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad <= 0)
            throw new Exception("La edad debe ser positiva.");
        this.edad = edad;
    }

}
