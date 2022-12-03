package home_work_2.arrays.runners;

import home_work_2.arrays.DoWhileOperation;
import home_work_2.arrays.ForEachOperation;
import home_work_2.arrays.ForOperation;
import home_work_2.arrays.WhileOperation;
import home_work_2.utils.ArraysUtils;

public class ArraysOperationsMain {

    public static void main(String[] args) {

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        WhileOperation whileOperation = new WhileOperation();
        ForOperation forOperation = new ForOperation();
        ForEachOperation forEachOperation = new ForEachOperation();

        int [] array = ArraysUtils.arrayFromConsole();

        System.out.println("1. Вывод всех элементов массива: ");
        doWhileOperation.printAll(array);
        whileOperation.printAll(array);
        forOperation.printAll(array);
        forEachOperation.printAll(array);

        System.out.println("2. Вывод каждого второго элемента массива: ");
        doWhileOperation.printEverySecond(array);
        whileOperation.printEverySecond(array);
        forOperation.printEverySecond(array);
        forEachOperation.printEverySecond(array);

        System.out.println("3. Вывод всех элементов массива в обратном порядке: ");
        doWhileOperation.printReverse(array);
        whileOperation.printReverse(array);
        forOperation.printReverse(array);
        forEachOperation.printReverse(array);
    }
}
