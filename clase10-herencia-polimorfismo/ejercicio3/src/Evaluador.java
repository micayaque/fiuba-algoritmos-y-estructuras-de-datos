public class Evaluador {

    EstudianteGrado estudianteGrado = new EstudianteGrado("Estudiante Grado", 4, 4, 4);
    EstudiantePosgrado estudiantePosgrado = new EstudiantePosgrado("Estudiante Posgrado", 4, 4);

    public void mostrarNotasFinales() {
        System.out.println("Nota final del estudiante de grado :" + this.estudianteGrado.calcularNotaFinal());
        System.out.println("Nota final del estudiante de posgrado: " + this.estudiantePosgrado.calcularNotaFinal());
    }
}
