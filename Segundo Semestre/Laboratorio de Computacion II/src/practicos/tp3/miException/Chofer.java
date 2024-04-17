package practicos.tp3.miException;

class Chofer {
    private boolean matriculaVencida;

    // Constructor que puede lanzar MatriculaVencidaException
    public Chofer(boolean matriculaVencida) throws MatriculaVencidaException {
        if (matriculaVencida) {
            throw new MatriculaVencidaException("La matrícula del chofer está "
                    + "vencida");
        }
        this.matriculaVencida = matriculaVencida;
    }
}
