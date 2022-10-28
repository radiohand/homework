package home_work_1;

import java.util.Random;

public class Branching2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int bound = 1000;
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);
        int c = rand.nextInt(bound);
        int average = 0;

        System.out.println("Заданы 3 произвольных числа: " + a + ", " + b + ", " + c);

        if (a>b && a<c) {
            average = a;
        } else if (a>c && a<b){
            average = a;
        } else if (b>a && b<c) {
            average = b;
        } else if (b>c && b<a){
            average = b;
        } else {
            average = c;
        }

        //int average = (a + b + c) - Math.max (a, Math.max(b,c)) - Math.min (a, Math.min(b,c));

        System.out.println("Среднее число: " +average);
    }
}
