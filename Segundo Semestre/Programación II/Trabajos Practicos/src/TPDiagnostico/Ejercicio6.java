package TPDiagnostico;

import java.util.Scanner;

/**
 * Pide al usuario que ingrese una frase y devuelve la cantidad de vocales y
 * consonantes que tiene esa frase.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}
