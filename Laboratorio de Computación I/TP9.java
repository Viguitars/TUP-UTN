import java.util.ArrayList;
import java.util.Random;

// Crea un ArrayList de números enteros y agrega 5 números a la lista.
class TP9Ejercicio1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("\nArrayList de números: " + numeros);

    }
}

// Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
class TP9Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        System.out.println("\nArrayList de nombres: " + nombres);

    }
}

// Imprime todos los elementos de un ArrayList de enteros.
class TP9Ejercicio3 {
    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("\nElementos del ArrayList de números: ");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}

// Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
class TP9Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        System.out.println("\nNúmero de elmentos del ArrayList de nombres: " + nombres.size());

    }
}

// Elimina un elemento específico de un ArrayList de cadenas.
class TP9Ejercicio5 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        System.out.println("\nArrayList nombres: " + nombres);
        System.out.println("Se elimina el elemento 'Maria'");
        nombres.remove("María");
        System.out.println("ArrayList de nombres resultante: " + nombres);

    }
}

// Comprueba si un ArrayList de números enteros está vacío.
class TP9Ejercicio6 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        mostrarEstadoArrayList(numeros);

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        mostrarEstadoArrayList(numeros);
    }

    public static void mostrarEstadoArrayList(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("\nEl ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}

// Encuentra el elemento más grande en un ArrayList de números.
class TP9Ejercicio7 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("ArrayList de números:");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        

    }

}
// Copia todos los elementos de un ArrayList en otro ArrayList nuevo.

// Invierte un ArrayList de enteros (el primer elemento se convierte en el
// último y viceversa).
// Combina dos ArrayLists de enteros en uno solo.

// Crea un ArrayList de números enteros y elimina todos los elementos pares.

// Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.

// Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el
// mismo orden).

// Encuentra el elemento más pequeño en un ArrayList de números.

// Crea un ArrayList de números enteros y suma todos los elementos.

// Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.

// Elimina todos los elementos duplicados de un ArrayList de cadenas.

// Crea un ArrayList de enteros y encuentra la suma de los elementos en índices
// pares.

// Comprueba si un ArrayList de enteros contiene un número específico.

// Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más
// larga.

// Encuentra el promedio de todos los elementos en un ArrayList de números
// enteros.

// Crea un ArrayList de enteros y ordénalo de forma ascendente.

// Crea un ArrayList de números enteros y elimina todos los elementos mayores
// que un valor específico.

// Encuentra la cantidad de veces que un elemento específico aparece en un
// ArrayList de cadenas.

// Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.
