import java.util.Scanner;

public class Ejercicio {
	
	Scanner texto = new Scanner(System.in);
	
	
	public Ejercicio() {
		
	}
	
	public void Suma() {
		
		int i;
		float n1;
		float sumatotal;
		System.out.println("SUMA.");
		
		
		do {
			
			sumatotal = 0;						//Reinicia el ciclo 
			System.out.println("Escribe cuantos numeros desea hacer la suma: ");
			int cant = texto.nextInt();
			
			if (cant <= 0) {
				System.out.println("Debes ser un numero positivo.");
			}
			
			for(int n = 1; n <= cant; n++) {
				
				System.out.print("Ecribe un numero: ");
				n1 = texto.nextFloat();
				sumatotal += n1;				//Suma el mismo dato.
				System.out.println(sumatotal);
				}
			
			System.out.print("Presione (1) si desea continuar, de lo contrario precione (2): ");
			i = texto.nextInt();
			
		}while(i != 2 );
		 
		System.out.print("Operacion terminada. ");
		texto.close(); // Cerrar el scanner al final
	}

}