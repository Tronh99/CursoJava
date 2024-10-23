
public class Principal {
	
	public Principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Ejercicio ej = new Ejercicio();
		int r1 = ej.metodo(0, 5);
		int r2 = ej.metodo(r1, 5, 5);
		int r3 = ej.metodo(r2, 10, 5, 2);
		ej.metodo(r3, "Angel", 22);
		
	}

}
