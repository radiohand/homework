package home_work_1;

import java.util.Scanner;

public class Branching5 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите символ для проверки: ");
        String str = console.next();
        char symb = str.charAt(0);

        System.out.println("Принят символ: " + symb);

        System.out.println(isLetter(symb));
    }

    /**
     * Определить, является ли принятый символ буквой, или иным символом
     * @param symb обрабатываемый символ
     * @return строка с сообщением о том, чем является принятый символ
     */
    public static String isLetter (char symb) {
        if (symb >= 'a' && symb <= 'z') {
            return ("Вы ввели букву в нижнем регистре");
        } else if (symb >= 'A' && symb <= 'Z') {
            return ("Вы ввели букву в верхнем регистре");
        } else {
            return ("Введенный символ не является буквой (латиница)");
        }
    }
}
