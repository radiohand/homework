package home_work_2.loops;

public class Loops6 {

    public static void main(String[] args) {

        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        printMultiTable(2,5);
        printMultiTable(6,9);
        System.out.println("ДИНОЗАВР");
    }

    /**
     * Вывести в консоль таблицу умножения от 1 до 10 для чисел из заданного диапазона
     * @param a начало диапазона
     * @param b окончание диапазона
     */
    public static void printMultiTable (int a, int b) {

        for (int x = 1; x <= 10; x++) {
            for (int i = a; i <= b; i++) {
                System.out.print (i + " x " + x);

                if (x < 10) {
                    if (x*i < 10) {
                        System.out.print ("  =  ");
                    } else System.out.print ("  = ");
                } else System.out.print (" = ");

                System.out.print ((i * x) + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
    }
}
