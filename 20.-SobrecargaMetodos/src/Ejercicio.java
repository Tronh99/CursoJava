
public class Ejercicio {
	
	public Ejercicio() {
		
	}
	
	public int  metodo(int contador, int numero1) {
		
		System.out.println("Metodo 1");
		int res = contador + numero1;
		
		
		System.out.println("Contador: " + contador);
		System.out.println("Resultado: " + res);
		return res;
	}
	
	public int metodo(int contador, int numero1, int numero2) {
		System.out.println("Metodo 2");

		int res;
		if(numero1 <= 10) {
			res = contador + numero1;
		}else {
			res = contador;
		}
		
		System.out.println("Contador: " + contador);
		System.out.println("Resultado: " + res);
		return res;

	}
	
	public int metodo(int contador, int numero1, int numero2, int numero3) {
		System.out.println("Metodo 3");
		int res = contador;
		if(res <= numero1 && res >= numero3) {
			res =+ numero1;
		}
		
		System.out.println("Contador: " + contador);
		System.out.println("Resultado: " + res);

		return res;
	}

	public int metodo(int contador, String nombre, int edad) {
		System.out.println("Metodo 4");
		
		System.out.println("Contador: " + contador);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);

		return contador;
		
	}



}
