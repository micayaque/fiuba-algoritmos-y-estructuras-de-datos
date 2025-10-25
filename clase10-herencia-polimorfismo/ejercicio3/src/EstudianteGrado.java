public class EstudianteGrado extends Estudiante{

    private double notaParcial1;
    private double notaParcial2;
    private double notaParcial3;

    public EstudianteGrado(String nombre, double notaParcial1, double notaParcial2, double notaParcial3){
        super(nombre);
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
        this.notaParcial3 = notaParcial3;
    }

    @Override
    double calcularNotaFinal() {
        return (this.notaParcial1 + this.notaParcial2 + this.notaParcial3)/3;
    }
}
