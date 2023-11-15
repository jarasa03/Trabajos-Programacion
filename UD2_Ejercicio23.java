package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio23 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre la tabla de multiplicar de un número
		 * que se introduce por teclado.
		 */

		
		System.out.println("Introduce un número y te daré su tabla de multiplicar.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < 10; i = i + 1) {
		System.out.println(num1 + " * " + (i + 1) + " = " + num1 * (i + 1));
		}
	}

}
