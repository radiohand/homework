package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class ArraysMain5 {

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int size = getUserPositiveInt();

        System.out.println("Введите максимальное по модулю число для генерации: ");
        int maxValueExclusion = getUserPositiveInt();

        int [] array = ArraysUtils.arrayRandom(size, maxValueExclusion);

        System.out.println("Сгенерирован массив: ");
        for (int element : array) {
            System.out.print (element + " ");
        }

        while (true) {

            System.out.println();

            System.out.println("Выберите задачу: \n" +
                    "1) Сумма четных положительных элементов массива; \n" +
                    "2) Максимальный из элементов массива с четными индексами; \n" +
                    "3) Элементы массива, которые меньше среднего арифметического; \n" +
                    "4) Два наименьших (минимальных) элемента массива; \n" +
                    "5) Сжать массив, удалив элементы, принадлежащие интервалу; \n" +
                    "6) Сумма цифр массива; \n" +
                    "7) Выйти из программы.");

            int choice = getUserPositiveInt();

            switch (choice) {
                case 1:
                    System.out.println("1) Сумма четных положительных элементов массива: ");
                    System.out.println(ArraysFromPresentation.sumOfElements(array));
                    break;

                case 2:
                    System.out.println("2) Максимальный из элементов массива с четными индексами: ");
                    System.out.println(ArraysFromPresentation.maxEvenElement(array));
                    break;

                case 3:
                    System.out.println("3) Элементы массива, которые меньше среднего арифметического: ");
                    int [] container3 = ArraysFromPresentation.lessThanAverage(array);
                    for (int element : container3) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("4) Два наименьших (минимальных) элемента массива: ");
                    int [] container4 = ArraysFromPresentation.twoMinElements(array);
                    for (int element : container4) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("5) Сжать массив, удалив элементы, принадлежащие интервалу: ");
                    System.out.println("Введите нижнюю границу исключаемого интервала:");
                    int begin = getUserInt();
                    System.out.println("Введите верхнюю границу исключаемого интервала:");
                    int end = getUserInt();
                    int [] container5 = ArraysFromPresentation.compressArray(array, begin, end);
                    for (int element : container5) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("6) Сумма цифр массива: ");
                    System.out.println(ArraysFromPresentation.digitsOfArray(array));
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
     * Получить положительное число (int), введенное пользователем через консоль
     * @return положительное число, соответствующее по размеру типу int
     */
    private static int  getUserPositiveInt () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                if (userInput >= 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Число должно быть положительным! Повторите ввод.");
                }
            } else {
                System.out.println("Введено недопустимое значение! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }

    /**
     * Получить число (int), введенное пользователем через консоль
     * @return число, соответствующее по размеру типу int
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
                System.out.println("Введено недопустимое значение! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}