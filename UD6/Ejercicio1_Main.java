package unidad6;

/**
 * @author Jarasa03
 */

public class Ejercicio1_Main {
	
	public static void main(String[] args) {
		
		Ejercicio1 ej1 = new Ejercicio1();
		
		// Prueba del primer método.
		ej1.generaArrayListInt(10, 5, 50);
		System.out.println(ej1);
		
		// Prueba del segundo método.
		System.out.println(ej1.minimoArrayListInt());
		
		// Prueba del tercer método. A partir de este método el array está ordenado.
		System.out.println(ej1.maximoArrayListInt());
		System.out.println(ej1);
		
		// Prueba del cuarto método.
		System.out.println(ej1.mediaArrayListInt());
		
		// Prueba del quinto método.
		System.out.println(ej1.estaEnArrayListInt(40));
		
		// Prueba del sexto método.
		System.out.println(ej1.posicionArrayListInt(40));
		
		// Prueba del séptimo método.
		System.out.println(ej1.volteaArrayList());
		
	}

}
