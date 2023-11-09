import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/* cSpell:disable */

/*
 * EXAMEN PARCIAL
 * Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar
 * contra
 * los X-Mens.
 * Te ha contratado a ti para que desarrolles un programa que detecte si un
 * humano
 * es mutante basándose en su secuencia de ADN.
 * 
 * Para eso te ha pedido crear un programa con un método o función booleana,
 * llamada is_mutant(dna), que recibe como parámetro un arreglo de Strings que
 * representan cada fila de una matriz 6x6 con la secuencia de ADN.
 * Las letras de los Strings solo pueden ser: A,T,C,G; las cuales representan
 * cada
 * base nitrogenada del ADN.
 * 
 * Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro
 * letras iguales, estas pueden aparecer de forma oblicua, horizontal o
 * vertical.
 * Ejemplo de matrices válidas:
 * 
 * No-Mutante:
 * A T G C G A
 * C A G T G C
 * T T A T T T
 * A G A C G G
 * G C G T C A
 * T C A C T G
 * Mutante:
 * A T G C G A
 * C A G T G C
 * T T A T G T
 * A G A A G G
 * C C C C T A
 * T C A C T G
 * 
 * En el caso de la segunda matriz ,
 * adn = [‘ATGCGA’,’CAGTGC’,’TTATGT’,’AGAAGG’,’CCCCTA’,’TCACTG’]
 * la función devolverá True.
 * 
 * Desarrolla el algoritmo de forma más eficiente posible.
 * El ingreso de los valores de la matriz debe ser pedido por teclado. Ten en
 * cuenta casos para que sea mutante y casos en los que no lo sea.
 * Una vez cargada correctamente la misma (esto debe verificarse), aplique la
 * función que verifica si hay presencia de genes mutantes o no y mostrar el
 * resultado por pantalla al usuario.
 * 
 * Subir a Github el proyecto con los casos de prueba.
 */

class MutantDetector {

    // Matriz para almacenar el ADN
    private char[][] dnaMatrix;

    // Contador de secuencias encontradas
    private int sequencesFound;

    // Conjunto para almacenar letras únicas de secuencias encontradas
    private Set<Character> uniqueLettersFound;

    // Constructor
    public MutantDetector() {
        dnaMatrix = new char[6][6];
        sequencesFound = 0;
        uniqueLettersFound = new HashSet<>();
    }

    // Método para obtener el ADN del usuario
    public void getDnaFromUser() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las secuencias de ADN (6 secuencias de 6 letras cada una de A, T, C, G):");
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Secuencia " + (i + 1) + ": ");
                String sequence = sc.nextLine().toUpperCase();
                if (isValidSequence(sequence)) {
                    dnaMatrix[i] = sequence.toCharArray();
                    break;
                }
                System.out.println("Secuencia inválida. Asegúrese de que sean 6 caracteres de A, T, C, G.");
            }
        }

        sc.close();

        System.out.println("\nMatriz de ADN cargada correctamente.");
    }

    // Método principal para determinar si un humano es mutante
    public boolean isMutant(char[][] dna) {
        if (!isValidDnaMatrix(dna)) {
            return false;
        }

        dnaMatrix = dna;
        sequencesFound = 0;
        uniqueLettersFound.clear();

        int n = dna.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequencesFound > 1) {
                    return true;
                }

                if (dfs(i, j, -1, dnaMatrix[i][j], 0)
                        && dnaMatrix[i][j] != uniqueLettersFound.iterator().next()) {
                    sequencesFound++;
                }
            }
        }

        return sequencesFound > 1;
    }

    // Método para validar si una matriz de ADN es válida
    private boolean isValidDnaMatrix(char[][] dna) {
        if (dna.length != 6 || anyRowLengthNotEqualSix(dna) || anyInvalidCharacter(dna)) {
            return false;
        }
        return true;
    }

    // Método para verificar si alguna fila no tiene longitud igual a seis
    private boolean anyRowLengthNotEqualSix(char[][] dna) {
        for (char[] row : dna) {
            if (row.length != 6) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si algún carácter es inválido
    private boolean anyInvalidCharacter(char[][] dna) {
        for (char[] row : dna) {
            for (char c : row) {
                if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                    return true;
                }
            }
        }
        return false;
    }

    // Método para validar si una secuencia es válida
    private boolean isValidSequence(String sequence) {
        return sequence.length() == 6 && sequence.matches("[ATCG]+");
    }

    // Método de búsqueda en profundidad (DFS)
    private boolean dfs(int i, int j, int direction, char currentChar, int depth) {
        if (direction == -1 && depth == 0) {
            // Llamada a DFS en todas las direcciones posibles
            for (int d = 0; d < 8; d++) {
                if (dfs(i, j, d, currentChar, 1)) {
                    return true;
                }
            }
            return false;
        }

        if (i < 0 || i >= dnaMatrix.length || j < 0 || j >= dnaMatrix.length || dnaMatrix[i][j] != currentChar) {
            return false;
        }

        if (depth == 4) {
            char currentLetter = dnaMatrix[i][j];
            if (!uniqueLettersFound.contains(currentLetter)) {
                uniqueLettersFound.add(currentLetter);
                return true;
            }
        }

        int[][] directions = {
                { -1, 0 }, // Arriba
                { 1, 0 }, // Abajo
                { 0, -1 }, // Izquierda
                { 0, 1 }, // Derecha
                { -1, -1 }, // Diagonal Arriba Izquierda
                { -1, 1 }, // Diagonal Arriba Derecha
                { 1, -1 }, // Diagonal Abajo Izquierda
                { 1, 1 } // Diagonal Abajo Derecha
        };

        if (0 <= direction && direction < directions.length) {
            int nextI = i + directions[direction][0];
            int nextJ = j + directions[direction][1];
            return dfs(nextI, nextJ, direction, currentChar, depth + 1);
        }

        return false;
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {

        MutantDetector mutantDetector = new MutantDetector();
        mutantDetector.getDnaFromUser();
        char[][] dnaMatrix = mutantDetector.dnaMatrix;

        boolean isMutant = mutantDetector.isMutant(dnaMatrix);

        System.out.println("Es mutante: " + isMutant);
    }
}
