package home_work_2.loops.runners;

import home_work_2.loops.Loops5;

import java.util.Random;
import java.util.Scanner;

public class Loops5Main {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {

            System.out.println("Выберите задачу: \n" +
                    "1) Наибольшая цифра случайного числа; \n" +
                    "2) Вероятность четных случайных чисел в выборке; \n" +
                    "3) Посчитать четные и нечетные цифры числа; \n" +
                    "4) Ряд Фибоначчи; \n" +
                    "5) Ряд чисел в диапазоне с шагом; \n" +
                    "6) Переворот чисел; \n" +
                    "7) Выйти из программы.");

            short choice = getUserPositiveShort();

            switch (choice) {
                case 1:
                    long number1 = random.nextLong();
                    if (number1 < 0) {
                        number1 *= (-1);
                    }
                    System.out.println("1) Наибольшая цифра случайного числа: " + number1 + " это " + Loops5.maxDigit(number1));
                    break;

                case 2:
                    System.out.println("2) Вероятность появления случайного четного числа в выборке");
                    System.out.println("Введите размер выборки: ");
                    short sampleSize = getUserPositiveShort();
                    System.out.println("Количество четных чисел в выборке из " +
                            sampleSize + " чисел, равно: " + Loops5.parityProb(sampleSize) + "%");
                    break;

                case 3:
                    long number2 = random.nextLong();
                    int[] counter = Loops5.digitsOfNum(number2);
                    System.out.println("3) Случайное число " + number2 + " содержит " + counter[0]
                            + " четных цифр, и " + counter[1] + " нечетных");
                    break;

                case 4:
                    System.out.println("4) Ряд Фибоначчи из n элементов.");
                    System.out.println("Введите количество элементов ряда: ");
                    short seriesSize = getUserPositiveShort();
                    System.out.println("Ряд Фибоначчи из " + seriesSize + " элементов:");
                    System.out.println(Loops5.fibonacci(seriesSize));
                    break;

                case 5:
                    System.out.println("5) Ряд чисел в диапазоне с шагом.");
                    System.out.println("Введите начало диапазона: ");
                    short begin = getUserPositiveShort();
                    System.out.println("Введите окончание диапазона: ");
                    short end = getUserPositiveShort();
                    System.out.println("Введите шаг: ");
                    short step = getUserPositiveShort();
                    System.out.println("Получился ряд: ");
                    System.out.println(Loops5.stepSeries(begin, end, step));
                    break;

                case 6:
                    System.out.println("6) Переворот чисел.");
                    System.out.println("Введите число: ");
                    short number3 = getUserPositiveShort();
                    System.out.println("Инверсия данного числа: ");
                    System.out.println(Loops5.rollNumber(number3));
                    break;

                case 7:
                    return;

                default:
                    System.out.println("Такого пункта нет...(");
                    break;
            }
            System.out.println();
        }
    }

    /**
     * Получить корректное число (short), введенное пользователем через консоль
     * @return положительное число, соответствующее по размеру типу short
     */
    private static short getUserPositiveShort () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        short userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextShort()) {
                userInput = console.nextShort();
                if (userInput >= 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Число должно быть положительным! Повторите ввод.");
                }
            } else {
                System.out.println("Введено не число, или число недопустимого размера! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
