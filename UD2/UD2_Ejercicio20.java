package unit_2;

// @author jarasa03

public class UD2_Ejercicio20 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre los números del 550 al 340, contando
		 * de 20 en 20 hacía atrás utilizando bucle while
		 */

		System.out.println("Voy a mostrar los números del 550 al 340, contando de 20 en 20 hacia atrás.");
		
		int i = 550;
		
		while (i >= 340) {
			i = i - 20;
			System.out.println(i);
		}
		
	}

}
