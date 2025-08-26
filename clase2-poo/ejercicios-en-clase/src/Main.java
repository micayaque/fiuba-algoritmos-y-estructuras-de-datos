import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        Integer edad = sc.nextInt();

        Persona persona = new Persona(nombre, edad);
        persona.mostrarDatos();


        sc.close();
    }
}