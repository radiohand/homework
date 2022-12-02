package home_work_1;

import java.util.Random;

public class Branching2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int bound = 1000;
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);
        int c = rand.nextInt(bound);

        System.out.println("Заданы 3 произвольных числа: " + a + ", " + b + ", " + c);

        System.out.println("Среднее число: " + averageNum(a, b, c));
    }

    public static int averageNum (int a, int b, int c) {
        if ((a>b && a<c) ||(a>c && a<b)) {
            return a;
        } else if ((b>a && b<c) || (b>c && b<a)) {
            return b;
        } else return c;
    }
}
