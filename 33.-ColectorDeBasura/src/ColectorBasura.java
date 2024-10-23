
public class ColectorBasura {
	
	String nombre;
	String apa;
	String ama;
	
	public ColectorBasura() {
		
	}
	
	
	
	public void IniciarObjetos() {
		nombre 	= "Angel";
		apa    	= "Ramirez";
		ama 	= "Diaz";
		}
	
	public void FinalizarObjetos() {
		nombre	= null;
		apa		= null;
		ama		= null; 
	}
	
	public void lanzarColector() {
		System.gc();
	}
	
	public void Imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido paterno: " + apa);
		System.out.println("Apellido materno: " + ama);
	}
}
