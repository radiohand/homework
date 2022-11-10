package home_work_2.utils;

public class SortsUtils {
    /**
     * Отсортировать массив в порядке возрастания при помощи алгоритма пузырьковой сортировки
     * @param arr массив элементов типа int произвольного размера
     */
    public static void sort (int [] arr) {
        int buffer;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    buffer = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = buffer;
                }
            }
        }
    }

    /**
     * Отсортировать массив в порядке возрастания при помощи алгоритма шейкерной сортировки
     * @param arr массив элементов типа int произвольного размера
     */
    public static void shake (int [] arr) {
        int buffer;
        boolean flag = true;
        int leftLimit = 0;
        int rightLimit = arr.length-1;

        while (leftLimit<rightLimit && flag) {
            flag = false;
            for (int i = leftLimit; i < rightLimit; i++) {
                if (arr[i]> arr[i+1]) {
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                    flag = true;
                }
            }
            rightLimit --;

            for (int i = rightLimit; i > leftLimit; i--) {
                if (arr[i-1]> arr[i]) {
                    buffer = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = buffer;
                    flag = true;
                }
            }
            leftLimit ++;
        }
    }
}
