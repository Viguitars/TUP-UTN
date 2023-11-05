import java.util.*;
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

        int elementoMasGrande = encontrarElementoMasGrande(numeros);

        System.out.println("\nEl elemento más grande en la lista es: " + elementoMasGrande);

    }

    public static int encontrarElementoMasGrande(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("\nLa lista está vacía");
        }

        int maximo = lista.get(0);

        for (int numero : lista) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }

}

// Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
class TP9Ejercicio8 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        ArrayList<Integer> copiaNumeros = new ArrayList<>(numeros);

        System.out.println("ArrayList original: " + numeros);
        System.out.println("Copia ArrayList: " + copiaNumeros);

    }

}

// Invierte un ArrayList de enteros (el primer elemento se convierte en el
// último y viceversa).
class TP9Ejercicio9 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("ArrayList original: " + numeros);
        invertirArrayList(numeros);
        System.out.println("ArrayList invertido: " + numeros);

    }

    public static void invertirArrayList(ArrayList<Integer> lista) {

        int tamaño = lista.size();

        for (int i = 0; i < tamaño / 2; i++) {
            int temp = lista.get(i);
            lista.set(i, lista.get(tamaño - 1 - i));
            lista.set(tamaño - 1 - i, temp);
        }
    }

}

// Combina dos ArrayLists de enteros en uno solo.
class TP9Ejercicio10 {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        cargarArrayList(num1);
        System.out.println("ArrayList N°1: " + num1);

        cargarArrayList(num2);
        System.out.println("\nArrayList N°2: " + num2);

        ArrayList<Integer> numeros = new ArrayList<>(num1);
        numeros.addAll(num2);

        System.out.println("\nArrayList combinado: " + numeros);

    }

    public static void cargarArrayList(ArrayList<Integer> lista) {
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            lista.add(rnd.nextInt(99) + 1);
        }

    }

}

// Crea un ArrayList de números enteros y elimina todos los elementos pares.
class TP9Ejercicio11 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("ArrayList original: " + numeros);

        numeros.removeIf(numero -> numero % 2 == 0);

        System.out.println("ArrayList sin números pares: " + numeros);

    }

}

// Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.
class TP9Ejercicio12 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        System.out.println("\nArrayList nombres: " + nombres);

        int indice = nombres.indexOf("María");

        System.out.println("\nIndice elemento 'Maria': " + indice);

    }
}

// Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el
// mismo orden).
class TP9Ejercicio13 {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();

        cargarArrayList(num1);
        System.out.println("ArrayList N°1: " + num1);

        ArrayList<Integer> num2 = new ArrayList<>(num1);
        System.out.println("\nArrayList N°2: " + num2);

        boolean sonIguales = num1.equals(num2);

        if (sonIguales) {
            System.out.println("\nLos ArrayList son iguales.");
        } else {
            System.out.println("\nLos ArrayList no son iguales.");
        }

    }

    public static void cargarArrayList(ArrayList<Integer> lista) {
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            lista.add(rnd.nextInt(99) + 1);
        }

    }

}

// Encuentra el elemento más pequeño en un ArrayList de números.
class TP9Ejercicio14 {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("ArrayList de números: " + numeros);

        int elementoMasChico = encontrarElementoMasChico(numeros);

        System.out.println("\nEl elemento más chico en la lista es: " + elementoMasChico);

    }

    public static int encontrarElementoMasChico(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("\nLa lista está vacía");
        }

        int minimo = lista.get(0);

        for (int numero : lista) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

}

// Crea un ArrayList de números enteros y suma todos los elementos.
class TP9Ejercicio15 {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(rnd.nextInt(99) + 1);
        }

        System.out.println("ArrayList de números: " + numeros);

        int resultado = sumaElementosArrayList(numeros);

        System.out.println("\nLa suma de los elementos es : " + resultado);

    }

    public static int sumaElementosArrayList(ArrayList<Integer> lista) {
        int suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }

        return suma;
    }

}

// Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.
class TP9Ejercicio16 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        System.out.println("\nArrayList nombres: " + nombres);

        String cadenaConcatenada = String.join("", nombres);

        System.out.println("\nConcatenado: " + cadenaConcatenada);

    }
}

// Elimina todos los elementos duplicados de un ArrayList de cadenas.
/* class TP9Ejercicio17 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Carlos");

        System.out.println("\nArrayList nombres: " + nombres);

        ArrayList<Integer> arrayListSinDuplicados = new ArrayList<>(nombres);

        // construye un conjunto a partir de elementos de la lista
        Set<String> set = new LinkedHashSet<>(arrayListSinDuplicados);

        // construir una nueva lista a partir de un conjunto e imprimirla
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("\nConcatenado: " + arrayListSinDuplicados);

    }
} */
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
