package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int [][] bigArray = new int[5][];
        int [] randArray;
        int [] userArray;

        System.out.println("Тестим пузырьковую сортировку: ");

        bigArray[0] = new int[] {1, 2, 3, 4, 5, 6};
        bigArray[1] = new int[] {1,1,1,1};
        bigArray[2] = new int[] {9,1,5,99,9,9};
        bigArray[3] = new int[] {};
        bigArray[4] = new int[] {6,5,4,3,2,1};

        for (int i = 0; i < bigArray.length; i++) {
            System.out.println("Test default array № " + (i+1) + ": ");
            System.out.print(Arrays.toString(bigArray[i]) + " -> ");
            SortsUtils.sort(bigArray[i]);
            System.out.println(Arrays.toString(bigArray[i]));
        }

        System.out.println("Test random array: ");
        randArray = ArraysUtils.arrayRandom(50, 100);
        System.out.print(Arrays.toString(randArray) + " -> ");
        SortsUtils.sort(randArray);
        System.out.println(Arrays.toString(randArray));

        System.out.println("Test user array: ");
        userArray = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(userArray) + " -> ");
        SortsUtils.sort(userArray);
        System.out.println(Arrays.toString(userArray));

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {e.printStackTrace();}

        System.out.println("Тестим шейкерную сортировку: ");

        bigArray[0] = new int[] {1, 2, 3, 4, 5, 6};
        bigArray[1] = new int[] {1,1,1,1};
        bigArray[2] = new int[] {9,1,5,99,9,9};
        bigArray[3] = new int[] {};
        bigArray[4] = new int[] {6,5,4,3,2,1};

        for (int i = 0; i < bigArray.length; i++) {
            System.out.println("Test default array № " + (i+1) + ": ");
            System.out.print(Arrays.toString(bigArray[i]) + " -> ");
            SortsUtils.shake(bigArray[i]);
            System.out.println(Arrays.toString(bigArray[i]));
        }

        System.out.println("Test random array: ");
        randArray = ArraysUtils.arrayRandom(50, 100);
        System.out.print(Arrays.toString(randArray) + " -> ");
        SortsUtils.shake(randArray);
        System.out.println(Arrays.toString(randArray));

        System.out.println("Test user array: ");
        userArray = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(userArray) + " -> ");
        SortsUtils.shake(userArray);
        System.out.println(Arrays.toString(userArray));

    }
}
