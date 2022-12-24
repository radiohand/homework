package additional.collections.tests;

import additional.collections.comparators.PersonPasswordNickComparator;
import additional.collections.dto.Animal;
import additional.collections.dto.Person;
import additional.collections.util.CollectionOperations;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CollectionOperationsTest {

    @Test
    @Order(0)
    public void testFillCollectionPersonCorrectSize () {
        ArrayList <Person> persons = new ArrayList<>();
        CollectionOperations.fillCollectionWithPerson(persons, 100);
        Assertions.assertEquals(100, persons.size());
    }

    @Test
    @Order(1)
    public void testGetElementFromFilledCollectionPerson () {
        ArrayList <Person> persons = new ArrayList<>();
        CollectionOperations.fillCollectionWithPerson(persons, 100);

        String regex = "^Peron: [А-Яа-я]+, with nickname: [A-Za-z]+[.] Password .+$";

        System.out.println(persons.get(57).toString());

        Assertions.assertTrue(persons.get(57).toString().matches(regex));
    }

    @Test
    @Order(2)
    public void testFillCollectionAnimalCorrectSize () {
        ArrayList <Animal> animals = new ArrayList<>();
        CollectionOperations.fillCollectionWithAnimal(animals, 100);
        Assertions.assertEquals(100, animals.size());
    }

    @Test
    @Order(3)
    public void testGetElementFromFilledCollectionAnimal () {
        ArrayList <Animal> animals = new ArrayList<>();
        CollectionOperations.fillCollectionWithAnimal(animals, 100);

        String regex = "^Animal: [А-Яа-я]+, age: [0-9]+$";

        System.out.println(animals.get(57).toString());

        Assertions.assertTrue(animals.get(57).toString().matches(regex));
    }

    @Test
    @Order(4)
    public void testSortCollectionIsCorrect () {
        ArrayList <Person> persons = new ArrayList<>();
        CollectionOperations.fillCollectionWithPerson(persons, 100);
        ArrayList <Person> persons2 = new ArrayList<>(persons);
        CollectionOperations.sortList(persons, new PersonPasswordNickComparator());
        persons2.sort(new PersonPasswordNickComparator());
        Assertions.assertEquals(persons, persons2);
    }
}
