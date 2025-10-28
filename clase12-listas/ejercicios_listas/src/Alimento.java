public class Alimento {

    private String nombre;
    private int calorias;
    private ListaConCursorT<String> ingredientes;

    public Alimento(String nombre, int calorias, ListaConCursorT<String> ingredientes) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.ingredientes = ingredientes;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public int obtenerCalorias() {
        return this.calorias;
    }

    public ListaConCursorT<String> obtenerIngredientes() {
        return this.ingredientes;
    }
}