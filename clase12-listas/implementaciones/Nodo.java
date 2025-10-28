package estructuras;

public class Nodo {
	private int dato;
	private Nodo siguiente;

	// constructor
	public Nodo(int d) {
		dato = d;
		siguiente = null;
	}

	public int obtenerDato() {
		return dato;
	}

	public void cambiarDato(int dato) {
		this.dato = dato;
	}
	
	public Nodo obtenerSiguiente() {
		return siguiente;
	}
	public void cambiarSiguiente(Nodo sig) {
		this.siguiente = sig;
	}

}
