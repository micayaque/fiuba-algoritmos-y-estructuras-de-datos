import java.util.ArrayList;

public class Estacion {
    private String nombre;
    private int cantidadMolinetes;
    private ArrayList<Molinete> molinetes = new ArrayList<>();

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.cantidadMolinetes = 3;
        for (int i = 0; i < cantidadMolinetes; i++) {
            molinetes.add(new Molinete());
        }
    }

    public int obtenerTotalPersonasEntraron() {
        int resultado = 0;
        for (int i = 0; i < this.cantidadMolinetes; i++) {
            resultado += this.molinetes.get(i).obtenerContadorDeEntradas();
        }
        return resultado;
    }

    public int obtenerTotalPersonasSalieron() {
        int resultado = 0;
        for (int i = 0; i < this.cantidadMolinetes; i++) {
            resultado += this.molinetes.get(i).obtenerContadorDeSalidas();
        }
        return resultado;
    }

    public int obtenerPersonasEntraron(int molinete) {
        return this.molinetes.get(molinete).obtenerContadorDeEntradas();
    }

    public int obtenerPersonasSalieron(int molinete) {
        return this.molinetes.get(molinete).obtenerContadorDeSalidas();
    }

    public void entrar(int molinete) {
        this.molinetes.get(molinete-1).entrar();
    }

    public void salir(int molinete) {
        this.molinetes.get(molinete-1).salir();
    }
}
