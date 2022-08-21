package lesson8;

import static lesson8.Obstacle.duration;
import static lesson8.Obstacle.height;

public class Person implements Heroes {

    private String name;
    private int limitRun;
    private int limitJump;

    public Person(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(Runnable runnable) {
        if (runnable.runnable()) {
            if (duration <= limitRun) {
                System.out.println(name + " says: I can run. Yahoo!!!");
            } else {
                System.out.println(name + " says: Ouch, I can't do thi sh*t...");
            }
        }
    }

    @Override
    public void jump(Jumpable jumpable) {
        if (jumpable.jumpable()) {
            if (height <= limitJump) {
                System.out.println(name + " says: I can jump. Yahoo!!!");
            }
        } else {
            System.out.println(name + " says: Are you kidding me? It's impossible!");
        }
    }
}

