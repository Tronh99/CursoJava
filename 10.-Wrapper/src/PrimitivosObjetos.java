
public class PrimitivosObjetos {
	
	public PrimitivosObjetos() {
		
	
	}

	public void ConvertirPrimitivoObjeto() {
		int		numero 		= 5;
		float	flotante	= 5.3f;
		boolean	verdadero	= true;
		double	decimal		= 39.9d;
		char	caracter	= 'a';
	
		Integer		i = numero;
		Boolean		b = verdadero;	
		Float		f = flotante;
		Double		d = decimal;
		Character 	c = caracter;
		
		System.out.println("Convertir Primario a Objeto");
		System.out.println(i);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	
	}
	
	public void ConvertirObjetoPrimitivo() {
		Integer		numero 			= new Integer(5);
		Boolean 	verdadero		= new Boolean(true);
		Float		flotante		= new Float(9.99);
		Double		decimal			= new Double(6.666);
		Character 	caracter		= new Character('a');
		
		int			n	= numero.intValue();
		boolean		b 	= verdadero.booleanValue();
		float 		f	= flotante.floatValue();
		double 		d	= decimal.doubleValue();
		char		c	= caracter.charValue();
		
		System.out.println("Convertir Objeto a Primario");
		System.out.println(n);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	
	}
	
}
