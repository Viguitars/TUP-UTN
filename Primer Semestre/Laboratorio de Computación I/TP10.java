// Crea una clase Perro con atributos como nombre, raza y edad.
// Define un objeto de la clase Perro y asigna valores a sus atributos
// Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en
// la consola.
class Perro {

    private String nombre;
    private String raza;
    private int edad;

    public void ladrar() {
        System.out.println("Guau, guau");
    }

    public static void main(String[] args) {

        Perro miPerro = new Perro();

        miPerro.nombre = "Rex";
        miPerro.raza = "Labrador";
        miPerro.edad = 3;

        System.out.println("\nNombre del perro: " + miPerro.nombre);
        System.out.println("Raza del perro: " + miPerro.raza);
        System.out.println("Edad del perro: " + miPerro.edad);

        miPerro.ladrar();
    }

}

// Crea una clase Círculo con un atributo de radio y métodos para calcular su
// área y circunferencia.
// Crea un objeto de la clase Círculo y calcula su área y circunferencia.
class Circulo {
    private double radio;

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {

        Circulo miCirculo = new Circulo();

        miCirculo.radio = 5.0;

        double area = miCirculo.calcularArea();
        double circunferencia = miCirculo.calcularCircunferencia();

        System.out.println("\nRadio: " + miCirculo.radio);
        System.out.println("\nArea: " + area);
        System.out.println("Circunferencia: " + circunferencia);

    }

}

// Crea una clase Estudiante con atributos como nombre, edad y número de
// identificación.
// Define un constructor para la clase Estudiante que permita inicializar sus
// atributos al crear un objeto.
class Estudiante {

    private String nombre;
    private int edad;
    private String numeroIdentificacion;

    public Estudiante(String nombre, int edad, String numeroIdentificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public static void main(String[] args) {

        Estudiante miEstudiante = new Estudiante("Víctor", 38, "755");

        System.out.println("\nEstudiante " + miEstudiante.nombre + ", " + miEstudiante.edad
                + " años de edad y número de identificación " + miEstudiante.numeroIdentificacion + ".");

    }
}

// Crea una clase Libro con atributos como título, autor y año de publicación.
// Implementa un método en la clase Libro que permita mostrar la información del
// libro en la consola.
class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void mostrarInformacion() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }

}

// Crea una clase CuentaBancaria con atributos como saldo y número de cuenta
// Define métodos para depositar y retirar dinero de la cuenta.
class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }
}

// Crea una clase Rectángulo con atributos de ancho y alto y métodos para
// calcular su área y perímetro.
class Rectangulo {

    private double ancho;
    private double alto;

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

// Crea una clase Coche con atributos como marca, modelo y año de fabricación.
// Define un método en la clase Coche que permita acelerar el coche y otro para
// frenar.
class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;

    public void acelerar() {
        System.out.println("Acelerando el coche");
    }

    public void frenar() {
        System.out.println("Frenando el coche");
    }
}

// Crea una clase Película con atributos como título, director y duración en
// minutos. Implementa un método para mostrar la información de la película.
class Pelicula {

    private String titulo;
    private String director;
    int duracionMinutos;

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración (minutos): " + duracionMinutos);
    }
}
