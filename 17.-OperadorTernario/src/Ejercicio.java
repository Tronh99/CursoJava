import java.util.Scanner;
public class Ejercicio {

	Scanner texto = new Scanner(System.in);
	
	public Ejercicio() {
		
	}
	
	
	public void Paletas() {
		
		System.out.println("PALETAS.");
		System.out.println("Introdusca cuantas paletas se vendieron en el dia: ");
		int p = texto.nextInt();
		
		double 	paletas = 	p >= 100 && p <= 162 ? 9.69 :
							p >= 163 && p <= 212 ? 9.59 :
							p >= 213		  	 ? 9.25 : 10;
							
							double subtotal = p * paletas;
							double Iva = (p * paletas) * (0.16);
							double total = subtotal + Iva;
		
		System.out.println("Cada paleta: " + paletas);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Iva: " + Iva);
		System.out.println("Total: " + total);
		
		
	}
	
	
	
	
}
