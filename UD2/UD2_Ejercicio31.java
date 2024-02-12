package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio31 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escribe un programa que permita ir introduciendo una serie
		 * indeterminada de números mientras su suma no supere el valor 10000. Cuando
		 * esto último ocurra, se debe mostrar el total acumulado, el contador de los
		 * números introducidos y la media.
		 */

		Scanner sc = new Scanner(System.in);

		int total = 0;
		int i = 0;

		do {
			System.out.println("Introduce un número");
			int num1 = sc.nextInt();
			total = num1 + total;
			i++;
		} while ((total < 10000));
		
		double media = (double) total / i;

		System.out.println("El total acumulado es de: " + total);
		System.out.println("El número de valores introducidos es de: " + i);
		System.out.println("La media de los valores es de: " + media);

		sc.close();

	}

}
