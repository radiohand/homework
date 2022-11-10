package home_work_2.arrays;

import java.util.Scanner;

public class ArrayFromClass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int count = console.nextInt();
        
        int [] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки: ");
            array[i] = console.nextInt();
        }

        printArray(array);

        sort(array);

        printArray(array);
    }

    public static void sort (int [] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    buffer = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buffer;
                }
            }
        }
    }

    public static void printArray (int [] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
