package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio8 {
	
	public static void main(String[] args) {
		
		/*	Inicio
		 * 		Definir como entero num
		 * 		Definir como entero disc
		 * 		Definir como entero end
		 * 		Imprimir "La camiseta verde vale 200€"
		 * 		Imprimir "Introduce un descuento sin el símbolo de %"
		 * 		Leer num
		 * 		disc = 200 * num / 100
		 * 		end = 200 - disc
		 * 		Imprimir "El precio final al aplicar un descuento del " num "%, se le resta a los 200€ iniciales " disc "€ y se queda en " end "€"
		 * Final 
		*/
		
		// Defino como enteros las siguientes variables
		int num;
		int disc;
		int end;
		
		// Imprimo por pantalla los siguientes textos
		System.out.println("La camiseta verde vale 200€");
		System.out.println("Introduce un descuento sin el símbolo de %");
		
		// Leo el descuento que me da el usuario y opero con él para sacar el precio final
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		entrada.close();
		disc = 200 * num / 100;
		end = 200 - disc;
		
		// Imprimo por pantalla todos los datos finales
		System.out.println("El precio final al aplicar un descuento del " + num + "%, se le resta a los 200€ iniciales " + disc + "€ y se queda en " + end + "€");;
	
	}

}
