import java.util.LinkedList;
import java.util.Queue;

public class ABB {

    private NodoT raiz;


    public void recorridoEnAncho() {
        if (this.raiz == null) return;
        Queue<NodoT> cola = new LinkedList<>();
        cola.add(this.raiz);

        while (!cola.isEmpty()) {
            NodoT actual = cola.poll();

            // Completa con el código relevante
            System.out.println(actual.getDato());

            if(actual.getDer() != null) cola.add(actual.getDer());
            if(actual.getIzq() != null) cola.add(actual.getIzq());
        }
    }

    public void modificar(int valor, int nuevoValor) {
        eliminar(valor);
        insertar(nuevoValor);
    }

    private void eliminar(int valor) {
        NodoT aEliminar = buscarNodo(valor);
        if (aEliminar == null) return;

        NodoT padre = buscarPadre(valor);

        if (aEliminar.getIzq() == null && aEliminar.getDer() == null) {
            if (padre == null) this.raiz = null;
            else if (padre.getIzq() == aEliminar) padre.setIzq(null);
            else padre.setDer(null);
        } else if (aEliminar.getIzq() != null && aEliminar.getDer() == null) {
            if (padre == null) this.raiz = aEliminar.getIzq();
            else if (padre.getIzq() == aEliminar) padre.setIzq(aEliminar.getIzq());
            else padre.setDer(aEliminar.getIzq());
        } else if (aEliminar.getIzq() == null && aEliminar.getDer() != null) {
            if (padre == null) this.raiz = aEliminar.getDer();
            else if (padre.getIzq() == aEliminar) padre.setIzq(aEliminar.getDer());
            else padre.setDer(aEliminar.getDer());
        } else {
            NodoT inmediatoSucesor = inmediatoSucesor(aEliminar);
            aEliminar.cambiarDato(inmediatoSucesor.getDato());
            eliminar(inmediatoSucesor.getDato());
        }
    }

    private void insertar(int valor) {
        NodoT aInsertar = new NodoT(valor);
        if(this.raiz == null){
            this.raiz = aInsertar;
            return;
        }
        NodoT padre = this.raiz;
        NodoT actual = this.raiz;
        while(actual != null) {
            if(actual.getDato() < valor) {
                padre = actual;
                actual = actual.getDer();
            }  else {
                padre = actual;
                actual = actual.getIzq();
            }
        }
        actual = aInsertar;
        if(actual.getDato() < padre.getDato()) padre.setIzq(actual);
        else padre.setDer(actual);
    }

    private NodoT inmediatoSucesor(NodoT nodo) {
        nodo = nodo.getDer();
        while(nodo.getIzq() != null) nodo = nodo.getIzq();
        return nodo;
    }

    private NodoT buscarPadre(int valor) {
        NodoT actual = this.raiz;
        NodoT padre = this.raiz;
        while (actual != null && actual.getDato() != valor){
            if(actual.getDato() < valor) {
                padre = actual;
                actual = actual.getDer();
            } else {
                padre = actual;
                actual = actual.getIzq();
            }
        }
        if(actual == this.raiz) padre = null;
        return padre;
    }

    private NodoT buscarNodo(int valor) {
        NodoT actual = this.raiz;
        while (actual != null && actual.getDato() != valor){
            if(actual.getDato() < valor) {
                actual = actual.getDer();
            } else {
                actual = actual.getIzq();
            }
        }
        return actual;
    }

    public int contarNodos() {
        return contarNodosAux(this.raiz);
    }

    private int contarNodosAux(NodoT nodo) {
        int res = 0;
        if(nodo != null) res = contarNodosAux(nodo.getIzq()) + 1 + contarNodosAux(nodo.getDer());
        return res;
    }

    //RID
    private void recorridoPreOrdenRec(NodoT nodo) {
        if(nodo != null) {
            System.out.println(nodo.getDato());
            recorridoPreOrdenRec(nodo.getIzq());
            recorridoPreOrdenRec(nodo.getDer());
        }
    }

    private class NodoT {
        private int dato;
        private NodoT izq;
        private NodoT der;

        public NodoT(int dato) {
            this.dato = dato;
            this.izq = null;
            this.der = null;
        }

        public NodoT getIzq() {
            return izq;
        }

        public NodoT getDer() {
            return der;
        }

        public int getDato() {
            return dato;
        }

        public void eliminarDato() {
            this.dato = 0;
        }

        public void cambiarDato(int dato) {
            this.dato = dato;
        }

        public void setIzq(NodoT izq) {
            this.izq = izq;
        }

        public void setDer(NodoT der) {
            this.der = der;
        }
    }
}