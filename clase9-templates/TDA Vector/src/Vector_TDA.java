package src;

import exceptions.Vector_TDA_Exception;

public class Vector_TDA<T> {
    private T[] elementos;
    private int tamanio;
    private int capacidad;
    private int capacidadInicial = 10;

    /**
     * Redimensiona la capacidad del vector.
     * 
     * @param nuevaCapacidad Nueva capacidad del vector.
     * @throws Vector_TDA_Exception Si la nueva capacidad es menor o igual a 0.
     */
    private void redimensionar(int nuevaCapacidad) {
        if (nuevaCapacidad <= 0) {
            throw new Vector_TDA_Exception("La capacidad debe ser mayor a 0");
        }

        System.out.println("Redimensionando a " + nuevaCapacidad);


        T[] nuevoArray = (T[]) new Object[nuevaCapacidad];
        System.arraycopy(elementos, 0, nuevoArray, 0, Math.min(capacidad, nuevaCapacidad));

        elementos = nuevoArray;
        capacidad = nuevaCapacidad;
    }

    /**
     * Constructor por defecto. Inicializa el vector con una capacidad
     * predeterminada.
     */
    public Vector_TDA() {
        this.capacidad = capacidadInicial;
        this.tamanio = 0;
        this.elementos = (T[]) new Object[capacidad];
    }

    /**
     * Constructor que inicializa el vector con una capacidad específica.
     * 
     * @param capacidad Capacidad inicial del vector.
     */
    public Vector_TDA(int capacidad) {
        this.capacidad = capacidad;
        this.capacidadInicial = capacidad;
        this.tamanio = 0;
        this.elementos = (T[]) new Object[capacidad];
    }

    /**
     * Agrega un elemento al final del vector.
     * 
     * @param valor Valor a agregar.
     */
    public void agregar(T valor) {
        if (tamanio < capacidad) {
            elementos[tamanio] = valor;
            tamanio++;
        } else {
            redimensionar(capacidad * 2);
            agregar(valor);
        }
    }

    /**
     * Remueve un elemento del vector en el índice especificado.
     * 
     * @param index Índice del elemento a eliminar.
     * @throws Vector_TDA_Exception Si el índice está fuera de rango.
     */
    public void remover(int index) {
        if (index >= 0 && index < tamanio) {
            for (int i = index; i < tamanio - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanio--;

            if (tamanio < capacidad / 2) {
                redimensionar(capacidad / 2);
            }
        } else {
            throw new Vector_TDA_Exception("Indice fuera de rango");
        }
    }

    /**
     * Obtiene un elemento del vector en el índice especificado.
     * 
     * @param index Índice del elemento a obtener.
     * @return El valor almacenado en el índice dado.
     * @throws Vector_TDA_Exception Si el índice está fuera de rango.
     */
    public T obtener(int index) {
        if (index >= 0 && index < tamanio) {
            return elementos[index];
        }
        throw new Vector_TDA_Exception("Indice fuera de rango");
    }

    /**
     * Inserta un valor en una posición específica del vector.
     * 
     * @param index Índice donde insertar el valor.
     * @param valor Valor a insertar.
     * @throws Vector_TDA_Exception Si el índice está fuera de rango.
     */
    public void insertar(int index, T valor) {
        if (index >= 0 && index < tamanio) {
            elementos[index] = valor;
        } else {
            throw new Vector_TDA_Exception("Indice fuera de rango");
        }
    }

    /**
     * Verifica si el vector está vacío.
     * 
     * @return true si el vector está vacío, false en caso contrario.
     */
    public boolean estaVacio() {
        return tamanio == 0;
    }

    /**
     * Elimina todos los elementos del vector y lo restablece a su capacidad
     * inicial.
     */
    public void borrar() {
        tamanio = 0;
        capacidad = capacidadInicial;
        elementos = (T[]) new Object[capacidad];
    }

    /**
     * Muestra los elementos del vector en formato de lista.
     */
    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[i]);
            if (i < tamanio - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}