package lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    private static Scanner in = new Scanner(System.in);

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        } else {
            System.out.println("В тарелке осталось " + food + " грамм еды - коту недостаточно");
            return false;
        }
    }

    public void printInfo() {
        System.out.println("В тарелке осталось " + food + " грамм еды");
    }

    public int someFood;

    public int addFood() {
        System.out.println("Пора насыпать корма этим товарищам.");
        System.out.println("Введите вес добавляемой порции:");
        someFood = in.nextInt();
        food = getFood() + someFood;
        return food;
    }
}
