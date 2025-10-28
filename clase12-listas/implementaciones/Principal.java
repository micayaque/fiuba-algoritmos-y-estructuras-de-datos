package estructuras;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Clase 1 de listas: Pila de enteros
		Pila p = new Pila();
		Pila ps = new Pila();
		p.alta(5);
		p.alta(8);
		p.alta(3);
		System.out.println("Consulto: " + p.consulta());
		System.out.println("Baja: " + p.baja());
		p.alta(6);
		while (! p.vacia()) {
			ps.alta(p.consulta());
			System.out.println(p.baja());
		}
		
		System.out.println("\nLa otra pila: -------");
		while (! ps.vacia()) {
			System.out.println(ps.baja());
		}
		*/
		
		/* 
		 * Clase 1 de listas: Pila genérica
		System.out.println("Pila de enteros ---------------");
		PilaEstatica<Integer> pe = new PilaEstatica<>();
		pe.alta(5);
		pe.alta(8);
		pe.alta(3);
		while (! pe.vacia()) {
			System.out.println(pe.baja());
		}

		System.out.println("\nPila de strings ---------------");		
		PilaEstatica<String> ps = new PilaEstatica<>();
		ps.alta("hola");
		ps.alta("que");
		ps.alta("tal");
		while (! ps.vacia()) {
			System.out.println(ps.baja());
		}
		*/
		
		/*
		 * Clase 2 de listas: Cola de enteros
		 
		Cola c = new Cola();
		c.alta(5);
		c.alta(8);
		c.alta(3);
		System.out.println("Consulta: " + c.consulta());
		System.out.println("Baja: " + c.baja());
		c.alta(7);
		while (! c.vacia())
			System.out.println("Baja: " + c.baja());
		
		System.out.println("La cola quedo vacia");
		c.alta(9);
		System.out.println("Consulta del ultimo elemento ingresado: " + c.consulta());
		*/
		
		/*
		Lista l = new Lista();
		l.alta(5, 1);
		l.alta(8, 1);
		l.alta(3, 2);
		l.alta(7, 4);
		
		for (int i = 1; i <= l.cantidadElementos(); i++) {
			System.out.println("Dato en pos " + i + ": " + l.consulta(i));
		}
		
		l.baja(3);
		System.out.println("\nLuego de la baja: --------");
		for (int i = 1; i <= l.cantidadElementos(); i++) {
			System.out.println("Dato en pos " + i + ": " + l.consulta(i));
		}
		*/

		ListaT<Integer> l = new ListaT<>();
		l.alta(5, 1);
		l.alta(8, 1);
		l.alta(3, 2);
		l.alta(7, 4);
		
		for (int i = 1; i <= l.cantidadElementos(); i++) {
			System.out.println("Dato en pos " + i + ": " + l.consulta(i));
		}
		
		l.baja(3);
		System.out.println("\nLuego de la baja: --------");
		for (int i = 1; i <= l.cantidadElementos(); i++) {
			System.out.println("Dato en pos " + i + ": " + l.consulta(i));
		}
	
		ListaT<String> ls = new ListaT<>();
		ls.alta("hola", 1);
		ls.alta("que", 2);
		ls.alta("tal", 2);
		ls.alta("chau");
		ls.alta("cualquier cosa");
		System.out.println("\nLista de Strings: --------");
		for (int i = 1; i <= ls.cantidadElementos(); i++) {
			System.out.println("Dato en pos " + i + ": " + ls.consulta(i));
		}
	
	}

}
