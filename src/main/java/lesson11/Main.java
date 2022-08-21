package lesson11;

public class Main {
    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson(557895, "Сорокин");
        phoneBook.addPerson(554785, "Сорокин");
        phoneBook.addPerson(512595, "Иванов");
        phoneBook.addPerson(553675, "Сидоров");
        phoneBook.addPerson(598205, "Петров");
        phoneBook.addPerson(551595, "Иванов");
        phoneBook.addPerson(557304, "Бубко");
        phoneBook.addPerson(557896, "Чиж");
        phoneBook.addPerson(557851, "Иванов");
        phoneBook.addPerson(557478, "Сорокин");
        phoneBook.addPerson(556895, "Чиж");

        System.out.println(phoneBook.toString());

        System.out.println(phoneBook.getPerson("Сорокин"));
        System.out.println(phoneBook.getPerson("Сорок"));
    }
}
