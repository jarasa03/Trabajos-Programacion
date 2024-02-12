package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite dos números y los muestre ordenados
		 * de mayor a menor.
		 * 
		 */
		
		// Solicito los dos números.
		System.out.println("Introduce dos números enteros.");

		// Abro el Scanner sc y defino los dos números como enteros.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		// Utilizo los condicionales if.
		if (num1 > num2) {
			System.out.println("Los números introducidos mostrados de mayor a menor son: " + num1 + ", " + num2);
		}
		else {
			System.out.println("Los números introducidos mostrados de mayor a menor son: " + num2 + ", " + num1);
		}
	}

}
