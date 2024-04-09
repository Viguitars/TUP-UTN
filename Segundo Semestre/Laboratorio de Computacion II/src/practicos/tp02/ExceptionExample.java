package practicos.tp02;

public class ExceptionExample {

    public void nestedExceptionMethod(int value) {
        try {
            int result = 100 / value;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException atrapada: " + e.getMessage());
        }

        try {
            int[] array = new int[5];
            int element = array[5];
            System.out.println("Elemento: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException atrapada: " + e.getMessage());
        }

        try {
            String str = null;
            str.length(); // Esto lanzará NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException atrapada: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        example.nestedExceptionMethod(0);
    }
}
