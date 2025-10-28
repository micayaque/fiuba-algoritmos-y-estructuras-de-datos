public class EstudiantePosgrado extends Estudiante {

    private double notaTrabajoFinal;
    private double notaExamenOral;

    public EstudiantePosgrado(String nombre, double notaExamenOral,  double notaTrabajoFinal) {
        super(nombre);
        this.notaExamenOral = notaExamenOral;
        this.notaTrabajoFinal = notaTrabajoFinal;
    }

    @Override
    double calcularNotaFinal() {
        return this.notaTrabajoFinal * 0.7 + this.notaExamenOral * 0.3;
    }
}
