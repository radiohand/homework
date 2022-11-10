package home_work_2.loops;

public class Loops1 {

    public static void main(String[] args) {

        long number;

        try {
            number = Long.parseLong(args[0]);
            if (number < 0) {
                System.out.println("Число должно быть положительным! Измените аргумент к программе.");
                return;
            }
            System.out.println("Введено число: " + number);
        } catch (NumberFormatException ex1) {
            System.out.println("Введено не число! Измените аргумент к программе.");
            return;
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Отсутствует аргумент к программе!");
            return;
        }

        System.out.println("Факториал, рассчитанный через цикл: ");

        long factorial1 = loopFactorial(number);

        if (factorial1 == -1) {
            System.out.println(" ...Произошло переполнение в переменной типа long");
        } else {
            System.out.println(" = " + factorial1);
        }

        System.out.println("Факториал, рассчитанный через рекурсивный метод: ");

        try {
            long factorial2 = recursionFactorial(number);

            if (factorial2 == 0) {
                System.out.println(" ...Произошло переполнение в переменной типа long");
            } else {
                System.out.println(" = " + factorial2);
            }
        } catch (StackOverflowError err) {
            System.out.println("Ошибка! Произошло переполнение стека");
        }
    }

    /**
     * Рассчитать факториал числа, используя цикл for
     * @param num число, факториал которого необходимо рассчитать
     * @return число, соответствующее факториалу, либо -1 в случае переполнения типа long.
     * При каждой итерации цикла текущее значение счетчика с символом '*' выводится в консоль.
     */
    private static long loopFactorial (long num) {

        long result = 1;
        boolean isFirstIter = true;

        for (int i = 1; i <= num; i++) {

            if (result > Long.MAX_VALUE / i) {
                return -1;
            }

            result *= i;

            if (isFirstIter) {
                isFirstIter = false;
            } else {
                System.out.print(" * ");
            }
            System.out.print(i);

        }
        return result;
    }

    /**
     * Рассчитать факториал числа, используя рекурсию
     * @param num число, факториал которого необходимо рассчитать
     * @return число, соответствующее факториалу, либо 0 в случае переполнения типа long
     * При каждом вызове выводит в консоль значение аргумента с символом ' * '.
     * @throws StackOverflowError при переполнении стека в процессе рекурсивного вызова метода
     */
    private static long recursionFactorial (long num) {

        long result = 1;

        if (num == 1) {
            System.out.print(num);
            return result;
        }

        result = num * recursionFactorial(num-1);

        if (result != 0) {
            System.out.print(" * " + num);
        }

        if ((result > (Long.MAX_VALUE / (num + 1)))) {
            return 0;
        }
        return result;
    }
}