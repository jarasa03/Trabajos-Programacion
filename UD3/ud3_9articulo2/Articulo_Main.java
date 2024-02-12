package ud3_9articulo2;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa con una clase llamada Articulo con los siguientes
 * atributos: nombre, precio (sin IVA), iva (siempre será 21 y por tanto no
 * podrá ser modificado desde fuera de la clase) y cuantosQuedan (representa
 * cuantos quedan en el almacén).
 * 
 * En el main de la clase principal instancia un objeto de la clase artículo.
 * Asígnale valores a todos sus atributos (los que quieras) y muestra por
 * pantalla un mensaje del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€”
 * (el PVP es el precio de venta al público, es decir, el precio con IVA).
 * Luego, cambia el precio y vuelve a imprimir el mensaje.
 */

/**
 * ENUNCIADO 2: Añade un constructor con 3 parámetros que asigne valores a
 * nombre, precio y cuantosQuedan. Dicho constructor deberá mostrar un mensaje
 * de error si alguno de los valores nombre, precio o cuantosQuedan no son
 * válidos. ¿Qué condiciones crees que podrían determinar si son válidos o no?
 * Razónalo e implementa el código.
 * 
 * Corrige el main y prueba a crear varios artículos. Introduce algunos con
 * valores incorrectos para comprobar si avisa del error.
 */

import java.util.Scanner;

public class Articulo_Main {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc = new Scanner(System.in);

		// Solicito los datos del artículo.
		System.out.println(
				"Introduce el nombre del artículo, su precio sin IVA y cuantos quedan separado por la tecla Enter.");

		// Zona de instanciado de objetos.
		Articulo articulo1 = new Articulo(sc.nextLine(), sc.nextInt(), sc.nextInt());
		sc.close();

		// Imprimo lo solicitado.
		System.out.println(articulo1.getNombre() + " - Precio: " + articulo1.getPrecioSinIVA() + "€ - PVP: "
				+ articulo1.pvp() + "€, quedan " + articulo1.getCuantosQuedan() + " unidades.");
	}

}
