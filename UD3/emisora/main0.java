package ejercicios_ud3_2.emisora;

import java.util.Scanner;

public class main0 {

    public static void main(String args[]) {

        // Zona de declaración de variables
        emisora emi1;
        Scanner sc = new Scanner(System.in);
        String respuesta; // Variable para elegir si poner una emisora en concreto o no
        double canal; // Variable para elegir una emisora en concreto al encender la radio
        int seleccion; // Variable para el menú
        boolean interruptor = true;

        // Selección de emisora inicial
        System.out.println("Vamos a encender la radio, ¿quieres algún canal en conreto?");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("si")) { // Por si quiere empezar con una emisora concreta

            System.out.println("¿Qué emisora quieres poner?");

            while (true) { // Pido emisoras hasta que sean un valor posible
                canal = sc.nextDouble();
                System.out.println((canal - (int) canal));

                // Compruebo que la emisora que me pasan está entre las comprendidas y es .0 o .5
                if (canal > 80 || canal < 108 && (canal - (int) canal) == 0 || (canal - (int) canal) == 5) {
                    emi1 = new emisora(canal);
                    break;
                } else {
                    System.out.println("Emisora incorrecta, prueba otra vez: ");
                }
            }

        } else { // Si no quiere poner emisora en concreto, empiezo por la 80, el valor por defecto

            emi1 = new emisora();

        }

        while (interruptor) {
            System.out.println("Emisora actual: " + emi1);
            System.out.println("---------------------------");
            System.out.println("1. Subir de emisora");
            System.out.println("2. Bajar de emisora");
            System.out.println("3. Apagar radio");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1 ->
                    emi1.subirEmisora();
                case 2 ->
                    emi1.bajarEmisora();
                case 3 ->
                    interruptor = false;
                default ->
                    System.out.println("Introduce un número correcto para el menú");
            }

        }
        System.out.println("Radio apagada");
        sc.close();
    }

}
