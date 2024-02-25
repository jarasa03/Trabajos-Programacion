package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: . Crea un programa que pida al usuario 10 cadenas de texto
 *         e introduzca las 5 primeros en un arrayList y los 5 últimos en otro
 *         arrayList. Por último, comparará ambos arrayList y le dirá al usuario
 *         si son iguales o no.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		ArrayList<String> listaArray1;
		ArrayList<String> listaArray2;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		listaArray1 = new ArrayList<>();
		listaArray2 = new ArrayList<>();

		System.out.println("COMPARAR ARRAYLISTS\n");
		System.out.println("Introducirás 5 cadenas de texto, luego otras cinco y las compararé posición por posición.");

		System.out.println("Introduce las primeras cinco cadenas de texto.");
		for (int i = 0; i < 5; i++) {
			listaArray1.add(sc.nextLine());
		}

		System.out.println("Introduce las segundas cinco cadenas de texto.");
		for (int i = 0; i < 5; i++) {
			listaArray2.add(sc.nextLine());
		}
		sc.close();

		System.out.println("Son ambos ArrayLists iguales?: " + listaArray1.equals(listaArray2));

	}

}
