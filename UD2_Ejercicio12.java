package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio12 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa en el que solicite un número entero del 1 al 12,
		 * y nos muestre por pantalla a que mes corresponde. Utilizar la estructura
		 * switch.
		 */

		System.out.println("Dame un número y te diré a qué mes corresponde.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if ((num1 < 1) || (num1 > 12)) {
			System.err.println("El número introducido no cumple los valores solicitados.");
		}
		else {
			switch (num1) {
			case 1:
				System.out.println("El número introducido corresponde a Enero");
				break;
			case 2:
				System.out.println("El número introducido corresponde a Febrero");
				break;
			case 3:
				System.out.println("El número introducido corresponde a Marzo");
				break;
			case 4:
				System.out.println("El número introducido corresponde a Abril");
				break;
			case 5:
				System.out.println("El número introducido corresponde a Mayo");
				break;
			case 6:
				System.out.println("El número introducido corresponde a Junio");
				break;
			case 7:
				System.out.println("El número introducido corresponde a Julio");
				break;
			case 8:
				System.out.println("El número introducido corresponde a Agosto");
				break;
			case 9:
				System.out.println("El número introducido corresponde a Septiembre");
				break;
			case 10:
				System.out.println("El número introducido corresponde a Octubre");
				break;
			case 11:
				System.out.println("El número introducido corresponde a Noviembre");
				break;
			case 12:
				System.out.println("El número introducido corresponde a Diciembre");
				break;
			}
		}
	}

}
