package home_work_2.loops;

public class Loops5 {

//1
    /**
     * Найти наибольшую цифру в числе
     * @param number число, в котором ищем наибольшую цифру
     * @return наибольшая цифра числа
     */
    public static byte maxDigit (long number) {

        if (number < 0) return -1;

        byte maxDigit = 0;

        while (number > 0) {
            if ((number % 10) > maxDigit) {
                maxDigit = (byte) (number % 10);
            }
            number /= 10;
        }
        return maxDigit;
    }
//2
    /**
     * Определить процент четных чисел в выборке псевдослучайных чисел заданного размера
     * @param sampleSize размер выборки
     * @return процент четных чисел
     */
    public static double parityProb (int sampleSize) {

        if (sampleSize < 10) {return -1;}

        double count = 0;

        for (int i = 0; i < sampleSize; i++) {
            if ((int)(Math.random()*100) % 2 == 0) {
                count++;
            }
        }
        return (count/sampleSize*100);
    }
//3
    /**
     * Определить количество четных и нечетных цифр в заданном числе
     * @param number число, в котором осуществляется поиск цифр
     * @return массив: количество четных цифр в ячейке 0, нечетных в ячейке 1.
     */
    public static int [] digitsOfNum (long number) {

        if (number < 0) {number *= -1;}

        int [] counter = new int [2];

        if (number == 0) {
            counter [0] = 1;
            return counter;
        }

        while (number > 0) {
            if (number%2 == 0 ) {
                counter[0]++;
            } else counter[1]++;
            number /= 10;
        }
        return counter;
    }
//4
    /**
     * Получить набор чисел, представляющий часть ряда Фибоначчи от начала и до заданного размера
     * @param seriesSize размер ряда
     * @return строка с набором чисел ряда
     */
    public static String fibonacci (int seriesSize) {


        if (seriesSize == 0) {return " ";}
        if (seriesSize < 0) {return "NegativeNumberError";}

        StringBuilder builder = new StringBuilder();

        long f1 = 1;
        long f2 = f1;
        long f3;

        builder.append(f1).append(" ").append(f2);

        for (int i = 2; i < seriesSize; i++) {

            f3 = f1+f2;

            if (f1 > (Long.MAX_VALUE - f2)) {
                builder.append(" Произошло переполнение типа long");
                break;
            }

            builder.append(" ").append(f3);
            f1 = f2;
            f2 = f3;
        }
        return builder.toString();
    }
//5
    /**
     * Получить набор чисел, представляющий числовой ряд с заданными началом, концом, и шагом
     * @param begin начало ряда
     * @param end окончание ряда
     * @param step шаг между элементами
     * @return строка с набором чисел ряда
     */
    public static String stepSeries (int begin, int end, int step) {

        if (begin >= end) {
            return "Ошибка! Отрицательный или нулевой размер диапазона.";
        }

        if (step >= (end-begin)) {
            return "Ошибка! Шаг превышает размер диапазона.";
        }

        StringBuilder builder = new StringBuilder();

        for (int i = begin; i <= end; i+=step) {
            builder.append(i).append(" ");
        }
        return builder.toString();
    }
//6
    /**
     * Получить инверсию заданного числа
     * @param number число, для которого получаем инверсию
     * @return число - инверсия заданного
     * @throws ArithmeticException
     */
    public static int rollNumber (int number) {

        if (number < 0) {return -1;}

        int newNumber = 0;

        while (number > 0) {
            newNumber = (Math.multiplyExact(newNumber, 10)) + (number % 10);
            number /= 10;
        }
        return newNumber;
    }
}