public class Almacen1{
	//Atributos o Varibes de Clase
String	comp;
int	disd;
String	pros;
int	panta;
boolean	dvd;
boolean	impre;
boolean	scanner;


	//Constructor
	public Almacen1 (){
	System.out.println("Productos en almacén 1");
	
	}

	//Constructor1
	public Almacen1(String comp, String pros, int disd){
	this.comp	=comp;
	this.pros	=pros;
	this.disd	=disd;
	}

	//Constructor2
	public Almacen1(String comp,String pros, int disd, int panta){
	this.pros	=pros;
	this.comp	=comp;
	this.disd	=disd;
	this.panta	=panta;
	}

	//Constructor3
	public Almacen1(String comp, String pros, int disd, int panta, boolean dvd){
	this.pros	=pros;
	this.comp	=comp;
	this.disd	=disd;
	this.panta	=panta;
	this.dvd	=dvd;
	
	}

	//Constructor4
	public Almacen1(String comp, String pros, int disd, int panta, boolean dvd, boolean 	impre, boolean scanner){
	this.pros	=pros;
	this.comp	=comp;
	this.disd	=disd;
	this.panta	=panta;
	this.dvd	=dvd;
	this.impre	=impre;
	this.scanner	=scanner;
	}


	//Metodo
	public void Imprimir(){
	System.out.println("Computadora: " + comp);
	System.out.println("Procesador: " + pros);
	System.out.println("Almacenamiento: " + disd + "Tb");
	}


	//Metodo1
	public void Imprimir1(){
	System.out.println("Computadora: " + comp);
	System.out.println("Procesador: " + pros);
	System.out.println("Almacenamiento: " + disd + "Tb");
	System.out.println("Pulgadas del monitor: " + panta);
	}

	//Metodo2
	public void Imprimir2(){
	System.out.println("Computadora: " + comp);
	System.out.println("Procesador: " + pros);
	System.out.println("Almacenamiento: " + disd + "Tb");
	System.out.println("PUlgadas del monitor: " + panta);
	System.out.println("Dvd incorporado: " + dvd);
	}

	//Metodo3
	public void Imprimir3(){
	System.out.println("Computadora: " + comp);
	System.out.println("Procesador: " + pros);
	System.out.println("Almacenamiento: " + disd + "Tb");
	System.out.println("PUlgadas del monitor: " + panta);
	System.out.println("Dvd incorporado: " + dvd);
	System.out.println("Impresora incluida: " + impre);
	System.out.println("Scanner incluido: " + scanner);
	}

}