package modificadoresAcceso;

public class Clase1 {

	public Clase1() {
		
	}
	
	public void metodo1() {
		System.out.println("Todos me ven.");
	}
	
	private void metodo2() {
		System.out.println("Solo la clase me ve.");
	}
	
	void metodo3() {
		System.out.println("Clases del mismo paquete me ven.");
	}
}
