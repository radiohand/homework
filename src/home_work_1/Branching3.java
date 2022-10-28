package home_work_1;

import java.util.Random;

public class Branching3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int bound = 1000;
        int a = rand.nextInt(bound);
        double b = rand.nextInt(bound);

        System.out.println("Заданы 2 произвольных числа: " + a + " и " + b);
        if (a%b == 0) {
            System.out.println("Число №1 делится на число №2 без остатка");
        } else {
            System.out.println("Число №1 делится на число №2 c остатком: " + a%b);
        }
        System.out.println("Частное от деления равно: " + a/b);
    }
}