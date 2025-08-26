public class Nota {

    private int valor;

    Nota(int valor) {
        if (valor >= 0 && valor <= 10) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("La nota debe estar entre 1 y 10.");
        }
    }

    public int obtenerValor() {
        return valor;
    }

    public boolean aprobado() {
        return valor >= 4;
    }

    public boolean desaprobado() {
        return valor < 4;
    }

    public void recuperar(int nuevoValor) {
        if(valor < nuevoValor) {
            valor = nuevoValor;
        }
    }

}

