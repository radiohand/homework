package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysMain3 {

    public static void main(String[] args) {

        int [] array = ArraysUtils.arrayFromConsole();

        System.out.println("1. Вывод всех элементов массива: ");
        ArraysIteration.printAll(array);

        System.out.println("2. Вывод каждого второго элемента массива: ");
        ArraysIteration.printEverySecond(array);

        System.out.println("3. Вывод всех элементов массива в обратном порядке: ");
        ArraysIteration.printReverse(array);
    }
}
