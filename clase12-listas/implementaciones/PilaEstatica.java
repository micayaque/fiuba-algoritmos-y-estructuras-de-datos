package estructuras;

public class PilaEstatica<T> {
	private final int MAXIMO = 10; // tamanio fisico
	private int ultimo;			   // tamanio logico
	private T[] datos;


	// constructor
	// PRE: -
	// POS: crea una Pila vacia
	@SuppressWarnings("unchecked")
	public PilaEstatica() {
		datos = (T[]) new Object[MAXIMO];
		ultimo = 0;
	}
	
	// PRE: llena debe dar false
	// POS: agrega dato encima de la Pila e incrementa ultimo
	public void alta(T dato) {
		datos[ultimo] = dato;
		ultimo++;
	}
	
	// PRE: la Pila no tiene que estar vacia
	// POS: saca el ultimo elemento de la Pila, decrementa ultimo
	//      y devuelve el elemento
	public T baja() {
		ultimo--;
		return datos[ultimo];
	}

	// PRE: la Pila no tiene que estar vacia
	// POS: devuelve el ultimo elemento de la Pila 
	public T consulta() {
		return datos[ultimo - 1];
	}
	
	// PRE: -
	// POS: devuelve true si la Pila esta vacia, false de lo contrario
	public boolean vacia() {
		return (ultimo == 0);
	}

	// PRE: -
	// POS: devuelve true si la Pila esta llena, false de lo contrario
	public boolean llena() {
		return (ultimo == MAXIMO);
	}
}
