package principalModificiadoresAcceso;

import modificadoresAcceso.Clase1;
import modificadoresAcceso.Clase2;
import modificadoresAcceso2.Clase3;

public class Principal {
	
	public Principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase1 c1 = new Clase1();
		c1.metodo1();
		
		Clase2 c2 = new Clase2();
		c2.metodo1();
		
		Clase3 c3 = new Clase3();
		c3.metodo1();
		
	}

}
