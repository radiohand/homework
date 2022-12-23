package additional.collections.runners;

import additional.collections.comparators.PersonPasswordNickComparator;
import additional.collections.dto.Person;
import additional.collections.util.CollectionOperations;
import additional.collections.util.StopWatch;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsSortMain {
    public static void main(String[] args) {

        int amount = 2_000;

        LinkedList<Person> personLinkedList = new LinkedList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();

// заполнение

        CollectionOperations.fillCollectionWithPerson(personLinkedList, amount);
        LinkedList<Person> personLinkedList2 = new LinkedList<>(personLinkedList);

        CollectionOperations.fillCollectionWithPerson(personArrayList, amount);
        ArrayList<Person> personArrayList2 = new ArrayList<>(personArrayList);

// сортировка
        StopWatch stopWatch = new StopWatch();
        personLinkedList.sort(new PersonPasswordNickComparator());
        System.out.println("Операция: сортировка jdk LinkedList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        CollectionOperations.sortList(personLinkedList2, new PersonPasswordNickComparator());
        System.out.println("Операция: сортировка LinkedList методом CollectionOperations.sortList. Заняла "
                + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        personArrayList.sort(new PersonPasswordNickComparator());
        System.out.println("Операция: сортировка jdk ArrayList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        CollectionOperations.sortList(personArrayList2, new PersonPasswordNickComparator());
        System.out.println("Операция: сортировка ArrayList методом CollectionOperations.sortList. Заняла "
                + stopWatch.get() + "мс.");

        System.out.println("Результат сортировок LinkedLis совпадает: " + personLinkedList.equals(personLinkedList2));

        System.out.println("Результат сортировок ArrayList совпадает: " + personArrayList.equals(personArrayList2));
    }
}
