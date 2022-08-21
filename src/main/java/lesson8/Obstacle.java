package lesson8;

public interface Obstacle extends Runnable, Jumpable {

    public int duration = 300;
    public int height = 20;
}
