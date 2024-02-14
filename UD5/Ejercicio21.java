package ud5_ejercicio21;

/**
 * ENUNCIADO: Realiza un programa que rellene un array de 6 filas por 10
 * columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos
 * incluidos). A continuación, el programa deberá dar la posición tanto del
 * máximo como del mínimo.
 */

public class Ejercicio21 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int[][] array;
		int min = 0;
		int max = 0;
		String maxString = "";
		String minString = "";

		array = new int[6][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (1 + Math.random() * (1000 - 0 + 1));
				if (i == 0 && j == 0) { // Condicional para que no me coja el mínimo en 0 por haberlo inicializado como
										// tal.
					min = array[i][j];
					max = array[i][j];
					minString = i + " " + j;
					maxString = i + " " + j;
				}
				if (array[i][j] > max) {
					max = array[i][j];
					maxString = i + " " + j;
				}
				if (array[i][j] < min) {
					min = array[i][j];
					minString = i + " " + j;
				}
			}

		}
		System.out.println("La posición del valor mínimo " + min + " = " + minString);
		System.out.println("La posición del valor máximo " + max + " = " + maxString);

	}

}
