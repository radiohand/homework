package home_work_1;

import java.util.Objects;

public class UserName1 implements ICommunicationPrinter{

    private static final String NAME_1 = "Вася";
    private static final String NAME_2 = "Анастасия";


    @Override
    public String welcome (String name) {
        StringBuilder builder = new StringBuilder();
        if (Objects.equals(name, NAME_1) || Objects.equals(name, NAME_2)) {
            if (Objects.equals(name, NAME_1)) {
                builder.append("Привет! \n");
            }
            builder.append("Я тебя так долго ждал");
            return builder.toString();
        } else return "Добрый день, а вы кто?";
    }
}
