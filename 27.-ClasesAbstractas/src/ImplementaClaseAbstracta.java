import java.util.Scanner;
public class ImplementaClaseAbstracta extends ClasesAbstractas{
	
	Scanner texto = new Scanner(System.in);
	
	public ImplementaClaseAbstracta() {
		
	}
	
	public float datos() {
		System.out.println("Introduca dostos del usuario");
		System.out.println("Introdusca salario: ");
		String salariod = texto.next();
				float sd = Float.parseFloat(salariod);
				return sd;
		}
	
	public void calcular(double salario) {
		double Iva = (salario * 0.16);
		double subtotal = salario * 7;
		double total = subtotal + Iva;
		
		
		System.out.println("Iva: " + Iva);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Total: " + total);
	}
	
	

	//public void suma() {
	//	System.out.println("Entra al metodo que realiza la suma. ");
	//}
	
	//public void mensaje() {
	//	System.out.println("Sobre escritura de un metodo de una clase abstracta. ");
	//}

	
}