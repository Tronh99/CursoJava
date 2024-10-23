import java.util.Scanner;
public class SentenciaDW {
	
	Scanner texto = new Scanner(System.in);
	
	public SentenciaDW() {
		
	}
	
	public void metodo() {
		
		int valor;
		
		do {
			System.out.println("Ingrese un valor entre 0 y 999 (finalisas con 0): ");
			valor = texto.nextInt();
			if (valor >= 100) {
				System.out.println("Tienen tres digitos. ");
			}
			else if (valor >= 10) {
				System.out.println("Tiene dos digitos. ");
			}
				
			else {
				System.out.println("Tienen un digito. ");
			}
			
			
		}while (valor != 0);
		
		
		
	}
	

}
