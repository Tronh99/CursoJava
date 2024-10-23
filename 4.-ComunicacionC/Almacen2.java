public class Almacen2{
	//Atributos o Variables de Clase
String	marca;
int	memoria;
int	fuente;
boolean	taR;
char	kit;
String	mobo;
boolean	proy;

	//Constructor
	public Almacen2(){	
	System.out.println("Productos del alamcen 2");
	}
	
	//Constructor1
	public Almacen2(String marca, int memoria){
	this.marca	=marca;
	this.memoria	=memoria;
	}

	//Constructor2
	public Almacen2(String marca, String mob, boolean taR){
	this.marca	=marca;
	this.mobo	=mobo;
	this.taR	=taR;
	}

	//Constructor3
	public Almacen2(String marca, int fuente, char kit){
	this.marca	=marca;
	this.fuente	=fuente;
	this.kit	=kit;
	}

	//Constructor4
	public Almacen2(String marca, String mob, boolean taproR, boolean proy){
	this.marca	=marca;
	this.mobo	=mobo;
	this.taR	=taR;
	this.proy	=proy;
	}

	//Metodos
	public void imprimir(){
	System.out.println("Marca de la memoria: " + marca);
	System.out.println("Tipo de memoria, Flash 'F': " + memoria + "Mb"); 
	}

	//Metodos
	public void imprimir1(){
	System.out.println("Marca de la tarjeta madre: " + marca);
	System.out.println("Tipo de tarjeta madre: " + mobo);
	System.out.println("Tarjeta de red: " + taR);
	System.out.println("Pormocion de proyector: " + proy);
	}


	









}