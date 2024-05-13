package practicos.tp6_genericas.Ejercicio2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    private final E[] array;
    private int contador;
    private final int tamanioMaximo;

    public PilaArray(int tamanioMaximo) {
        this.tamanioMaximo = tamanioMaximo;
        this.contador = 0;
        this.array = (E[]) new Object[tamanioMaximo];
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return contador == 0;
    }

    // Método para añadir un elemento a la pila
    public boolean aniadir(E elemento) {
        if (contador < tamanioMaximo) {
            array[contador++] = elemento;
            return true;
        } else {
            return false;
        }
    }

    // Método para obtener el primer elemento de la pila
    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return array[contador - 1];
    }

    // Método para extraer y devolver el primer elemento de la pila
    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía.");
        } return array[--contador];
    }

    // Método toString para representar la pila como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaArray [");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i != contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
