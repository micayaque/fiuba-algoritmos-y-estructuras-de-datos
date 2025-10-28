package estructuras;

public class NodoT<T> {
	private T dato;
	private NodoT<T> siguiente;

	// constructor
	public NodoT(T d) {
		dato = d;
		siguiente = null;
	}

	public T obtenerDato() {
		return dato;
	}

	public void cambiarDato(T dato) {
		this.dato = dato;
	}
	
	public NodoT<T> obtenerSiguiente() {
		return siguiente;
	}
	public void cambiarSiguiente(NodoT<T> primero) {
		this.siguiente = primero;
	}
}
