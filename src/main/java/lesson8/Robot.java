package lesson8;

import static lesson8.Obstacle.duration;
import static lesson8.Obstacle.height;

public class Robot implements Heroes {

    private String name;
    private int limitRun;
    private int limitJump;

    public Robot(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(Runnable runnable) {
        if (runnable.runnable()) {
            if (duration <= limitRun) {
                System.out.println(name + " says: I can run very fast. Don't try to go away!");
            } else {
                System.out.println(name + " says: Error, software failure!");
            }
        }
    }

    @Override
    public void jump(Jumpable jumpable) {
        if (jumpable.jumpable()) {
            if (height <= limitJump) {
                System.out.println(name + " says: I can jump very high. Don't try to go away!");
            } else {
                System.out.println(name + " says: Error, software failure!");
            }
        }
    }
}
