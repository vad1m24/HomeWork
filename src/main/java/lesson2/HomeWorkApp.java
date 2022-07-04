package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sumOfTwoNumbers(5, 7));
        numberPositiveOrNegative(10);
        System.out.println(number2(-3));
        writeStringNTimes("Спасибо!", 5);
        godVisokosnij(2024);
        System.out.println(godVisokosnij123(1768));
    }

    //Task 1
    public static boolean sumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20) ? true : false;
    }

    //Task 2
    public static int numberPositiveOrNegative(int a) {
        System.out.println(a + (a >= 0 ? " является положительным числом" : " является отрицательным числом"));
        return a;
    }

    //Task 3
    public static boolean number2(int a) {
        return a < 0 ? true : false;
    }

    //Task 4
    public static void writeStringNTimes(String str, int numbers) {
        do {
            System.out.println(str);
            numbers--;
        } while (numbers > 0);
    }

    //Task 5
    public static boolean godVisokosnij(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            System.out.println("Год не високосный");
            return false;
        } else {
            System.out.println("Год високосный");
            return true;
        }
    }

    //Task 5.2
    public static boolean godVisokosnij123(int year) {
        return ((!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) ? false : true);
    }
}
