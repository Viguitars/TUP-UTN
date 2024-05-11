package clases.clase09_0705.Ejemplos.Parametrico;

public class Contenedor<T> {
    private T objeto;

    public Contenedor(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
    /*
     *En este ejemplo, T es un tipo genérico que representa cualquier tipo de
     * objeto. La clase Contenedor está parametrizada con T, lo que significa que
     * puede trabajar con cualquier tipo de objeto.
     */
}
