import java.util.Scanner;

public class Menu {

    public static final int MINIMA_OPCION = 0;
    public static final int MAXIMA_OPCION = 4;

    public static final int AGREGAR_CONTACTO = 1;
    public static final int ELIMINAR_CONTACTO = 2;
    private static final int MOSTRAR_CONTACTOS = 3;
    private static final int GUARDAR_CONTACTOS_EN_ARCHIVO = 4;
    public static final int SALIR = 0;

    private boolean salir = false;

    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("Ingrese una opción:");
        System.out.println("1 - Agregar un contacto");
        System.out.println("2 - Eliminar un contacto");
        System.out.println("3 - Mostrar contactos");
        System.out.println("4 - Guardar los contactos en un archivo");
        System.out.println("0 - Salir");
    }

    public int pedirOpcionValida() {
        int opcion;
        var esOpcionValida = false;
        do {
            opcion = pedirOpcion();
            esOpcionValida = esOpcionValida(opcion);
            if(!esOpcionValida){
                System.out.println("La opcion seleccionada no se encuentra entre las posibles \n");
            }
        } while (!esOpcionValida);
        return opcion;
    }

    /**
     * Pide al usuario la opcion que desea seleccionar
     * @return lo ingresado por el usuario
     */
    private int pedirOpcion() {
        int opcion;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido.");
            sc.next();
        }
        opcion = sc.nextInt();
        return opcion;
    }

    /**
     * Chequea si la opcion seleccionada esta entre las posibles
     * @param opcion opcion seleccionada por el usuario
     * @return true si es valida y false si no lo es
     */
    private static boolean esOpcionValida(int opcion) {
        return opcion >= MINIMA_OPCION && opcion <= MAXIMA_OPCION;
    }

    /**
     * procesa la opcion del menu seleccionada
     * @param opcion opcion a ser procesada
     * @param agenda agenda con la que se realizaran las cuentas
     */
    public void procesarOpcion(int opcion, Agenda agenda) {
        switch (opcion) {
            case AGREGAR_CONTACTO ->
                    agregarContacto(agenda);
            case ELIMINAR_CONTACTO ->
                eliminarContacto(agenda);
            case MOSTRAR_CONTACTOS ->
                agenda.mostrarContactos();
            case GUARDAR_CONTACTOS_EN_ARCHIVO ->
                agenda.guardarContactosEnArchivo();
            case SALIR ->
                salir();
            default ->
                System.out.println("Opción no válida.");
        }
    }

    private void eliminarContacto(Agenda agenda) {
        System.out.println("Ingrese el teléfono del contacto que quiere eliminar: ");
        String telefono = sc.next();
        agenda.eliminarContacto(telefono);
    }

    private void agregarContacto(Agenda agenda) {
        System.out.println("Ingrese el nombre del contacto:");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del contacto:");
        String apellido = sc.next();
        System.out.println("Ingrese el número de teléfono del contacto:");
        String numero = sc.next();
        Contacto nuevoContacto =  new Contacto(numero, nombre, apellido);
        agenda.agregarContacto(nuevoContacto);
    }

    /**
     * Se encarga del flujo de salir
     */
    private void salir() {
        salir = true;
        sc.close();
        System.out.println("¡Adiós!");
    }

    public boolean esOpcionSalir() {
        return salir;
    }
}