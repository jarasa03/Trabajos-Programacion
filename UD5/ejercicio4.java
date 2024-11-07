package ejercicios_ud5;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int[] array = new int[10];
        String valorInicial;
        String incremento;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Secuencia aritmética");
        System.out.println("--------------------------");
        
        do { // Por si me introducen algo más que números
            System.out.println("Introduce un valor inicial");
            valorInicial = sc.nextLine();
        } while (!esSoloNumeros(valorInicial));

        do { // Por si me introducen algo más que números
            System.out.println("Introduce el incremento");
            incremento = sc.nextLine();
        } while (!esSoloNumeros(incremento));

        sc.close();

        for(int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(valorInicial) + contador;
            contador += Integer.parseInt(incremento);
            System.out.print(array[i] + " ");
        }
    }

    public static boolean esSoloNumeros(String input) {
        return input.matches("\\d+");
    }

}
