public class ListaT<T> {
    private NodoT primero;
    private int cantidad;
    private NodoT ultimo;

    public ListaT() {
        primero = null;
        cantidad = 0;
        ultimo = null;
    }

//    public void unir(ListaT<T> lista){
//        if(this.primero != null || lista.obtenerNodo(1) != null) {
//            if(this.primero == null){
//                this.primero = lista.obtenerNodo(1);
//                this.ultimo = lista.obtenerUltimo();
//            } else {
//                if(lista.obtenerNodo(1) != null) {
//                    this.ultimo.cambiarSiguiente(lista.obtenerNodo(1));
//                    this.ultimo = lista.obtenerUltimo();
//                }
//            }
//            this.cantidad += lista.cantidadElementos();
//        }
//    }

    public boolean haySiguiente(NodoT nodo){
        return nodo.obtenerSiguiente() != null;
    }

    public ListaT<T> unir(ListaT<T> lista){

        ListaT<T> nuevaLista = new ListaT<>();

        NodoT actual = this.primero;
        while(actual != null){
            nuevaLista.alta(actual.obtenerDato());
            actual = actual.obtenerSiguiente();
        }

        actual = lista.obtenerNodo(1);
        while(actual != null){
            nuevaLista.alta(actual.obtenerDato());
            actual = actual.obtenerSiguiente();
        }

        return nuevaLista;
    }


    public NodoT obtenerUltimo() {
        return this.ultimo;
    }

    public void alta(T d) {
        NodoT nuevo = new NodoT(d);
        nuevo.cambiarSiguiente(primero);
        primero = nuevo;
        cantidad++;
    }

    public void alta(T d, int pos) {
        NodoT nuevo = new NodoT(d);
        if (pos == 1) {
            nuevo.cambiarSiguiente(primero);
            primero = nuevo;
        } else {
            NodoT anterior = obtenerNodo(pos - 1);
            NodoT siguiente = anterior.obtenerSiguiente();
            nuevo.cambiarSiguiente(siguiente);
            anterior.cambiarSiguiente(nuevo);
        }
        cantidad++;
    }

    public void baja(int pos) {
        NodoT borrar;
        if (pos == 1) {
            borrar = primero;
            primero = borrar.obtenerSiguiente();
        } else {
            NodoT anterior = obtenerNodo(pos - 1);
            borrar = anterior.obtenerSiguiente();
            anterior.cambiarSiguiente(borrar.obtenerSiguiente());
        }
        borrar = null;
        cantidad--;
    }

    public T consulta(int pos) {
        NodoT nodo = obtenerNodo(pos);
        return nodo.obtenerDato();
    }

    public boolean vacia() {
        return (cantidad == 0);
    }

    public int cantidadElementos() {
        return cantidad;
    }

    private NodoT obtenerNodo(int pos) {
        NodoT nodo = primero;
        for (int i = 1; i < pos; i++)
            nodo = nodo.obtenerSiguiente();
        return nodo;
    }

    private class NodoT {
        private T dato;
        private ListaT.NodoT siguiente;

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

        public ListaT.NodoT obtenerSiguiente() {
            return siguiente;
        }

        public void cambiarSiguiente(ListaT.NodoT nodo) {
            this.siguiente = nodo;
        }
    }
}