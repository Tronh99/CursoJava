package PackageImport;
import java.util.Scanner;

public class Multiplicacion {
	Scanner texto = new Scanner(System.in);
	
	
	
	public Multiplicacion() {
		
	}
	
	
	public void multiplicando() {
		System.out.println("Introduce el valor: ");
		int numero1 = texto.nextInt();
		System.out.println("Introduce el valor: ");
		int numero2 = texto.nextInt();
		
		int resultado = numero1 * numero2;
		System.out.println("La multiplicacion es: " + resultado);
	
	}
	
	

}