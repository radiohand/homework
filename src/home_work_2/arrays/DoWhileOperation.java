package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    /**
     * Вывести все элементы массива в консоль при помощи цикла do....while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printAll (int [] array) {

        int i = 0;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль при помощи цикла do....while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printEverySecond (int [] array) {

        int i = 1;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println();
    }

    /**
     * Вывести в обратном порядке все элементы массива в консоль при помощи цикла do....while
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printReverse (int [] array) {

        int i = array.length;

        System.out.println("do-while iteration: ");
        do {
            System.out.print(array[i - 1] + " ");
            i--;
        } while (i > 0);
        System.out.println();
    }
}
