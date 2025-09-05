public class Agenda {

    private Integer posicionUltimoAgregado;

    private final GestorArchivos gestorArchivos;

    private Contacto[] contactos;

    private static final String RUTA = "contactos.txt";

    public Agenda(Integer capacidadMaxima) {
        this.contactos = new Contacto[capacidadMaxima];
        this.posicionUltimoAgregado = 0;
        this.gestorArchivos = new GestorArchivos(RUTA);
    }

    public void agregarContacto(Contacto contacto) {
        if(posicionUltimoAgregado == this.contactos.length){
            System.out.println("La agenda está llena");
            return;
        }

        for(int i = 0; i < this.contactos.length && this.contactos[i] != null; i++) {
            if(this.contactos[i].obtenerNumeroDeTelefono() == contacto.obtenerNumeroDeTelefono()) {
                System.out.println("El contacto ya está registrado");
                return;
            }
        }

        this.contactos[posicionUltimoAgregado] = contacto;
        posicionUltimoAgregado++;
    }

    public void eliminarContacto(String numeroDeTelefono) {
        int indiceEliminar = -1;
        for(int i = 0; i < this.contactos.length && this.contactos[i] != null; i++) {
            if(this.contactos[i].obtenerNumeroDeTelefono().equals(numeroDeTelefono)) {
                indiceEliminar = i;
            }
        }
        if(indiceEliminar == -1){
            System.out.println("El contacto no existe");
        } else {
            this.contactos[indiceEliminar] = null;
            for(int i = indiceEliminar ; i < this.contactos.length - 1 && this.contactos[i+1] != null;i++){
                this.contactos[i] = this.contactos[i+1];
            }
        }
    }

    public void mostrarContactos() {
        for(int i = 0; i < this.contactos.length; i++){
            if(this.contactos[i] != null){
                System.out.println("NÚMERO: " + this.contactos[i].obtenerNumeroDeTelefono() + " NOMBRE: " +
                        this.contactos[i].obtenerNombre() + " APELLIDO: " + this.contactos[i].obtenerApellido());
            }
        }
    }

    public void guardarContactosEnArchivo() {
        gestorArchivos.guardarContactos(contactos);
    }

}
