import java.util.Scanner;

public class ventaFuteriaAnual {

	public static void main(String[] args) {
	
	//se definen dos constantes con un tipo de dato primitivo con los valores establecidos para la operacion 
	final double precioM= 2.35;
	final double precioP= 1.95;
	
	//se define el tipo double porque se solicita las ventas en kilos
	double manzanaPrimer,manzanaSegundo, peraPrimer, peraSegundo;
	
	Scanner  sc= new Scanner (System.in);
	
	//se comienzan a guardar los datos en las variables creadas
	System.out.println("Venta manzana primer semestre");
	manzanaPrimer= sc.nextDouble();
	
	System.out.println("Venta manzana segundo semestre");
	manzanaSegundo= sc.nextDouble();
	
	System.out.println("Venta pera primer semestre");
	peraPrimer= sc.nextDouble();
	
	System.out.println("Venta pera segundo semestre");
	peraSegundo=sc.nextDouble();
	
	/**
	 * Operacion aritmetica 
	 * Como el ejercicio nos está pidiendo calcular los beneficios anuales de las manzanas y de las peras
	 * lo primero que se va a hacer es que se va a dividir el año por dos semestre.
	 * 
	 * Aclarado lo anterior, la operación aritmética se hace de la siguiente manera:
	 * 	Manzana:
	 * 1- precioM * manzanaPrimer + precioM * manzanaSegundo para obtener el resultado final (opMan)
	 * 
	 * 
	 * 	Pera:
	 * 2- precioP * peraPrimer + precioP * peraSegundo para obtner el resultado final (opPer)
	 * 
	 * 	TOTAL:
	 * Se suma el resultado del precio final de las manzanas y peras totalAnual= opMan + opPer;
	 * 
	 */
	
	double opMan= precioM * manzanaPrimer + precioM * manzanaSegundo;
		
	double opPer= precioP * peraPrimer + precioP * peraSegundo; 
	
	double totalAnual= opMan + opPer;
	
	System.out.println("Los beneficios anuales de las manzanas y peras son" + totalAnual);
	
	}

}
