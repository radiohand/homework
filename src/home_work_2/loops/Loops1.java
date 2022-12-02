package home_work_2.loops;

public class Loops1 {

    /**
     * Рассчитать факториал числа, используя цикл for
     * @param num число, факториал которого необходимо рассчитать
     * @return число, соответствующее факториалу, либо -1 в случае переполнения типа long.
     * При каждой итерации цикла текущее значение счетчика с символом '*' выводится в консоль.
     */
    public static long loopFactorial (long num) {

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
    public static long recursionFactorial (long num) {

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