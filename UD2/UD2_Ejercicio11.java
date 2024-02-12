package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio11 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa en el que solicite un número entero del 1 al 7,
		 * y nos muestre por pantalla el correspondiente día de la semana. Utilizar la
		 * estructura switch.
		 * 
		 */

		System.out.println("Introduce un número del 1 al 7 y te diré a qué día de la semana corresponde.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if ((num1 < 1) || (num1 > 7)) {
			System.err.println("El número introducido no cumple los valores solicitados.");
		}
		
		else {
			switch (num1) {
			case 1:
				System.out.println("El número introducido corresponde al lunes");
				break;
			case 2:
				System.out.println("El número introducido corresponde al martes");
				break;
			case 3:
				System.out.println("El número introducido corresponde al miércoles");
				break;
			case 4:
				System.out.println("El número introducido corresponde al jueves");
				break;
			case 5:
				System.out.println("El número introducido corresponde al viernes");
				break;
			case 6:
				System.out.println("El número introducido corresponde al sábado");
				break;
			case 7:
				System.out.println("El número introducido corresponde al domingo");
				break;
			}
		}
	}

}
