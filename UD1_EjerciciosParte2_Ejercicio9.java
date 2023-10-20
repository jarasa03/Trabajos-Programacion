package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio9 {

	public static void main(String[] args) {

		// ENUNCIADO: Crear un programa que calcule y muestre el número de horas que hay
		// en 10 años.

		System.out.println("Voy a mostrar por pantalla el número de horas que hay en 10 años teniendo en cuenta que hay 2 bisiestos");

		// Defino como entero la variable "num".
		int num;
		/*
		 * 24 son el número de horas en un día, lo multiplico por el número de días en
		 * un año y por los 10 años. Después le sumo los 2 días por haber dos años
		 * bisiestos.
		 */
		num = 24 * 365 * 10 + 48;

		System.out.println("\nHay " + num + " horas en 10 años");

	}

}
