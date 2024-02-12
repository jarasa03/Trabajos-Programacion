package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio13 {

	public static void main(String[] args) {

		/*
		 * Dado el siguiente algoritmo descrito en pseudocódigo, explica brevemente qué
		 * hace y cuál sería el resultado mostrado si el valor R leído fuera 2. 
		 * 	Inicio
		 * 		Leer R 
		 * 		A = 3,14 * R * R 
		 * 		Mostrar A 
		 * 	Fin
		 */
		
		// Voy a hacer el programa en java y comprobarlo
		
		int r;
		// double es para hacer números decimales
		double a;
		
		System.out.println("Introduce el área del círculo:");
		
		Scanner entrada = new Scanner(System.in);
		r = entrada.nextInt();
		entrada.close();
		
		a = 3.14 * r * r;
		
		System.out.println(a);
		
	}

}
