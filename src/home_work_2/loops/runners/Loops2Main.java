package home_work_2.loops.runners;


import home_work_2.loops.Loops2;

public class Loops2Main {

    public static void main(String[] args) {

        String number;
        boolean isFirstIter = true;

        try {
            number = args[0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Отсутствует аргумент к программе!");
            return;
        }

        System.out.println("Введено: " + number);

        for (int i = number.length(); i > 0; i--) {
            if (isFirstIter) {
                isFirstIter = false;
                System.out.print(number.charAt(i - 1));
            } else {
                System.out.print(" * " + number.charAt(i - 1));
            }
        }
            System.out.print(" = " + Loops2.multiply(number));
    }
}
