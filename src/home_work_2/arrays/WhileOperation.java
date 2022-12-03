package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    public String printAll (int [] array) {

        StringBuilder builder = new StringBuilder();

        int j = 0;

        while (j < array.length) {
            builder.append(array[j]);
            if (j != array.length-1) {builder.append(" ");}
            j++;
        }
        return builder.toString();
    }

    public String printEverySecond (int [] array) {

        StringBuilder builder = new StringBuilder();

        int j = 1;

        while (j < array.length) {
            builder.append(array[j]);
            if (j < array.length-2) {builder.append(" ");}
            j += 2;
        }
        return builder.toString();
    }

    public String printReverse (int [] array) {

        StringBuilder builder = new StringBuilder();

        int j = array.length;

        while (j > 0) {
            builder.append(array[j-1]);
            if (j > 1) {builder.append(" ");}
            j--;
        }
        return builder.toString();
    }
}
