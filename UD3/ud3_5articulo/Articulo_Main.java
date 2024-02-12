package ud3_5articulo;

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

public class Articulo_Main {
	
	public static void main(String[] args) {
		
		// Zona de instanciado de objetos.
		Articulo articulo1 = new Articulo();
		
		articulo1.setNombre("Pijama");
		articulo1.setPrecioSinIVA(20);
		articulo1.setCuantosQuedan(5);
		
		// Imprimo lo solicitado.
		System.out.println(articulo1.getNombre() + " - Precio: " + articulo1.getPrecioSinIVA() + " - PVP: " + articulo1.pvp());
	}

}
