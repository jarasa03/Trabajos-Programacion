package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que indique si un número introducido es positivo
		 * o negativo.
		 * 
		 */
		
		// Solicito el número.
		System.out.println("Introduce un número y te diré si es positivo o negativo.");
		
		// Abro el Scanner y lo asigno como entero.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		// Con un if defino que si es positivo lo diga y sino diga que es negativo.
		if (num1 >= 0) {
			System.out.println("El número " + num1 + " es positivo.");
		}
		else {
			System.out.println("El número " + num1 + " es negativo.");
		}

	}

}
