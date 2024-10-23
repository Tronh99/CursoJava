
public class OTernario {
	
	public OTernario() {
		
	}
	
	public void ejercicioOperadorTernario() {
		
		int comprar = 5;
		int numero 	= comprar >= 0 && comprar <= 10 ? 10 : // ? Entonces
					  comprar > 10 && comprar <= 20 ? 15 :	// : De lo contrario
					  comprar > 20 && comprar <= 30 ? 25 :
					  comprar > 30 && comprar <= 40 ? 30 : 5;
					  
		for (int i = 0; i <= numero; i++) {
			System.out.println("La Variable numero vale: " + numero);
		}
		
	}
	

}
