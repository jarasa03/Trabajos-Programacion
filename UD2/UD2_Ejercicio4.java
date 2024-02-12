package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO:Crear un programa que solicite dos números y los reste, de forma
		 * que siempre se reste el menor al mayor, quedando un número positivo. Si los
		 * números son iguales debe mostrar un mensaje y no realizar ninguna operación.
		 * 
		 */

		// Solicito los dos números.
		System.out.println("Introduce dos números enteros y los restaré, dando igual el orden en el que los introduzcas.");
		
		// Abro el Scanner sc y defino los dos números como enteros.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		// Utilizo los condicionales if.
		if (num1 > num2) {
			int resta1 = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resta1);
		}
		else if (num2 > num1) {
			int resta2 = num2 - num1;
			System.out.println(num2 + " - " + num1 + " = " + resta2);
		}
		else {
			System.out.println("Los dos números iutroducidos son iguales.");
		}
		
	}

}
