package practicos.tp6_genericas.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de una clase que implemente la interfaz Operable
        Calculadora calculadora = new Calculadora();

        // Realizar operaciones
        int suma = calculadora.sumar(5, 3);
        int resta = calculadora.restar(5, 3);
        int producto = calculadora.multiplicar(5, 3);
        int division = calculadora.dividir(10, 2);

        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);
    }
}
