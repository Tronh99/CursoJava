import java.util.Scanner;
public class Division {
	
	Scanner texto =  new Scanner(System.in);
	
	public Division() {
		
	}
	

	public void Div() {
		
		int n;
		
		
		System.out.println("DIVISON.");
		
		
		do {
			
			System.out.println("Introdusca los numeros que desee dividir: ");
			int can = texto.nextInt();
			
			System.out.print("Introdusca un numero: ");
			double num = texto.nextDouble();
			
			double total = num;
			
			for(int i = 2; i <= can; i++) {
					
					System.out.print("Introdusca un numero: ");
					num = texto.nextDouble();
				
				total /= num;
				
				System.out.println(total);
				
				
			}
			
			System.out.println("Presione (1) si desea continuar, de lo contrario precione (2): ");
			n =  texto.nextInt();
			
			
		}while(n != 2);
		
		System.out.println("Operacion terminada. ");
	}
	
	

}