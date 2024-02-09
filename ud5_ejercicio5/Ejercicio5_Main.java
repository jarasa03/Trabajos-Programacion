package ud5_ejercicio5;

// @author jarasa03

import java.util.Scanner;

/**
 * ENUNCIADO: Crea un programa que pida al usuario dos valores N y M y luego
 * cree un array de tamaño N que contenga M en todas sus posiciones. Luego
 * muestra el array por pantalla.
 */

public class Ejercicio5_Main {

	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		int n;
		int m;
		Scanner sc;
		int[] array;
		
		Ejercicio5 ej5 = new Ejercicio5();
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce N");
		n = sc.nextInt();
		System.out.println("Introduce M");
		m = sc.nextInt();
		
		sc.close();
		
		array = ej5.crearArray(n, m);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
