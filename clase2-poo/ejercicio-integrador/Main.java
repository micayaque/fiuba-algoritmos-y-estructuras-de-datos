
public class Main {
    public static void main(String[] args) {
            Materia materia = new Materia("Matemáticas");

            Alumno juan = new Alumno("Juan");
            Alumno maria = new Alumno("María");

            materia.agregarAlumno(juan);
            materia.agregarAlumno(maria);

            try {
                juan.agregarNota(new Nota(8));
                juan.agregarNota(new Nota(7));

                maria.agregarNota(new Nota(5));
                maria.agregarNota(new Nota(11));

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Estado de Juan: " + materia.consultarEstado(juan));
            System.out.println("Estado de María: " + materia.consultarEstado(maria));

    }
}