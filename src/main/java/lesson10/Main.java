package lesson10;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange();
        Orange [] arrOranges = new Orange[]{orange, new Orange()};


        Apple apple = new Apple();
        Apple [] arrApple = new Apple[]{apple, new Apple()};

        Box<Orange> oranges = new Box<>(arrOranges);
        System.out.println(oranges.getWeightBox(orange));

        Box<Apple> apples = new Box<>(arrApple);
        System.out.println(apples.getWeightBox(apple));

       oranges.compare(apples);
        System.out.println(oranges.compare(apples));
        System.out.println(oranges.compare(oranges));
        }
    }

