package ud5_ejercicio18;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree una matriz de 10x10 e introduzca los
 * valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila).
 * Luego mostrará la matriz por pantalla.
 */

public class Ejercicio18 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int[][] array;

		array = new int[10][10];
		
		// Bucle para crear el array.
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						array[i][j] = (i + 1) * (j + 1);
					}

				}
				
		// Bucle para imprimir el array.
				System.out.print("\t\t");
				for(int j = 0; j < array[0].length; j++) {
					System.out.print("X" + (int)(j + 1) + "\t");
				}
				for (int i = 0; i < array.length; i++) {
					System.out.println();
					System.out.print("Tabla del " + (int)(i + 1) + "\t");
					for (int j = 0; j < array[0].length; j++) {
						System.out.print(array[i][j] + "\t");
					}
					System.out.println();
				}
		
	}

}
