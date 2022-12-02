package home_work_2.loops;

public class Loops2 {

    /**
     * найти произведение цифр числа
     * @param number строка, содержащая число, цифры которого нужно перемножить
     * @return произведение цифр числа; -1 при переполнении или некорректном значении аргумента
     */

    public static long multiply (String number) {

        if (!checkString(number)) return -1;

        char [] chars = number.toCharArray();
        long result = 1;
        long nextDigit;

        for (char aChar : chars) {

            nextDigit = Character.digit(aChar, 10);

            if (nextDigit != 0) {
                if (result > Long.MAX_VALUE / nextDigit) {
                    System.out.println(" Ошибка! Произошло переполнение в переменной типа long");
                    return -1;
                }
            }

            result *= nextDigit;
        }
        return result;
    }

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