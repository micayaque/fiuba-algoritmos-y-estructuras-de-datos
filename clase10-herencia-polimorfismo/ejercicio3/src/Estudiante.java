abstract class Estudiante {

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularNotaFinal();
}
