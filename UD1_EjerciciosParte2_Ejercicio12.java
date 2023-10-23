package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio12 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa en el que se declara la variable int valor=1, y
		 * muestre por pantalla los números del 1 al 10 utilizando el incremento
		 * unitario.
		 * 
		 */
		
		// Defino como entero la variable valor y le doy el valor 1, como dice en el enunciado.
		int valor = 1;
		
		// Mientras el valor sea menor o igual a 10 lo imprime por pantalla y le suma uno.
		while (valor <= 10) {
			System.out.println(valor);
			valor = valor + 1;
		}

	}

}
