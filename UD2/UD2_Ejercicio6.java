package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite tres números enteros y muestre cual
		 * es el mayor utilizando if-else. Tener en cuenta que los números introducidos
		 * pueden ser iguales entre ellos.
		 * 
		 */
		
		// Solicito los tres números
		System.out.println("Introduce 3 números enteros y te los ordenaré.");
		
		// Abro el Scanner sc y defino los tres números como enteros.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		// Primera parte del bucle, sin números iguales.
		if ((num1 > num2) && (num2 > num3)) {
			System.out.println(num1 + " > " + num2 + " > " + num3);
		}
		else if ((num2 > num1) && (num1 > num3)) {
			System.out.println(num2 + " > " + num1 + " > " + num3);
		}
		else if ((num3 > num2) && (num2 > num1)) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}
		else if ((num2 > num3) && (num3 > num1)) {
			System.out.println(num2 + " > " + num3 + " > " + num1);
		}
		else if ((num1 > num3) && (num3 > num2)) {
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}
		else if ((num3 > num1) && (num1 > num2)) {
			System.out.println(num3 + " > " + num1 + " > " + num2);
		}
		
		
		// Segunda parte del bucle, con números iguales siendo el último el menor.
		else if ((num1 == num2) && (num2 > num3)) {
			System.out.println(num1 + " = " + num2 + " > " + num3);
		}
		else if ((num3 == num2) && (num2 > num1)) {
			System.out.println(num3 + " = " + num2 + " > " + num1);
		}
		else if ((num1 == num3) && (num3 > num2)) {
			System.out.println(num1 + " = " + num3 + " > " + num2);
		}
		
		
		// Tercera parte del bucle, con números iguales siendo el último el mayor.
		else if ((num1 == num2) && (num2 < num3)) {
			System.out.println(num1 + " = " + num2 + " < " + num3);
		}
		else if ((num3 == num2) && (num2 < num1)) {
			System.out.println(num3 + " = " + num2 + " < " + num1);
		}
		else if ((num1 == num3) && (num3 < num2)) {
			System.out.println(num1 + " = " + num3 + " < " + num2);
		}
		
		
		// Última parte del bucle, todos los números iguales.
		else {
			System.out.println(num3 + " = " + num1 + " = " + num2);
		}
		
	}

}
