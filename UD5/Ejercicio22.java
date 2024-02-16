package ud5_ejercicio22;

import java.util.Scanner;

/**
 * ENUNCIADO: Necesitamos crear un programa para almacenar las notas de 4
 * alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario
 * introducirá las notas por teclado y luego el programa mostrará la nota
 * mínima, máxima y media de cada alumno. (no es necesario guardar el nombre del
 * alumno, sabremos que alumno es por la fila)
 * 
 */

public class Ejercicio22 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int[][] array;
		Scanner sc;
		int[] maximos;
		int[] minimos;
		double[] medias;
		int max;
		int min;
		double media;

		// Zona de inicialización de variables.
		array = new int[4][5];
		sc = new Scanner(System.in);
		minimos = new int[array[0].length];
		maximos = new int[array[0].length];
		medias = new double[array[0].length];
		max = 0;
		min = 0;
		media = 0;

		for (int i = 0; i < array.length; i++) { // Rellenado del array mediante la clase Scanner.
			System.out.println("Introduce las notas del alumno nº" + (int) (i + 1));
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
				if (j == 0) { // Bucle para que no tenga en cuenta la inicialización de mis variables en 0.
					max = array[i][j];
					min = array[i][j];
				}
				if (array[i][j] > max) { // Número máximo.
					max = array[i][j];
				}
				if (array[i][j] < min) { // Número mínimo.
					min = array[i][j];
				}
				media += array[i][j];

			}
			maximos[i] = max;
			minimos[i] = min;
			medias[i] = media / array[0].length;
			media = 0;
		}
		sc.close();

//		for (int i = 0; i < array.length; i++) {
//			medias[i] /= contador; // Cálculo de la media.
//		}

		System.out.print("\t\t\t\t\t\t\t");

		System.out.print("MAX\tMIN\tMEDIA");
		System.out.println();

		for (int i = 0; i < array.length; i++) { // Impresión del array.
			System.out.print("Alumno " + (int) (i + 1) + "\t");
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print(maximos[i] + "\t" + minimos[i] + "\t" + medias[i]);
			System.out.println();
		}
	}

}
