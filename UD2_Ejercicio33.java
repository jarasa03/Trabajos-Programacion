package unit_2;

// @author jarasa03

public class UD2_Ejercicio33 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que obtenga independientemente (no en el mismo
		 * bucle) la suma de los números pares y de los impares dentro de los valores
		 * del 1 al 40
		 */

		int sumimpar = 0;
		int sumpar = 0;

		System.out
				.println("Voy a mostrarte la suma de los números pares entre 1 y 40 y también la suma de los impares.");

		for (int i = 1; i <= 40; i += 2) {

			sumimpar = i + sumimpar;

		}

		System.out.println("La suma de impares es igual a: " + sumimpar);

		for (int i = 2; i <= 40; i += 2) {

			sumpar = i + sumpar;

		}
		
		System.out.println("La suma de impares es igual a: " + sumpar);

	}

}
