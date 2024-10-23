
public class PrimitivoString {

	//Constructor
	public PrimitivoString(){
		
	}
	
	public void ConvertirPrimitivoString() {
	int		numero		= 5 ;
	float 	flotante 	= 2.6f ;
	double 	decimal		= 5.55d;
	boolean verdadero	= true;
	char	caracter	= 'a';
	

	String numerocadena 	= String.valueOf(numero);
	String flotantecadena	= String.valueOf(flotante);
	String decimalcadena	= String.valueOf(decimal);
	String booleancadena	= String.valueOf(verdadero);
	String caractercadena	= String.valueOf(caracter);
	
	System.out.println(numerocadena);
	System.out.println(flotantecadena);
	System.out.println(decimalcadena);
	System.out.println(booleancadena);
	System.out.println(caractercadena);
	
	
	
	}

}
	

