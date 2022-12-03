package home_work_2.arrays;

import java.util.Arrays;

public class ArraysFromPresentation {

    /**
     * Получить сумму четных положительных значений элементов массива
     * @param array массив, для которого производятся вычисления
     * @return сумма значений элементов
     */
    public static long sumOfElements (int [] array) {

        long sum = 0;

        for (int element : array) {
            if ((element > 0) && (element % 2 == 0)) {
                sum += element;
            }
        }
        return sum;
    }

    /**
     * Получить максимальный из элементов массива с четными индексами
     * @param array массив, для которого производятся вычисления
     * @return значение максимального элемента с четным индексом
     */
    public static int maxEvenElement (int[] array) {

        int maxElement = array[0];

        for (int i = 0; i < array.length; i+=2) {
            if (maxElement < array[i]) {
                maxElement = array [i];
            }
        }
        return maxElement;
    }

    /**
     * Найти элементы массива, которые меньше среднего арифметического значений всех элементов этого массива
     * @param array массив, для которого производятся вычисления
     * @return массив, содержащий искомые элементы исходного массива
     */
    public static int [] lessThanAverage (int [] array) {

        double sum = 0;
        double average;
        int newLength = 0;

        for (int element : array) {
            sum += element;
        }

        average = sum/array.length;

        for (int element : array){
            if (element < average) {newLength++;}
        }

        int [] newArray = new int [newLength];
        int i = 0;

        for (int element : array){
            if (element < average) {
                newArray[i] = element;
                i++;
            }
        }
        return newArray;
    }

    /**
     * Найти два наименьших (минимальных) элемента массива
     * @param array массив, для которого производятся вычисления
     * @return массив из 2 элементов, содержащий 2 минимальных элемента исходного массива
     */
    public static int [] twoMinElements (int[] array) {

        int [] startArray = new int[array.length];
        System.arraycopy(array, 0, startArray, 0, startArray.length);

        int [] minElements = new int[2];

        Arrays.sort(startArray);

        minElements[0] = startArray[0];
        for (int i = 1; i < startArray.length; i++) {
            if (startArray[i] != startArray[0]) {
                minElements [1] = startArray [i];
                break;
            }
        }
        return minElements;
    }

    /**
     * Сжать массив, удалив элементы, принадлежащие заданному интервалу
     * @param array массив, для которого производится сжатие
     * @param begin начало интервала
     * @param end окончание интервала
     * @return массив, содержащий сжатую версию исходного
     */
    public static int [] compressArray (int [] array, int begin, int end) {

        int newLength = array.length;

        for (int element : array) {
            if (element > begin && element < end) {
                newLength --;
            }
        }

        int i = 0;
        int [] newArray = new int [newLength];

        for (int element : array){
            if (!(element > begin && element < end)) {
                newArray [i] = element;
                i++;
            }
        }
        return newArray;
    }

    /**
     * Найти сумму цифр элементов массива
     * @param array массив, для которого производятся вычисления
     * @return сумма цифр элементов принятого массива
     */
    public static long digitsOfArray (int [] array) {

        int sum = 0;

        for (int element : array) {
            if (element<0) element *= (-1);
            while (element > 0) {
                sum += element % 10;
                element /= 10;
            }
        }
        return sum;
    }
}
