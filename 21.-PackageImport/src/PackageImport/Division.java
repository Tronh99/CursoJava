package PackageImport;
import java.util.Scanner;

public class Division {
	Scanner texto = new Scanner(System.in);
	
	public Division() {
		
	}
	
	
	public void Dividiendo() {
		System.out.println("Introduce el valor: ");
		int numero1 = texto.nextInt();
		System.out.println("Introduce el valor: ");
		int numero2 = texto.nextInt();
		
		float resultado = numero1 / numero2;
		System.out.println("La division es: " + resultado);
	}
}
