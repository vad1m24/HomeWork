package lesson6;

public class Dog extends Animal {

    private int limitRun = 500;
    private int limitSwim = 10;
    public static int counterDog;

    public Dog(String name) {
        super(name);
        counterDog++;
    }

    public int getCounterDog() {
        return counterDog;
    }

    @Override
    public void swimming(int swim) {
        super.swimming(swim);
        if (swim > limitSwim){
            System.out.printf("%s не может проплыть более %d метров\n", getName(), limitSwim);
        } else {
            System.out.printf("%s пробежал %d метров\n", getName(), swim);
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

