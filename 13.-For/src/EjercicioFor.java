import java.util.Scanner;

public class EjercicioFor {

	public EjercicioFor() {
		
	}
	
	public void Veinte() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero >= 0 u <=20: ");
		String num1 = texto.next();
		int n1 = Integer.parseInt(num1);
		
		for(int i = n1; i <=20; i++) {
			System.out.println("Numero: " + i);
		}
	}
	
	public void cien() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Introdusca un nunero: ");
		String num1 = texto.next();
		int n1 = Integer.parseInt(num1);
		
		for(int i =  0; i <= n1; i++) {
			System.out.println(i);
		}
	}
	
	public void MayorMenor() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		String num1 = texto.next();
		System.out.print("Introdusca otro numero");
		String num2	= texto.next();
		
		int n1	= Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		for(int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
	
	}
	
}
