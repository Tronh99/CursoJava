
public class SentenciaIf {

	public SentenciaIf() {
		
	}
	
	public void Evaluador() {
		
		int numero1 = 5;
		int numero2 = 5;
		
		if(numero1 > numero2) {
			System.out.print(numero1 + " es mayor que " + numero2 );
			
		}
		else if (numero1 < numero2) {
			System.out.println(numero2 + " es mayor que " + numero1);
		}
		else {
			System.out.print( numero1 + " es igual " + numero2);
		}
	}
	
}
