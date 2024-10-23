import java.util.Scanner;

public class Ejercicico {
	
	public Ejercicico() {
		
	}

	
	//Metodo
	public void Suma() {
	//1 Pedir datos
		
		Scanner texto = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		String numero1 = texto.next();
		System.out.print("Introduce otro numero: ");
		String numero2 = texto.next();
		
		//2 Parsear
		
		int num1	= Integer.parseInt(numero1);
		int num2	= Integer.parseInt(numero2);
		
		//3 Wrappear
		
		Integer n1	= num1;
		Integer n2	= new Integer(num2);
		
		//4 operaciones
		
		Integer resultado = n1 + n2;
		
		
		//5 grapear
		
		int nume1 = n1.intValue();
		int nume2 = n2.intValue();
		int resul = resultado.intValue();
		
		//6 imprimir
		
		System.out.println("El resultado de la resta de " + nume1 + " + " + nume2 + " = " + resul );
	}
	
	public void Resta() {
		
				Scanner texto = new Scanner(System.in);
				System.out.print("Introduce un numero: ");
				String numero1 = texto.next();
				System.out.print("Introduce otro numero: ");
				String numero2 = texto.next();
				
				
				int num1	= Integer.parseInt(numero1);
				int num2	= Integer.parseInt(numero2);
	
			
				Integer n1	= num1;
				Integer n2	= num2;
				
				
				Integer resultado = n1 - n2;
				
				
				int nume1 = n1.intValue();
				int nume2 = n2.intValue();
				int resul = resultado.intValue();
				
				
				System.out.println("El resultado de la suma de " + nume1 + " - " + nume2 + " = " + resul );
	}
	
	public void Multiplicacion() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		String numero1 = texto.next();
		System.out.print("Introdusca otro numero: ");
		String numero2 = texto.next();
		
		Float num1 = Float.parseFloat(numero1);
		Float num2 = Float.parseFloat(numero2);
		
		Float n1 = num1;
		Float n2 = num2;
		
		Float resultado = ( n1 * n2) ;
		
		float nume1		= n1.floatValue();
		float nume2		= n2.floatValue();
		
		System.out.println("El resultado de la multiplicacion de " + nume1 + " * " + nume2 + " = " + resultado );
		
	}
	
	public void Division() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		String numero1 = texto.next();
		System.out.print("Introduce otro numero: ");
		String numero2 = texto.next();
		
		
		Double num1 = Double.parseDouble(numero1);
		Double num2 = Double.parseDouble(numero2);
		
		Double n1 = num1;
		Double n2 = num2;
		
		Double resultado = n1/ n2;
		
		double nume1 = n1.doubleValue();
		double nume2 = n2.doubleValue();
		
		System.out.println("El resultado de la division de " + nume1 + " /  " + nume2 + " = " + resultado );
		
				
	}
}