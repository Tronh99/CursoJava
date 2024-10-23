public class WelcomeGC{
//Atributos o Variables de Clase


	//Constructor
	public WelcomeGC() {
	System.out.println("Bienvenidos a Grupocodesi.com");
	}

	
	//Director de orquesta
	public static void main (String [] args){

	WelcomeGC wgc = new WelcomeGC();
	wgc.metodo1();	
	wgc.metodo2();
	wgc.metodo3();
	wgc.metodo4();
	wgc.metodo5();
	wgc.metodo6();

	}


	public void metodo1(){
	String 		nom	="Angel";
	String 		apa	="Ramirez";
	String 		ama	="Diaz";

	System.out.println(nom + " " + apa + " " + ama);
	}
	

	public void metodo2(){
	int 		Edad	= 22;
	char 		Sexo	='M';

	System.out.println("Edad: " + Edad);
	System.out.println("Genero: " + Sexo);
	}


	public void metodo3(){
	String 		Escolaridad	="Superiro";

	System.out.println("Grado escolar maximo: " + Escolaridad);
	}
	

	public void metodo4(){
	boolean 	vive	= true;
	int 		NoHer	= 0;
	
	System.out.println("Vive : " + vive);
	System.out.println("Numeor de hermanos: " + NoHer);
	}


	public void metodo5(){
	float	SueldoMensual	= 6999.69f;
	float 	SueldoAnual	= 83996.28f;
	double	SueldoDiario	= 230.126795;
	

	System.out.println("Sueldo mensula: " + SueldoMensual);
	System.out.println("Sueldo Anual: " + SueldoAnual);
	System.out.println("Sueldo Diario: " + SueldoDiario);
	}


	public void metodo6(){

	System.out.println("Gracias por su visita, vuelva pronto :)");
	}


}