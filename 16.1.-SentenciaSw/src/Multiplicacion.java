import java.util.Scanner;

public class Multiplicacion {
	
	Scanner texto = new Scanner(System.in);

	public Multiplicacion() {
		
	}
	
	
	public void Mul() {
		
		System.out.println("MULTIPLICACIÓN");
		
		int n;
		
		do {
				
			
				System.out.println("Ingrese la cantidad de numero a multiplicar: ");
				int cant =  texto.nextInt();
				int total = 1;	
				
				for(int i = 1; i <= cant; i++) {
					
					System.out.print("Ingrese numero: ");
					float num = texto.nextFloat();
					
					total *= num;
					
					System.out.println(total);
					
				}
			
			System.out.print("Presione (1) si desea continuar, de lo contrario precione (2): ");
			n = texto.nextInt();
			
			}while(n != 2);
		
		System.out.println("Operacion terminada.");
		
		
	}
	
	
	
	
	
}
