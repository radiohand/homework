package home_work_2.arrays.runners;

import home_work_2.arrays.ArrayFromClass;

import java.util.Scanner;

public class ArrayFromClassMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int count = console.nextInt();

        int [] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки: ");
            array[i] = console.nextInt();
        }

        System.out.println(ArrayFromClass.printArray(array));

        ArrayFromClass.sort(array);

        System.out.println(ArrayFromClass.printArray(array));
    }
}
