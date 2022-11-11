package additional.strings;

import java.util.Scanner;

public class StringsMain2 {
    public static void main(String[] args) {
        System.out.println("Конвертация чисел с плавающей запятой в прописной формат.");
        System.out.println("Введите число от - 999.999.999,99 до 999.999.999,99");
        System.out.println(StringsConverter.toString(getUserDouble()));
    }

    /**
     * Получить корректное число (double), введенное пользователем через консоль
     * @return положительное число, соответствующее типу double
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
            }
        }

        if (str.contains(",")) {
            str = str.replace(',', '.');
        }
        return Double.parseDouble(str);
    }
}
