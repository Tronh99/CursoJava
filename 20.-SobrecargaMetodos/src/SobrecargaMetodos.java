
public class SobrecargaMetodos {
	
	public SobrecargaMetodos() {
		
	}
	
	public void muestraMensaje() {
		System.out.println("Mensaje de metodo sin lista de parametro");
	}

	public void muestraMensaje(String mensaje) {
		System.out.println("Muestra de metodos con listra de parametros " + mensaje);
	}
	
	public int muestraMensaje(int numero1, int numero2) {
		System.out.println("Muestra de metodos con listra de parametros");
		return numero1 + numero2;
	}
}
