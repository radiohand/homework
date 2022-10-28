package home_work_1;

import java.util.Scanner;

public class UserName3 {

    public static final String NAME_1 = "Вася";
    public static final String NAME_2 = "Анастасия";

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Представьтесь: ");
        String str = console.next();

        switch (str) {
            case NAME_1:
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;
            case NAME_2:
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
