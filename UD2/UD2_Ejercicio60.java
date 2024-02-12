package Unit_2;

// @author jarasa03

public class UD2_Ejercicio60 {
	
	public static void main(String[] args) {
		
		int[] array = new int[55];
		int pos = 0;
		
		// Rellenar array
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				array[pos] = i;
				pos++;
			}
		}
		
		// Mostrar array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
