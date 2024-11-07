package ejercicio_eval1;

/**
 * ENUNCIADO: El siguiente programa debe imprimir un triángulo rectángulo por
 * pantalla utilizandeo la altura y el carácter dados. Encuentra los fallos en
 * el siguiente código.
 *
 *  *public class MyClass {
 *
 *  *public static void main(String args[]) { int altura = 10; char caracter =
 * '*'
 *
 *  *int veces = 1; for (int i=1;i<altura;i++) { for (int j=0;j<veces;j++) {
 * System.out.print(caracter); } veces = veces*3; } } }
 *
 */
public class ej1 {

    public static void main(String args[]) {
        int altura = 10;
        char caracter = '*';

        int veces = 1;
        for (int i = 1; i < altura; i++) {
            for (int j = 0; j < veces; j++) {

                System.out.print(caracter);
            }
            System.out.println();

            veces = veces + 2;
        }
    }
}
