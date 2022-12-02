package home_work_2.loops;

public class Loops3 {

    /**
     * возвести число в степень
     * @param a основание степени
     * @param b показатель степени
     * @return результат возведения числа (a) в степень (b)
     */
    public static double pow (double a, int b) {

        if (b < 0) {
            System.out.println("Степень должна быть положительной!");
            return -1;
        }

        double result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}