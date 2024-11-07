package ejercicios_ud3_1.rectangulo_1;

public class rectangulo {

    // Zona de declaración de variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor
    public rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // Getters y setters
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("rectangulo{");
        sb.append("x1=").append(x1);
        sb.append(", y1=").append(y1);
        sb.append(", x2=").append(x2);
        sb.append(", y2=").append(y2);
        sb.append('}');
        return sb.toString();
    }

    // Zona de métodos
    public int perimetro() { // Cálculo del perímetro

        int lado1 = Math.abs(x2 - x1);
        int lado2 = Math.abs(y2 - y1);
        int perimetro = lado1 * 2 + lado2 * 2;

        return perimetro;

    }

    public int area() { // Cálculo del área

        int lado1 = Math.abs(x2 - x1);
        int lado2 = Math.abs(y2 - y1);
        int area = lado1 * lado2;
        return area;
    }
}
