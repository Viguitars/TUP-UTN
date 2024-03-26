package clases.clase03_2103.Ejercicio2;

public abstract class Animal {
    protected String foto;
    protected String comida;
    protected String localizacion;
    protected String tamanio;

    public Animal(String foto, String comida, String localizacion,
                  String tamanio) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public abstract void hacerRuido();

    public void comer() {
        System.out.println("Comiendo...");
    }

    public void dormir() {
        System.out.println("Durmiendo...");
    }


    public abstract void rugir();


}
