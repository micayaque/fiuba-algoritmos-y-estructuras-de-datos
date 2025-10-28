public class Auto extends Vehiculo{


    @Override
    double calcularCostoViaje(double distancia) {
        return 10 * distancia;
    }
}
