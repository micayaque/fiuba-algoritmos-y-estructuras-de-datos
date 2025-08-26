import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String nombre;
    private List<Nota> notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> getNotas() {
        return notas;
    }
}