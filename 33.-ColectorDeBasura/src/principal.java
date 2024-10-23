
public class principal {
	
	public principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColectorBasura cb = new ColectorBasura();
		cb.IniciarObjetos();
		cb.Imprimir();
		cb.lanzarColector();
		cb.FinalizarObjetos();
		cb.Imprimir();

	}

}
