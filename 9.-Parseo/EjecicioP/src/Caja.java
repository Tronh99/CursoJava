import java.util.Scanner;

public class Caja {
	//Atrbutos o Variables de Clase
	String producto;
	
	
	//Constructor
	public Caja() {
		System.out.println("¡Registrar producto!");
	}

	//Metodo
	public void Producto() {
		Scanner texto = new Scanner(System.in);
		System.out.print("Inglres el nombre del producto: ");
		String producto = texto.next();
		System.out.println("Introduca la el monto del producto: ");
		String precio = texto.next();
		System.out.println("Ingrese el la cantidad de productos: ");
		String cantidad = texto.next();
		
		float pre 	= Float.parseFloat(precio);
		float cant 	= Float.parseFloat(cantidad);
		float subtotal = cant * pre; 
		double total = subtotal + (subtotal * 0.16);
		
		System.out.println("Suptotal = " + subtotal);
		System.out.println("Precio total (iva): " + total); 
		
		
	}
	
}
