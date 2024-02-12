package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio43 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y
		 * ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un
		 * espacio.
		 */

		System.out.println("Introduce un carácter y te diré si es una vocal o no.");

		Scanner sc = new Scanner(System.in);
		char caracter = sc.next().charAt(0);
		sc.close();

		// Si es vocal lo imprime y sino no.
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
				|| caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
			System.out.println("VOCAL");
		} else {
			System.out.println("NO VOCAL");
		}
	}

}
