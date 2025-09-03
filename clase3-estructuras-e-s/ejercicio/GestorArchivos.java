import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorArchivos {
    private final String ruta;

    public GestorArchivos(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Obtiene el historial de resultados del archivo
     * @return Los resultados que se levantaron del archivo
     */
    public ArrayList<Integer> obtenerHistorial() {
        try {
            FileReader archivo = new FileReader(ruta);
            var resultados = new ArrayList<Integer>();
            procesarArchivo(archivo, resultados);
            archivo.close();
            return resultados;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Se encarga de agregar los resultados del archivo a la lista de resultados
     * @param archivo el archivo del cual levantar los resultados ya abierto
     * @param resultados donde guardar los resultados obtenidos del archivo
     */
    private static void procesarArchivo(FileReader archivo, ArrayList<Integer> resultados) {
        Scanner scanner = new Scanner(archivo);
        String resultado;
        while (scanner.hasNextLine()) {
            resultado = scanner.nextLine().trim();
            try {
                resultados.add(Integer.parseInt(resultado));
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el resultado a numero: " + resultado);
            }
        }
        scanner.close();
    }

    /**
     * Se encarga de agregar los resultados al archivo del historial
     * @param resultados resultados a guardar, es importante no reenviar los ya guardados
     */
    public void guardarHistorial(ArrayList<Integer> resultados) {
        System.out.println("Escribiendo historial en: " + new java.io.File(ruta).getAbsolutePath());
        if(!resultados.isEmpty()){
            try (FileWriter archivo = new FileWriter(ruta, true)) {
                for (int resultado : resultados) {
                    archivo.write("\n" + resultado);
                }
            } catch (IOException e) {
                System.out.println("Error al escribir un número en el archivo de historial ");
            }
        }
    }
}