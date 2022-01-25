import java.util.Scanner;

public class ventaFuteriaAnual {

	public static void main(String[] args) {
	
	final double precioM= 2.35;
	final double precioP= 1.95;
	
	double manzanaPrimer,manzanaSegundo, peraPrimer, peraSegundo;
	
	Scanner  sc= new Scanner (System.in);
	
	System.out.println("Venta manzana primer semestre");
	manzanaPrimer= sc.nextDouble();
	
	System.out.println("Venta manzana segundo semestre");
	manzanaSegundo= sc.nextDouble();
	
	System.out.println("Venta pera primer semestre");
	peraPrimer= sc.nextDouble();
	
	System.out.println("Venta pera segundo semestre");
	peraSegundo=sc.nextDouble();
	
	double opMan= precioM * manzanaPrimer + precioM * manzanaSegundo;
		
	double opPer= precioP * peraPrimer + precioP * peraSegundo; 
	
	double totalAnual= opMan + opPer;
	
	//double totalAnual= precioM * manzanaPrimer + precioM * manzanaSegundo;
	//totalAnual += (precioP * peraPrimer + precioP * peraSegundo);
	
	System.out.println("Los beneficios anuales de las manzanas y peras son" + totalAnual);
	
	}

}
