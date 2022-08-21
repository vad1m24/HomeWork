package lesson6;

public class Cat extends Animal {

    private int limitRun = 200;
    private boolean canSwim = false;
    public static int counterCat;

    public Cat(String name) {
        super(name);
        counterCat++;
    }

    @Override
    public void swimming(int swim) {
        super.swimming(swim);
        if (!canSwim) {
            System.out.printf("%s не умеет плавать\n", getName());
        }
    }

    @Override
    public void running(int run) {
        super.running(run);
        if (run > limitRun){
            System.out.printf("%s не может пробежать более %d метров\n", getName(), limitRun);
        } else {
            System.out.printf("%s пробежал %d метров\n", getName(), run);
        }
    }
}


