public class Punto {

    private double x;
    private double y;

    /*
    * post: inicializa los valores x e y
    */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
    * post : devuelve el valor de x
    */
    public double obtenerX() {
        return x;
    }

    /*
     * post : devuelve el valor de y
     */
    public double obtenerY() {
        return y;
    }

    /*
    * post : modifica el valor de x
     */
    public void cambiarX(double valor) {
        this.x = valor;
    }

    /*
     * post : modifica el valor de y
     */
    public void cambiarY(double valor) {
        this.y = valor;
    }

    /*
     * post : devuelve verdadero si las coordenadas son las del origen del plano
     */
    public boolean esOrigen() {
        return x == 0 && y == 0;
    }

    /*
     * post : devuelve verdadero si el punto del plano que definen x e y se encuentra sobre el eje y
     */
    public boolean estaEnEjeY() {
        return x == 0;
    }

    /*
     * post : devuelve verdadero si el punto del plano que definen x e y se encuentra sobre el eje x
     */
    public boolean estaEnEjeX() {
        return y == 0;
    }

    /*
     * post : devuelve la distancia al origen del punto del plano que definen x e y
     */
    public double distanciaAlOrigen() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
