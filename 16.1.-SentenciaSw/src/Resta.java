import java.util.Scanner;

public class Resta {
	Scanner texto = new Scanner(System.in);
	
	
	
	public Resta() {
		
	}
	
	
	public void Res() {
		
		System.out.println("RESTA.");
		
		int cant;
		int n;
		
		
		do {
			
			System.out.print("Escriba cuantos numeros desea restar: ");
			cant = texto.nextInt();
			
			float sumatotal = 0;
			
			for(int  i = 1; i <=cant; i++) {
				
				float num;
				System.out.println("Ingrese un numero: ");
				num = texto.nextFloat();
				
				sumatotal -= num;
				
				System.out.println("Resultado: " + sumatotal);
			
			}
			System.out.println("Presione (1) si desea continuar, de lo contrario precione (2): ");
			n = texto.nextInt();
			
		}while(n != 2);
		
		System.out.print("Operacion terminada.");
		
	}
	

}
