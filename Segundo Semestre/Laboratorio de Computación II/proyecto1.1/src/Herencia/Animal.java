package Herencia;

public abstract class  Animal {
    protected String raza;
    protected int edad;

    public Animal() {
    }

    public Animal(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    abstract void comer();
}
