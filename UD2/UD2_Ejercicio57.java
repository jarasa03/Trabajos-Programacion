package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio57 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crea un programa que pida dos valores enteros P y Q, luego cree un
		 * array que contenga todos los valores desde P hasta Q, y lo muestre por
		 * pantalla.
		 */

		int array[];
		int P;
		int Q;

		// Solicitar valores P y Q.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el valor de P.");
		P = sc.nextInt();
		System.out.println("Escribe el valor de Q.");
		Q = sc.nextInt();
		sc.close();
		
		// Calcular el tamaño del array.
		array = new int[Q - P + 1];
		
		// Rellenar el array.
		for (int i = 0; P <= Q; i++) {
			array[i] = P;
			P++;
		}
		
		// Mostrar el array.
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);	
		}
		
	}

}
