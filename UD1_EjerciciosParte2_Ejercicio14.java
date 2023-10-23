package unit_1;

import java.util.Scanner;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio14 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa dados dos número muestre cual es el mayor. (Se
		 * puede utilizar la clase Math)
		 * 
		 */
		
		
		// Defino como entero los dos números a leer.
		int num1;
		int num2;
			
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introducirás dos números y te diré cuál es mayor");
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
				
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();
				
		sc.close();
		
		int mayor = Math.max(num1, num2);
		System.out.println("El número mayor es: " + mayor);
				
	}
				
	

	}


