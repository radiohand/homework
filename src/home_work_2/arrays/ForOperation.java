package home_work_2.arrays;

import java.util.Locale;

public class ForOperation implements IArraysOperation{

    public String printAll (int [] array) {

        StringBuilder builder = new StringBuilder();

        for (int k = 0; k < array.length; k++) {
            builder.append(array[k]);
            if (k < array.length-1) { builder.append(" ");}
        }
        return builder.toString();
    }

    public String printEverySecond (int [] array) {

        StringBuilder builder = new StringBuilder();

        for (int k = 1; k < array.length; k += 2) {
            builder.append(array[k]);
            if (k < array.length-2) {builder.append(" ");}
        }
        return builder.toString();
    }

    public String printReverse (int [] array) {

        StringBuilder builder = new StringBuilder();

        for (int k = array.length; k > 0; k--) {
            builder.append(array[k-1]);
            if (k > 1) {builder.append(" ");}
        }
        return builder.toString();
    }
}
