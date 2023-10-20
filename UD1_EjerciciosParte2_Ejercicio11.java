package unit_1;

import java.util.Scanner;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio11 {
	
	public static void main(String[] args) {
		
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
