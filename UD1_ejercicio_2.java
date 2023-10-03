package unit_1;

// @author jarasa03

public class prueba_2 {

	public static void main(String[] args) {
		// Defino las variables "a", "b", "c" y "d" como boolean porque solo pueden ser verdadero o falso
		boolean a, b, c, d;
		
		// Defino "a" y "b" como verdaderas y "c" y "d" como falsas
		a=true;
		b=true;
		c=false;
		d=false;
		
		// Operación de puerta lógica AND, se hace con &&
		System.out.println("true Y true = " + (a && b));
		System.out.println("true Y false = " + (a && c));
		System.out.println("false Y false = " + (c && d));
		
		// Operación de puerta lógica OR, se hace con ||
		System.out.println("true O true = " + (a || b));
		System.out.println("true O true = " + (a || c));
		System.out.println("false O false = " + (c || d));
		
		// Operación de puerta lógica NOT, se hace con !
		System.out.println("NO true = " + !a);
		System.out.println("NO false = " + !c);
		
		// Operación de puerta lógica AND, pero más compleja
		System.out.println("(3<4) Y true = " + ((3<4) && a));
	}
}
