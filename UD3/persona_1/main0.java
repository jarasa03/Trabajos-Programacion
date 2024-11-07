package ejercicios_ud3_1.persona_1;

import java.util.Scanner;

public class main0 {

    public static void main(String args[]) {

        // Zona de declaración de variables
        String nombre;
        String apellidos;
        int edad;
        String dni;
        Scanner sc = new Scanner(System.in);

        System.out.println("Solicito los datos de ambas persona a crear");

        System.out.println("Introduce los datos de la primera persona");
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        edad = sc.nextInt();
        System.out.println("Introduce el dni");
        dni = sc.next();

        persona p1 = new persona(nombre, apellidos, edad, dni);

        System.out.println("Introduce los datos de la segunda persona");
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        edad = sc.nextInt();
        System.out.println("Introduce el dni");
        dni = sc.next();

        sc.close();

        persona p2 = new persona(nombre, apellidos, edad, dni);

        System.out.println(p1);
        System.out.println(p2);
    }

}
