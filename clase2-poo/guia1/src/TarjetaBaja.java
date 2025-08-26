public class TarjetaBaja {

    private double saldo;
    private int viajesRealizadosSubte;
    private int viajesRealizadosColectivo;

    public TarjetaBaja (double saldoInicial){
        saldo = saldoInicial;
        viajesRealizadosSubte = 0;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void cargar (double monto) {
        saldo += monto;
    }

    /* Las secciones son 1, 2 o 3, y los valores correspondientes son
     * $408.24, $454.78 y $489.82
     */
    public void pagarViajeEnColectivo (int seccion) {
        switch (seccion) {
            case 1:
                saldo -= 408.24;
                break;
            case 2:
                saldo -= 454.78;
                break;

            case 3:
                saldo -= 489.82;
                break;
            default:
                System.out.println("La sección tiene que ser un número entre 1 y 3");
        }
    }

    /* El subte cuesta $832.
     */
    public void pagarViajeEnSubte() {
        saldo -= 832;
    }

    public int viajesRealizadosSubte() {
        return viajesRealizadosSubte;
    }

    public int viajesRealizadosColectivo() {
        return viajesRealizadosColectivo;
    }
}
