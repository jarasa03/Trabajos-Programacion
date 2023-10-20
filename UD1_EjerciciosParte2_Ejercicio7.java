package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa, que indique si un número es mayor que otro.
		 * 
		 */
		
		// Defino como entero los dos números a leer.
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducirás dos números y te diré cuál es mayor");
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
		else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
	}

}
