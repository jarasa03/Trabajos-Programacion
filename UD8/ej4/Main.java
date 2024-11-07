package ejercicios_ud8.ej4;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro("Manuel", "04/05/2003", "081237", "300", "Pepito");
        Revista r1 = new Revista("24", "04/12/2021", "039204", "35", "Más que Coches");

        System.out.println(l1);
        System.out.println(r1);

        System.out.println(l1.anyoPublicacion);
        System.out.println(r1.anyoPublicacion);
        System.out.println(l1.codigo);
        System.out.println(r1.codigo);
        System.out.println(l1.numPag);
        System.out.println(r1.numPag);
        System.out.println(l1.titulo);
        System.out.println(r1.titulo);

    }
}
