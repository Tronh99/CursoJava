
public class SentenciaWhile {
	
	public SentenciaWhile() {
		
	}
	
	public void Iterar() {
		int numero1 = 0;
		int numero2 = 2;
		
		while (numero1 <= 10) {
			int resultado = numero1 + numero2;
			System.out.println("La suma de los numeros es : " + resultado);
			numero1 ++;
		}
	}
}
