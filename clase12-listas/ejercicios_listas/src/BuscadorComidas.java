public class BuscadorComidas {


    public ListaConCursorT<Alimento> comidasParaCeliacos(ListaConCursorT<Alimento> comidas, ListaConCursorT<String> ingredientesPermitidos,
                                                ListaConCursorT<String> ingredientesNoPermitidos, int caloriaMaxima) {

        ListaConCursorT<Alimento> resultado = new ListaConCursorT<>();
        comidas.reiniciar();

        while(comidas.haySiguiente()) {
            Alimento comidaActual = comidas.siguiente();

            if(comidaActual.obtenerCalorias() < caloriaMaxima){

                boolean hayUnoPermitido = false;
                boolean noHayNingunoNoPermitido = true;

                ListaConCursorT<String> ingredientesComida = comidaActual.obtenerIngredientes();
                ingredientesComida.reiniciar();
                while(ingredientesComida.haySiguiente()) {
                    String ingrediente = ingredientesComida.siguiente();

                    ingredientesPermitidos.reiniciar();
                    while(ingredientesPermitidos.haySiguiente()) {
                        if(ingrediente.equals(ingredientesPermitidos.siguiente())) {
                            hayUnoPermitido = true;
                        }
                    }

                    ingredientesNoPermitidos.reiniciar();
                    while(ingredientesNoPermitidos.haySiguiente()) {
                        if(ingrediente.equals(ingredientesNoPermitidos.siguiente())) {
                            noHayNingunoNoPermitido = false;
                        }
                    }
                }
                if(hayUnoPermitido && noHayNingunoNoPermitido) resultado.alta(comidaActual);
            }
        }
        return resultado;
    }

}

