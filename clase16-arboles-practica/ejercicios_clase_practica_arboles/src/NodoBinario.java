public class NodoBinario<T> {

    private  T valor;
    private NodoBinario<T> izquierdo;
    private NodoBinario<T> derecho;

    public NodoBinario(T valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    public NodoBinario getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBinario<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoBinario<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBinario<T> derecho) {
        this.derecho = derecho;
    }

    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
}
