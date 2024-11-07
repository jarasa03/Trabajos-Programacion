package ejercicios_ud6;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        HashMap<Integer, String> alineacion = new HashMap<>();
        boolean interruptor = true;
        Scanner sc = new Scanner(System.in);
        int respuesta;

        alineacion.put(1, "Ter Stegen");
        alineacion.put(13, "Iñaki Peña");
        alineacion.put(2, "Cubarsí");
        alineacion.put(3, "Balde");
        alineacion.put(4, "Araujo");
        alineacion.put(5, "Íñigo Martínez");
        alineacion.put(15, "Christensen");
        alineacion.put(23, "Kounde");
        alineacion.put(6, "Gavi");
        alineacion.put(7, "Ferrán");
        alineacion.put(8, "Pedri");
        alineacion.put(16, "Fermín");
        alineacion.put(20, "Dani Olmo");
        alineacion.put(21, "De Jong");
        alineacion.put(9, "Lewandowski");
        alineacion.put(10, "Ansu Fati");
        alineacion.put(11, "Raphinha");
        alineacion.put(19, "Lamine Yamal");

        while (interruptor) {
            System.out.println("--------------------------------");
            System.out.println("1. Añadir jugador");
            System.out.println("2. Eliminar jugador");
            System.out.println("3. Mostrar plantilla");
            System.out.println("4. Buscar jugador por dorsal");
            System.out.println("5. Salir");
            System.out.println("--------------------------------");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1 -> {
                    System.out.println("Introduce el dorsal del jugador a incorporar.");
                    int nuevoDorsal = sc.nextInt();
                    if (alineacion.containsKey(nuevoDorsal)) {
                        System.out.println("Has de introducir un dorsal no existente.");
                    } else {
                        System.out.println("Introduce el nombre del jugador a incorporar.");
                        String nuevoNombre = System.console().readLine();
                        alineacion.put(nuevoDorsal, nuevoNombre);
                        System.out.println("Jugador incorporado correctamente.");
                    }
                }

                case 2 -> {
                    System.out.println("Introduce el dorsal del jugador a eliminar.");
                    int dorsalFuera = sc.nextInt();
                    if (alineacion.containsKey(dorsalFuera)) {
                        alineacion.remove(dorsalFuera);
                        System.out.println("Jugador eliminado correctamente.");
                    } else {
                        System.out.println("Has de introducir un dorsal que exista en la plantilla.");
                    }
                }

                case 3 -> {
                    System.out.println("Mostrando plantilla: ");
                    System.out.println(alineacion.entrySet());
                }

                case 4 -> {
                    System.out.println("Introduce el dorsal del jugador que buscas.");
                    int dorsalBuscar = sc.nextInt();
                    if (alineacion.containsKey(dorsalBuscar)) {
                        System.out.println("El dorsal nº " + dorsalBuscar + " es el jugador " + alineacion.get(dorsalBuscar));
                    } else {
                        System.out.println("El dorsal que buscas no existe en la plantilla.");
                    }
                }

                case 5 -> {
                    interruptor = false; // Salgo del programa
                }

                default -> {
                    System.err.println("Introduce un número correcto");
                }
            }
        }

        sc.close();
    }

}
