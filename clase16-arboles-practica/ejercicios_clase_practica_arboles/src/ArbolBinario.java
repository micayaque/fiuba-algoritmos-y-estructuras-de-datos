public class ArbolBinario<T extends Comparable<T>> {

    private NodoBinario<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void recorridoPreOrder() {
        recorridoPreOrdenRec(this.raiz);
    }

    private void recorridoPreOrdenRec(NodoBinario nodo) {
        if(nodo != null) {
            System.out.println(nodo.getValor());
            recorridoPreOrdenRec(nodo.getIzquierdo());
            recorridoPreOrdenRec(nodo.getDerecho());
        }
    }

    public int contarNodos() {
        return contarNodosAux(this.raiz);
    }

    private int contarNodosAux(NodoBinario nodo) {
        int res = 0;
        if(nodo != null) res = contarNodosAux(nodo.getIzquierdo()) + 1 + contarNodosAux(nodo.getDerecho());
        return res;
    }

    public int contarHojas() {
        return contarHojasAux(this.raiz);
    }

    private int contarHojasAux(NodoBinario<T> nodo) {
        if (nodo == null) return 0;

        if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) return 1;

        return contarHojasAux(nodo.getIzquierdo()) + contarHojasAux(nodo.getDerecho());
    }

    public boolean buscar(T valor) {
        boolean res = false;
        NodoBinario<T> nodoActual = this.raiz;
        while (nodoActual != null && nodoActual.getValor().compareTo(valor) != 0 ) {
            if(nodoActual.getValor().compareTo(valor) < 0) nodoActual = nodoActual.getDerecho();
            else nodoActual = nodoActual.getIzquierdo();
        }
        return  nodoActual != null;
    }
}