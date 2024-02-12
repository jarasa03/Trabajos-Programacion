package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio9 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa en el que solicite un número entero del 1 al 7,
		 * y nos muestre por pantalla el correspondiente día de la semana. Utilizar la
		 * estructura if-else.
		 * 
		 */
		
		System.out.println("Introduce un número entero del 1 al 7 y te diré que día de la semana es.");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if ((num1 < 1) || (num1 > 7)) {
			System.err.println("El número introducido no cumple los parámetros solicitados.");
		}
		else if (num1 == 1) {
			System.out.println("El número introducido corresponde al lunes");
		}
		else if (num1 == 2) {
			System.out.println("El número introducido corresponde al martes");
		}
		else if (num1 == 3) {
			System.out.println("El número introducido corresponde al miércoles");
		}
		else if (num1 == 4) {
			System.out.println("El número introducido corresponde al jueves");
		}
		else if (num1 == 5) {
			System.out.println("El número introducido corresponde al viernes");
		}
		else if (num1 == 6) {
			System.out.println("El número introducido corresponde al sábado");
		}
		else {
			System.out.println("El número introducido corresponde al domingo");
		}
	}

}
