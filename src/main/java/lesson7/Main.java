package lesson7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(10);
        plate.printInfo();

        Cat pushok = new Cat("Pushok", 9);
        Cat snezok = new Cat("Snezok", 4);
        Cat rizik = new Cat("Rizik", 19);
        Cat vaksa = new Cat("Vaksa", 30);
        Cat murzik = new Cat("Murzik", 14);

/*        while (plate.getFood() > 0) {
            pushok.eat(plate);
            if (!pushok.isSatiety()) break;
            plate.printInfo();
            snezok.eat(plate);
            if (!pushok.isSatiety()) break;
            plate.printInfo();
            rizik.eat(plate);
            if (!pushok.isSatiety()) break;
            plate.printInfo();
            vaksa.eat(plate);
            if (!pushok.isSatiety()) break;
            plate.printInfo();
            murzik.eat(plate);
            if (!pushok.isSatiety()) break;
            plate.printInfo();
        }*/

        Cat[] arrCats = new Cat[5];
        arrCats[0] = pushok;
        arrCats[1] = snezok;
        arrCats[2] = rizik;
        arrCats[3] = vaksa;
        arrCats[4] = murzik;


        while (plate.getFood() > 0) {
            for (int i = 0; i < arrCats.length; i++) {
                arrCats[i].setSatiety(false);
            }
            System.out.println("Настал новый день. Коты проголодались");

            plate.addFood();

            for (int i = 0; i < arrCats.length; i++) {
                arrCats[i].eat(plate);
                plate.printInfo();
            }
            System.out.println("Коты поели!");
        }
    }
}