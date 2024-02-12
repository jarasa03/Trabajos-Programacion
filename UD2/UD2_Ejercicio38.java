package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio38 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escriba un programa que solicite del usuario un número N y luego
		 * muestre por pantalla la siguiente ejecución: 1 1 2 1 2 3 1 2 3 4 ……………. 1 2 3
		 * 4 5 6 …….N
		 */

		System.out.println("Escribe un número.");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();

		System.out.println(num1);

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
