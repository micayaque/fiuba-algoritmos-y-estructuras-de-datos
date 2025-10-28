import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Figura rectangulo1 = new Rectangulo(23.3, 23);
        Figura rectangulo2 = new Rectangulo(21.3, 2);
        Figura circulo1 = new Circulo(5);
        Figura circulo2 = new Circulo(15);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(circulo1);
        figuras.add(circulo2);

        System.out.println(areaTotal(figuras));

    }

    static double areaTotal(ArrayList<Figura> figuras) {
        double resultado = 0;
        for( Figura figura : figuras){
            resultado += figura.calcularArea();
        }
        return resultado;
    }

}