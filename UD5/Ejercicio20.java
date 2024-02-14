package ud5_ejercicio20;

/**
 * ENUNCIADO: Escribe un programa que pida 20 números enteros. Estos números se
 * deben introducir en un array de 4 filas por 5 columnas. El programa mostrará
 * las sumas parciales de filas y columnas igual que si de una hoja de cálculo
 * se tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int[][] array;
		Scanner sc;
		int sumaFila = 0;
		int sumaColumna = 0;

		array = new int[4][5];
		sc = new Scanner(System.in);

		System.out.println("Introduce 20 números enteros.");

		for (int i = 0; i < array.length; i++) { // Bucle para rellenar el array.
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();

		System.out.println("");
		System.out.print("\t");
		for (int i = 0; i < array.length; i++) { // Bucle para imprimir el array.
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
				sumaFila += array[i][j]; // Suma de cada fila.
			}
			System.out.print("\tΣ fila " + i + " = " + sumaFila);
			System.out.println("");
			System.out.print("\t");
		}

		for (int i = 0; i < array[0].length; i++) { // Bucle para el cálculo de la suma de las columnas.
			for (int j = 0; j < array.length; j++) {
				sumaColumna += array[j][i]; // Suma de cada columna.
			}
			System.out.print("\tColumna " + i + " = " + sumaColumna);
		}
	}

}
