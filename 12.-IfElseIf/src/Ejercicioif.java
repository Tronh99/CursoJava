import java.util.Scanner;

public class Ejercicioif {

	Ejercicioif(){
		
	}
	
	public void descuento() {
	Scanner texto = new Scanner(System.in);
	System.out.println("Introdusca la cantidad de libros comprados: ");
	String libros = texto.next();
	int books = Integer.parseInt(libros);
	
	if(books == 10 ) {
		System.out.print("Usted tiene un descuento del 0.05%. ");
	}
	else if(books >= 11 && books <= 20) {
		System.out.print("Cantidad de libros " + books + " descuento de 0.10%");
	}
	else if(books > 21 && books <= 50) {
		System.out.print("Cantidad de libros " + books + " descuento de 0.20%");
	}
	else if(books >= 51) {
		System.out.print("Cantidad de libros " + books + " descuento de 0.30%");
	}
	else if(books < 10) {
		System.out.print("No tiene descuento :( ");
	}
	}
}
