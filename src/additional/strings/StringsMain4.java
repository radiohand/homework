package additional.strings;

import java.util.Scanner;

public class StringsMain4 {
    public static void main(String[] args) {

        System.out.println("Конвертация из миллисекунд в часы,минуты,секунды,миллисекунды.");
        System.out.println("Введите количество миллисекунд: ");
        long milliseconds = getUserPositiveLong();
        System.out.println("Короткое написание: ");
        System.out.println(StringsConverter.toHoursMinuteSecondMillisecond(milliseconds, false));
        System.out.println("Полное написание: ");
        System.out.println(StringsConverter.toHoursMinuteSecondMillisecond(milliseconds, false));
    }

    /**
     * Получить корректное число (положительное, long), введенное пользователем через консоль
     * @return положительное число, соответствующее типу long
     */
    public static long  getUserPositiveLong () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        long userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextLong()) {
                userInput = console.nextLong();
                if (userInput >= 0) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Введено отрицательное число! Повторите ввод.");
                }
            } else {
                System.out.println("Введено не число, или число недопустимого размера! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
