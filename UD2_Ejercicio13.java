package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio13 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite una nota del 1 al 10 al usuario, y
		 * le diga si es aprobado si 5 o más o suspenso menos de 5. Utilizar la
		 * estructura switch.
		 * 
		 */

		System.out.println("Introduce una nota y te diré si es aprobado o suspenso.");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();

		switch (num1) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Estás suspenso.");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Estás aprobado.");
		default:
			System.err.println("Solo acepto valores del 1 al 10.");
		}

	}

}
