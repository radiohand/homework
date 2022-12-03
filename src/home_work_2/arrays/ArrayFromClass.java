package home_work_2.arrays;

public class ArrayFromClass {

    public static void sort (int [] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    buffer = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buffer;
                }
            }
        }
    }

    public static String printArray (int [] array) {

        StringBuilder builder = new StringBuilder();

        boolean isFirstIter = true;

        for (int element : array) {
            if (isFirstIter) {
                builder.append(element);
                isFirstIter = false;
            } else {builder.append(" ").append(element);}
        }
        return builder.toString();
    }
}
