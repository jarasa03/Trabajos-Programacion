package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio16 {

	public static void main(String[] args) {

		/*
		 * Teniendo en cuenta que a, b y c son variables de tipo int que han sido
		 * inicializadas con algún valor, indica cuál de las siguientes instrucciones es
		 * incorrecta: 
		 * 
		 * 1. a = b*c++; 
		 * 2. a=c^b; 
		 * 3. a = b && c;
		 */
		
		int a;
		int b;
		int c;
		
		a = b * c++;
		a = c ^ b;
		a = b && c; // Es un error por ser de tipo entero y no buleano.

	}

}
