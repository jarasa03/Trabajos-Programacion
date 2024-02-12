package ud5_ejercicio2;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa para realizar cálculos relacionados con la altura
 * (en metros) de personas. Pedirá un valor N y luego almacenará en un array N
 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
 * mínima así como cuántas personas miden por encima y por debajo de la media.
 * 
 */

import java.util.Scanner;

import ud5_ejercicio1.Ejercicio1;

public class Ejercicio2_Main {
	
	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		Scanner sc;
		int[] array;
		Ejercicio2 ej2;
		
		System.out.println("Introduce el número de alturas que vas a introducir.");
		
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ej2 = new Ejercicio2();
		array = new int[n];
		
		System.out.println("Introduce " + n + " alturas.");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(ej2.alturas(array));
		
		
		
		sc.close();
		
	}

}
