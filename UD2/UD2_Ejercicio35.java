package unit_2;

// @author jarasa03

public class UD2_Ejercicio35 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre por pantalla todos los números del 1
		 * al 10 excepto el 5. Utilizar la sentencia continue.
		 */

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
