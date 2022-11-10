package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    /**
     * Вывести все элементы массива в консоль при помощи цикла while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printAll (int [] array) {

        int j = 0;

        System.out.println("while iteration: ");
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j++;
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль при помощи цикла while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printEverySecond (int [] array) {

        int j = 1;

        System.out.println("while iteration: ");
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j += 2;
        }
        System.out.println();
    }

    /**
     * Вывести в обратном порядке все элементы массива в консоль при помощи цикла while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printReverse (int [] array) {

        int j = array.length;

        System.out.println("while iteration: ");
        while (j > 0) {
            System.out.print(array[j-1] + " ");
            j--;
        }
        System.out.println();
    }
}
