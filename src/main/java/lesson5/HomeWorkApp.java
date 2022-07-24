package lesson5;

public class HomeWorkApp {


    public static void main(String[] args) {
        Emploee person1 = new Emploee("Sidorov Andrei Anatolevich", "director", "sidorovAA@gmail.com", "6660044", 1950, 57);
        Emploee person2 = new Emploee("Gichan Sergei Serggeevich", "mechanic", "s.gichan@gmail.com", "2559578", 700, 40);
        Emploee person3 = new Emploee("Petrov Ivan Ivanovich", "manager", "sidorovAA@gmail.com", "4596781", 950, 28);
        Emploee person4 = new Emploee("Zlidnja Tomara Fedorovna", "accountant", "nununu@mail.ru", "4862589", 630, 69);
        Emploee person5 = new Emploee("Gulena Alena Pavlovna", "secretary", "ljalka@yandex.ru", "6660044", 800, 22);

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
        person4.printInfo();
        person5.printInfo();

        Emploee[] emplArr = new Emploee[5];
        emplArr[0] = person1;
        emplArr[1] = person2;
        emplArr[2] = person3;
        emplArr[3] = person4;
        emplArr[4] = person5;

        findAge(emplArr);
    }


    public static void findAge(Emploee[] emplArr) {
        for (int i = 0; i < emplArr.length; i++) {
            if (emplArr[i].getAge() >= 40) {
                emplArr[i].printInfo();
            }
        }
    }
}
