package Unit_2;

// @author jarasa03

public class UD2_Ejercicio59 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crea un programa que cree dos arrays de enteros de tamaño 100.
		 * Luego introducirá en el primer array todos los valores del 1 al 100. Por
		 * último, deberá copiar todos los valores del primer array al segundo array en
		 * orden inverso, y mostrar ambos por pantalla.
		 */

		// Zona de declaración de variables.
		int array1[] = new int[100];
		int array2[] = new int[100];

		// Relleno el primer array.
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
		}

		// Muestro el array 1 para probar que todo va bien.
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//		}

		// Se me ocurre hacer el array de cero restando desde 100, pero no usaría el
		// primer array.

		// Relleno el array 2.
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[array1.length - 1 - i];
		}

		// Muestro el array 2.
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
