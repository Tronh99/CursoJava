import java.util.Scanner;

public class Ejercicio {
	
	Scanner texto = new Scanner(System.in);
	
	public Ejercicio() {
		
	}
	
	public void veinte() {
		
		
		System.out.print("Introdusca un valor menor o igual a veinte: ");
		int valor = texto.nextInt();
		do {
			System.out.println(valor++);
			
		}while(valor <=20);	
		
	}
	
	public void cien() {
		
		int valor;
		System.out.print("Introduce un valor entre 1 y 100: ");
		valor = texto.nextInt();
		int i = 0;
		do {
			System.out.println(i++);
			
			
			
		}while(i <= valor);
	}
	
	public void MayorMenor() {
		int num;
		int nuM;
		
		System.out.println("Introduce un numero: ");
		num = texto.nextInt();
		System.out.println("Introduce un numero mayor");
		nuM = texto.nextInt();
		do {

			System.out.println(num++);
			
		}while(num <= nuM);
		
		
		
	}
	
	
	
	
	
	
	

}
