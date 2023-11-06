import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/* 
 * Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
 * String. El programa pedirá una marca de Auto en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar 
 * otro Auto o si quiere salir. Si decide salir, se mostrará todos los autos
 * guardados en el ArrayList. 
 */

class TP11Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> marcasDeAutos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese la marca del auto: ");
            String marca = sc.nextLine();

            marcasDeAutos.add(marca);

            System.out.print("¿Desea ingresar otra marca de auto? (Si/No): ");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));

        System.out.println("\nMarcas de autos registradas:");
        for (String marca : marcasDeAutos) {
            System.out.println(marca);
        }

        sc.close();
    }
}

/*
 * Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una
 * lista de jugadores. La clase debe permitir agregar nuevos jugadores, eliminar
 * jugadores y listar la plantilla.
 */

class EquipoDeFútbol {

    private ArrayList<String> jugadores;

    public EquipoDeFútbol() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(String jugador) {
        jugadores.remove(jugador);
    }

    public void listarPlantilla() {
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public static void main(String[] args) {
        EquipoDeFútbol equipo = new EquipoDeFútbol();

        equipo.agregarJugador("Jugador 1");
        equipo.agregarJugador("Jugador 2");
        equipo.agregarJugador("Jugador 3");

        System.out.println("\nPlantilla del equipo:");
        equipo.listarPlantilla();

        equipo.eliminarJugador("Jugador 2");

        System.out.println("\nPlantilla después de eliminar a Jugador 2:");
        equipo.listarPlantilla();
    }
}

/*
 * Crear una clase llamada Factura que represente una factura comercial. La
 * clase debe tener los siguientes atributos:
 * 
 * Número de factura: Un número único para identificar la factura.
 * Fecha de emisión: La fecha en la que se emitió la factura.
 * Cliente: El cliente al que se le emite la factura.
 * Artículos: Una lista de artículos vendidos en la factura.
 * Precio unitario: El precio unitario de cada artículo.
 * Cantidad: La cantidad de cada artículo vendido.
 * Subtotal: El subtotal de la factura sin impuestos.
 * IVA: El impuesto sobre el valor añadido (IVA) de la factura.
 * Total: El total de la factura, incluyendo el IVA.
 * 
 * La clase debe tener los siguientes métodos:
 * 
 * Constructor: Un constructor que inicializa los atributos de la factura.
 * Agregar artículo: Un método que agrega un artículo a la factura.
 * Calcular subtotal: Un método que calcula el subtotal de la factura.
 * Calcular IVA: Un método que calcula el IVA de la factura.
 * Calcular total: Un método que calcula el total de la factura
 */
class Articulo {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Articulo(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}

class Factura {
    private int numeroFactura;
    private Date fechaEmision;
    private String cliente;
    private ArrayList<Articulo> articulos;

    public Factura(int numeroFactura, Date fechaEmision, String cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public double calcularSubtotal() {
        double subtotal = 0.0;
        for (Articulo articulo : articulos) {
            subtotal += articulo.getPrecioUnitario() * articulo.getCantidad();
        }
        return subtotal;
    }

    public double calcularIVA(double tasaIVA) {
        double subtotal = calcularSubtotal();
        return subtotal * tasaIVA;
    }

    public double calcularTotal(double tasaIVA) {
        double subtotal = calcularSubtotal();
        double iva = calcularIVA(tasaIVA);
        return subtotal + iva;
    }

    public void mostrarFactura(double tasaIVA) {
        System.out.println("\nNúmero de Factura: " + numeroFactura);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Cliente: " + cliente);
        System.out.println("Artículos:");
        for (Articulo articulo : articulos) {
            System.out.println("  - Nombre: " + articulo.getNombre());
            System.out.println("    Precio Unitario: " + articulo.getPrecioUnitario());
            System.out.println("    Cantidad: " + articulo.getCantidad());
        }
        double subtotal = calcularSubtotal();
        double iva = calcularIVA(tasaIVA);
        double total = calcularTotal(tasaIVA);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (" + (tasaIVA * 100) + "%): " + iva);
        System.out.println("Total: " + total);
    }
}

class Main {
    public static void main(String[] args) {
        Date fechaHoy = new Date();
        Articulo articulo1 = new Articulo("Producto 1", 10.0, 5);
        Articulo articulo2 = new Articulo("Producto 2", 15.0, 3);

        Factura factura = new Factura(12345, fechaHoy, "Cliente Ejemplo");
        factura.agregarArticulo(articulo1);
        factura.agregarArticulo(articulo2);

        double tasaIVA = 0.16;
        factura.mostrarFactura(tasaIVA);
    }
}
