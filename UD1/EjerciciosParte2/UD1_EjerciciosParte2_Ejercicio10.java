package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio10 {
	
	public static void main(String[] args) {
		
		// ENUNCIADO: Hacer las instrucciones resultando 3 valores finales.
		
		// Defino las variables "a", "b" y "c" como enteros.
		int a;
		int b;
		int c;
		
		// Comienzo con los valores iniciales.
		a = 4;
		b = 2;
		c = 3;
		
		System.out.println("Los valores iniciales son a = 4, b = 2 y c = 3");
		System.out.println("       \t\t\tA\tB\tC");
		
		// Empiezo con los cálculos pedidos.
		a = b;
		System.out.println("a = b: \t\t\t" + a + "\t" + b + "\t" + c);
		c = a;
		System.out.println("c = a: \t\t\t" + a + "\t" + b + "\t" + c);
		b = (a + b + c) / 2;
		System.out.println("b = (a + b + c) / 2:\t" + a + "\t" + b + "\t" + c);
		a = a + c;
		System.out.println("a = a + c:\t\t" + a + "\t" + b + "\t" + c);
		c = b - a;
		System.out.println("c = b - a:\t\t" + a + "\t" + b + "\t" + c);
		c = c - a;
		System.out.println("c = c - a:\t\t" + a + "\t" + b + "\t" + c);
		a = a * b;
		System.out.println("a = a * b:\t\t" + a + "\t" + b + "\t" + c);
		a = a + 3;
		System.out.println("a = a + 3:\t\t" + a + "\t" + b + "\t" + c);
		a = a % b;
		System.out.println("a = a % b:\t\t" + a + "\t" + b + "\t" + c);
		c = c + a;
		System.out.println("c = c + a:\t\t" + a + "\t" + b + "\t" + c);
	}

}
