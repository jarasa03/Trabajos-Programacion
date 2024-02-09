package ud5_ejercicio6;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree un array de enteros e introduzca la
 * siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5,
 * etc. hasta introducir 10 diez veces, y luego la muestre por pantalla. En esta
 * ocasión has de utilizar Arrays.fill().
 */

public class Ejercicio6_Main {

	public static void main(String[] args) {
		
		int[] array;
		
		Ejercicio6 ej6 = new Ejercicio6();
		
		array = ej6.crearArray();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
