package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa en el que se declaren dos variables de tipo
		 * entero (int), asignándole valor 20 y 4 respectivamente, y muestre el
		 * resultado de la suma, resta, multiplicación, división y módulo.
		 */
		
		// Defino como enteros dos variables y los diferentes resultados.
		int var1;
		int var2;
		int sum;
		int res1;
		int res2;
		int mul;
		double div1;
		double div2;
		double mod1;
		double mod2;
		
		// Defino las variables "var1" y "var2".
		var1 = 20;
		var2 = 4;
		
		// Hago cada una de las operaciones.
		// El (double) es un casting, es para trasformar una operación en un caso determinado.
		sum = var1 + var2;
		res1 = var1 - var2;
		res2 = var2 - var1;
		mul = var1 * var2;
		div1 = var1 / var2;
		div2 = (double) var2 / var1;
		mod1 = var1 % var2;
		mod2 = var2 % var1;
		
		// Ahora voy a imprimir por pantalla todos los resultados de cada operación.
		System.out.println("La suma de " + var1 + " más " + var2 + " es igual a: " + sum);
		System.out.println("La resta de " + var1 + " menos " + var2 + " es igual a: " + res1);
		System.out.println("La resta de " + var2 + " menos " + var1 + " es igual a: " + res2);
		System.out.println("La multiplicación de " + var1 + " por " + var2 + " es igual a: " + mul);
		System.out.println("La división de " + var1 + " entre " + var2 + " es igual a: " + div1);
		System.out.println("La división de " + var2 + " entre " + var1 + " es igual a: " + div2);
		System.out.println("El módulo de " + var1 + " entre " + var2 + " es igual a: " + mod1);
		System.out.println("El módulo de " + var2 + " entre " + var1 + " es igual a: " + mod2);
	}

}
