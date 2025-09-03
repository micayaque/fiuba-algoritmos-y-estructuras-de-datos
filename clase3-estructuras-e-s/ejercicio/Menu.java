import java.util.Scanner;

public class Menu {
    public static final int MINIMA_OPCION = 1;
    public static final int MAXIMA_OPCION = 4;

    public static final int SUMAR = 1;
    public static final int RESTAR = 2;
    private static final int MOSTRAR_HISTORIAL = 3;
    public static final int SALIR = 4;

    private final Scanner scanner;
    private final Historial historial;

    private boolean salir = false;


    public Menu(Historial historial) {
        this.scanner = new Scanner(System.in);
        this.historial = historial;
        this.historial.cargarHistorial();
    }

    /**
     * Muestra las opciones disponibles en el menu
     */
    public void mostrarMenu() {
        System.out.println("Menú de Calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Mostrar historial");
        System.out.println("4. Salir");
    }

    /**
     * Pide al usuario la opcion que desea seleccionar asegurando que sea valida
     * @return una opcion del menu valida
     */
    public int pedirOpcionValida() {
        int opcion;
        var esOpcionValida = false;
        do {
            opcion = pedirOpcion();
            esOpcionValida = esOpcionValida(opcion);
            if(!esOpcionValida){
                System.out.println("La opcion seleccionada no se encuentra entre las posibles");
            }
        } while (!esOpcionValida);
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
     * Pide al usuario la opcion que desea seleccionar
     * @return lo ingresado por el usuario
     */
    private int pedirOpcion() {
        int opcion;
        System.out.print("Selecciona una opción: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next();
        }
        opcion = scanner.nextInt();
        return opcion;
    }

    /**
     * Pide al usuario un numero
     * @param mensaje el mensaje a mostrarle al usuario
     * @return el valor ingresado por el usuario
     */
    public int pedirNumero(String mensaje) {
        int numero;
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next();
        }
        numero = scanner.nextInt();
        return numero;
    }

    /**
     * procesa la opcion del menu seleccionada
     * @param opcion opcion a ser procesada
     * @param calculadora calculadora con la que se realizaran las cuentas
     */
    public void procesarOpcion(int opcion, Calculadora calculadora) {
        switch (opcion) {
            case SUMAR:
                sumar(calculadora);
                break;
            case RESTAR:
                restar(calculadora);
                break;
            case MOSTRAR_HISTORIAL:
                historial.mostrarHistorial();
                break;
            case SALIR:
                salir();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    /**
     * Se encarga del flujo de salir
     */
    private void salir() {
        salir = true;
        scanner.close();
        historial.guardarHistorial();
        System.out.println("¡Adiós!");
    }

    /**
     * Se encarga del flujo de restar
     */
    private void restar(Calculadora calculadora) {

        var primerNumero = pedirNumero("Ingresa el primer número: ");
        var segundoNumero = pedirNumero("Ingresa el segundo número: ");
        var resultado = calculadora.restar(new int[]{primerNumero, segundoNumero});
        historial.guardarResultado(resultado);
        System.out.printf("El resultado de la resta es: %s%n", resultado);
    }

    /**
     * Se encarga del flujo de sumar
     */
    private void sumar(Calculadora calculadora) {
        var primerNumero = pedirNumero("Ingresa el primer número: ");
        var segundoNumero = pedirNumero("Ingresa el segundo número: ");
        var resultado = calculadora.sumar(new int[]{primerNumero, segundoNumero});
        historial.guardarResultado(resultado);
        System.out.printf("El resultado de la suma es: %s%n", resultado);
    }

    public boolean esOpcionSalir() {
        return salir;
    }

}