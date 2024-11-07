package ejercicios_ud8.ej1;

public class Linea {

    // Zona de declaración de variables
    Punto punto1;
    Punto punto2;
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;

    // Constructor
    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.x1 = punto1.getX();
        this.y1 = punto1.getY();
        this.x2 = punto2.getX();
        this.y2 = punto2.getY();
    }

    // Otro constructor
    public Linea(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Getters & Setters
    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public double longitudLinea() {
        return (Math.round((Math.sqrt(Math.pow((double) (this.x2 - this.x1), 2) + Math.pow((double) (this.y2 - this.y1), 2))) * 100)) / 100.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linea{");
        sb.append("x1=").append(x1);
        sb.append(", x2=").append(x2);
        sb.append(", y1=").append(y1);
        sb.append(", y2=").append(y2);
        sb.append('}');
        return sb.toString();
    }

}
