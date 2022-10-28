package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {

    public static void main(String[] args) {

        System.out.println("Введите два числа в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);

        System.out.println("Введите первое число: ");
        int a = getUserInput();

        System.out.println("Введите второе число: ");
        int b = getUserInput();

        System.out.println("Результат выполнения оператора AND: " + (a&b));
        /* a=18, b=107
        a = 0010010
        &
        b = 1101011
            0000010 (2) */

        System.out.println("Результат выполнения оператора OR: " + (a|b));
        /* x=18, z=107
        x = 0010010
        |
        y = 1101011
            1111011 (123) */
    }

    /**
    * Получить проверенный на соответствие типу int пользовательский ввод
    * @return Введенное пользователем число, соответствующее типу int
    */
    public static int getUserInput () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                isInputCorrect = true;
            } else {
                System.out.println("Введено недопустимое значение! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
// Для числа 45.2 - ошибка "bad operand types for binary operator '&'", т.к. побитовые операторы применимы только для целых чисел.
// Можно руками попробовать реализовать данные операторы для вещественного типа, если в этом вообще есть смысл.