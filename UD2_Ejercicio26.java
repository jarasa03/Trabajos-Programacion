package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio26 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que pida una base y un exponente (entero
		 * positivo) y que calcule la potencia. (No usar la clase Math, utilizar bucles)
		 */

		System.out.println("Introducirás una base y su exponente y calcularé la potencia.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base.");
		int num1 = sc.nextInt();
		System.out.println("Introduce el exponente.");
		int num2 = sc.nextInt();
		if (num2 < 0) {
			System.err.println("Has de introducir un número positivo.");
		}
		sc.close();
	
		int i = 0;
		int num3 = num1;
		
		do {
			num3 = num1 * num3;
			i++;
		} while (i < (num2 - 1));
		
		System.out.println("El resultado es igual a: " + num3);
		
	}

}
