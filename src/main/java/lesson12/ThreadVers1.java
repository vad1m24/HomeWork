package lesson12;

import static lesson12.Main.*;

public class ThreadVers1 extends Thread {

    @Override
    public void run() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        newValues(arr);

        long timeVers1 = System.currentTimeMillis() - a;

        System.out.println("Время проведения операции " + ThreadVers1.class.getSimpleName()  + " составило: " + timeVers1);
    }
}
