package clases.clase09_0705.Ejemplos.HerenciaDownCasting;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Perro
        Animal animal = new Perro();

        // Intentar hacer down casting a Perro
        if (animal instanceof Perro) {
            Perro perro = (Perro) animal;
            perro.hacerSonido();
            perro.perseguirCola();
        } else {
            System.out.println("El animal no es un perro.");
        }

        // Intentar hacer down casting a Gato
        if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            gato.hacerSonido();
            gato.rasgarMuebles();
        } else {
            System.out.println("El animal no es un gato.");
        }
    }
    /*
     * En este ejemplo, creamos un objeto de tipo Perro, pero lo almacenamos en
     *  una referencia de tipo Animal. Luego, intentamos hacer down casting a
     *  Perro y Gato. Como esperamos, el primer intento de down casting a Perro
     *  es exitoso y se ejecuta correctamente. Sin embargo, el segundo intento
     *  de down casting a Gato lanzará una excepción ClassCastException, ya que
     *  el objeto original es un Perro, no un Gato.
     */
}
