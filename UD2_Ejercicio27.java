package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio27 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que diga si un número introducido por teclado es
		 * o no primo. Un número primo es aquel que sólo es divisible entre él mismo y
		 * la unidad.
		 */
		
		System.out.println("Introduce un número y te diré si es o no primo");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		int i = 2;
		boolean primo = true;
		
		while ((i >= 2) && (i < num1) && (primo == true)) {
			if (num1 % i == 0) {
				primo = false;
			}
			i++;
		}
		
		if (primo == true) {
			System.out.println("El número es primo.");
		}
		else {
			System.out.println("El número no es primo.");
		}

	}

}
