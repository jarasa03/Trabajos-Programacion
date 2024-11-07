package ejercicios_ud5;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        Scanner sc = new Scanner(System.in);
        String tamanyo;
        int tamanyoInt;
        String num;
        int[] array;

        System.out.println("-------------");
        System.out.println("Array");
        System.out.println("-------------");
        do { // Por si no se introducen números enteros
            System.out.println("Introduce el tamaño de tu array");
            tamanyo = sc.nextLine();
        } while (!esSoloNumeros(tamanyo));

        tamanyoInt = Integer.parseInt(tamanyo);
        array = new int[tamanyoInt];

        do { // Por si no se introducen números enteros
            System.out.println("Introduce el número con el que quieres llenar tu array");
            num = sc.nextLine();
        } while (!esSoloNumeros(num));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(num);
            System.out.print(array[i] + " ");
        }
    }

    public static boolean esSoloNumeros(String input) {
        return input.matches("\\d+");
    }

}
