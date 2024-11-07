package ejercicios_ud6;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        String[] array = new String[diccionario.size()];
        int contador = 0;
        int contador2 = 0;

        diccionario.put("casa", "house");
        diccionario.put("pelota", "ball");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("ratón", "mouse");
        diccionario.put("teclado", "keyboard");
        diccionario.put("auriculares", "headphones");
        diccionario.put("ordenador", "personal computer");
        diccionario.put("portátil", "laptop");
        diccionario.put("pantalla", "screen");
        diccionario.put("móvil", "phone");
        diccionario.put("cable", "cable");
        diccionario.put("reloj", "watch");
        diccionario.put("cargador", "charger");
        diccionario.put("pelo", "hair");
        diccionario.put("rubio", "blond");
        diccionario.put("tecla", "key");
        diccionario.put("altavoz", "speaker");
        diccionario.put("micrófono", "microphone");
        diccionario.put("ventana", "window");

        for (String key : diccionario.keySet()) {
            System.out.println("Introduce la traducción de: " + key);
            respuesta = sc.nextLine();
            if (respuesta.equals(diccionario.get(key))) {
                array[contador] = "CORRECTA";
            } else {
                array[contador] = "INCORRECTA";
            }
            contador++;
        }

        sc.close();

        System.out.println("Tus respuestas correctas e incorrectas han sido: ");

        for (String key : diccionario.keySet()) {
            System.out.println(key + " traducción correcta: " + diccionario.get(key) + " // Lo pusiste de manera " + array[contador2]);
            contador2++;
        }

    }

}
