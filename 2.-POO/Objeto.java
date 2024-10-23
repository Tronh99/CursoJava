public class Objeto{
	//Atributos o Variables de Clase
	
	//Constructor
	public Objeto(){
	System.out.println("Hola desde un constructor");
	}
	
	//Director de orquesta
	public static void main (String[] args){
	Objeto Obj = new Objeto();
	Obj.mensaje();
	Obj.mensaje2();

	}
	
	//Metodos1
	public void mensaje(){
	System.out.println("Hola desde un METODO");
	}

	//Metodo2
	public void mensaje2(){
	System.out.println("Hola desde otro objeto");
	}




}