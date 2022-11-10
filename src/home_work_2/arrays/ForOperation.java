package home_work_2.arrays;

public class ForOperation implements IArraysOperation{

    /**
     * Вывести все элементы массива в консоль при помощи цикла for
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printAll (int [] array) {

        System.out.println("fori iteration: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль при помощи цикла for
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printEverySecond (int [] array) {

        System.out.println("fori iteration: ");
        for (int k = 1; k < array.length; k += 2) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
    }

    /**
     * Вывести в обратном порядке все элементы массива в консоль при помощи цикла for
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printReverse (int [] array) {

        System.out.println("fori iteration: ");
        for (int k = array.length; k > 0; k--) {
            System.out.print(array[k-1] + " ");
        }
        System.out.println();
    }
}
