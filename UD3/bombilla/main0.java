package ejercicios_ud3_2.bombilla;

import java.util.ArrayList;
import java.util.Scanner;

public class main0 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        bombilla b1 = new bombilla(false);
        bombilla b2 = new bombilla(false);
        bombilla b3 = new bombilla(false);
        bombilla b4 = new bombilla(false);
        bombilla b5 = new bombilla(false);
        ArrayList <bombilla> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Meto todas las bombillas en el ArrayList
        array.add(b1);
        array.add(b2);
        array.add(b3);
        array.add(b4);
        array.add(b5);

    }

    // Zona de métodos
    public void interruptorGeneral(ArrayList <bombilla> array) {
        // Zona de declaración de variables
        Scanner sc = new Scanner(System.in);
        String respuesta;
        
        System.out.println("Escribe 'apagar' o 'encender' en función de lo que quieras hacer con las bombillas");
        respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("encender")) {
            for (int i = 0; i < array.size(); i++) {
                array.get(i).setEncendida(true);
            }
        } else if (respuesta.equalsIgnoreCase("apagar")) {
            for (int i = 0; i < array.size(); i++) {
                array.get(i).setEncendida(false);
            }
        } else {
            System.out.println("Respuesta introducida erróneamente");
        }
    }
}
