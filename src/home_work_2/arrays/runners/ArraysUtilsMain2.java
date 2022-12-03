package home_work_2.arrays.runners;

import home_work_2.utils.ArraysUtils;

public class ArraysUtilsMain2 {

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int size = ArraysUtils.getUserPositiveInt();

        System.out.println("Введите максимальное (по модулю) число для генерации: ");
        int maxValueExclusion = ArraysUtils.getUserPositiveInt();

        int [] container = ArraysUtils.arrayRandom(size, maxValueExclusion);

        System.out.println("Сохранен массив: ");
        for (int element : container) {
            System.out.print(element + " ");
        }
    }
}
