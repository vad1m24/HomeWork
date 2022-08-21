package lesson12;

import static lesson12.Main.*;

public class ThreadVers2 extends Thread {

    @Override
    public void run() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread(){
            @Override
            public void run() {
                float[] array1 = newValues(arr1);
            }
        };

        new Thread(){
            @Override
            public void run() {
                float[] array2 = newValues(arr2);
            }
        };

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, HALF, arr2.length);

        long timeVers2 = System.currentTimeMillis() - a;

        System.out.println("Время проведения операции " + ThreadVers2.class.getSimpleName() + " составило: " + timeVers2);
    }
}
