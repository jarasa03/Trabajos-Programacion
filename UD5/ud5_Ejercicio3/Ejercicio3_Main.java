package ud5_ejercicio3;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree un array de 10 enteros y luego muestre
 * el siguiente menú con distintas opciones:
 * 
 * a) Mostrar valores.
 * 
 * b) Introducir valor.
 * 
 * c) Salir.
 * 
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
 * un valor V y una posición P, luego escribirá V en la posición P del array. El
 * menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
 * terminará el programa.
 */

import java.util.Scanner;

public class Ejercicio3_Main {

	public static void main(String[] args) {
		
		Ejercicio3 ej3 = new Ejercicio3();

		// Zona de declaración de variables.
		boolean interruptor = true;
		
		int[] array;
		int valor = 0;
		int posicion = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		while (interruptor == true) {
			
			System.out.println("1) Mostrar valores");
			System.out.println("\n2) Introducir valor");
			System.out.println("\n3) Salir\n");
			
			int num = sc.nextInt();
			switch (num) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.println("Posición " + (int)(i + 1) + ". " + array[i]);
				}
				break;
			case 2:
				System.out.println("Introduce el valor que quieras.");
				valor = sc.nextInt();
				System.out.println("En qué posición quieres colocarlo?");
				posicion = sc.nextInt();
				ej3.sustituyeNumero(array, valor, posicion);
				break;
			case 3:
				interruptor = false;
				System.out.println("Programa terminado.");
				break;
			default:
				System.err.println("Introduce un número válido.");
			}
			
		}
		sc.close();

	}

}
