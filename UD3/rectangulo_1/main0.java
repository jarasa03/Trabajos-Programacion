package ejercicios_ud3_1.rectangulo_1;

public class main0 {

    public static void main(String args[]) {

        rectangulo r1 = new rectangulo(0, 0, 5, 5);
        rectangulo r2 = new rectangulo(7, 9, 2, 3);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Perímetro de r1: " + r1.perimetro());
        System.out.println("Perímetro de r2: " + r2.perimetro());

        System.out.println("Área de r1: " + r1.area());
        System.out.println("Área de r2: " + r2.area());

        System.out.println("Ahora modifico los rectángulos:");
        r1.setX1(8);
        r1.setY2(12);
        r2.setY1(-4);
        r2.setX2(0);

        System.out.println("r1 modificado: " + r1);
        System.out.println("r2 modificado: " + r2);

        System.out.println("Perímetro de r1 modificado: " + r1.perimetro());
        System.out.println("Perímetro de r2 modificado: " + r2.perimetro());

        System.out.println("Área de r1 modificado: " + r1.area());
        System.out.println("Área de r2 modificado: " + r2.area());

    }

}
