package estructuras;

public class Cola {
	// Atributos
	private Nodo primero;
	private Nodo ultimo;
	
	// Metodos
	// Constructor
	// pre: - 
	// pos: inicializa la Cola en vacia
	public Cola() {
		System.out.println("Construyo una cola vacia");
		primero = null;
		ultimo = null;
	} 
	
	// pre: - 
	// pos: agrega d al final de la Cola
	public void alta(int d) {
		Nodo nuevo = new Nodo(d);
		if (vacia()) {
			primero = nuevo;
		}
		else {
			ultimo.cambiarSiguiente(nuevo);
		}
		ultimo = nuevo;
	}

	// pre: la Cola no puede estar vacia
	// pos: saca el primer elemento de la Cola y lo devuelve
	public int baja() {
		int devolver = consulta();
		if (primero == ultimo)
			ultimo = null;
		primero = primero.obtenerSiguiente();
		return devolver;
	}

	// pre: la Cola no puede estar vacia
	// pos: devuelve el primer elemento de la Cola
	public int consulta() {
		return primero.obtenerDato();
	}

	// pre: -
	// pos: devuelve true si la Cola esta vacia, false si no
	public boolean vacia() {
		return (ultimo == null);
	}
}
