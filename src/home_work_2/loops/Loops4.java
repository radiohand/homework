package home_work_2.loops;

public class Loops4 {

    /**
     * умножать число №1 на число №2 до наступления переполнения, получить значение до и после переполнения
     * @param a число №1
     * @param b число №2
     * @return массив: в ячейке 1 - значение до переполнения;
     * в ячейке 2 - значение до переполнения.
     */
    public static long [] multiply (long a, long b) {

        long [] result = new long [2];

        if (b == 0 || a == 0 || (a == 1 && b == 1)) {
            System.out.println("Переполнение не наступит");
            return result;
        }

        while (true) {
            a *= b;
            if ((Math.abs(a) > Math.abs(Long.MAX_VALUE / b))) {
                result [0] = a;
                break;
            }
        }
        result [1] = a*b;
        return result;
    }
}


