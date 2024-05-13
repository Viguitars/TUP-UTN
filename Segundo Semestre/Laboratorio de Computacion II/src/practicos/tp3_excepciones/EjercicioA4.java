package practicos.tp3;

import java.io.FileReader;
import java.io.IOException;

public class EjercicioA4 {
    public static void main(String[] args) {
        try {
            // Intentamos abrir un archivo que no existe
            FileReader reader = new FileReader("archivo_que_no_existe.txt");
            // Intentamos leer el archivo, lo que debería lanzar una IOException
            reader.read();
            // Cerramos el lector
            reader.close();
        } catch (IOException e) {
            // Capturamos la excepción y manejamos el error adecuadamente
            System.out.println("Ha ocurrido un error de entrada/salida: " + e.getMessage());
            // También podríamos imprimir la traza de la pila para obtener más
            // detalles sobre la excepción
            e.printStackTrace();
        }
    }
}
