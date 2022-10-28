package home_work_1;

import java.util.Scanner;

public class UserName1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String name1 = "Вася";
        String name2 = "Анастасия";

        System.out.println("Представьтесь: ");
        String str = console.next();

        if (str.equals(name1) || (str.equals(name2))) {
            if (str.equals(name1)) {
                System.out.println("Привет!");
            }
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("Добрый день, а вы кто?");
    }
}
