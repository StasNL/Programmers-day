import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("12.09." + year + "."); //выводим результат для високосного года
        } else {
            System.out.println("13.09." + year + "."); //выводим результат для невисокосного года
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 400 == 0) {  //Проверяем, является ли год кратным 400
            return true ;
        } else if (year % 100 == 0) { //Проверяем, является ли год кратным 100
            return false;
        } else if (year % 4 == 0) { //Проверяем, является ли год кратным 4
            return true;
        } else {
            return false;
        }
    }
}
