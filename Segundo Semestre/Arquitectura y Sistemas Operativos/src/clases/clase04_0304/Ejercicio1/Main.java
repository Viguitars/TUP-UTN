package clases.clase04_0304.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        try {
            //            Sé instancia un objeto de la clase Persona
            Persona persona = new Persona("Juan", 620);
            //            Se invoca el método imprimir()
            persona.imprimir();
        } catch (EdadInvalidaException e) {
            //            Se captura la nueva excepción EdadInvalidaException
            System.out.println("Error: " + e.getMessage());
        }
    }
}
