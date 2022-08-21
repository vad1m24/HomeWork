package lesson13;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static final int CARS_COUNT = 4;
    public static CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT);
    public static CountDownLatch startLatch = new CountDownLatch(CARS_COUNT);
    public static CountDownLatch finishPoint = new CountDownLatch(CARS_COUNT);
    public static ArrayList<String> winners = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
            new Thread(cars[i]).start();
        }
        try {
            startLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        try {
            finishPoint.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Победитель" + winners.get(0));
    }
}










