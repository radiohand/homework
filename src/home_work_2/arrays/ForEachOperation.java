package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{

    public String printAll (int [] array) {

        StringBuilder builder = new StringBuilder();

        boolean isFirstIter = true;

        for (int element: array) {
            if (isFirstIter) {
                builder.append(element);
                isFirstIter = false;
            } else {builder.append(" ").append(element);}
        }
        return builder.toString();
    }

    public String printEverySecond (int [] array) {

        StringBuilder builder = new StringBuilder();

        int l = 1;
        boolean isFirstIter = true;

        for (int element : array) {
            if(l%2 == 0) {
                if (isFirstIter) {
                    builder.append(element);
                    isFirstIter = false;
                } else { builder.append(" ").append(element);}
            }
            l++;
        }
        return builder.toString();
    }

    public String printReverse (int [] array) {

        StringBuilder builder = new StringBuilder();

        int l = array.length;
        boolean isFirstIter = true;

        for (int ignored : array) {
            if (isFirstIter) {
                builder.append(array[l - 1]);
                isFirstIter = false;
            } else {builder.append(" ").append(array[l - 1]);}
            l--;
        }
        return builder.toString();
    }
}
