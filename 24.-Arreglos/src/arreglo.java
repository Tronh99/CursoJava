import java.util.Scanner;
public class arreglo {
	static Scanner texto = new Scanner(System.in);
	
	public arreglo(){
		
	}
	
	
	
	public static void main(String [ ] args) {
		int [] a;
		a = new int [5];
	}
	
	public static void seconth(String [] args) {
		int [] a = new int [3];
	}
	
	public static void thirth(String [] args) {
		int [] a =  {5,3,2};
	}
	
	public static void fourth(String [] args) {
		int [] a = new int[3];	
	}
	
	public static void fiveth(String [] args) {
		int [] a = new int [9];	
	
		
	
		for (int i = 0; i < a.length; i++) {
			//System.out.println("Introduce un valor: ");
			String valor = texto.next();
			int v = Integer.parseInt(valor);
			a[i] = v;
			
		}
	}
	
	public static void sixth(String [] args) {
		int [] a = new int[3];
		a[0] = 5;
		a[1] = 6;
		a[2] = 7;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}

