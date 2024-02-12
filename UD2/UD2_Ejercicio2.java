package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite dos números e indique cual es el
		 * mayor de los dos.
		 * 
		 */
		
		// Solicito ambos números.
		System.out.println("Introduce dos números y te diré el mayor entre ambos.");
		
		// Abro el Scanner sc y asigno los dos valores como enteros.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		// Con un condicional if defino que si el num1 es mayor que el 2 diga que lo es y sino diga que es menor.
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es mayor que " + num2);
		}
		else {
			System.out.println("El número " + num1 + " es menor que " + num2);
		}

	}

}
