import java.util.Scanner;
public class Menu {
	
	Scanner texto = new Scanner(System.in);
	
	public Menu() {
		
	};
	
	
	public void Men() {
		
		
		System.out.println("Multiplicacion (1)");
		System.out.println("Division (2)");
		
		int op = texto.nextInt();
		
		switch (op) {
		
		case 1: 
			Multiplicacion mul = new Multiplicacion();
			
			System.out.println("Introdusca un numero: ");
			int numero1 = texto.nextInt();
			System.out.println("Introdusca un numero: ");
			int numero2 = texto.nextInt();

			int resultado = mul.Mul(numero1, numero2);
			break;
		
		case 2:
			Division div = new Division();
			
			System.out.println("Introdusca un numero: ");
			int n1 = texto.nextInt();
			System.out.println("Introdusca un numero: ");
			int n2 = texto.nextInt();
			
			float resul = div.Div(n1, n2);
			break;
		
		}
		
		
		
	}
	
	

}
