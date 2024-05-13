package practicos.tp6_genericas.Ejercicio1;

public class Calculadora implements Operable<Integer> {
    @Override
    public Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer restar(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer dividir(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}
