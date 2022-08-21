package lesson6;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok");
        Cat cat1 = new Cat("Snezok");

        Dog dog = new Dog("Barbos");
        Dog dog2 = new Dog("Tuzik");


        System.out.println(cat.toString());
        cat.running(100);
        System.out.println("-----------------");
        cat.swimming(5);
        System.out.println();
        System.out.println(dog.toString());
        dog.running(4);
        System.out.println("-----------------");
        dog.swimming(500);
        System.out.println();

        System.out.printf("Количество собак %d\n", Dog.counterDog);
        System.out.printf("Количество котов %d\n", Cat.counterCat);
    }

}
