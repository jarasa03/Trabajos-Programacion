package ejercicios_ud3_1.punto_1;

public class main0 {

    public static void main(String args[]) {

        punto p1 = new punto(5, 0);
        punto p2 = new punto(10, 10);
        punto p3 = new punto(-3, 7);

        System.out.println("Coordenadas originales:");

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p3: (" + p3.getX() + ", " + p3.getY() + ")");

        p1.setX(p1.getX() + 3);
        p2.setY(p2.getY() - 1);
        p3.setX(p3.getX() + 5);

        System.out.println("Coordenadas cambiadas:");

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p3: (" + p3.getX() + ", " + p3.getY() + ")");
        

    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("main0{");
        sb.append('}');
        return sb.toString();
    }
    
}
