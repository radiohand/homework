package home_work_1;

public class UserName3 implements ICommunicationPrinter{

    private static final String NAME_1 = "Вася";
    private static final String NAME_2 = "Анастасия";

    @Override
    public String welcome(String name) {
        switch (name) {
            case NAME_1:
                return ("Привет! \nЯ тебя так долго ждал");
            case NAME_2:
                return ("Я тебя так долго ждал");
            default:
                return ("Добрый день, а вы кто?");
        }
    }
}
