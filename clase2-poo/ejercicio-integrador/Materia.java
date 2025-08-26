import java.util.ArrayList;
import java.util.List;

class Materia {
    private String nombre;
    private List<Alumno> alumnos;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public String consultarEstado(Alumno alumno) {
        if (!alumnos.contains(alumno)) {
            return "Alumno no encontrado en la materia.";
        }
        return alumno.getNotas().isEmpty() ? "El alumno no tiene notas registradas." : calcularEstadoAlumno(alumno);
    }

    private String calcularEstadoAlumno(Alumno alumno) {
        float promedio = calcularPromedio(alumno);
        return promedio >= 7 ? "Aprobado" : "Desaprobado";
    }

    private float calcularPromedio(Alumno alumno) {
        float suma = 0;
        for (Nota nota : alumno.getNotas()) {
            suma += nota.getValor();
        }
        return suma / alumno.getNotas().size();
    }
}