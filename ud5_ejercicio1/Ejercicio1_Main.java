package ud5_ejercicio1;

// @author jarasa03

/**
 * ENUNCIADO: Crea una biblioteca de funciones (librería) para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 *
 * a) generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo
 * (mínimo y máximo) se indica como parámetro.
 * 
 * b) minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 
 * c) maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 
 * d) mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 
 * e) estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 
 * f) posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la
 * que se encuentra.
 * 
 * g) volteaArrayInt: Le da la vuelta a un array.
 * 
 * Crea una clase para probar todas las funciones de la librería, además está podrá ser utilizada
 * en cualquier otro ejercicio.
 * 
 */

import java.util.Scanner;

public class Ejercicio1_Main {

	public static void main(String[] args) {

		Ejercicio1 ej1 = new Ejercicio1();
		int[] array2;

		ej1.generaArrayInt(10, 3, 20);

		array2 = ej1.getArray();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}

		System.out.println();
		System.out.println(ej1.minimoArrayInt(array2));
		System.out.println(ej1.maximoArrayInt(array2));
		System.out.println(ej1.mediaArrayInt(array2));

		System.out.println("Introduce un número y te diré si está en el array");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(ej1.estaEnArray(num));
		System.out.println(ej1.posicionEnArray(num));

		int[] voltea = ej1.volteaArrayInt();
		for (int i = 0; i < voltea.length; i++) {
			System.out.print(" " + voltea[i]);
		}

	}

}
