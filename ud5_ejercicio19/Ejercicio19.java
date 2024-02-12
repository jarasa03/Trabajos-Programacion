package ud5_ejercicio19;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree una matriz de tamaño NxM (tamaño
 * introducido por teclado) e introduzca en ella NxM valores (también
 * introducidos por teclado). Luego deberá recorrer la matriz y al final mostrar
 * por pantalla cuántos valores son mayores que cero, cuántos son menores que
 * cero y cuántos son igual a cero.
 */

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		int[][] array;
		int mayCero = 0, menCero = 0, eqCero = 0;

		sc = new Scanner(System.in);

		System.out.println("Voy a solicitar el tamaño de la matriz.");
		System.out.println("Introduce la coordenada x.");
		int x = sc.nextInt();

		System.out.println("Introduce la coordenada y.");
		int y = sc.nextInt();

		array = new int[x][y]; // Doy el tamaño introducido al array.

		// Bucle para introducir los valores y calcular los números comparados con cero.
		System.out.println("Introduce los " + x * y + " valores");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = sc.nextInt();
				if (array[i][j] > 0) {
					mayCero++;
				} else if (array[i][j] < 0) {
					menCero++;
				} else {
					eqCero++;
				}
			}
		}

		sc.close();

		// Bucle para mostrar el array.
		System.out.println("\nMuestro el array.");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Hay " + mayCero + " números mayores a cero, " + menCero + " números menores a cero y "
				+ eqCero + " números iguales a cero.");

	}

}
