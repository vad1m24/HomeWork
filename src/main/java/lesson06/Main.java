package lesson06;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok", 200, 0, false);
        Dog dog = new Dog("Barbos", 500, 10, true);

        System.out.println(cat.toString());
        cat.running(100);
        System.out.println("-----------------");
        cat.swimming(5);
        System.out.println();
        System.out.println(dog.toString());
        dog.running(450);
        System.out.println("-----------------");
        dog.swimming(5);
        System.out.println();

        System.out.printf("Количество собак %d\n", Dog.counterDog);
        System.out.printf("Количество котов %d\n", Cat.counterCat);
    }
}
