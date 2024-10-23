import java.util.Scanner;

public class EntradaTeclado {
	//Atributos o Variables de Clase
	
	//Constructor
	public EntradaTeclado(){
		
	}
	
	//Metodo
	public void entrada() {
		Scanner texto	= new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		String nombre = texto.next();
	
		System.out.println("Tu nombre es : " + nombre);
	}
}
