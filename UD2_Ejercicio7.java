package unit_2;

import java.util.Scanner;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite un número entre 0 y 999, y muestre
		 * cuantas cifras tiene.
		 * 
		 */

		System.out.println("Dame un número entre 0 y 999.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if ((num1 < 0) && (num1 > 999)) {
			System.err.println("El número introducido no cumple los parámetros solicitados");
		}
		else {
			int i = 0;
			while (num1 > 10) {
				i = i + 1;
				num1 = num1 / 10;
			}
		i = i + 1;
		System.out.println("El número introducido tiene " + i + " cifras.");
		}
	}

}
