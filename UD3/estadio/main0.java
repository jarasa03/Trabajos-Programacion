package ejercicios_ud3_3.estadio;

import java.util.Scanner;

public class main0 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        Zona fondoSur = new Zona("Fondo Sur", 500, 10);
        Zona fondoNorte = new Zona("Fondo Norte", 700, 10);
        Zona preferenciaAlta = new Zona("Preferencia Alta", 300, 25);
        Zona preferenciaBaja = new Zona("Preferencia Baja", 250, 40);
        boolean interruptor = true; // Interruptor para salir del programa
        Scanner sc = new Scanner(System.in);
        String respuesta; // Respuesta para el menú
        String respuestaZona; // Respuesta para la compra de entradas
        String respuestaCompraEntradas; // Respuesta a cuántas entradas se quieren comprar
        int respuestaCompraEntradasInt;

        while (interruptor) {
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("VENTA DE ENTRADAS");
            System.out.println("-----------------");
            System.out.println("1. Mostrar número de entradas libres en cada zona");
            System.out.println("2. Mostrar precio por entrada en cada zona");
            System.out.println("3. Comprar entradas");
            System.out.println("4. Salir");
            respuesta = sc.next();

            switch (respuesta) {
                case "1" -> {
                    System.out.println("");
                    System.out.println("--------------------");
                    System.out.println("ENTRADAS DISPONIBLES");
                    System.out.println("--------------------");
                    System.out.println("·Entradas disponibles Fondo Sur: " + fondoSur.getNumEntradas());
                    System.out.println("·Entradas disponibles Fondo Norte: " + fondoNorte.getNumEntradas());
                    System.out.println("·Entradas disponibles Preferencia Alta: " + preferenciaAlta.getNumEntradas());
                    System.out.println("·Entradas disponibles Preferencia Baja: " + preferenciaBaja.getNumEntradas());
                }
                case "2" -> {
                    System.out.println("");
                    System.out.println("---------------");
                    System.out.println("PRECIO DE ENTRADAS");
                    System.out.println("---------------");
                    System.out.println("·Precio Entradas Fondo Sur: " + fondoSur.getPrecioEntradas() + " euros");
                    System.out.println("·Precio Entradas Fondo Norte: " + fondoNorte.getPrecioEntradas() + " euros");
                    System.out.println("·Precio Entradas Preferencia Alta: " + preferenciaAlta.getPrecioEntradas() + " euros");
                    System.out.println("·Precio Entradas Preferencia Baja: " + preferenciaBaja.getPrecioEntradas() + " euros");
                }
                case "3" -> {
                    System.out.println("");
                    System.out.println("------------------");
                    System.out.println("COMPRA DE ENTRADAS");
                    System.out.println("------------------");
                    System.out.println("De qué zona quieres comprar tus entradas?");
                    sc.nextLine(); // Para el tratamiento del enter
                    respuestaZona = sc.nextLine();
                    if (!respuestaZona.equals("")) { // Para el tratamiento del enter
                        while (!"Fondo Sur".equalsIgnoreCase(respuestaZona) && !"Fondo Norte".equalsIgnoreCase(respuestaZona) && !"Preferencia Alta".equalsIgnoreCase(respuestaZona) && !"Preferencia Baja".equalsIgnoreCase(respuestaZona)) {
                            System.out.println("Introduce una zona válida");
                            respuestaZona = sc.nextLine();
                        }
                    }
                    System.out.println("Cuántas entradas quieres comprar?");
                    if ("Fondo Sur".equalsIgnoreCase(respuestaZona)) { // Si la respuesta es fondo sur
                        respuestaCompraEntradas = sc.nextLine();
                        if (esSoloNumeros(respuestaCompraEntradas)) { // Para tratar el error de si es o no un entero
                            respuestaCompraEntradasInt = Integer.parseInt(respuestaCompraEntradas);
                            if (fondoSur.getNumEntradas() < respuestaCompraEntradasInt) { // Si hay o no suficientes entradas
                                System.out.println("No hay entradas suficientes para las solicitadas.");
                            } else {
                                System.out.println("Has de pagar " + fondoSur.venderEntradas(respuestaCompraEntradasInt) + "€");
                            }
                        } else {
                            System.out.println("\nIntroduce un número entero positivo");
                        }
                    } else if ("Fondo Norte".equalsIgnoreCase(respuestaZona)) { // Si la respuesta es fondo norte
                        respuestaCompraEntradas = sc.nextLine();
                        if (esSoloNumeros(respuestaCompraEntradas)) { // Para tratar el error de si es o no un entero
                            respuestaCompraEntradasInt = Integer.parseInt(respuestaCompraEntradas);
                            if (fondoNorte.getNumEntradas() < respuestaCompraEntradasInt) { // Si hay o no suficientes entradas
                                System.out.println("No hay entradas suficientes para las solicitadas.");
                            } else {
                                System.out.println("Has de pagar " + fondoNorte.venderEntradas(respuestaCompraEntradasInt) + "€");
                            }
                        } else {
                            System.out.println("\nIntroduce un número entero positivo");
                        }
                    } else if ("Preferencia Alta".equalsIgnoreCase(respuestaZona)) { // Si la respuesta es preferencia alta
                        respuestaCompraEntradas = sc.nextLine();
                        if (esSoloNumeros(respuestaCompraEntradas)) { // Para tratar el error de si es o no un entero
                            respuestaCompraEntradasInt = Integer.parseInt(respuestaCompraEntradas);
                            if (preferenciaAlta.getNumEntradas() < respuestaCompraEntradasInt) { // Si hay o no suficientes entradas
                                System.out.println("No hay entradas suficientes para las solicitadas.");
                            } else {
                                System.out.println("Has de pagar " + preferenciaAlta.venderEntradas(respuestaCompraEntradasInt) + "€");
                            }
                        } else {
                            System.out.println("\nIntroduce un número entero positivo");
                        }
                    } else if ("Preferencia Baja".equalsIgnoreCase(respuestaZona)) { // Si la respuesta es preferencia baja
                        respuestaCompraEntradas = sc.nextLine();
                        if (esSoloNumeros(respuestaCompraEntradas)) { // Para tratar el error de si es o no un entero
                            respuestaCompraEntradasInt = Integer.parseInt(respuestaCompraEntradas);
                            if (preferenciaBaja.getNumEntradas() < respuestaCompraEntradasInt) { // Si hay o no suficientes entradas
                                System.out.println("No hay entradas suficientes para las solicitadas.");
                            } else {
                                System.out.println("Has de pagar " + preferenciaBaja.venderEntradas(respuestaCompraEntradasInt) + "€");
                            }
                        } else {
                            System.out.println("\nIntroduce un número entero positivo");
                        }

                    }
                }
                case "4" -> {
                    interruptor = false;
                }
                default -> {
                    System.err.println("Introduce un número válido");
                }
            }
        }
        sc.close(); // Cierro el scanner

    }

    public static boolean esSoloNumeros(String input) {
        return input.matches("\\d+");
    }

}
