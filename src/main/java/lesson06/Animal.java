package lesson06;

public class Animal {

    private String name;
    private int limitRun;
    private int limitSwim;
    private boolean canSwim;

    public Animal(String name, int limitRun, int limitSwim, boolean canSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", limitRun=" + limitRun +
                ", limitSwim=" + limitSwim +
                ", canSwim=" + canSwim +
                '}';
    }

    public void running(int run) {
        System.out.printf("%s пытается пробежать %d метров\n", name, run);
        if (run > limitRun) {
            System.out.printf("%s не может пробежать более %d метров\n", getName(), limitRun);
        } else {
            System.out.printf("%s пробежал %d метров\n", getName(), run);
        }
    }

    public void swimming(int swim) {
        System.out.printf("%s пытается проплыть %d метров\n", name, swim);
        if (!canSwim) {
            System.out.printf("%s не умеет плавать\n", getName());
        } else {
            if (swim > limitSwim) {
                System.out.printf("%s не может проплыть более %d метров\n", getName(), limitSwim);
            } else {
                System.out.printf("%s проплыл %d метров\n", getName(), swim);
            }
        }
    }
}
