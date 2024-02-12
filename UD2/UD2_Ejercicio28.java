package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio28 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que obtenga los números enteros comprendidos
		 * entre dos números introducidos por teclado y validados como distintos, el
		 * programa debe empezar por el menor de los enteros introducidos e ir
		 * incrementando de 7 en 7.
		 */

		System.out.println("Introduce dos números enteros y te dire los números entre estos, de 7 en 7.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número entero.");
		int num1 = sc.nextInt();
		if (num1 < 0) {
			System.err.println("Introduce un número positivo");
		}
		System.out.println("Introduce el segundo número entero.");
		int num2 = sc.nextInt();
		if (num2 < 0) {
			System.err.println("Introduce un número positivo");
		}
		sc.close();
		
		System.out.println(num1);
		
		while (num1 < num2) {
			num1 = num1 + 7;
			if (num1 <= num2)
			System.out.println(num1);
			else {
				System.out.println(num2);
			}
		}
		
	}

}
