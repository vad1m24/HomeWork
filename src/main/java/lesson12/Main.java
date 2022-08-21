package lesson12;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        ThreadVers1 vers1 = new ThreadVers1();
        vers1.start();

        ThreadVers2 vers2 = new ThreadVers2();
        vers2.start();

    }

    public static float[] newValues(float[] arr) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        return arr;
    }

}