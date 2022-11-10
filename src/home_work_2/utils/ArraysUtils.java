package home_work_2.utils;

import java.util.Scanner;

public class ArraysUtils {
    /**
     * Создать массив с размером и значениями элементов, указанными пользователем
     * @return созданный массив
     */
    public static int [] arrayFromConsole () {

        System.out.println("Введите размер массива: ");
        int size = getUserPositiveInt();

        int [] array = new int [size];

        for (int i=0; i<array.length; i++) {
            System.out.println("Введите элемент №" + (i+1) + ": ");
            array[i] = getUserInt();
        }
        return array;
    }

    /**
     * Создать массив с размером, указанным пользователем, заполненный случайными числами из диапазона,
     * указанного пользователем
     * @param size размер массива
     * @param maxValueExclusion граница (по модулю) диапазона для генерации случайных чисел
     * @return созданный массив
     */

    public static int [] arrayRandom (int size, int maxValueExclusion) {

        int [] array = new int [size];

        for (int i = 0; i< array.length;i++) {
            array[i] = (int) (Math.random() * (2 * maxValueExclusion) - maxValueExclusion);
        }
        return array;
    }

    /**
     * Получить корректное число (положительное, int), введенное пользователем через консоль
     * @return положительное число, соответствующее типу int
     */
    public static int  getUserPositiveInt () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                if (userInput >= 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Введено отрицательное число! Повторите ввод.");
                }
            } else {
                System.out.println("Введено не число, или число недопустимого размера! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }

    /**
     * Получить корректное число (int), введенное пользователем через консоль
     * @return положительное число, соответствующее типу int
     */
    private static int  getUserInt () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                    isInputCorrect = true;
            } else {
                System.out.println("Введено не число, или число недопустимого размера! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }

}