package lesson13;

import static lesson13.Main.*;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 1000));
            startLatch.countDown();
            System.out.println(this.name + " готов");
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        saveWinnersName();
        finishPoint.countDown();
    }

    private synchronized void saveWinnersName() {
        winners.add(getName());
    }
}
