public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int opcion;
        Historial gestorHistorial = new Historial();
        Menu menu = new Menu (gestorHistorial);

        do {
            menu.mostrarMenu();
            opcion = menu.pedirOpcionValida();
            menu.procesarOpcion(opcion, calculadora);
        } while (!menu.esOpcionSalir());

        gestorHistorial.guardarHistorial();
    }
}