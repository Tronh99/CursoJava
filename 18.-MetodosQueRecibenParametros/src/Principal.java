import java.util.Scanner;
public class Principal {
	
	
	static Scanner texto = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//MetodosQueRecibenParametros mqrp = new MetodosQueRecibenParametros();
		
		
		//System.out.print("Introdusca un numero: ");
		//int numero1 = texto.nextInt();
		//System.out.print("Introdusca un numero: ");
		//int numero2 = texto.nextInt();
		
		//mqrp.meto2(numero1, numero2);
		
		Menu men = new Menu();
		
		System.out.println("Calculadora");
		System.out.println("(1) SUMA.");
		System.out.println("(2) RESTA.");
		System.out.println("(0) SALIR.");
		int op = texto.nextInt();
		men.Men(op);
		
		
	}

}
