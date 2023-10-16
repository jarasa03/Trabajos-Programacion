package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio10 {
	
	public static void main(String[] args) {
		
		/* 	Inicio
		 * 		Definir como entero num1
		 * 		Definir como entero num2
		 * 		Imprimir "Introduce dos números y te diré el mayor"
		 * 		Imprimir "Introduce el primer número"
		 * 		Leer num1
		 * 		Imprimir "Introduce el segundo número"
		 * 		Leer num2
		 * 		Si num1 > num2
		 * 			Imprimir num1 " > " num2
		 * 		Si num2 > num1
		 * 			Imprimir num2 " > " num1
		 * 		Si no
		 * 			Imprimir num1 " = " num2
		 * 	Final
		 * */
		
		int num1;
		int num2;
		
		System.out.println("Introduce dos números y te diré el mayor");
		System.out.println("\nIntroduce el primer número");
		
		Scanner entrada = new Scanner(System.in);
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2 = entrada.nextInt();
		
		entrada.close();
		
		// Condicionante if poniendo condiciones y finalizando con un sino
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		}
		if (num2 > num1) {
			System.out.println(num2 + " > " + num1);
		}
		else {
			System.out.println(num1 + " = " + num2);
		}
	}

}
