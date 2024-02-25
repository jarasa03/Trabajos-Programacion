package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que cree un arrayList de enteros y luego
 *         muestre el siguiente menú con distintas opciones:
 * 
 *         a) Mostrar valores. ( inicialmente no tendrá ningún valor)
 * 
 *         b) Introducir valor al final.
 * 
 *         c) Introducir valor en una posición.
 * 
 *         d) Salir.
 * 
 *         La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’
 *         pedirá un valor V, y luego escribirá V en el arrayList .La opción ‘c’
 *         pedirá un valor V y una posición P, luego escribirá V en la posición
 *         P del arrayList. El menú se repetirá indefinidamente hasta que el
 *         usuario elija la opción ‘d’ que terminará el programa.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		boolean interruptor;
		Scanner sc;
		String letra;
		ArrayList<Integer> listaArray;
		int valor;

		// Zona de inicialización de variables.
		interruptor = true;
		sc = new Scanner(System.in);
		listaArray = new ArrayList<>();
		valor = 0;

		while (interruptor) {
			System.out.println("a) Mostrar valores.");
			System.out.println("b) Introducir valores al final.");
			System.out.println("c) Introducir valor en una posición.");
			System.out.println("d) Salir.");

			letra = sc.nextLine().toLowerCase();

			switch (letra) {
			case "a":
				if (listaArray.isEmpty()) {
					System.err.println("No hay valores a mostrar");
				}
				for (int j = 0; j < listaArray.size(); j++) {
					System.out.print(listaArray.get(j) + " ");
				}
				System.out.println();
				break;
			case "b":
				System.out.println("Introduce el valor que quieras meter.");
				listaArray.add(sc.nextInt());
				sc.nextLine(); // Por bug que me muestra dos veces el menú.
				break;
			case "c":
				System.out.println("Introduce el valor que quieras meter.");
				valor = sc.nextInt();
				System.out.println("Introduce la posición en la que quieras meterlo.");
				listaArray.add(sc.nextInt(), valor);
				sc.nextLine(); // Por bug que me muestra dos veces el menú.
				break;
			case "d":
				interruptor = false;
				break;
			}
		}
		sc.close();
		System.out.println("El programa ha terminado.");
	}

}
