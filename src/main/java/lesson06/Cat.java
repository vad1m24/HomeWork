package lesson06;

public class Cat extends Animal {
    public static int counterCat;

    public Cat(String name, int limitRun, int limitSwim, boolean canSwim) {
        super(name, limitRun, limitSwim, canSwim);
        counterCat++;
    }


}


