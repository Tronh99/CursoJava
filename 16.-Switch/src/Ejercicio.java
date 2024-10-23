import java.util.Scanner;
public class Ejercicio {
	Scanner texto = new Scanner(System.in);
	
	public Ejercicio() {
		
	}
	
	
	public void calculadora() {
		System.out.println("Introduce la opcion que dece.");
		System.out.println("Suma (1).");
		System.out.println("Resta (2).");
		System.out.println("Multiplicacion (3).");
		System.out.println("Division (4).");
		int opcion = texto.nextInt();
		
		switch(opcion) {
		
		case 1:{
			System.out.println("SUMA");
			System.out.println("¿Cuantos numeros desea sumar?");
			int cant = texto.nextInt();
			int ope;
			
			do {
				
				System.out.println("Escriba un numero: ");
				float n1 = texto.nextFloat();
				float restultado = n1 + n1;
				
				System.out.println("¿Desea continuar con mas operaciones? 1 (Si) 2 (No) ");
				ope =  texto.nextInt();
				
			}while(ope != 2);
				
				
			
			
			//Pedir cantidad de numeros a sumar
			
			
			
			// 
			
			
		}
		
		case 2:{
			
		}
		
		case 3:{
			
		}
		
		case 4:{
			
		}
		
		
		
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
