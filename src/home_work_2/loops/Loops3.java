package home_work_2.loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        System.out.println("Возведение в степень.");
        System.out.println("Введите основание степени: ");
        double a = getUserDouble();
        System.out.println("Введите показатель степени (положительный): ");
        int b = getUserPositiveInt();
        System.out.println("Результат возведения в степень: ");
        System.out.println(a + " ^ " + b + " = " + pow(a,b));
    }

    /**
     * возвести число в степень
     * @param a основание степени
     * @param b показатель степени
     * @return результат возведения числа (a) в степень (b)
     */
    private static double pow (double a, int b) {
        double result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    /**
     * Получить корректное значение (double), введенное пользователем через консоль
     * @return значение, соответствующее типу double
     */
    private static double getUserDouble () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        String str = null;

        while (!isInputCorrect) {
            str = console.nextLine();
            if (str.matches("^-?[0-9]*[.,]?[0-9]+$")) {
                isInputCorrect = true;
            } else {
                System.out.println("Введено не число");
                console.next();
            }
        }

        if (str.contains(",")) {
            str = str.replace(',', '.');
        }
        return Double.parseDouble(str);
    }

    /**
     * Получить корректное число (положительное, int), введенное пользователем через консоль
     * @return положительное число, соответствующее типу int
     */
    private static int  getUserPositiveInt () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                if (userInput >= 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Показатель степени должен быть положительным! Повторите ввод.");
                }
            } else {
                System.out.println("Введено недопустимое значение! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}