public class Contacto {

    // debe tener 10 dígitos y empezar con "11"
    private String numeroDeTelefono;

    private String nombre;

    private String apellido;

    public Contacto(String numeroDeTelefono, String nombre, String apellido) {
        if(numeroDeTelefono.length() == 10 && numeroDeTelefono.startsWith("11") && todosLosCaracteresSonNumeros(numeroDeTelefono)){
            this.numeroDeTelefono = numeroDeTelefono;
        } else {
            System.out.println("Numero de telefono invalido");
            return;
        }
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private boolean todosLosCaracteresSonNumeros(String numeroDeTelefono) {
        for(int i = 0; i < numeroDeTelefono.length(); i++){
            if(!Character.isDigit(numeroDeTelefono.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public String obtenerNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }
}
