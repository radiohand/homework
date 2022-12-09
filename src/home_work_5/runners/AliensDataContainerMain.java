package home_work_5.runners;

import home_work_5.DataContainer;
import home_work_5.comparators.AliensComparator;
import home_work_5.elements.Alien;

import java.util.Arrays;
import java.util.Random;

public class AliensDataContainerMain {
    public static void main(String[] args) {

        Alien [] aliensArray = getAliensArray();
        printAliensArray(aliensArray);

        DataContainer <Alien> aliensContainer = new DataContainer<> (aliensArray);

        System.out.println("After creation: \n" + Arrays.toString(aliensContainer.getItems()));

        System.out.println("add to index " + aliensContainer.add(new Alien(10, "Bill")));

        System.out.println("After adding an element: \n" + Arrays.toString(aliensContainer.getItems()));

        System.out.println("Element taken from index: \n" + aliensContainer.get(6).getAlienName());

        aliensContainer.delete(8);
        aliensContainer.delete(new Alien("Alien 3"));

        System.out.println("After deleting: \n" + aliensContainer);

        aliensContainer.sort(new AliensComparator());

        System.out.println("After sort: " + aliensContainer);

        DataContainer <Alien> aliensContainer2 = new DataContainer<> (getAliensArray());
        DataContainer.sort(aliensContainer2);

        System.out.println("Container #2 after static sort without comparator (by names): \n" + aliensContainer2);

        DataContainer.sort(aliensContainer2, new AliensComparator());

        System.out.println("Container #2 after static sort with comparator (by head sizes): \n" + aliensContainer2);

        System.out.println("Use of iterator:");

        for (Alien alien : aliensContainer2) {
            System.out.print (alien.getAlienName() + ", ");
        }
    }

    /**
     * Создать массив, наполнить его объектами класса Alien
     * @return заполненный массив Alien
     */
    private static Alien [] getAliensArray () {

        Random random = new Random();

        Alien [] aliens = new Alien [10];

        int j = aliens.length - 1;

        for (int i = 0; i < aliens.length; i++) {
            aliens[i] = new Alien(random.nextInt(1000), "Alien " + j);
            j--;
        }
        return aliens;
    }

    /**
     * Вывести в консоль элементы массива с объектами класса Alien
     * @param a массив объектов Alien
     */
    private static void printAliensArray (Alien [] a) {
        for (Alien alien : a) {
            System.out.print(alien.getAlienName() + " with head size: " + alien.getHeadSizeInMillimeters());
            System.out.println();
        }
    }
}
