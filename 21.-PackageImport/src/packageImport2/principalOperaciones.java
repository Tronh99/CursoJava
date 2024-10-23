package packageImport2;

import PackageImport.Division;
import PackageImport.Multiplicacion;
import PackageImport.Resta;
import PackageImport.Suma;

public class principalOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suma s = new Suma();
		s.sumando();
		
		Resta r = new Resta();
		r.restando();
		
		Multiplicacion m = new Multiplicacion();
		m.multiplicando();
		
		Division d = new Division();
		d.Dividiendo();

	}

}
