package ud5_ejercicio16;

// @author jarasa03

/**
 * ENUNCIADO: 16. Crea un programa que cree una matriz de tamaño 5x5 que
 * almacene los números del 1 al 25 y luego muestre la matriz por pantalla.
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		int[][] array;
		int cont = 1;
		
		array = new int[5][5];
		
		// Bucle para crear el array.
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = cont;
				cont ++;
			}
		}
		
		// Bucle para imprimir el array.
		for(int i = 0; i < array.length; i++) {
			System.out.println();
			for(int j = 0; j < array[0].length; j++) {
				
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
