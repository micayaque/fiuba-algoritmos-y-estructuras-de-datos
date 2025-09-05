import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Bienvenido a su Agenda");
        System.out.println("Ingrese la capacidad máxima de contactos que tendrá su Agenda");
        int capacidadAgenda = sc.nextInt();
        Agenda agenda = new Agenda(capacidadAgenda);

        do {
            menu.mostrarMenu();
            opcion = menu.pedirOpcionValida();
            menu.procesarOpcion(opcion, agenda);
        } while (!menu.esOpcionSalir());

    }
}