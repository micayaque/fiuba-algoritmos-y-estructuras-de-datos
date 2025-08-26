import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private double importe;
    private boolean estaAbierto;
    int cantidadTotalDeProductos;
    List<String> items;

    /* post : el Ticket se inicializa con importe 0.
     */
    public Ticket() {
        importe = 0;
        estaAbierto = true;
        cantidadTotalDeProductos = 0;
        items = new ArrayList<>();
    }

    /* pre : cantidad y precio son mayores a cero . El ticket está abierto .
     * post : suma al Ticket un item a partir de la cantidad de
     * de productos y su precio unitario .
     */
    public void agregarItem(int cantidad ,double precioUnitario) {
        items.add(String.valueOf("Cantidad: " +cantidad + "Precio: " + precioUnitario));
        cantidadTotalDeProductos+=cantidad;
        importe += precioUnitario*cantidad;
    }

    /* pre : el Ticket está abierto y no se ha aplicado un descuento previamente .
     * post : aplica un descuento sobre el total del importe .
     */
    public void aplicarDescuento(double porcentaje) {
            importe -= importe * porcentaje;
    }

    /* post : devuelve el importe acumulado hasta el momento sin cerrar el Ticket .
     */
    double calcularSubtotal() {
        return importe;
    }

    /* post : cierra el Ticket y devuelve el importe total .
     */
    public double calcularTotal() {
        estaAbierto = false;
        return importe;
    }

    /* post : devuelve la cantidad total de productos .
     */
    int contarProductos () {
        return cantidadTotalDeProductos;
    }
}
