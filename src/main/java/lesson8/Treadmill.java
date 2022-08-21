package lesson8;

public class Treadmill implements Obstacle {

    private String name;

    public Treadmill(String name) {
        this.name = name;
    }

    @Override
    public boolean runnable() {
        return true;
    }

    @Override
    public boolean jumpable() {
        return false;
    }
}
