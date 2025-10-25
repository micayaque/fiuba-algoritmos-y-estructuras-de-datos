public class Moto extends Vehiculo {


    @Override
    double calcularCostoViaje(double distancia) {
        return 5 *  distancia;
    }
}
