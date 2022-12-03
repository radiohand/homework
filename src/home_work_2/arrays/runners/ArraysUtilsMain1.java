package home_work_2.arrays.runners;

import home_work_2.utils.ArraysUtils;

public class ArraysUtilsMain1 {

    public static void main(String[] args) {

        int [] container = ArraysUtils.arrayFromConsole();

        System.out.println("Сохранен массив: ");
        for (int element : container) {
            System.out.print(element + " ");
        }
    }
}
