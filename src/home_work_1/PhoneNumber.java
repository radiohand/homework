package home_work_1;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {

        System.out.println("Введите тел. номер из 10 цифр: ");
        String stringPhone = Long.toString(getUserInput());

        char [] phoneArray = stringPhone.toCharArray();

        System.out.println("Отформатированный номер: " + createPhoneNumber(phoneArray));
    }

    /**
     * Получить отформатированную по шаблону (телефонный номер) строку.
     * @param phoneArray массив из 10 цифр
     * @return Строка, содержащая отформатированную последовательность из цифр, переданных в качестве параметра
     */
    public static String createPhoneNumber (char [] phoneArray){

        StringBuilder phoneString = new StringBuilder();

        for (char digit : phoneArray)
        {
            phoneString.append(digit);
        }
        return ("(" + phoneString.substring(0,3) + ") " + phoneString.substring(3,6) + "-" + phoneString.substring(6,10));
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем число, лежащее в диапазоне (от 10^9 до 10^10 - десять символов)
     */
    public static long getUserInput() {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        long userInput = 0;

        while (!isInputCorrect) {
            if (console.hasNextLong()) {
                userInput = console.nextLong();
                if (userInput >= 1E9 && userInput < 1E10) {
                    isInputCorrect = true;
                } else {
                    System.out.println("Должно быть 10 цифр! Повторите ввод!");
                }
            } else {
                System.out.println("Недопустимые символы! Повторите ввод!");
                console.next();
            }
        }
        return userInput;
    }
}
