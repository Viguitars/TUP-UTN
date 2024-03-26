package clases.clase02_2103.Cursos;

import java.util.ArrayList;

public class CronogramaCursos {
    private int turno;
    //    Relación
    private ArrayList<Curso> listaCursos;

    public CronogramaCursos() {
    }

    public CronogramaCursos(int turno, ArrayList<Curso> listaCursos) {
        this.turno = turno;
        this.listaCursos = listaCursos;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    //    Relación de dependencia
    //    Lo que me define la relación de dependencia es que a los métodos
    //    agregarCurso() y quitarCurso(), le paso como parámetro un elemento
    //    de otra clase
    public void agregarCurso(Curso c) {
        listaCursos.add(c);

    }

    public void quitarCurso(Curso c) {
        listaCursos.remove(c);
    }
}
