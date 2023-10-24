package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio18 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un conversor de tiempo. En una variable se guardará un
		 * tiempo en segundos y se debe mostrar por pantalla convertido en horas,
		 * minutos y segundos. Presta atención a crear un formato de salida agradable
		 * para el usuario final.
		 * 
		 */
		
		System.out.println("Introduce un número de tiempo en segundos");
		
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		sc.close();
		
		if (num1 < 60) {
			System.out.println("El número está ya en segundos");
		}
		else {
			if (num1 < 3600) {
				System.out.println(num1 / 60 + "m");
			}
			else {
				double num2 = num1 / 60 / 60;
				System.out.println(num2 + "h");
			}
		}

	}

}
