import java.util.Scanner;

public class Ejercicio {
    //Atributos o Variables de Clase
    
    
    
    //Coonstructor
    public Ejercicio(){
        
    }
    //Metodo
    public void caja(){
        Scanner texto = new Scanner(System.in);
        System.out.print("Escriba el ID del provedor: ");
        String id       = texto.next();
        System.out.print("Escriba una descripcion: ");
        String desc    = texto.next();
        System.out.print("Escriba produto: ");
        String prod     = texto.next();
        System.out.print("Escriba la cantidad de productos: ");
        String cant     = texto.next();
        System.out.print("Escrriba el precio del producto: ");
        String pres     = texto.next();
               
        int num     = Integer.parseInt(cant);
        int press   = Integer.parseInt(pres);
        
        Integer nume    = num;
        Integer presi   = press;
        
        Integer subtotal = nume * presi;
        
        Double iva      = (nume * presi) * (0.16);
        
        Double total   = subtotal + iva;
        
        int     sub     = subtotal.intValue();
        double  Iva     = iva.doubleValue();
        double  Total   = total.doubleValue();
        
        
        System.out.println("Resumen de la operacion: ");
        System.out.println("ID del producto: " + id );
        System.out.println("Descripcion del producto: " + desc);
        System.out.println("Producto: " + prod);
        System.out.println("Cantitdad de producto(s): " + num);
        System.out.println("Precio del producto: " + pres);
        System.out.println("Iva: " + Iva);
        System.out.println("Suntotal : " + sub);
        System.out.println("Total: " + Total);
        
   
        
    }
    
}