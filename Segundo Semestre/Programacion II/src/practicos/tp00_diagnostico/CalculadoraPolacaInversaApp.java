package practicos.tp00_diagnostico;

import java.util.Scanner;

/**
 * Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2
 * operandos (int) y un signo aritmético (String), según este último se realizará
 * la operación correspondiente. Al final mostrará el resultado en un cuadro de
 * diálogo.
 * Los signos aritméticos disponibles son:
 * +: suma los dos operandos.
 * -: resta los operandos.
 * *: multiplica los operandos.
 * /: divide los operandos, este debe dar un resultado con decimales (double)
 * ^: 1º operando como base y 2º como exponente.
 * %: módulo, resto de la división entre operando1 y operando 2.
 */

public class CalculadoraPolacaInversaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        double operand1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^, %): ");
        String operator = sc.next();

        System.out.print("Enter the second operand: ");
        double operand2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "^":
                result = Math.pow(operand1, operand2);
                break;
            case "%":
                result = operand1 % operand2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);

    }
}
