import java.util.Arrays;

public class Calculadora {

    /**
     * Suma los numeros recibidos
     * @param numeros numeros a sumar
     * @return el resultado de la suma de todos los numeros
     */
    public int sumar(int[] numeros) {
        var resultado = 0;
        for(int numero: numeros){
            resultado += numero;
        }
        return resultado;
    }

    /**
     * Resta los numeros recibidos
     * @param numeros numeros a restar
     * @return el resultado de la resta de todos los numeros
     */
    public int restar(int[] numeros) {
        var resultado = 0;
        for(int numero: numeros){
            resultado -= numero;
        }
        return resultado;
    }
}