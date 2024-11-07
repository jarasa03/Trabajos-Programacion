package libreria_ud6;

import java.util.ArrayList;

public class arraylist {

    /**
     *
     * @param tamanyo Tamaño del arraylist
     * @param min Valor minimo
     * @param max Valor maximo
     * @return ArrayList<Integer> con tamaño "tamanyo" con numeros con minimo y
     */
    public static ArrayList<Integer> generaArrayListInt(int tamanyo, int min, int max) {
        ArrayList<Integer> arraylist = new ArrayList<>(tamanyo);

        for (int i = 0; i < arraylist.size(); i++) {
            int randomNum = (int) (Math.random() * (max - min + 1)) + min;
            arraylist.add(randomNum);
        }
        return arraylist;
    }

    /**
     *
     * @param arraylist
     * @return Numero minimo del arraylist
     *
     */
    public static int minimoArrayListInt(ArrayList<Integer> arraylist) {
        int min = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) < min) {
                min = arraylist.get(i);
            }
        }
        return min;
    }

    /**
     *
     * @param arraylist ArrayList<Integer> con los elementos a buscar
     * @return Numero maximo del arraylist
     */
    public static int maximoArrayListInt(ArrayList<Integer> arraylist) {
        int max = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) > max) {
                max = arraylist.get(i);
            }
        }
        return max;
    }

    /**
     *
     * @param arraylist ArrayList<Integer> con los elementos a sumar
     * @return Suma de los elementos de la lista
     */
    public static int mediaArrayListInt(ArrayList<Integer> arraylist) {
        int media = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            media += arraylist.get(i);
        }
        return media / arraylist.size();
    }

    /**
     *
     * @param arraylist ArrayList<Integer> con los elementos a buscar
     * @param numero Numero a buscar
     * @return Si el numero esta o no en el arraylist
     */
    public static boolean estaEnArrayListInt(ArrayList<Integer> arraylist, int numero) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) == numero) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param arraylist ArrayList<Integer> con los elementos a buscar
     * @param numero Numero a buscar
     * @return Posición del numero en la lista
     */
    public static int posicionEnArrayListInt(ArrayList<Integer> arraylist, int numero) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) == numero) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param arraylist ArrayList<Integer> con los elementos a invertir
     * @return ArrayList<Integer> con los elementos de la lista invertida
     */
    public static ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> arraylist) {
        ArrayList<Integer> voltea = new ArrayList<>(arraylist.size());
        for (int i = arraylist.size() - 1; i >= 0; i--) {
            voltea.add(arraylist.get(i));
        }
        return voltea;
    }

}
