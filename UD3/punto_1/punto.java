package ejercicios_ud3_1.punto_1;

public class punto {

    // Zona de declaración de variables
    private int x;
    private int y;

    // Constructor
    public punto(int x, int y) {

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
