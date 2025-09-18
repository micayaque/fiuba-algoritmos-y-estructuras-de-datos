import java.util.HashMap;

public class Registro<K,V> {

    HashMap<K, V> elementos;

    public Registro() {
        this.elementos = new HashMap<>();
    }

    public void agregar(K key, V value) {
        this.elementos.put(key, value);
    }

    public V obtener(K key) {
        return elementos.get(key);
    }

    public boolean existe(K key) {
        return elementos.containsKey(key);
    }

    public void listarValores() {
        for (K key : elementos.keySet()) {
            System.out.println(" - " + elementos.get(key));
        }
    }

    public void listarClaves(V value) {
        for (K key : elementos.keySet()) {
            if(elementos.get(key) == value) System.out.println(key + " - " + elementos.get(key));
        }
    }

}