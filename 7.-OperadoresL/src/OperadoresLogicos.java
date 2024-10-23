
public class OperadoresLogicos {
	//Atributos o Variables de Clase
	
	//Constructor
	public OperadoresLogicos() {
		
	}
	
	//Metodo
	public void Operaciones() {
		int numero1		= 5;
		int numero2 	= 6;
		double double1	= 7.7d;
		double double2	= 8.96d;
		char  caracter 	= 'a';
		
		System.out.println(numero1 < numero2 && double1 > double2 );
		System.out.println(numero1 > numero2 || caracter == 'a');
		System.out.println((caracter != 'b' && numero2 > 5) || (double2 > numero1));
		
	}
}
