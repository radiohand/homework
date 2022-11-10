package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{

    /**
     * Вывести все элементы массива в консоль при помощи цикла foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printAll (int [] array) {

        System.out.println("foreach iteration: ");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль при помощи цикла foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printEverySecond (int [] array) {

        int l = 1;

        System.out.println("foreach iteration: ");
        for (int element : array) {
            if(l%2 == 0) System.out.print(element + " ");
            l++;
        }
        System.out.println();
    }

    /**
     * Вывести в обратном порядке все элементы массива в консоль при помощи цикла foreach
     * @param array массив, элементы которого нужно вывести в консоль
     */
    public void printReverse (int [] array) {

        int l = array.length;

        System.out.println("foreach iteration: ");
        for (int ignored : array) {
            System.out.print(array[l-1] + " ");
            l--;
        }
        System.out.println();
    }
}
