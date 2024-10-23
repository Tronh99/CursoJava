public class Persona{
	//Atributos o Variables de clase
	String	nombre;
	String	Apa;
	String	Ama;
	int 	Edad;

	//Constructor
	public Persona (){
	this.nombre	= "Angel";
	this.Apa	= "Ramirez";
	this.Ama	="Diaz";
	this.Edad	= 22;

	}

	
	//Constructor2 
	public Persona (String nombre, String Apa, String Ama, int Edad){
	
	this.nombre	= nombre;
	this.Apa	= Apa;
	this.Ama	= Ama;
	this.Edad	= Edad;

	}	


	//Metodo principal
	public static void main (String [] args){
	
	Persona prs = new Persona();
	Persona prs2 = new Persona ("uno", "dos", "tres", 35);
	prs.mostrar();
	prs2.mostrar();

	}


	//Metodo
	public void mostrar(){
	System.out.println(this.nombre+ " " + this.Apa + " " + this.Ama);
	int Edad = 5689;
	System.out.println(this.Edad);
	}



}