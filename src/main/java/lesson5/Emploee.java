package lesson5;

public class Emploee {
    private final String fullName;
    private final  String jobTitle;
    private final  String email;
    private final  String phoneNumber;
    private final  int salary;
    private final  int age;

    public Emploee(String fullName, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("\n  Выписка по заработной плате работников компании ''ООО Огонёк'' \nСотрудник %s, возраст %s, занимающий должность %s (электронный адрес %s, телефон %s), за июнь 2022 получит %s$ (до вычета налогов и сборов)", fullName, age, jobTitle, email, phoneNumber, salary);

    }

    public int getAge() {
        return age;
    }


}