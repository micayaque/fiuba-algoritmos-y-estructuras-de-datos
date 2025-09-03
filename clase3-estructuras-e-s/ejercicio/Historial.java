import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Historial {
    private static final String RUTA = "historial.txt";
    private final GestorArchivos gestorArchivos;
    private ArrayList<Integer> historial;
    private final ArrayList<Integer> historialEjecucion;

    public Historial() {
        this.gestorArchivos = new GestorArchivos(RUTA);
        historialEjecucion = new ArrayList<>();
    }

    /**
     * Carga el historial del archivo especificado en la RUTA
     */
    public void cargarHistorial() {
        this.historial = gestorArchivos.obtenerHistorial();
    }

    /**
     * Carga el historial de ejecucion en archivo especificado en la RUTA
     */
    public void guardarHistorial() {
        gestorArchivos.guardarHistorial(historialEjecucion);

    }

    /**
     * Muestra el historial completo
     */
    public void mostrarHistorial(){
        if(historial != null){
            System.out.println("El historial de resultados es el siguiente:");
            historial.forEach(System.out::println);
        }

        if(!historialEjecucion.isEmpty()) {
            System.out.println("Durante esta ejecución se obtuvieron los siguientes resultados:");
            historialEjecucion.forEach(System.out::println);
        }

    }
    /**
     * Guarda el resultado en el historial
     */
    public void guardarResultado(int resultado){
        historialEjecucion.add(resultado);
    }
}