package ejercicios_ud3_3.movil;

import java.util.Scanner;

public class main0 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        Scanner sc = new Scanner(System.in);
        String numero;
        int respuesta;
        String respuesta2;
        boolean interruptor = true;
        Movil movil1 = null;
        int minutos;

        while (interruptor) {
            System.out.println("Menú telefonía");
            System.out.println("----------------------------------");
            System.out.println("1. Crear teléfono");
            System.out.println("2. Llamar con determinado teléfono");
            System.out.println("3. Reiniciar factura de determinado teléfono");
            System.out.println("4. Salir del programa");
            System.out.println("----------------------------------");
            System.out.println(movil1);
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1 -> {
                    System.out.println("Dime la tarifa que vas a querer: Elefante, Tigre o Gato");
                    sc.nextLine(); // Para que no se coma el enter en respuesta2
                    respuesta2 = sc.nextLine();
                    switch (respuesta2) {
                        case "Elefante" -> {
                            Tarifas tarifa = Tarifas.ELEFANTE;
                            System.out.println("Introduce el número del teléfono");
                            numero = sc.nextLine();
                            movil1 = new Movil(0, tarifa, numero);
                        }
                        case "Tigre" -> {
                            Tarifas tarifa = Tarifas.TIGRE;
                            System.out.println("Introduce el número del teléfono");
                            numero = sc.nextLine();
                            movil1 = new Movil(0, tarifa, numero);
                        }
                        case "Gato" -> {
                            Tarifas tarifa = Tarifas.GATO;
                            System.out.println("Introduce el número del teléfono");
                            numero = sc.nextLine();
                            movil1 = new Movil(0, tarifa, numero);
                        }
                        default ->
                            throw new AssertionError();
                    }

                }
                case 2 -> {
                    System.out.println("Cuántos minutos desea llamar?");
                    minutos = sc.nextInt();
                    movil1.llamar(minutos);
                }
                case 3 -> {
                    System.out.println("Reiniciando factura");
                    movil1.reiniciarFactura();
                    System.out.println("Factura reiniciada");
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");
                    interruptor = false;
                }
                default ->
                    throw new AssertionError();
            }
        }
        sc.close();

    }

}
