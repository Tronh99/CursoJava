import java.util.Scanner;

public class Ejercicio {
	
	//Atributos o Variables de Clase
	
	
	//Constructor
	public Ejercicio() {
	}
	

	//Metodo
	public void suma() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Escriba un numero: ");
		String numero1 = texto.next();
		System.out.println("Escriba otro numero: ");
		String numero2 = texto.next();
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		Integer n1 = num1;
		Integer n2 = new Integer(num2);
		
		Integer resultado = n1 + n2; 
		
		int nume1 = n1.intValue();
		int nume2 = n2.intValue();
		int res	  = resultado.intValue();
		
		String Numero1 = String.valueOf(nume1);
		String Numero2 = String.valueOf(nume2);
		String Resp	   = String.valueOf(res);
		
		System.out.println("El resultado de la suma de " + Numero1 + " + " + Numero2 + " = " + Resp);
		
		}
	
	public void resta() {
		Scanner texto	= new Scanner(System.in);
		System.out.println("Introdusca un numero cualquiera: ");
		String numero1 = texto.next();
		System.out.println("Introduca otro numero: ");
		String numero2 = texto.next();
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		
		Integer n1 = num1; 
		Integer n2 = num2;
		
		Integer resultado = n1 - n2;
		
		int numer1 = n1.intValue();
		int numer2 = n2.intValue();	
		int resul  = resultado.intValue();
		
		String nu1 = String.valueOf(numer1);
		String nu2 = String.valueOf(numer2);
		String res = String.valueOf(resul);
		
		
		System.out.print("El resultado de la resta entre " + nu1 + " - " + nu2 + " = " + res);
		}
}
