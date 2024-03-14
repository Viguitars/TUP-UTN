import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        /*
         * Persona per1 = new Persona("Víctor", "Gomenza", "2614271299", 39);
         * 
         * Persona per2 = new Persona("Alejandra", "Segovia", "2614121585", 38);
         * 
         * Persona per3 = new Persona("Juan", "Perez", "2614897596", 78);
         * 
         * 
         * 
         * per1.mostrarInfo();
         * per1.decirNombre();
         * per2.mostrarInfo();
         * per2.decirNombre();
         * per3.mostrarInfo();
         * per3.decirNombre();
         * 
         * per1.setNombre("Hugo");
         * 
         * JOptionPane.showMessageDialog(null, "Modifico el nombre a " +
         * per1.llamarNombre());
         */

        Persona per1 = new Persona();
        per1.setNombre("Alejandra");
        JOptionPane.showMessageDialog(null, "ID" + per1.getId() + ": " + per1.llamarNombre());

        Persona per2 = new Persona();

        per2.setNombre("Víctor");
        JOptionPane.showMessageDialog(null, "ID" + per2.getId() + ": " + per2.llamarNombre());

        Persona per3 = new Persona();
        per3.setNombre("José");
        JOptionPane.showMessageDialog(null, "ID" + per3.getId() + ": " + per3.llamarNombre());

    }
}
