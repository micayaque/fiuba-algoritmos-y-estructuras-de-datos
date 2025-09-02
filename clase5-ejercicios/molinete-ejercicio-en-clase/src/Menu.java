import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    Estacion estacion = new Estacion("Retiro");

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("1. Entrar a la facultad");
            System.out.println("2. Salir de la facultad");
//            System.out.println("3. Ver la cantidad de personas que entraron");
//            System.out.println("4. Ver la cantidad de personas que salieron");
            System.out.println("0. Salir \n");

            try{
                opcion = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Ingresá una opción válida");
                opcion = 0;
            }

            int molinete;
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el molinete por el que quiere entrar:");
                    molinete = scanner.nextInt();
                    estacion.entrar(molinete);
                }
                case 2 -> {
                    System.out.println("Ingrese el molinete por el que quiere salir:");
                    molinete = scanner.nextInt();
                    estacion.salir(molinete);
                }
                case 3 -> System.out.println("Cantidad de personas que entraron a la estación: " + estacion.obtenerTotalPersonasEntraron());
                case 4 -> System.out.println("Cantidad de personas que salieron de la estación: " + estacion.obtenerTotalPersonasSalieron());
                case 0 -> System.exit(0);
                default -> System.out.println("Ingresá una opción válida");
            }

        } while (opcion != 0);

        scanner.close();
    }

}
