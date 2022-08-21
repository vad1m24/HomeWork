package lesson8;

public class Wall implements  Obstacle {

    private String name;

    public Wall(String name) {
        this.name = name;
    }

    @Override
    public boolean runnable() {
        return false;
    }

    @Override
    public boolean jumpable() {
        return true;
    }
}
