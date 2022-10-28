package home_work_1;

import java.util.Scanner;

public class MathExperiment {

    public static void main(String[] args) {

        System.out.println("Программа производит расчет числа π по формуле Сриниваса Рамануджана" +
                "\nпутем разложения в ряд Тейлора. Затем, используя рассчитанное число π," +
                "\nнаходит объем шара с произвольным диаметром." +
                "\nКоличество элементов ряда влияет на точность вычисления π");

        System.out.println("Введите количество элементов ряда (от 1 до 34): ");

        int k = getUserInput ();

        double pi = findPI (k);
        System.out.println("Рассчитанное число π равно: " + pi);
        System.out.println("Погрешность относительно константы: " + (Math.PI-pi));

        int randRadius = (int) (Math.random() * 100);
        System.out.println("Объем шара c радиусом " + randRadius +  " равен: " + getVolume (randRadius, pi));
    }

    /**
     * Поулчить число π, рассчитанное по формуле Рамануджана.
     * @param k количество элементов ряда Тейлора - нужно для вычисления числа π.
     * @return значение типа double, соответствующее рассчитанному числу π.
     */
    public static double findPI (int k) {

        double firstPart = (2 * Math.sqrt(2)) / 9801;
        double secondPart = 0;

        for (int i = 0; i < k; i++) {
            secondPart += getFactorial(4*i) * (1103 + 26390 * i) / (Math.pow (getFactorial(i), 4) * Math.pow(396, 4*i));
        }

        return 1/(firstPart*secondPart);
    }

    /**
     * Получить факториал введенного числа.
     * @param num число, факториал которого необходимо получить
     * @return значение типа int, соответствующее рассчитанному факториалу.
     */
    public static int getFactorial (int num) {
        if (num == 0) {
            return 1;
        }
        return num * getFactorial(num-1);
        }

    /**
     * Получить объем шара, рассчитанный по заданным параметрам.
     * @param pi число π, используемое в расчете объема шара
     * @param radius радиус шара, используемый в расчете объема.
     * @return значение типа double, соответствующее рессчитанному объему.
     */
    public static double getVolume(int radius, double pi) {
        return 4 / 3 * Math.pow (radius, 3) * pi;
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем число, соответствующее типу int, находящееся в диапазоне от 1 до 34 вкл.
     */
    public static int getUserInput() {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                if (userInput > 0 && userInput <= 34) {
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