public class ListaDoblementeEnlazadaT<T extends Comparable<T>> {
    private NodoDobleT primero;
    private NodoDobleT ultimo;

    public ListaDoblementeEnlazadaT() {
        this.primero = null;
        this.ultimo = null;
    }

    public void alta(T dato) {
        NodoDobleT nuevo = new NodoDobleT(dato);

        if (this.primero == null) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else if (dato.compareTo(this.primero.obtenerDato()) < 0) {
            nuevo.cambiarSiguiente(this.primero);
            this.primero.cambiarAnterior(nuevo);
            this.primero = nuevo;
        } else {
            NodoDobleT actual = this.primero;

            while (actual.obtenerSiguiente() != null && dato.compareTo(actual.obtenerSiguiente().obtenerDato()) > 0) actual = actual.obtenerSiguiente();

            NodoDobleT siguiente = actual.obtenerSiguiente();

            actual.cambiarSiguiente(nuevo);
            nuevo.cambiarAnterior(actual);

            if (siguiente != null) {
                nuevo.cambiarSiguiente(siguiente);
                siguiente.cambiarAnterior(nuevo);
            } else {
                this.ultimo = nuevo;
            }
        }
    }

    public void baja(T dato) {
        NodoDobleT actual = this.primero;
        while (actual != null && actual.obtenerDato().compareTo(dato) != 0) actual = actual.obtenerSiguiente();

        if(actual != null) {
            NodoDobleT anterior = actual.obtenerAnterior();
            NodoDobleT siguiente = actual.obtenerSiguiente();

            if (anterior == null) this.primero = siguiente;
            else anterior.cambiarSiguiente(siguiente);

            if (siguiente == null) this.ultimo = anterior;
            else siguiente.cambiarAnterior(anterior);
        }
    }

    private class NodoDobleT {
        private T dato;

        private NodoDobleT siguiente;
        private NodoDobleT anterior;

        public NodoDobleT(T d) {
            this.dato = d;

            this.siguiente = null;
            this.anterior = null;
        }

        public T obtenerDato() {
            return dato;
        }

        public void cambiarDato(T dato) {
            this.dato = dato;
        }

        public NodoDobleT obtenerSiguiente() {
            return this.siguiente;
        }
        public NodoDobleT obtenerAnterior() { return this.anterior; }

        public void cambiarSiguiente(NodoDobleT nodo) {
            this.siguiente = nodo;
        }
        public void cambiarAnterior(NodoDobleT nodo) { this.anterior = nodo; }
    }
}