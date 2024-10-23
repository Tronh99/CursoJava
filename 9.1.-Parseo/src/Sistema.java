import java.util.Scanner;

public class Sistema {

		public Sistema() {
			
		}
	
		public void Tienda() {
			Scanner texto = new Scanner(System.in);
			System.out.println("Introdusca el ID del producto");
			int id 		= texto.nextInt();
			System.out.println("Escriba una breve descripcion: ");
			String desc = texto.next();
			System.out.println("Cantidad de arituculos: ");
			int art		= texto.nextInt();
			System.out.println("Precio por producto: ");
			float pres	= texto.nextFloat();
			
			float subtotal	= art * pres;
			double iva 		= (subtotal * 0.16);
			double total 	= subtotal + (subtotal * 0.16);
			
			System.out.println("El resumen del pedido es: ");
			System.out.println("Ariticulo: " + id);
			System.out.println("Descripcion: " + desc);
			System.out.println("IVA = " + iva);
			System.out.println("SUBTOTAL = " + subtotal);
			System.out.println("TOTAL = " + total );
			
			
			
		
		
		}
	
}
