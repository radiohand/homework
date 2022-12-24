package additional.collections.util;

import additional.collections.dto.Animal;
import additional.collections.exceptions.IncorrectDataException;
import additional.collections.exceptions.NotEnoughInformationException;

import java.io.File;

public class AnimalCreator {

    private int age = -1;
    private String nick;

    private final String [] nicksArray = new String[] {"Бублик", "Гав", "Чарли", "Бейли", "Купер", "Макс"};

    private final File nicksFile = new File("src/additional/collections/txt/animalNickNames.txt");

    private final StringsGenerator generator = new StringsGenerator();

    public Animal getAnimal() throws NotEnoughInformationException {
        if (nick != null & age > 0) {
            return new Animal(nick, age);
        } else throw new NotEnoughInformationException("Не все поля заполнены");
    }

    /**
     * Инициализировать поле 'nick' строкой из произвольных символов
     */
    public void setNickFullRandom () {
        this.nick = generator.getStringUnicodeRandom(10);
    }

    /**
     * Инициализировать поле 'nick' строкой из русских букв
     */
    public void setNickRussianRandom () {

        this.nick = generator.getStringAlphabeticRandom('А', 63, 10);
    }

    /**
     * Инициализировать поле 'nick' произвольной строкой из массива
     */
    public void setRealNickRandom () {
        this.nick = generator.getStringRandomFromArray(nicksArray);
    }

    /**
     * Инициализировать поле 'nick' произвольной строкой из файла
     */
    public void setNickFromFile () {
        this.nick = generator.getStringRandomFromFile(nicksFile);
    }

    /**
     *
     * @param age Инициализировать поле 'nick' переданным значением
     * @throws IncorrectDataException если аргумент меньше 1 или больше 15
     */
    public void setAge (int age) throws IncorrectDataException {
        if (age < 1 || age > 15) {
            throw new IncorrectDataException("Некорректный возраст животного");
        } else this.age = age;
    }
}
