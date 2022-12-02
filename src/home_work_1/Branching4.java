package home_work_1;

import java.util.Scanner;

public class Branching4 {

    public static void main(String[] args) {

        boolean isRightChoice = false;

        System.out.println("Введите число, которое необходимо перевести: ");
        int num = getUserInput();

        System.out.println("Выберите направление перевода: 1-в килобайты, 2-в байты.");
        while (!isRightChoice) {
            switch (getUserInput()) {
                case 1:
                    System.out.println(num + " байт = " + bytesToKilobytes(num) + " Кбайт");
                    isRightChoice = true;
                    break;
                case 2:
                    System.out.println(num + " Кбайт = " + kilobytesToBytes(num) + " байт");
                    isRightChoice = true;
                    break;
                default:
                    System.out.println("Введите 1 или 2!");
                    break;
            }
        }
    }

    /**
     * Перевести значение в байтах в килобайты
     * @param bytes значение в байтах
     * @return значение в килобайтах
     */
    public static int bytesToKilobytes (int bytes) {
        if (bytes < 0 ) {return 0;}
        return bytes/1024;
    }

    /**
     * Перевести значение в килобайтах в байты
     * @param kbytes значение в килобайтах
     * @return значение в байтах
     */
    public static int kilobytesToBytes (int kbytes) {
        if (kbytes < 0 ) {return 0;}
        return kbytes*1024;
    }


    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем число, соответствующее типу int
     */
    public static int getUserInput () {

        Scanner console = new Scanner(System.in);

        boolean isInputCorrect = false;
        int userInput =0;

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
