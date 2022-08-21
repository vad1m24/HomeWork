package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Кот " + name + " решил подкрепиться");
        boolean status = plate.decreaseFood(appetite);
        if (status) {
            satiety = true;
            System.out.println("Кот " + name + " наелся");
        } else {
            satiety = false;
            System.out.println("Коту " + name + " еды не хватит, он гордо уходит мстить в тапки");
        }

    }
}
