package home_work_1;

import java.util.Random;

public class Branching1 {

    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt();
        //int a = (int) (Math.random()*Integer.MAX_VALUE);

        System.out.println("Выбрано случайное число: " + a);
        if (isEven(a)) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        }
    }

    public static boolean isEven (int a) {
        return a % 2 == 0;
    }
}
