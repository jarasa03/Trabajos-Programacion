package ejercicio2;

import java.util.Scanner;

import ejercicio1.Ejercicio1;

public class Ejercicio2_Main {
	
	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		Scanner sc;
		int[] array;
		Ejercicio2 ej2;
		
		System.out.println("Introduce el número de alturas que vas a introducir.");
		
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ej2 = new Ejercicio2();
		array = new int[n];
		
		System.out.println("Introduce " + n + " alturas.");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(ej2.alturas(array));
		
		
		
		sc.close();
		
	}

}
