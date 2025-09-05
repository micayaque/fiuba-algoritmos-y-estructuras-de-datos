public class Matriz {
    private int cantidadFilas;
    private int cantidadColumnas;
    private int[][] elementos;

    public Matriz(int cantidadFilas, int cantidadColumnas) {
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.elementos = new int[cantidadFilas][cantidadColumnas];
    }

    public Matriz(int n) {
        this.cantidadFilas = n;
        this.cantidadColumnas = n;
        this.elementos = new int[cantidadFilas][cantidadColumnas];
    }

    public void modificarElemento(int fila, int columna, int valor) {
        if (fila < 0 || fila >= this.cantidadFilas || columna < 0 || columna >= cantidadColumnas) {
            throw new IndexOutOfBoundsException("Índices fuera de rango");
        }
        this.elementos[fila][columna] = valor;
    }

    public int obtenerElemento(int fila, int columna) {
        if (fila < 0 || fila >= this.cantidadFilas || columna < 0 || columna >= cantidadColumnas) {
            throw new IndexOutOfBoundsException("Índices fuera de rango");
        }
        return this.elementos[fila][columna];
    }

    public void mostrarMatriz() {
        for (int i = 0; i < this.cantidadFilas; i++) {
            for (int j = 0; j < this.cantidadColumnas; j++) {
                System.out.print(this.elementos[i][j] + " ");
            }
            System.out.println();
        }
    }

}
