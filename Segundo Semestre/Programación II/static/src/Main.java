//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Victor", 39);
//        Persona.incrementarContador();
        Persona p2 = new Persona("Alejandra", 38);
//        Persona.incrementarContador();
        System.out.println("Se ha creado " + Persona.getContadorPersonas() + " " +
                "personas.");

/*
En lugar de utilizar el método incrementarContador() cada vez que se crea un
objeto, podemos hacer el incremento de la variable estática directamente en el
constructor.
*/

    }
}