import java.util.Scanner;
public class Ejercicio {

	public Ejercicio(){
		
	}

	public void MayorMenor() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Introdusca un numero menor: ");
		String num1 = texto.next();
		System.out.println("Introdusca otro numero mayor: ");
		String num2 = texto.next();
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		while (n1 <= n2) {
			System.out.println(n1);
			n1++;
		}
		
	}
	public void cien() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Introdusca un numero: ");
		String num1 = texto.next();
		
		int n1 = Integer.parseInt(num1);
		int res = 0;
		
		while (res <= n1) {
			
			System.out.println(res);
			res++;
		}
		
	}

	public void veinte() {
		
		int n1  = 0;
		int res = 20;
		
		while (n1 <= res) {
			
			System.out.println(n1);
			n1++;
		}
		
	}







}


