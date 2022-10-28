package home_work_1;

import java.util.Scanner;

import static java.lang.System.*;

public class UserName2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(in);

        String name1 = "Вася";
        String name2 = "Анастасия";

        out.println("Представьтесь: ");
        String str = console.next();

        if (str.equals(name1)) {
            out.println("Привет! \nЯ тебя так долго ждал");
        } else if (str.equals(name2)) {
            out.println("Я тебя так долго ждал");
        } else out.println("Добрый день, а вы кто?");
    }
}
