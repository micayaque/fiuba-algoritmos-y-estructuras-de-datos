public class Terminal {

    Auto auto = new Auto();
    Moto moto = new Moto();
    Colectivo colectivo = new Colectivo();

    public void mostrarCostoViaje() {
        System.out.println("Costo del viaje del Auto: " + auto.calcularCostoViaje(50));
        System.out.println("Costo del viaje de la Moto: " + moto.calcularCostoViaje(50));
        System.out.println("Costo del viaje del colectivo: " + colectivo.calcularCostoViaje(50));
    }
}
