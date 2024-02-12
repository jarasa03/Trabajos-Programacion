package ud3_4rectangulo;

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

public class Rectangulo_Main {

	public static void main(String[] args) {

		// Zona de instanciado de objetos.
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();

		rectangulo1.setx1(0);
		rectangulo1.setx2(0);
		rectangulo1.sety1(5);
		rectangulo1.sety2(5);

		rectangulo2.setx1(7);
		rectangulo2.setx2(9);
		rectangulo2.sety1(2);
		rectangulo2.sety2(3);

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
