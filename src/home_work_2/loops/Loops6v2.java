
    package home_work_2.loops;

    public class Loops6v2 {

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

            StringBuilder builder = new StringBuilder();

            for (int x = 1; x <= 10; x++) {
                builder.setLength(0);
                builder.append("|");
                for (int i = a; i <= b; i++) {
                    builder.append(" ").append(i).append(" x ").append(x);

                    if (x < 10) {
                        if (x*i < 10) {
                            builder.append("  =  ");
                        } else builder.append("  = ");
                    } else builder.append(" = ");

                    builder.append(i * x).append(" |");
                }
                System.out.println(builder.toString());
            }
            System.out.println(builder.toString().replaceAll(".","-"));
        }
    }
