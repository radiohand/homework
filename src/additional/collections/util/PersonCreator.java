package additional.collections.util;

import additional.collections.dto.Person;
import additional.collections.exceptions.IncorrectDataException;
import additional.collections.exceptions.NotEnoughInformationException;

import java.io.File;

public class PersonCreator {

    private String nick;
    private String password;
    private String name;

    public PersonCreator() {}

    private final String [] namesArray = new String[]
    {"Петя", "Вася", "Саша", "Гоша", "Ваня", "Маша", "Света", "Вика", "Аня", "Юля"};

    private final File namesFile = new File ("src/additional/collections/txt/names.txt");

    private final File nickNamesFile = new File("src/additional/collections/txt/personNickNames.txt");

    private final StringsGenerator generator = new StringsGenerator();

    public Person getPerson() throws NotEnoughInformationException {
        if (nick != null && password != null && name != null) {
            return new Person(nick, password, name);
        } else throw new NotEnoughInformationException("Не все поля заполнены");
    }

    /**
     * Инициализировать поле 'name' строкой из произвольных символов
     */
    public void setNameFullRandom () {
        this.name = generator.getStringUnicodeRandom(10);
    }

    /**
     * Инициализировать поле 'name' строкой из русских букв
     */
    public void setNameRussianRandom () {

        this.name = generator.getStringAlphabeticRandom('А', 63, 10);
    }

    /**
     * Инициализировать поле 'name' произвольным именем из массива
     */
    public void setRealNameRandom () {
        this.name = generator.getStringRandomFromArray(namesArray);
    }

    /**
     * Инициализировать поле 'name' произвольным именем из файла
     */
    public void setNameFromFile () {
        this.name = generator.getStringRandomFromFile(namesFile);
    }

    /**
     * Инициализировать поле 'nick' строкой из произвольных символов
     */
    public void setNickFullRandom () {
        this.nick = generator.getStringUnicodeRandom(10);
    }

    /**
     * Инициализировать поле 'nick' строкой из английских букв
     */
    public void setNickEnglishRandom () {

        this.nick = generator.getStringAlphabeticRandom('A', 57, 10);
    }

    /**
     * Инициализировать поле 'nick' произвольным именем из файла
     */
    public void setNickFromFile () {
        this.nick = generator.getStringRandomFromFile(nickNamesFile);
    }

    /**
     * Инициализировать поле 'password' переданной строкой
     * @param password принимаемая строка
     * @throws IncorrectDataException при передаче строки длинной меньше 5 или больше 10
     */
    public void setPassword (String password) throws IncorrectDataException {
        if (password.length() < 5 || password.length() > 10) {
            throw new IncorrectDataException("Некорректная длина пароля");
        } else this.password = password;
    }
}