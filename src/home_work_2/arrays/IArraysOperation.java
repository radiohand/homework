package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Вывести все элементы массива в консоль при помощи циклов
     * @param array массив, элементы которого нужно вывести в консоль
     */
    void printAll(int[] array);

    /**
     * Вывести каждый второй элемент массива в консоль
     * @param array массив, элементы которого нужно вывести в консоль
     */
    void printEverySecond (int [] array);

    /**
     * Вывести в обратном порядке все элементы массива в консоль
     * @param array массив, элементы которого нужно вывести в консоль
     */
    void printReverse (int [] array);
}
