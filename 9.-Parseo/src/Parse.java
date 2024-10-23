import java.util.Scanner;

public class Parse {

	public Parse() {
		
	}
	
	public void suma() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		String numero1 = texto.next();
		System.out.print("Introdusca un numero: ");
		String numero2 = texto.next();
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		int resultado = num1 + num2;
		
		System.out.println("El resultado de la suma es = " + resultado);
	}
	
	public void resta() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		String numero3 = texto.next();
		System.out.print("Introdusca un numero: ");
		String numero4 = texto.next();
		
		int num3 = Integer.parseInt(numero3);
		int num4 = Integer.parseInt(numero4);
		int result = num3 - num4;
		
		System.out.println("El resultado de la resta es: " + result);
		
	}
	
	public void mult() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introduce un numero cualquiera: ");
		String numero5 = texto.next();
		System.out.print("Intoduce otro numero: ");
		String numero6 = texto.next();
		
		int num5 = Integer.parseInt(numero5);
		int num6 = Integer.parseInt(numero6);
		int resulta = num5 * num6;
		
		System.out.println("El resultado de la mlultiplicacion es: " + resulta);
		
	}
	
	public void div() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introduce un numero cualquiera: ");
		String numero7 = texto.next();
		System.out.print("Intoduce otro numero: ");
		String numero8 = texto.next();
		
		int num7 = Integer.parseInt(numero7);
		int num8 = Integer.parseInt(numero8);
		int resultad = num7 / num8;
		
		System.out.println("El resultado de la mlultiplicacion es: " + resultad);
		
	}
}
