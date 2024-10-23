
public class Principal {
	
	metodoJavaBeans mjb = new metodoJavaBeans();

	
	public Principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p = new Principal();
		p.settCadenas();
		p.getCadena();
		
	}
	
	public void settCadenas() {
		mjb.setNombre("Angel ");
		mjb.setApa("Ramirez ");
		mjb.setAma("Diaz");
	}
	
	public void getCadena() {
		System.out.println(mjb.getNombre());
		System.out.println(mjb.getApa());
		System.out.println(mjb.getAma());
	}

}
