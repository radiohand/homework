package home_work_2.arrays;

public class ArraysIteration {

    /**
     * Вывести все элементы массива в консоль при помощи циклов do....while, while, for, foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public static void printAll (int [] array) {

        int i = 0;
        int j = 0;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();

        System.out.println("while iteration: ");
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j++;
        }
        System.out.println();

        System.out.println("fori iteration: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        System.out.println("foreach iteration: ");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль при помощи циклов do....while, while, for, foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public static void printEverySecond (int [] array) {

        int i = 1;
        int j = 1;
        int l = 1;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println();

        System.out.println("while iteration: ");
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j += 2;
        }
        System.out.println();

        System.out.println("fori iteration: ");
        for (int k = 1; k < array.length; k += 2) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        System.out.println("foreach iteration: ");
        for (int element : array) {
            if(l%2 == 0) System.out.print(element + " ");
            l++;
        }
        System.out.println();
    }

    /**
     * Вывести в обратном порядке все элементы массива в консоль при помощи циклов do....while, while, for, foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public static void printReverse (int [] array) {

        int i = array.length;
        int j = array.length;
        int l = array.length;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i-1] + " ");
            i--;
        } while (i > 0);
        System.out.println();

        System.out.println("while iteration: ");
        while (j > 0) {
            System.out.print(array[j-1] + " ");
            j--;
        }
        System.out.println();

        System.out.println("fori iteration: ");
        for (int k = array.length; k > 0; k--) {
            System.out.print(array[k-1] + " ");
        }
        System.out.println();

        System.out.println("foreach iteration: ");
        for (int ignored : array) {
            System.out.print(array[l-1] + " ");
            l--;
        }
        System.out.println();
    }
}
