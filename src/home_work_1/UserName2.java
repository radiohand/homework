package home_work_1;

import java.util.Objects;

public class UserName2 implements ICommunicationPrinter {

    private static final String NAME_1 = "Вася";
    private static final String NAME_2 = "Анастасия";

    @Override
    public String welcome(String name) {
        if (Objects.equals(name, NAME_1)) {
            return "Привет! \nЯ тебя так долго ждал";
        } else if (Objects.equals(name, NAME_2)) {
            return "Я тебя так долго ждал";
        } else return ("Добрый день, а вы кто?");
    }
}
