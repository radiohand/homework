package additional.strings;

import java.util.Scanner;

public class StringsMain3 {
    public static void main(String[] args) {
        System.out.println("Дни в недели");
        System.out.println("Введите количество дней: ");
        System.out.println(StringsConverter.toWeek(getUserPositiveInt()));
    }

    /**
     * Получить корректное число (положительное, int), введенное пользователем через консоль
     * @return положительное число, соответствующее типу int
     */
    public static int  getUserPositiveInt () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
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
