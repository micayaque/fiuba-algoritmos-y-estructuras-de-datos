public class ListaConCursorT<T> {
    private NodoT primero;
    private int cantidad;
    private NodoT ultimo;
    private NodoT cursor;

    public ListaConCursorT() {
        primero = null;
        cantidad = 0;
        ultimo = null;
        cursor = null;
    }

    public void reiniciar() {
        this.cursor = this.primero;
    }


    public boolean haySiguiente() {
        return (this.cursor != null);
    }

    public T siguiente() {
        T datoActual = this.cursor.obtenerDato();

        this.cursor = this.cursor.obtenerSiguiente();

        return datoActual;
    }

    public void alta(T d) {
        ListaConCursorT.NodoT nuevo = new NodoT(d);
        nuevo.cambiarSiguiente(primero);
        primero = nuevo;
        cantidad++;
    }


    private class NodoT {
        private T dato;
        private ListaConCursorT.NodoT siguiente;

        public NodoT(T d) {
            this.dato = d;
            this.siguiente = null;
        }

        public T obtenerDato() {
            return dato;
        }

        public void cambiarDato(T dato) {
            this.dato = dato;
        }

        public ListaConCursorT.NodoT obtenerSiguiente() {
            return siguiente;
        }

        public void cambiarSiguiente(ListaConCursorT.NodoT nodo) {
            this.siguiente = nodo;
        }
    }
}