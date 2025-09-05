import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    private final String ruta;

    public GestorArchivos(String ruta) {
        this.ruta = ruta;
    }

    public void guardarContactos(Contacto[] contactos) {
        System.out.println("Escribiendo historial en: " + new java.io.File(ruta).getAbsolutePath());
        if(!(contactos.length > 0)){
            try (FileWriter archivo = new FileWriter(ruta, true)) {
                for (Contacto contacto : contactos) {
                    archivo.write(contacto.obtenerNumeroDeTelefono() + contacto.obtenerNombre() + " " + contacto.obtenerApellido() + "\n");
                }
            } catch (IOException e) {
                System.out.println("Error al escribir un número en el archivo de historial ");
            }
        }
    }
}
