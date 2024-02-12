package unit_2;

// @author jarasa03

public class UD2_Ejercicio36 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre los números pares del 1 al 10.
		 * Utilizar la sentencia continue.
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
