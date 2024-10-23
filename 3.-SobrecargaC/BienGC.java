public class BienGC{
//Atributs o Variables de Clase
	
	String		Nom;		
	String		Apa;		
	String 		Ama;		
	String		Tel;		
	int 		Edad;		
	char		Sexo;	
	String		Esco;
	boolean		Vive;
	int		NoHer;
	float		SuelM;
	float 		SuelA;
	double		SuelD;
	
	
	
	
	//Constructor0
	public BienGC(){
	System.out.println("Bienvendios al Grupocodesi.com");
	}

	//Constructor1
	public BienGC(String Nom, String Apa, String Ama){
	this.Nom	=Nom;
	this.Apa	=Apa;
	this.Ama	=Ama;


	}
	//Constructor2
	public BienGC(String Tel, char Sexo){
	this.Tel	=Tel;
	this.Sexo 	=Sexo;
	}
	
	//Constructor3
	public BienGC(String Esco){	
	this.Esco 	=Esco;		
	}
	//Constructor4
	public BienGC(boolean Vive, int NoHer){
	this.Vive 	=Vive;
	this.NoHer	=NoHer;
	}
	
	//Constructor4
	public BienGC(float SuelM, float SuelA, double SuelD){
	this.SuelM	=SuelM;
	this.SuelA	=SuelA;
	this.SuelD	=SuelD;
	}

	//Método principal
	public static void main(String [] arg){
	BienGC bgc	= new BienGC();
	BienGC bgc1	= new BienGC("Angel", "Ramriez", "Diaz");
	BienGC bgc2	= new BienGC("55788811836", 'H');
	BienGC bgc3	= new BienGC("Superior");
	BienGC bgc4	= new BienGC(false, 0);
	BienGC bgc5	= new BienGC(6999.69f, 83996.28f,  230.126795d);
	bgc1.muestra();
	bgc2.muestra2();
	bgc3.muestra3();
	bgc4.muestra4();
	bgc5.muestra5();
	bgc.muestra6();
	}

	//Metodo muestra
	public void muestra(){
	System.out.println(this.Nom + " " + this.Apa + " " + this.Ama);
		
	}

	//Metodo muestra
	public void muestra2(){	 
	System.out.println("Numero telefonico: " + this.Tel);
	System.out.println("Secso: " + this.Sexo);
	}
	

	//Metodo muestra	
	public void muestra3(){
	System.out.println("Grado maxiomo de escolaridad: " + this.Esco);
	}


	//Metodo
	public void muestra4(){
	System.out.println("Numero de hermanos :" + this.NoHer);
	System.out.println("Aun vive: " + this.Vive);
	}

	//Metodo
	public void muestra5(){
	System.out.println("Sueldo mensual :" + this.SuelM);
	System.out.println("Sueldo anual :" + this.SuelA);
	System.out.println("Sueldo diario :" + this.SuelD);
	}
	
	//Metodo
	public void muestra6(){
	System.out.println("Gracias por su visita :)");
	}


}
