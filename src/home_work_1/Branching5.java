package home_work_1;

import java.util.Scanner;

public class Branching5 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите символ для проверки: ");
        String str = console.next();
        char symb = str.charAt(0);
        System.out.println("Принят символ: " + symb);

        if (symb >= 'a' && symb <= 'z') {
            System.out.println("Вы ввели букву в нижнем регистре");
        } else if (symb >= 'A' && symb <= 'Z') {
            System.out.println("Вы ввели букву в верхнем регистре");
        } else {
            System.out.println("Введенный символ не является буквой (латиница)");
        }
    }
}
