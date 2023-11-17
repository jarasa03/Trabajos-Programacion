package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio25 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre los n primeros términos de la serie
		 * de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es
		 * 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
		 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n
		 * se debe introducir por teclado.
		 */

		System.out.println("Voy a mostrarte los n primeros términos de la serie de Fibonacci. Introduce n.");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();

		int i = 0;
		int a = 0;
		int b = 1;

		do {
			int c = b + a;
			a = b;
			b = c;
			System.out.println(c);
			i++;
		} while (i < num1);

	}

}
