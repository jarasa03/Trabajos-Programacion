package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * PSEUDOCÓDIGO:
		 * 	Inicio
		 * 		Imprimir: "Introduce un lado del cuadrado y te daré su área"
		 * 		Leer: num
		 * 		Int num
		 * 		Int res
		 * 		res = num * num
		 * 		Imprimir: "El área del cuadrado es: " res
		 * 	Fin
		 */
		
		// Imprimir: "Introduce un lado del cuadrado y te daré su área"
		System.out.println("Introduce un lado del cuadrado y te daré su área");
		
		// Defino num como entero.
		int num;
		
		// Defino res como entero.
		int res;
		
		// Leo el lado que me de por pantalla como entrada.
		Scanner entrada = new Scanner(System.in);
		
		// La entrada va a ser lo mismo que num, el número entero.
		num = entrada.nextInt();
		
		// Cierro el scanner
		entrada.close();
		
		// Defino res como num * num
		res = num * num;
		
		// Imprimo por pantalla "El área del cuadrado es: " res
		System.out.println("El área del cuadrado es: " + res);
	}

}
