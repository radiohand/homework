package additional.collections.runners;

import additional.collections.dto.Person;
import additional.collections.util.CollectionOperations;
import additional.collections.util.StopWatch;

import java.util.*;

public class CollectionsTimeOfOperationsMain {
    public static void main(String[] args) {

        int amount = 100_000;

        LinkedList<Person> personLinkedList = new LinkedList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        HashSet <Person> personHashSet = new HashSet<>();
        TreeSet <Person> personTreeSet = new TreeSet<>();

// заполнение

        StopWatch stopWatch = new StopWatch();
        CollectionOperations.fillCollectionWithPerson(personLinkedList, amount);
        System.out.println("Операция: заполнение LinkedList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        CollectionOperations.fillCollectionWithPerson(personArrayList, amount);
        System.out.println("Операция: заполнение ArrayList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        CollectionOperations.fillCollectionWithPerson(personHashSet, amount);
        System.out.println("Операция: заполнение HashSet. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        CollectionOperations.fillCollectionWithPerson(personTreeSet, amount);
        System.out.println("Операция: заполнение TreeSet. Заняла " + stopWatch.get() + "мс.");

// итерирование при помощи итератора (foreach)

        stopWatch = new StopWatch();
        for (Person person : personLinkedList) {}
        System.out.println("Операция: foreach итерирование LinkedList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        for (Person person : personArrayList) {}
        System.out.println("Операция: foreach итерирование ArrayList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        for (Person person : personHashSet) {}
        System.out.println("Операция: foreach итерирование HashSet. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        for (Person person : personTreeSet) {}
        System.out.println("Операция: foreach итерирование TreeSet. Заняла " + stopWatch.get() + "мс.");

// итерирование при помощи for

        stopWatch = new StopWatch();
        for (int i = 0; i< personLinkedList.size(); i++) {
                personLinkedList.get(i);
        }
        System.out.println("Операция: for итерирование LinkedList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        for (int i = 0; i< personArrayList.size(); i++) {
            personArrayList.get(i);
        }
        System.out.println("Операция: for итерирование ArrayList. Заняла " + stopWatch.get() + "мс.");

// удаление всех элементов коллекции

        stopWatch = new StopWatch();
        personLinkedList.clear();
        System.out.println("Операция: удаление элементов LinkedList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        personArrayList.clear();
        System.out.println("Операция: удаление элементов ArrayList. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        personHashSet.clear();
        System.out.println("Операция: удаление элементов HashSet. Заняла " + stopWatch.get() + "мс.");

        stopWatch = new StopWatch();
        personTreeSet.clear();
        System.out.println("Операция: удаление элементов TreeSet. Заняла " + stopWatch.get() + "мс.");
    }
}
