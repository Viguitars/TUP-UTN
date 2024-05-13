package practicos.tp6_genericas.Ejercicio1;

public interface Operable<E> {
    E sumar(E a, E b);

    E restar(E a, E b);

    E multiplicar(E a, E b);

    E dividir(E a, E b);
}
