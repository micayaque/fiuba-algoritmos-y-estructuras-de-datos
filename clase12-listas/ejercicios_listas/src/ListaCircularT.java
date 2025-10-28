

public class ListaCircularT<T> {
    private NodoT ultimo;
    private int n;
    private int cantidad;

    public ListaCircularT(int n) {
        this.ultimo = null;
        this.n = n;
        this.cantidad = 0;
    }

    public void alta(T dato) {
        if(this.cantidad == 0) {
            this.ultimo = new NodoT(dato);
            this.ultimo.cambiarSiguiente(this.ultimo);
            this.cantidad++;
        } else {
            NodoT primero = this.ultimo.obtenerSiguiente();

            if (cantidad < n) {
                NodoT nuevo = new NodoT(dato);
                nuevo.cambiarSiguiente(primero);
                ultimo.cambiarSiguiente(nuevo);
                ultimo = nuevo;
                cantidad++;
            } else {
                primero.cambiarDato(dato);
                ultimo = primero;
            }
        }
    }


    private class NodoT {
        private T dato;
        private NodoT siguiente;

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

        public NodoT obtenerSiguiente() {
            return siguiente;
        }

        public void cambiarSiguiente(NodoT nodo) {
            this.siguiente = nodo;
        }
    }

}