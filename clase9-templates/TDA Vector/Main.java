import src.Vector_TDA;

public class Main {
    public static void main(String[] args) {
        Vector_TDA vector = new Vector_TDA(1);

        System.out.println("Agrego valores iniciales al vector");
        vector.agregar(1);
        vector.agregar(2);
        vector.agregar(3);
        vector.mostrar();

        System.out.println("\nRemuevo el valor en la posicion 1");
        vector.remover(1);
        vector.mostrar();

        System.out.println("\nInserto el valor 5 en la posicion 1");
        vector.insertar(1, 5);
        vector.mostrar();

        System.out.println("\nRemuevo el valor en la posicion 1");
        vector.remover(1);
        vector.mostrar();

        System.out.println("\nVacio el vector");
        vector.borrar();
        vector.mostrar();
    }
}
