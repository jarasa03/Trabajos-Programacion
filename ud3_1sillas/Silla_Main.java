package ud3_1sillas;

// @author jarasa03

public class Silla_Main {

	public static void main(String[] args) {
		
		Silla_Clase silla1 = new Silla_Clase();
		Silla_Clase silla2 = new Silla_Clase();
		
		// Doy valores a los atributos.
		silla1.patas = 4;
		silla1.color = "rojo";
		silla1.numRuedas = 4;
		
		silla2.patas = 6;
		silla2.color = "verde";
		silla2.numRuedas = 6;
		
		
		// Imprimo y doy los métodos.
		System.out.println("¿Puede la silla 1 rodar? " + silla1.puedeRodar());
		System.out.println("¿Puede la silla 2 rodar? " + silla2.puedeRodar());
		
	}
	
}
