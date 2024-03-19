public class Coche {
    private String Marca;
    private String Modelo;
    private String Color;
    private String Matricula;
    private double Precio;
    static double Descuento = 2000;

    public Coche() {

    }

    public Coche(String marca, String modelo, String color, String matricula, double precio) {
        Marca = marca;
        Modelo = modelo;
        Color = color;
        Matricula = matricula;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public static double getDescuento() {
        return Descuento;
    }

    public static void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public void Arrancar() {
    }


    public void Detenerse() {
    }


    public void Acelerar() {
    }


    public void Frenar() {
    }


    public void verPrecio() {
    }


}
