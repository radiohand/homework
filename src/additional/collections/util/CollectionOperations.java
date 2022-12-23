package additional.collections.util;

import additional.collections.dto.Animal;
import additional.collections.dto.Person;
import additional.collections.exceptions.IncorrectDataException;
import additional.collections.exceptions.NotEnoughInformationException;

import java.util.*;

public class CollectionOperations {

    /**
     * Заполнить переданную коллекцию переданным количеством объектов класса Person
     * @param collection заполняемая коллекция
     * @param amount количество объектов
     */
    public static void fillCollectionWithPerson (Collection <Person> collection, int amount) {

        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < amount; i++) {

            PersonCreator creator = new PersonCreator();

            creator.setNameFromFile();
            creator.setNickEnglishRandom();

            int passwordSize = random.nextInt(5) + 5;

            for (int j = 0; j < passwordSize; j++) {
                char nextChar = (char) random.nextInt(Character.MAX_CODE_POINT);
                builder.appendCodePoint(nextChar);
            }

            try {
                creator.setPassword(builder.toString());
                collection.add(creator.getPerson());
            } catch (IncorrectDataException | NotEnoughInformationException e) {
                e.printStackTrace();
            } finally {
                builder.setLength(0);
            }
        }
    }

    /**
     * Заполнить переданную коллекцию переданным количеством объектов класса Animal
     * @param collection заполняемая коллекция
     * @param amount количество объектов
     */
    public static void fillCollectionWithAnimal (Collection <Animal> collection, int amount) {

        Random random = new Random();

        for (int i = 0; i < amount; i++) {

            AnimalCreator creator = new AnimalCreator();

            creator.setNickFromFile();

            int age = random.nextInt(14) + 1;

            try {
                creator.setAge(age);
                collection.add(creator.getAnimal());
            } catch (IncorrectDataException | NotEnoughInformationException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Выполнить сортировку переданной коллекции в соответствии с переданным компаратором
     * @param list сортируемая коллекция
     * @param comp компаратор, реализующий алгоритм сравнения элементов
     * @param <E> тип элементов коллекции
     */
    public static <E> void sortList (List <E> list, Comparator<? super E> comp) {

        E buffer;

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (comp.compare(list.get(j), list.get(j - 1)) < 0) {
                    buffer = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set((j - 1), buffer);
                }
            }
        }
    }
}