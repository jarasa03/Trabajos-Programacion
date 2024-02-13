package ud5_ejercicio4;

// @author jarasa03

import java.util.Scanner;

/**
 * ENUNCIADO: Crea un programa que permita al usuario almacenar una secuencia
 * aritmética en un array y luego mostrarla. Una secuencia aritmética es una
 * serie de números que comienza por un valor inicial V, y continúa con
 * incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7,
 * 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa
 * solicitará al usuario V, I además de N (no de valores a crear).
 */

public class Ejercicio4_Main {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int v;
		int i;
		int n;
		int[] array;
		Scanner sc;
		
		Ejercicio4 ej4 = new Ejercicio4();
		
		sc = new Scanner(System.in);

		System.out.println("Introduce el valor inicial de tu secuencia aritmética.");
		v = sc.nextInt();
		System.out.println("Introduce el incremento del valor inicial.");
		i = sc.nextInt();
		System.out.println("Introduce el número de valores a crear.");
		n = sc.nextInt();
		sc.close();
		
		array = ej4.secuenciaAritmetica(v, i, n);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}

}
