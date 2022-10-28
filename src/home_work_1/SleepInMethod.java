package home_work_1;

import java.util.Scanner;

public class SleepInMethod {

    public static void main(String[] args) {

        System.out.println("Сегодня рабочий день? (true/false): ");
        boolean isWeekday = getUserInput();

        System.out.println("Вы сейчас в отпуске? (true/false): ");
        boolean isVacation = getUserInput();

        if (sleepIn(isWeekday, isVacation)) {
            System.out.println("Ура! Можно спать дальше");
        } else {
            System.out.println("Доброе утро. Пора на работу.");
        }
    }

    /**
     * Получить ответ (true/false) о том, можно ли продолжить спать, основываясь на передаваемых параметрах.
     * @param vacation сообщает в отпуске сечйчас пользователь, или нет.
     * @param weekday сообщает, будний или выходной нынче день.
     * @return Ответ, можно ли продолжить спать.
     */
    public static boolean sleepIn (boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем число, соответствующее типу int
     */
    public static boolean getUserInput () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        boolean userInput = false;

        while (!isInputCorrect) {
            if (console.hasNextBoolean()) {
                userInput = console.nextBoolean();
                isInputCorrect = true;
            } else {
                System.out.println("Только true или false! Повторите ввод.");
                console.next();
            }
        }
        return userInput;
    }
}
