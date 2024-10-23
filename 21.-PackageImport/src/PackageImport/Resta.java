package PackageImport;
import java.util.Scanner;

public class Resta {
	
	Scanner texto = new Scanner(System.in);
	
	public Resta() {
		
	}
	
	public void restando() {
		System.out.println("Introduce el valor: ");
		int numero1 = texto.nextInt();
		System.out.println("Introduce el valor: ");
		int numero2 = texto.nextInt();
		
		int resultado = numero1 - numero2;
		System.out.println("La resta es: " + resultado);
	}

}
