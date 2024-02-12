package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que indique si un número introducido por teclado
		 * es par y/o divisible entre 5.
		 * 
		 */

		// Solicito el número al usuario.
		System.out.println("Introduce un número entero");
		
		// Abro el Scanner sc y defino el número como entero.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		// Hago los condicionales con if.
		if (num1 % 2 == 0) {
			
			if (num1 % 5 == 0) {
				System.out.println("El número " + num1 + " es par y divisible entre 5.");
			}
			else {
				System.out.println("El número " + num1 + " es par pero no divisible entre 5.");
			}
		}
		else if (num1 % 5 == 0) {
			System.out.println("El número " + num1 + " es impar y divisible entre 5.");
		}
		else {
			System.out.println("El núnero " + num1 + " es impar y no es divisible entre 5.");
		}
		
	}

}
