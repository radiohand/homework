package home_work_2.loops.runners;

import home_work_2.loops.Loops1;

public class Loops1Main {
    public static void main(String[] args) {

        long number;

        try {
            number = Long.parseLong(args[0]);
            if (number < 0) {
                System.out.println("Число должно быть положительным! Измените аргумент к программе.");
                return;
            }
            System.out.println("Введено число: " + number);
        } catch (NumberFormatException ex1) {
            System.out.println("Введено не число! Измените аргумент к программе.");
            return;
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Отсутствует аргумент к программе!");
            return;
        }

        System.out.println("Факториал, рассчитанный через цикл: ");

        long factorial1 = Loops1.loopFactorial(number);

        if (factorial1 == -1) {
            System.out.println(" ...Произошло переполнение в переменной типа long");
        } else {
            System.out.println(" = " + factorial1);
        }

        System.out.println("Факториал, рассчитанный через рекурсивный метод: ");

        try {
            long factorial2 = Loops1.recursionFactorial(number);

            if (factorial2 == 0) {
                System.out.println(" ...Произошло переполнение в переменной типа long");
            } else {
                System.out.println(" = " + factorial2);
            }
        } catch (StackOverflowError err) {
            System.out.println("Ошибка! Произошло переполнение стека");
        }
    }
}
