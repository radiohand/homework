package additional.strings;

import java.util.Scanner;

public class StringsMain1 {
    public static void main(String[] args) {
        System.out.println("Введите число от - 999.999.999 до 999.999.999");
        System.out.println(StringsConverter.toString(getUserInt()));
    }

    /**
     * Получить корректное число (int), введенное пользователем через консоль
     * @return число, соответствующее типу int
     */
    public static int getUserInt() {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextInt()) {
                userInput = console.nextInt();
                    isInputCorrect = true;
            } else {
                System.out.println("Введено не число, или число недопустимого размера! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
