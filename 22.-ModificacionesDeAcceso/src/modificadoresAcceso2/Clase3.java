package modificadoresAcceso2;

import modificadoresAcceso.Clase1;
import modificadoresAcceso.Clase2;

public class Clase3 {

	public Clase3() {
		
	}
	
	public void metodo1() {
		Clase1 c1 = new Clase1();
		c1.metodo1();
		
		Clase2 c2 = new Clase2();
		c2.metodo1();
	}
	
	
	
}
