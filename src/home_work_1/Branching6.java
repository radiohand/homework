package home_work_1;

import java.util.Scanner;

public class Branching6 {

    public static void main(String[] args) {

        System.out.println("Введите год для проверки: ");
        int year = getUserInput ();

        if (isLeapYear(year)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    /**
     * Определить является ли год високосным
     * @param year год
     * @return true, если високосный, иначе - false
     */
    public static boolean isLeapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return (year % 400 == 0);
            } else return true;
        }
        return false;
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем положительное число, соответствующее типу int
     */
    public static int getUserInput() {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                if (userInput > 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Значение в недопустимом диапазоне. Повторите ввод!");
                }
            } else {
                System.out.println("Недопустимое значение. Повторите ввод!");
                console.next();
            }
        }
        return userInput;
    }
}