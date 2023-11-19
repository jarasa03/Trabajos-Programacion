package unit_2;

// @author jarasa03

import java.util.Random;
import java.util.Scanner;

public class UD2_Ejercicio37 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa para acertar un número aleatorio del 1 al 10,
		 * para lo que tendremos 5 oportunidades. Utilizar la sentencia break.
		 */

		System.out.println("Adivina un número aleatorio entre 1 y 10.");
		
		Random rd = new Random();
		
		int range = rd.nextInt(10) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			int num1 = sc.nextInt();
			if (num1 == range) {
				break;
			}
			else {
				System.out.println("Prueba de nuevo");
			}
		}
		System.out.println("CORRECTO!");
		sc.close();
		
	}

}
