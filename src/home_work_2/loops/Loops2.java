package home_work_2.loops;

public class Loops2 {

    public static void main(String[] args) {

        String number;

        try {
            number = args[0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Отсутствует аргумент к программе!");
            return;
        }
        System.out.println("Введено число: " + number);

        if (checkString(number)) {
            System.out.println("Произведение цифр данного числа: ");
            multiply(number);
        } else {
            System.out.println("Измените аргумент к программе");
        }
    }

    /**
     * найти произведение цифр числа
     * @param number строка, содержащая число, цифры которого нужно перемножить
     * @return произведение цифр числа; -1 при переполнении
     */

    private static long multiply (String number) {

        char [] chars = number.toCharArray();
        long result = 1;
        boolean isFirstIter = true;
        long nextDigit;

        for (char aChar : chars) {

            nextDigit = Character.digit(aChar, 10);

            if (result > Long.MAX_VALUE / nextDigit) {
                System.out.println(" Ошибка! Произошло переполнение в переменной типа long");
                return -1;
            }

            result *= nextDigit;

            if (isFirstIter) {
                isFirstIter = false;
                System.out.print(aChar);
            } else {
                System.out.print(" * " + aChar);
            }
        }
        System.out.print(" = " + result);
        return result;
    }

    /**
     * Проверить, соответствует ли строка условиям:
     * - содержит только число
     * - число целое
     * - число положительное
     * @param str строка, которую нужно проверить
     * @return true, если все условия выполняются, иначе false.
     */
    private static boolean checkString (String str) {

        if (!str.matches("^-?[0-9]*[.]?[0-9]+$")) {
            System.out.println("Введено не число");
            return false;
        }

        if (str.contains("-")) {
            System.out.println("Введено не положительное число");
            return false;
        }

        if (str.contains(".")) {
            System.out.println("Введено не целое число");
            return false;
        }
        return true;
        }
}