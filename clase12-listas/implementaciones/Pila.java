package estructuras;

public class Pila {
	
	// Atributos
	private Nodo ultimo;

	// Constructor
	public Pila() {
		ultimo = null;
	}
	
	public void alta(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.cambiarSiguiente(ultimo);
		ultimo = nuevo;
	}
	
	public int baja() {
		int devolver = ultimo.obtenerDato();
		ultimo = ultimo.obtenerSiguiente();
		return devolver;
	}
	
	public int consulta() {
		return ultimo.obtenerDato();
	}
	
	public boolean vacia() {
		return (ultimo == null);
	}
}
