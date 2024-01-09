package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio55 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crea un programa que pida 8 números enteros por teclado, los
		 * almacene en un array y luego muestre por separado la suma de todos los
		 * valores positivos y negativos.
		 */

		// Zona de declaración de variables.
		Scanner sc = new Scanner(System.in);
		int num;
		int array[] = new int[8];
		int pos = 0; // Variable para números positivos.
		int neg = 0; // Variable par anúmeros negativos.

		// Solicitar los números y rellenar el array.
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce un número entero");
			num = sc.nextInt();
			array[i] = num;
//			// Dentro del for, para guardar en dos variables la suma de los negativos y la
//			// suma de los positivos.
//			if (num >= 0) {
//				pos = pos + num;
//			} else {
//				neg = neg + num;
//			}
		}
		sc.close();

		// Calculo de la suma de los positivos y los negativos.
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				pos = pos + array[i];
			} else {
				neg = neg + array[i];
			}
		}

		// Mostrar el array.
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// Mostrar la suma de negativos y positivos por separado.
		System.out.println("\nLa suma de los positivos es igual a: " + pos);
		System.out.println("La suma de los negativos es igual a: " + neg);

	}

}
