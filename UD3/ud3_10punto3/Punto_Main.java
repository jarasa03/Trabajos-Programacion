package ud3_10punto3;

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

/**
 * ENUNCIADO 2: Añade a la clase Punto un constructor que de valor inicial a las
 * coordenadas x e y.
 * 
 * Corrige el código del main para hacer uso del constructor.
 * 
 * Al crear el constructor con los parámetros, ya no podemos utilizar el
 * constructor por defecto (new Punto() ) esto nos da la ventaja, de que siempre
 * que creemos un objeto este tendrá valores, y no se nos olvidará asignarlos
 * posteriormente.
 */

/**
 * ENUNCIADO 3: Añade a la clase Punto los siguientes métodos públicos:
 * 
 * • public void imprime() // Imprime por pantalla las coordenadas. Ejemplo:
 * “(7, -5)”
 * 
 * • public void setXY(int x, int y) // Modifica ambas coordenadas. Es como un
 * setter doble.
 * 
 * • public void desplaza(int dx, int dy) // Desplaza el punto la cantidad
 * (dx,dy) indicada. Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces
 * estará en (3,6).
 * 
 * • public int distancia(Punto p) // Calcula y devuelve la distancia entre el
 * propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro:
 * distancia entre dos coordenadas.
 * 
 * Prueba a utilizar estos métodos desde el main para comprobar su
 * funcionamiento.
 */

public class Punto_Main {

	public static void main(String[] args) {

		// Instancio 3 nuevos objetos.
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		Punto p = new Punto(5, 5);

		// Imprimo las coordenadas.
		System.out.println("Coordenadas originales:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());

		// Hago operaciones con las coordenadas.
		punto1.setX(punto1.getX() + 3);
		punto1.setY(punto1.getY() * 5);

		punto2.setX(punto1.getX() + 10);
		punto2.setY(punto1.getY() + 4);

		punto3.setX(punto1.getY() - 5);

		// Vuelvo a imprimir las nuevas coordenadas.
		System.out.println("\nNuevas coordenadas:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());
		
		// Pruebo los métodos del enunciado 3.
		System.out.println();
		punto1.imprime();
		punto1.setXY(5, 15);
		punto1.imprime();
		punto1.desplaza(5, 5);
		punto1.imprime();
	}

}
