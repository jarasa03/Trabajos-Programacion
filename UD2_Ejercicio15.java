package unit_2;

// @author jarasa03

import java.util.Random;

public class UD2_Ejercicio15 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crea un programa que genere números aleatorios en [0,30] y los
		 * muestre por pantalla hasta que salga uno mayor que 25.
		 * 
		 */

		Random r = new Random();

		int numrang = 1;
		while ((numrang <= 25) && (numrang >= 0)) {
			int min = 0;
			int max = 30;
			numrang = r.nextInt(max - min + 1) + min;

			System.out.println("El número aleatorio entre 0 y 30 es igual a: " + numrang);
		}
	}
	
}
