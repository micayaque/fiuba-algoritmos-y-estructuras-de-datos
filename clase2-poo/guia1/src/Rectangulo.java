public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double obtenerBase() {
        return base;
    }
    public double obtenerAltura() {
        return altura;
    }

    public void modificarBase(double nuevaBase) {
        base = nuevaBase;
    }

    public void modificarAltura(double nuevaAltura) {
        altura = nuevaAltura;
    }

    public double obtenerPerimetro() {
        return (base + altura) * 2;
    }

    public double obtenerArea() {
        return base * altura;
    }
}
