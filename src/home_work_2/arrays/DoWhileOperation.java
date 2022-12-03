package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    public String printAll (int [] array) {

        StringBuilder builder = new StringBuilder();

        int i = 0;

        if (array.length == 0) {return "";}

        do {
            builder.append(array[i]);
            if (i != array.length-1) {builder.append(" ");}
            i ++;
        } while (i < array.length);
        return builder.toString();
    }

    public String printEverySecond (int [] array) {

        StringBuilder builder = new StringBuilder();

        int i = 1;

        if (array.length == 0) {return "";}

        do {
            builder.append(array[i]);
            if (i < array.length-2) {builder.append(" ");}
            i += 2;
        } while (i < array.length);
        return builder.toString();
    }

    public String printReverse (int [] array) {

        StringBuilder builder = new StringBuilder();

        int i = array.length;

        if (array.length == 0) {return "";}

        do {
            builder.append(array[i - 1]);
            if (i != 1) {builder.append(" ");}
            i--;
        } while (i > 0);
        return builder.toString();
    }
}
