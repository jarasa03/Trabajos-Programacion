package ud3_8rectangulo2;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa con una clase llamada Rectangulo que representará
 * un rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo
 * que la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 * 
 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
 * y (7,9)(2,3). Muestra por pantalla sus coordenadas, perímetros (suma de
 * lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
 * y vuelve a imprimir coordenadas, perímetros y áreas.
 */

/**
 * ENUNCIADO 2: En nuestro software necesitamos asegurarnos de que la coordenada
 * (x1,y1) represente la esquina inferior izquierda y la (x2,y2) la superior
 * derecha del rectángulo. Añade a Rectangulo un constructor con los 4
 * parámetros. Incluye un if que compruebe los valores (*). Si son válidos
 * guardará los parámetros en el objeto. Si no lo son mostrará un mensaje del
 * estilo “ERROR al instanciar Rectangulo…” utilizando System.err.println(...).
 * No podremos evitar que se instancie el objeto pero al menos avisaremos por
 * pantalla.
 * 
 * Corrige el main para utilizar dicho constructor. Debería mostrar un mensaje
 * de error.
 * 
 * (*) Pista: Es suficiente con un if ( (condición) && (condición) )
 */

public class Rectangulo_Main {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Rectangulo rectangulo1;
		Rectangulo rectangulo2;
		int x1, x2, y1, y2;

		// Doy valor a las variables.
		x1 = 0;
		x2 = 0;
		y1 = 5;
		y2 = 5;

		// Zona de instanciado de objetos.
		rectangulo1 = new Rectangulo(x1, y1, x2, y2);

		// Doy valor a las variables.
		x1 = 7;
		x2 = 9;
		y1 = 2;
		y2 = 3;

		// Zona de instanciado de objetos.
		rectangulo2 = new Rectangulo(x1, y1, x2, y2);

		// Muestro lo solicitado.
		System.out.println("Las coordenadas del primer recángulo son: (" + rectangulo1.getx1() + ","
				+ rectangulo1.getx2() + ") y (" + rectangulo1.gety1() + "," + rectangulo1.gety2() + ")");
		System.out.println("Las coordenadas del segundo recángulo son: (" + rectangulo2.getx1() + ","
				+ rectangulo2.getx2() + ") y (" + rectangulo2.gety1() + "," + rectangulo2.gety2() + ")");

		System.out.println("El perímetro del primer rectángulo es igual a " + rectangulo1.perimetro());
		System.out.println("El perímetro del segundo rectángulo es igual a " + rectangulo2.perimetro());

		System.out.println("El área del primer rectángulo es igual a " + rectangulo1.area());
		System.out.println("El área del segundo rectángulo es igual a " + rectangulo2.area());
	}

}
