class Nota {

    private float valor;

    public Nota(float valor) {
        if (valor < 1 || valor > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 1 y 10.");
        }
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}