package unit_2;

// author @jarasa03

import java.util.*;

public class UD2_Ejercicio34 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escribir un programa en Java que lea un número entero por el
		 * teclado e imprima todos los números impares menores que él.
		 */

		System.out.println("Introduce un número entero y te mostraré todos los impares menor que él.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if (num1 % 2 == 0) {
			num1 = num1 - 1;
			System.out.println(num1);
			while (num1 >= 3) {
				System.out.println(num1 -= 2);
			}
		}
		else {
			while (num1 >= 2) {
				System.out.println(num1 -= 2);
			}
		}
		
	}

}
