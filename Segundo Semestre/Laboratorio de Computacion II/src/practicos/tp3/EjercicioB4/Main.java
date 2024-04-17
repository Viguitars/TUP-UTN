package practicos.tp3.CustomException;

public class Main10 {
    static void methodFour() throws CustomException {
        throw new CustomException("Exception thrown in method four");
    }

    static void methodThree() throws CustomException {
        methodFour();
    }

    static void methodTwo() throws CustomException {
        methodThree();
    }

    static void methodOne() throws CustomException {
        methodTwo();
    }

    public static void main(String[] args) {
        try {
            methodOne();
        } catch (CustomException e) {
            System.out.println("Exception handled in method one: " + e.getMessage());
        }
    }
}
