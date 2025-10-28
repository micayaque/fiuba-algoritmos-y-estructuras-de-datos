package estructuras;

public class Lista {
	// Atributos
	private Nodo primero;
	private int cantidad;
	
	// Metodos
	// Constructor
	// pre: - 
	// pos: inicializa la Lista en vacia
	public Lista() {
		primero = null;
		cantidad = 0;
	} 
	
	// pre: 1 <= pos <= cantidad + 1, la primera posicion es la 1 
	// pos: agrega d en la Lista en la posicion pos
	//      incrementa en 1 la cantidad de elementos
	public void alta(int d, int pos) {
		
		Nodo nuevo = new Nodo(d);
		// Caso 1: alta al principio
		if (pos == 1) {
			nuevo.cambiarSiguiente(primero);
			primero = nuevo;
		}
		// caso generico
		else {
			Nodo anterior = obtenerNodo(pos - 1);
			Nodo siguiente = anterior.obtenerSiguiente();
			nuevo.cambiarSiguiente(siguiente);
			anterior.cambiarSiguiente(nuevo);
		}
		cantidad++;	
	}

	// pre: 1 <= pos <= cantidad
	// pos: saca el elemento de la Lista que esta en la posicion pos
	//      decrementa la cantidad de elementos
	public void baja(int pos) {
		Nodo borrar;
		// Caso 1: baja al principio
		if (pos == 1) {
			borrar = primero;
			primero = borrar.obtenerSiguiente();
		}
		// caso generico
		else {
			Nodo anterior = obtenerNodo(pos - 1);
			borrar = anterior.obtenerSiguiente();
			anterior.cambiarSiguiente(borrar.obtenerSiguiente());
		}
		borrar = null;
		cantidad--;
	}

	// pre: 1 <= pos <= cantidad
	// pos: devuelve el elemento de la Lista que esta en la posicion pos
	public int consulta(int pos) {
		Nodo nodo = obtenerNodo(pos);
		return nodo.obtenerDato();
	}

	// pre: -
	// pos: devuelve true si la Lista esta vacia, false si no
	public boolean vacia() {
		return (cantidad == 0);
	}
	
	// pre: -
	// pos: devuelve la cantidad de elementos de la Lista
	public int cantidadElementos() {
		return cantidad;
	}
	
	// pre: 1 <= pos <= cantidad
	// pos: devuelve una ref. al Nodo que esta en la posicion pos
	private Nodo obtenerNodo(int pos) {
		Nodo nodo = primero;
		for (int i = 1; i < pos; i++)
			nodo = nodo.obtenerSiguiente();
		return nodo;
	}
}
