package home_work_1;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

        System.out.println("Для чисел из задания: ");
        System.out.println("Ввод: 42. Возвращает: " + toBinaryString((byte) 42));
        System.out.println("Ввод: 15. Возвращает: " + toBinaryString((byte) 15));
        System.out.println("Ввод: -42. Возвращает: " + toBinaryString((byte) -42));
        System.out.println("Ввод: -15. Возвращает: " + toBinaryString((byte) -15));

        System.out.println("Введите число (от -128 до 127) для перевода в двоичную систему: ");
        byte number = getUserInput();

        System.out.println("Ввод: " + number + ". Возвращает: " + toBinaryString(number));
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @param num число, соотв. типу byte, для которого необходимо получить двоичное представление
     * @return двоичное представление числа, записаннное в строку
     */
    public static String toBinaryString (byte num) {

        StringBuilder str = new StringBuilder();

        byte [] arr = new byte[8];

        if (num>0) {
            for (int i = 7; i >= 0; i--) {

                if (num != 0) {
                    if (num % 2 == 0) {
                        arr[i] = 0;
                    } else {
                        arr[i] = 1;
                    }
                    num /= 2;
                } else {
                    arr[i] = 0;
                }
            }
        } else {
            for (int i = 7; i >= 0; i--) {

                if (num != 0) {
                    if (num % 2 == 0) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 0;
                    }
                    num /= 2;
                } else {
                    arr[i] = 1;
                }
            }
            for (int i = 7; i >= 0; i--) {
                if (arr[i]==0) {
                    arr [i] = 1;
                    break;
                } else {
                    arr [i] = 0;
                }
            }
        }
        for (byte digit: arr) {
            str.append(digit);
        }
        return str.toString();
    }

    /**
     * Получить проверенный на соответствие условиям пользовательский ввод.
     * @return Введенное пользователем число, соответствующее типу byte
     */
    public static byte getUserInput() { // метод, реализующий пользовательский ввод с проверкой типа, и возвращающий принятое значение.
        Scanner console = new Scanner(System.in);
        boolean isInputCorrect = false;
        byte userInput = 0;
        while (!isInputCorrect) { // Циклим до ввода допустимого значения
            if (console.hasNextByte()) {
                userInput = console.nextByte();
                    isInputCorrect = true;
            } else {
                System.out.println("Недопустимое значение. Повторите ввод!");
                console.next();
            }
        }
        return userInput;
    }
}
