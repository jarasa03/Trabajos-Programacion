package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio22 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa para acertar un número aleatorio de 3 cifras,
		 * para lo que tendremos 5 oportunidades.
		 */

		System.out.println("Adivina un número de 3 cifras, tienes cinco intentos.");
		Random num = new Random();

		int min = 0;
		int max = 999;

		Scanner sc = new Scanner(System.in);
		
		int a = num.nextInt(max - min + 1) + min;

		for (int i = 1; i < 6; i = i + 1) {
			System.out.println("Introduce un número, vas por el intento número: " + i);
			int num1 = sc.nextInt();
			if (num1 == a) {
				System.out.println("CORRECTO!!!");
			}
			else if (num1 > 999) {
				System.err.println("Introduce un número de 3 cifras");
			}
			else if (num1 < 0) {
				System.err.println("Introduce un número positivo de 3 cifras");
			}
			
		}
		System.out.println("El número correcto era " + a);
		sc.close();
	}

}
