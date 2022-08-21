package lesson06;

public class Dog extends Animal {
    public static int counterDog;

    public Dog(String name, int limitRun, int limitSwim, boolean canSwim) {
        super(name, limitRun, limitSwim, canSwim);
        counterDog++;
    }

}

