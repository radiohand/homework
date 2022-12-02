package home_work_2.loops.runners;

import home_work_2.loops.Loops4;

import java.util.Scanner;

public class Loops4Main {

    public static void main(String[] args) {

        long a = 1;
        long b = 3;
        long c = 188;
        long d = -19;
        long e;
        long [] result;

        System.out.println("Программа умножает 1 на заданное число до наступления переполнения.");

        result = Loops4.multiply(a,b);
        System.out.println("При умножении на " + b + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        result = Loops4.multiply(a,c);
        System.out.println("При умножении на " + c + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        result = Loops4.multiply(a,d);
        System.out.println("При умножении на " + d + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        System.out.println("Введите свой 2-й множитель: ");
        e = getUserLong();
        result = Loops4.multiply(a,e);
        System.out.println("При умножении на " + e + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);
    }

    /**
     * Получить корректное число (long), введенное пользователем через консоль
     * @return чмсло, соответствующее типу long
     */
    private static long  getUserLong () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        long userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextLong()) {
                userInput = console.nextLong();
                isInputCorrect = true;
            } else {
                System.out.println("Введено недопустимое значение! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
