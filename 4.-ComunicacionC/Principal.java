	public class Principal{
	//Atributos o Variables de clase

	
	//Constructor
	public Principal(){
	
	}


	//Método principal
	public static void main(String [] arg){
	//Creacion de objetos
	Almacen1 alm1	= new Almacen1();
	Almacen1 alm11	= new Almacen1("Escritorio", "I5",1);
	Almacen1 alm12	= new Almacen1("Portatil", "Ryzen 5",2);
	Almacen1 alm13	= new Almacen1("Escritorio", "Ryzen 9", 2, 16, false, false, true);
	//Llamado de metodos
	alm11.Imprimir();
	alm12.Imprimir();
	alm13.Imprimir3();
	Almacen2 alm2	= new Almacen2();
	Almacen2 alm21	= new Almacen2("ADATA", 1024);
	Almacen2 alm22	= new Almacen2("ROG 550", "ATX", true, true);
	alm21.imprimir();
	alm22.imprimir1();
	}

}
