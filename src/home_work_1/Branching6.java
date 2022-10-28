package home_work_1;

import java.util.Scanner;

public class Branching6 {

    public static void main(String[] args) {

        boolean isLeapYear = false;

        System.out.println("Введите год для проверки: ");
        int year = getUserInput ();

        if (year%4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = (year % 400 == 0);
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
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