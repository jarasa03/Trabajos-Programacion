package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio8 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa al que se le pasa una temperatura corporal en
		 * grados centígrados. Si la temperatura es menor que 34 o mayor de 41, debe
		 * mostrar el siguiente mensaje: “Vuelva a tomar la temperatura, posible error”,
		 * si la temperatura está entre 34,1 y 37,1 muestre “temperatura correcta”, si
		 * la temperatura está entre 37,2 y 38,3 muestre “Acuda al médico, puede estar
		 * enfermo” si la temperatura está entre 38,4 y 40,9 muestre “URGENTE: acuda al
		 * médico”. Utilizar la estructura if-else.
		 * 
		 */

		
		System.out.println("Introduce tu temperatura corporal");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		sc.close();
		
		if ((num1 < 34) || (num1 > 41)) {
			System.err.println("Vuelva a tomar la temperatura, posible error");
		}
		else if ((num1 > 34.1) && (num1 < 37.1)) {
			System.out.println("Temperatura correcta");
		}
		else if ((num1 > 37.2) && (num1 < 38.3)) {
			System.out.println("Acuda al médico, puede estar enfermo");
		}
		else {
			System.out.println("URGENTE: acuda al médico");
		}
	}

}
