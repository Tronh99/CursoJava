import java.util.Scanner;

public class Principal {
	
	
	
	
	public Principal() {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		
		System.out.println("MENU.");
		System.out.println("Introdusca la opcion de desea.");
		System.out.println("(1) SUMA.");
		System.out.println("(2) RESTA.");
		System.out.println("(3) MULTIPLICACION.");
		System.out.println("(4) DIVISION.");
		System.out.println("(0) SALIR.");
			
		int op = texto.nextInt();
		
		 switch (op){
		
		 case 1:
			Ejercicio ej = new Ejercicio();
			ej.Suma();
			 	break;
		
		 case 2:
			 Resta res = new Resta();
				res.Res();
				break;
				
		 case 3:
			 Multiplicacion mul = new Multiplicacion();
			 mul.Mul();
			 	break;
			 	
		 case 4:
			 	Division div = new Division();
			 	div.Div();
			 	break;
			
		}
		 texto.close();
		 
	}

}
