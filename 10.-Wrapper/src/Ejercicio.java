import java.util.Scanner;

public class Ejercicio {
	
	public Ejercicio() {
		
	}

	
	//Metodo
	public void Suma() {
	//1 Pedir datos
		
		Scanner texto = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		String numero1 = texto.next();
		System.out.println("Introduce otro numero: ");
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
		
		System.out.println("El resultado de la suma de " + nume1 + " + " + nume2 + " = " + resul );
	}
}
