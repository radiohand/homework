package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loops5 {
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
                    System.out.println("1) Наибольшая цифра случайного числа: " + number1 + " это " + maxDigit(number1));
                    break;

                case 2:
                    System.out.println("2) Вероятность появления случайного четного числа в выборке");
                    System.out.println("Введите размер выборки: ");
                    short sampleSize = getUserPositiveShort();
                    System.out.println("Количество четных чисел в выборке из " +
                            sampleSize + " чисел, равно: " + parityProb(sampleSize) + "%");
                    break;

                case 3:
                    long number2 = random.nextLong();
                    int[] counter = digitsOfNum(number2);
                    System.out.println("3) Случайное число " + number2 + " содержит " + counter[0]
                            + " четных цифр, и " + counter[1] + " нечетных");
                    break;

                case 4:
                    System.out.println("4) Ряд Фибоначчи из n элементов.");
                    System.out.println("Введите количество элементов ряда: ");
                    short seriesSize = getUserPositiveShort();
                    System.out.println("Ряд Фибоначчи из " + seriesSize + " элементов:");
                    System.out.println(fibonacci(seriesSize));
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
                    System.out.println(stepSeries(begin, end, step));
                    break;

                case 6:
                    System.out.println("6) Переворот чисел.");
                    System.out.println("Введите число: ");
                    short number3 = getUserPositiveShort();
                    System.out.println("Инверсия данного числа: ");
                    System.out.println(rollNumber(number3));
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
//1
    /**
     * Найти наибольшую цифру в числе
     * @param number число, в котором ищем наибольшую цифру
     * @return наибольшая цифра числа
     */
    public static byte maxDigit (long number) {

        byte maxDigit = 0;

        while (number > 0) {
            if ((number % 10) > maxDigit) {
                maxDigit = (byte) (number % 10);
            }
            number /= 10;
        }
        return maxDigit;
    }
//2
    /**
     * Определить процент четных чисел в выборке псевдослучайных чисел заданного размера
     * @param sampleSize размер выборки
     * @return процент четных чисел
     */
    public static double parityProb (int sampleSize) {

        double count = 0;

        for (int i = 0; i < sampleSize; i++) {
            if ((int)(Math.random()*100)%2 == 0) {
                count++;
            }
        }
        return (count/sampleSize*100);
    }
//3
    /**
     * Определить количество четных и нечетных цифр в заданном числе
     * @param number число, в котором осуществляется поиск цифр
     * @return массив: количество четных цифр в ячейке 0, нечетных в ячейке 1.
     */
    public static int [] digitsOfNum (long number) {

        int [] counter = new int [2];

        while (number > 0) {
            if (number%2 == 0 ) {
                counter[0]++;
            } else counter[1]++;
            number /= 10;
        }
        return counter;
    }
//4
    /**
     * Получить набор чисел, представляющий часть ряда Фибоначчи от начала и до заданного размера
     * @param seriesSize размер ряда
     * @return строка с набором чисел ряда
     */
    public static String fibonacci (int seriesSize) {

        StringBuilder builder = new StringBuilder();

        long f1 = 1;
        long f2 = f1;
        long f3;

        builder.append(f1).append(" ").append(f2);

        for (int i = 2; i < seriesSize; i++) {

            f3 = f1+f2;

            if (f1 > (Long.MAX_VALUE - f2)) {
                builder.append(" Произошло переполнение типа long");
                break;
            }

            builder.append(" ").append(f3);
            f1 = f2;
            f2 = f3;
        }
        return builder.toString();
    }
//5
    /**
     * Получить набор чисел, представляющий числовой ряд с заданными началом, концом, и шагом
     * @param begin начало ряда
     * @param end окончание ряда
     * @param step шаг между элементами
     * @return строка с набором чисел ряда
     */
    public static String stepSeries (int begin, int end, int step) {

        if (begin >= end) {
            return "Ошибка! Отрицательный или нулевой размер диапазона.";
        }

        if (step >= (end-begin)) {
            return "Ошибка! Шаг превышает размер диапазона.";
        }

        StringBuilder builder = new StringBuilder();

        for (int i = begin; i <= end; i+=step) {
            builder.append(i).append(" ");
        }
        return builder.toString();
    }
//6
    /**
     * Получить инверсию заданного числа
     * @param number число, для которого получаем инверсию
     * @return число - инверсия заданного
     */
    public static int rollNumber (int number) {

        int newNumber = 0;

        while (number > 0) {
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }
        return newNumber;
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