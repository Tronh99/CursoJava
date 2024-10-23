import java.util.Scanner;
public class Excepciones {
	
	public Excepciones() {
		
	}
	
	public void main() {
		boolean verdadero = false;
		
		do {
			try {
				
				Scanner texto = new Scanner(System.in);
				System.out.println("Introducir un numero: ");
				String numero1 = texto.next();
				
				System.out.println("Introducir un numero: ");
				String numero2 = texto.next();
				
				float n1 = Float.parseFloat(numero1);
				float n2 = Float.parseFloat(numero2);
				
				float resultado = n1 + n2;
				
				System.out.println("Numero 1 vale " + n1);
				System.out.println("Numero 2 vale " + n2);
				System.out.println("Resultado de la suma: " + resultado);
				verdadero = false;
				
			}catch(Exception e){
				e.printStackTrace();
				verdadero = true;
			}
			
			
			
		}while(verdadero == true);
		
	}

}
