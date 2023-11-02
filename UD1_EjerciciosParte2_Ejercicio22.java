package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio22 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite nombre y edad en la misma línea y
		 * se introduzcan separados por un espacio y los muestre por pantalla.
		 */

		// Abro el scanner sc.
		Scanner sc = new Scanner(System.in);
		
		// Solicito lo que quiero que el usuario meta por pantalla.
		System.out.println("Dime tu nombre y tu edad separados por un espacio");
		
		// Defino a y b como strings.
		String a = sc.next();
		String b = sc.next();
		
		// Cierro el scanner sc.
		sc.close();
		
		// Imprimo por pantalla la solución.
		System.out.println("Tu nombre es " + a + " y tu edad son: " + b + " años.");
		
	}

}
