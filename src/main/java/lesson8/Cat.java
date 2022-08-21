package lesson8;

import static lesson8.Obstacle.duration;
import static lesson8.Obstacle.height;

public class Cat implements Heroes {

    private String name;
    private int limitRun;
    private int limitJump;

    public Cat(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(Runnable runnable) {
        if (runnable.runnable()) {
            if (duration <= limitRun) {
                System.out.println(name + " says: Meow");
            } else {
                System.out.println(name + " says: FOO");
            }
        }
    }

    @Override
    public void jump(Jumpable jumpable) {
        if (jumpable.jumpable()) {
            if (height <= limitJump) {
                System.out.println(name + " says: Meow");
            } else {
                System.out.println(name + " says: FOO");
            }
        }
    }
}
