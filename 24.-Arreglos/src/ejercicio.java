import java.util.Scanner;
public class ejercicio {
	
	Scanner texto = new Scanner(System.in);
	
	public ejercicio() {
		
	}
	
	void SumaArreglos() {
		System.out.println("Introduce el tamaño del arreglo: ");
		String tamaño = texto.next();
		int t = Integer.parseInt(tamaño);
		
		int [] a = new int [t];
		int [] b = new int [t];
		int [] c = new int [t];
		
		for(int i = 0; i < a.length; i++ ) {
			System.out.println("Introduce el valor del arreglo 'a' en la posicion " + i + " : ");
			int v = texto.nextInt();
			a[i] = v;
			
			
			
		}

		for(int j= 0; j < b.length; j++ ) {
			System.out.println("Introduce el valor del arreglo 'b' en la posicion " + j + " : ");
			int v = texto.nextInt();
			b[j] = v;
		}
		
		for(int k = 0; k < c.length; k++) {
			
			c[k] = a [k] + b [k];
			
		}
		
		for(int k = 0; k < c.length; k++) {
			System.out.println("Resultado en la posicion : "+ k + " con el numero1 igual a " + a[k] + " y numero2 igual a " + b[k] + " es igual a "+  c[k]);
		}
		
		
	}


}
