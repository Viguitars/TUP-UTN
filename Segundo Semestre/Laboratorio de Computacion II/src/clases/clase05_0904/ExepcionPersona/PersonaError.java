package clases.clase05_0904.ExepcionPersona;

public class PersonaError {
    public static void main(String[] args) {


        try {
            Persona persona = new Persona();
            persona.setEdad(-10);
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
            persona1.imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
