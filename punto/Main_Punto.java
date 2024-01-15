package punto;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa con una clase llamada Punto que representará un
 * punto de dos dimensiones en un plano. Solo contendrá dos atributos enteros
 * llamadas x e y (coordenadas).
 * 
 * En el main de la clase principal instancia 3 objetos Punto con las
 * coordenadas (5,0), (10,10) y (-3, 7). Muestra por pantalla sus coordenadas
 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
 * distintos operadores, modificando el valor directamente, operando sobre el
 * valor que tiene el punto, como puede ser sumar, restar, multiplicar o
 * dividir, etc) y vuelve a imprimirlas por pantalla.
 */

public class Main_Punto {

	public static void main(String[] args) {

		// Instancio 3 nuevos objetos.
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();

		// Dar valores a los atributos.
		punto1.setXY(5, 0);
		punto2.setXY(10, 10);
		punto3.setXY(-3, 7);

		// Imprimo las coordenadas.
		System.out.println("Coordenadas originales:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());

		// Hago operaciones con las coordenadas.
		punto1.setX(punto1.getX() + 3);
		punto1.setY(punto1.getY() * 5);

		punto2.setX(punto1.getX() + 10);
		punto2.setY(punto1.getY() * 2);

		punto3.setX(punto1.getY() - 5);

		// Vuelvo a imprimir las nuevas coordenadas.
		System.out.println("\nNuevas coordenadas:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());
	}

}
