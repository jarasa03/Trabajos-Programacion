package ejercicios_ud6;

import java.util.HashMap;

public class ejercicio11 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        HashMap<String, String> mapa = new HashMap<>();
        
        mapa.put("ramon", "123456");
        mapa.put("juan", "123456");
        mapa.put("pedro", "123456");
        mapa.put("maria", "123456");

        
        System.out.println("Introduce tu nombre de usuario");
        String nombre = System.console().readLine();
        
        System.out.println("Introduce tu contraseña");
        String contraseña = System.console().readLine();
        
        for (String key : mapa.keySet()) {
            if (mapa.get(key).equals(contraseña)) {
                if (key.equals(nombre)) {
                    System.out.println("Ha accedido al área restringida");
                }
            } else {
                
                System.out.println("No tienes acceso a esta área, usuario incorrecta");
            }
        }
    }
    
}
