package practicos.tp3;

public class Main2 {
    public static void main(String[] args) {
        String aux = "hola";
        try {
            int aux2 = Integer.parseInt(aux);
            System.out.println("El valor convertido a entero es: " + aux2);
        } catch (NumberFormatException e) {
            System.out.println("Ha ocurrido un error al convertir la cadena a " +
                    "entero: " + e.getMessage());
        }
    }
}
