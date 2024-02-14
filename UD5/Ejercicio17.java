package ud5_ejercicio17;

// @author jarasa03

/**
 * ENUNCIADO: Define un array de números enteros de 3 filas por 6 columnas con
 * nombre num y asigna los valores según la siguiente tabla. Muestra el
 * contenido de todos los elementos del array dispuestos en forma de tabla como
 * se muestra a continuación.
 */

public class Ejercicio17 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		int[][] num;

		num = new int[3][6];

		// Bucle para crear el array.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = 0;
			}
		}

		// Meto a mano los números en las posiciones solicitadas.
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 7;
		num[0][0] = 75;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Bucle para imprimir el array.
		System.out
				.print("\t     Columna 0\t    Columna 1\t    Columna 2\t    Columnta 3\t    Columna 4\t    Columna 5");
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			System.out.print("Fila " + i + "\t\t");
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}
