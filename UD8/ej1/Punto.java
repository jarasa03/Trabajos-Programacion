package ejercicios_ud8.ej1;

public class Punto {

    // Zona de declaración de variables
    private int x;
    private int y;

    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
