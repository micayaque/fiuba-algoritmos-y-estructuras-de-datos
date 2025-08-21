import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// ejercicio 9
//        System.out.printf("Hello world! :D");

// ejercicio 11
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ingrese un número");
//        double n = input.nextDouble();
//        System.out.println("Ingrese otro número");
//        double altura = input.nextDouble();
//
//        System.out.println("Suma: " + (n+altura));
//        System.out.println("Resta: " + (n-altura));
//        System.out.println("Multiplicación: " + n*altura);
//        System.out.println("Division: " + n/altura);

// ejercicio 12
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ingrese la longitud de la base de un rectángulo");
//        double base = input.nextDouble();
//        System.out.println("Ingrese la longitud de la altura de el rectángulo");
//        double altura = input.nextDouble();
//        System.out.println("Área: " + (base * altura));
//        System.out.println("Perímetro: " + (base + altura)*2);

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de un círculo");
        double radio = input.nextDouble();
        System.out.println("Área: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println("Perímetro: " +  (2 * Math.PI * radio));

    }
}