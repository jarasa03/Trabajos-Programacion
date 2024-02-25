package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que pida al usuario valores hasta que se
 *         introduzca -1 y los guarde en un arrayList. Luego muestra el
 *         arrayList por pantalla.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		ArrayList<Integer> listaArray;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		listaArray = new ArrayList<>();

		System.out.println("PROGRAMA PARA MOSTRAR NÚMEROS\n");
		System.out.println("Introduce números, cuando quieras parar, introduce -1.");

		while (listaArray.contains(-1) == false) {
			listaArray.add(sc.nextInt());
		}

		sc.close();
		
		listaArray.remove(listaArray.size() - 1);
		
		for(int i = 0; i < listaArray.size(); i++) {
			System.out.print(listaArray.get(i) + " ");
		}
	}

}
