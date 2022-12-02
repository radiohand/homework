package home_work_1;

import java.util.Random;

public class Branching3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int bound = 1000;
        int a = rand.nextInt(bound);
        //double b = rand.nextInt(bound);
        double b = 0;

        System.out.println("Заданы 2 произвольных числа: " + a + " и " + b);
        if (!hasRemainder(a, b)) {
            System.out.println("Число №1 делится на число №2 без остатка.");
        } else {
            System.out.println("Число №1 делится на число №2 c остатком.");
        }
        System.out.println("Частное от деления равно: " + divider(a,b));
    }

    /**
     * Определить есть ли остаток при делении двух чисел
     * @param a делимое
     * @param b делитель
     * @return true, если есть остаток, иначе - false
     */
    public static boolean hasRemainder (int a, double b) {
        return a%b != 0;
    }

    /**
     * Получить частное от деления 2 чисел
     * @param a делимое
     * @param b делитель
     * @return частное от деления
     */
    public static double divider (int a, double b) {
        return a/b;
    }
}