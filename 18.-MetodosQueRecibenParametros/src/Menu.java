import java.util.Scanner;

public class Menu {
	
	static Scanner texto = new Scanner(System.in);
	
	public Menu() {
		
	}
	
	public void Men(int op) {
		
		
		
		
		switch (op){
		
		case 1:
			Ejercicio ej = new Ejercicio();
			System.out.print("Introdusca un numero: ");
			int n1 = texto.nextInt();
			System.out.print("Introdusca un numero: ");
			int n2 = texto.nextInt();
			ej.Suma(n1, n2);
			 break;
			 
		case 2:
			Resta res = new Resta();
			System.out.print("Introdusca un numero: ");
			int num1 = texto.nextInt();
			System.out.print("Introdusca un numero: ");
			int num2 = texto.nextInt();
			res.Res(num1, num2);
			break;
			
			default:
				break;
			
		}
	}
	
	
	
	
	
	

}
