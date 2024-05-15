package Ejemplo2;

public class Main {
    public static void main(String[] args) {
        Grupo<String> grupoInformatica = new Grupo<>("Informática");
        grupoInformatica.agregarAlumno("Juan");
        grupoInformatica.agregarAlumno("María");
        grupoInformatica.agregarAlumno("Pedro");
        grupoInformatica.mostrarAlumnos();

        Grupo<Integer> grupoMatematicas = new Grupo<>("Matemáticas");
        grupoMatematicas.agregarAlumno(101);
        grupoMatematicas.agregarAlumno(102);
        grupoMatematicas.agregarAlumno(103);
        grupoMatematicas.mostrarAlumnos();
    }

}
