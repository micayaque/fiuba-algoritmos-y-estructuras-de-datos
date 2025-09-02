public class Molinete {
    //private static String lugar = "FIUBA";
    private int contadorEntrada;
    private int contadorSalida;

    public Molinete() {
        this.contadorEntrada = 0;
        this.contadorSalida = 0;
    }
    public void entrar() {
        this.contadorEntrada++;
        // System.out.println("Bienvenido a " + lugar + "\n");
    }

    public void salir() {
        this.contadorSalida++;
        // System.out.println("Saliendo de " + lugar + "\n");
    }

    public int obtenerContadorDeEntradas() {
        //System.out.println("Contador de entradas: " + this.contadorEntrada + "\n");
        return  this.contadorEntrada;
    }

    public int obtenerContadorDeSalidas() {
        //System.out.println("Contador de salidas: " + this.contadorSalida + "\n");
        return this.contadorSalida;
    }
}