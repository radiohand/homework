package home_work_2.loops;

import java.util.Scanner;

public class Loops4 {

    public static void main(String[] args) {

        long a = 1;
        long b = 3;
        long c = 188;
        long d = -19;
        long e;
        long [] result;

        System.out.println("Программа умножает 1 на заданное число до наступления переполнения.");

        result = multiply(a,b);
        System.out.println("При умножении на " + b + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        result = multiply(a,c);
        System.out.println("При умножении на " + c + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        result = multiply(a,d);
        System.out.println("При умножении на " + d + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);

        System.out.println("Введите свой 2-й множитель: ");
        e = getUserLong();
        result = multiply(a,e);
        System.out.println("При умножении на " + e + ":");
        System.out.println("До переполнения: " + result[0]);
        System.out.println("После переполнения: " + result[1]);
    }

    /**
     * умножать число №1 на число №2 до наступления переполнения, получить значение до и после переполнения
     * @param a число №1
     * @param b число №2
     * @return массив: в ячейке 1 - значение до переполнения;
     * в ячейке 2 - значение до переполнения.
     */
    public static long [] multiply (long a, long b) {

        long [] result = new long [2];

        if (b == 0 || a == 0 || (a == 1 && b == 1)) {
            System.out.println("Переполнение не наступит");
            return result;
        }

        while (true) {
            a *= b;
            if ((Math.abs(a) > Math.abs(Long.MAX_VALUE / b))) {
                result [0] = a;
                break;
            }
        }
        result [1] = a*b;
        return result;
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


