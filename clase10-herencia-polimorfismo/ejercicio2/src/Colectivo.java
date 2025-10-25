public class Colectivo extends Vehiculo {


    @Override
    double calcularCostoViaje(double distancia) {
        return 3 *  distancia;
    }
}
