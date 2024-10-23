public class ComunicacionClases{
	//Atributos o Variables de Clase
	String		nombre;
	String		apa;
	String		ama;
	int 		edad;

	//Constructor
	public ComunicacionClases(){
	this.nombre	="Angel";
	this.apa	="Ramirez";
	this.ama	="Diaz";
	this.edad	=22;

	}

	//Constructor1
	public ComunicacionClases(String nombre, String apa, String ama, int edad){
	this.nombre	=nombre;
	this.apa	=apa;
	this.ama	=ama;
	this.edad	=edad;
	}

	//Método
	public void mostrarDatos(){
	System.out.println("Nombre del usuario" + this.nombre);
	System.out.println("Apellido de usuario :" + this.apa);
	System.out.println("Apellido materno: " + this.ama);
	System.out.println("Edad del usuario: " + this.edad);
	}








}