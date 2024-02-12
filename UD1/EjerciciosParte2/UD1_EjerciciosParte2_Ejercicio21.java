package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio21 {

	public static void main(String[] args) {

		/*
		 * Crear un programa que solicite nombre y edad y los muestre por pantalla.
		 */

		// Abro el scanner dándole el nombre sc.
		Scanner sc = new Scanner(System.in);
		
		// Solicito el nombre y lo guardo en a.
		System.out.println("Dime tu nombre");
		String a = sc.next();
		
		// Solicito la edad y la guardo en b.
		System.out.println("Dime tu edad");
		String b = sc.next();
		
		// Cierro el scanner "sc".
		sc.close();
		
		// Imprimo por pantalla el resultado.
		System.out.println("Tu nombre es: " + a + " y tu edad es: " + b + " años.");
	}

}
