package PackageImport;
import java.util.Scanner;

public class Suma {
	
	Scanner texto = new Scanner(System.in);
	
	
	public Suma() {
		
	}
	
	public void sumando(){
		System.out.println("Introduce el valor: ");
		int numero1 = texto.nextInt();
		System.out.println("Introduce el valor: ");
		int numero2 = texto.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("La suma es: " + resultado);
	}
	
	
	
}
