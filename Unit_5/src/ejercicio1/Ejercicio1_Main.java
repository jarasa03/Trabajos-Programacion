package ejercicio1;

import java.util.Scanner;

public class Ejercicio1_Main {
	
	public static void main(String[] args) {
		
		Ejercicio1 ej1 = new Ejercicio1();
		int[] array2;

		
		ej1.generaArrayInt(10, 3, 20);
		
		array2 = ej1.getArray();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}

		System.out.println();
		System.out.println(ej1.minimoArrayInt(array2));
		System.out.println(ej1.maximoArrayInt(array2));
		System.out.println(ej1.mediaArrayInt(array2));
		
		System.out.println("Introduce un número y te diré si está en el array");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(ej1.estaEnArray(num));
		System.out.println(ej1.posicionEnArray(num));
		
		int [] voltea = ej1.volteaArrayInt();
		for (int i = 0; i < voltea.length; i++) {
			System.out.print(" " + voltea[i]);
		}
		
		
	}

}
