package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que permita al usuario almacenar una
 *         secuencia aritmética en un arrayList y luego mostrarla. Una secuencia
 *         aritmética es una serie de números que comienza por un valor inicial
 *         V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la
 *         secuencia sería 1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería
 *         7, 17, 27, 37... El programa solicitará al usuario V, I además de N
 *         (número de valores a crear).
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int v; // Valor inicial.
		int i; // Incremento.
		int n; // Número de valores.
		ArrayList<Integer> listaArray;
		Scanner sc;
		
		// Zona de inicialización de variables.
		listaArray = new ArrayList<>();
		sc = new Scanner(System.in);
		
		System.out.println("PROGRAMA SOBRE INCREMENTOS\n");
		System.out.println("Introduce el valor inicial.");
		v = sc.nextInt();
		listaArray.add(v);
		System.out.println("Introduce el incremento de dicho valor.");
		i = sc.nextInt();
		System.out.println("Introduce el número de valores a mostrar.");
		n = sc.nextInt();

		sc.close();
		
		for (int j = 0; j < n; j++) {
			listaArray.add(v + i);
			v += i;
		}
		
		for (int j = 0; j < n; j++) {
			System.out.print(listaArray.get(j) + " ");
		}
	}

}
