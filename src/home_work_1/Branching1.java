package home_work_1;

import java.util.Random;

public class Branching1 {

    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt();
        //int a = (int) (Math.random()*Integer.MAX_VALUE);

        System.out.println("Выбрано случайное число: " + a);
        if (a%2 != 0) {
            System.out.println("Число является нечетным");
        } else {
            System.out.println("Число является четным");
        }
    }
}
