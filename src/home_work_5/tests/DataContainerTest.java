package home_work_5.tests;

import home_work_5.DataContainer;
import home_work_5.comparators.AliensComparator;
import home_work_5.elements.Alien;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DataContainerTest {
    @Test
    @Order(0)
    public void addOneElementToEmptyArray(){
        DataContainer<Alien> container = new DataContainer<>(new Alien[]{});
        container.add(new Alien(780, "John"));
    }

    @Test
    @Order(1)
    public void addOneElementToArrayWithSize1(){
        DataContainer<Alien> container = new DataContainer<>(new Alien [1]);
        container.add(new Alien(780, "John"));
    }

    @Test
    @Order(2)
    public void addOneElementToArrayWithSize2(){
        DataContainer<Alien> container = new DataContainer<>(new Alien[2]);
        container.add(new Alien(780, "John"));
        Assertions.assertEquals("John", container.get(0).getAlienName());
    }

    @Test
    @Order(3)
    public void addOneElementToArrayRepeat(){
        DataContainer<Alien> container = new DataContainer<>(new Alien[2]);
        container.add(new Alien(780, "John"));
        container.add(new Alien(560, "Joe"));
        Assertions.assertEquals("Joe", container.get(1).getAlienName());
    }

    @Test
    @Order(4)
    public void addOneElementToArrayRepeat2(){
        DataContainer<Alien> container = new DataContainer<>(new Alien[3]);
        container.add(new Alien("John"));
        container.add(new Alien("Joe"));
        container.add(new Alien("JJ"));
        Assertions.assertEquals("Joe", container.get(1).getAlienName());
    }

    @Test
    @Order(5)
    public void addOneElementToArrayWithEmptySectionInMiddle(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"),new Alien("John"), new Alien("Joe"), null, null, null};
        DataContainer<Alien> container = new DataContainer<>(arr);
        int index = container.add(new Alien("JJ"));
        Assertions.assertEquals(3, index);
    }

    @Test
    @Order(6)
    public void addNullElement(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"),new Alien("John"), new Alien("Joe"), null, null, null};
        DataContainer<Alien> container = new DataContainer<>(arr);
        int index = container.add(null);
        Assertions.assertEquals(-1, index);
    }

    @Test
    @Order(7)
    public void addElementNullOnSecondPosition(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), null, new Alien("John"), null, null, null};
        DataContainer<Alien> container = new DataContainer<>(arr);
        int index = container.add(new Alien("JJ"));
        Assertions.assertEquals(1, index);
    }

    @Test
    @Order(8)
    public void addElementToFullArray(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"), new Alien("Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        int index = container.add(new Alien("JJ"));
        Assertions.assertEquals(3, index);
    }

    @Test
    @Order(9)
    public void addElementToFullArrayAndCheckElement(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"), new Alien("Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        int index = container.add(new Alien("JJ"));
        Assertions.assertEquals("JJ", container.get(index).getAlienName());
    }

    @Test
    @Order(10)
    public void getElementWhenIndexNotExistInArray(){
        Alien[] arr = new Alien[]{new Alien("Jimmy")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Assertions.assertNull(container.get(1));
    }

    @Test
    @Order(11)
    public void getItems(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"), new Alien("Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Alien[] fromContainer = container.getItems();

        Assertions.assertArrayEquals(arr, fromContainer);
    }

    @Test
    @Order(12)
    public void deleteTrue(){
        Alien[] arr = new Alien[]{new Alien("Jimmy")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Assertions.assertTrue(container.delete(0));
    }

    @Test
    @Order(13)
    public void deleteNotCorrectIndex(){
        Alien[] arr = new Alien[]{new Alien("Jimmy")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Assertions.assertFalse(container.delete(1));
    }


    @Test
    @Order(14)
    public void deleteCheckGet(){
        Alien[] arr = new Alien[]{new Alien("Jimmy")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(0);
        Assertions.assertNull(container.get(0));
    }

    @Test
    @Order(15)
    public void deleteCheckArray(){
        Alien[] arr = new Alien[]{new Alien("Jimmy")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(0);
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals(0, fromContainer.length);
    }

    @Test
    @Order(16)
    public void deleteFirstElement(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(0);
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals("John", fromContainer[0].getAlienName());
        Assertions.assertEquals("Joe", fromContainer[1].getAlienName());
        Assertions.assertEquals("JJ", fromContainer[2].getAlienName());
    }

    @Test
    @Order(17)
    public void deleteSecondElement(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(1);
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals("Jimmy", fromContainer[0].getAlienName());
        Assertions.assertEquals("Joe", fromContainer[1].getAlienName());
        Assertions.assertEquals("JJ", fromContainer[2].getAlienName());
    }

    @Test
    @Order(18)
    public void deleteLastElement(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(3);
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals("Jimmy", fromContainer[0].getAlienName());
        Assertions.assertEquals("John", fromContainer[1].getAlienName());
        Assertions.assertEquals("Joe", fromContainer[2].getAlienName());
    }

    @Test
    @Order(19)
    public void deleteByItem(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertTrue(container.delete(new Alien("John")));
    }

    @Test
    @Order(20)
    public void deleteByItemCorrectSize(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Assertions.assertTrue(container.delete(new Alien("John")));
        Alien[] fromContainer = container.getItems();
        Assertions.assertEquals(3, fromContainer.length);
    }

    @Test
    @Order(21)
    public void deleteByItemCorrectData(){
        Alien[] arr = new Alien[]{new Alien("Jimmy"), new Alien("John"),
                new Alien("Joe"), new Alien("JJ")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        Assertions.assertTrue(container.delete(new Alien("John")));
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals("Jimmy", fromContainer[0].getAlienName());
        Assertions.assertEquals("Joe", fromContainer[1].getAlienName());
        Assertions.assertEquals("JJ", fromContainer[2].getAlienName());
    }

    @Test
    @Order(22)
    public void deleteByItemCheckCorrectEquals(){
        Alien[] arr = new Alien[]{new Alien("first"), new Alien("second")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(new Alien("first"));
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals("second", fromContainer[0].getAlienName());;
    }

    @Test
    @Order(23)
    public void deleteDoubleEqualsElement(){
        Alien[] arr = new Alien[]{new Alien("first"), new Alien("first")};
        DataContainer<Alien> container = new DataContainer<>(arr);
        container.delete(new Alien("first"));
        Alien[] fromContainer = container.getItems();

        Assertions.assertEquals(1, fromContainer.length);
    }

    @Test
    @Order(24)
    public void deleteNull(){
        Alien[] arr = new Alien[]{new Alien("first"), new Alien("first")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertFalse(container.delete(null));
    }

    @Test
    @Order(25)
    public void toStringEmpty(){
        Alien[] arr = new Alien[]{};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertEquals("[]", container.toString());
    }

    @Test
    @Order(26)
    public void toStringWithOneElement(){
        Alien[] arr = new Alien[]{new Alien("Bill")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertEquals("[Alien{headSizeInMillimeters=0, alienName='Bill'}]", container.toString());
    }

    @Test
    @Order(27)
    public void toStringWithTwoElement(){
        Alien[] arr = new Alien[]{new Alien(590, "Bill"), new Alien(400, "Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertEquals("[Alien{headSizeInMillimeters=590, alienName='Bill'}," +
                " Alien{headSizeInMillimeters=400, alienName='Joe'}]", container.toString());
    }

    @Test
    @Order(28)
    public void toStringWithNullElement(){
        Alien[] arr = new Alien[]{new Alien(590, "Bill"), null, new Alien(400, "Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertEquals("[Alien{headSizeInMillimeters=590, alienName='Bill'}," +
                " Alien{headSizeInMillimeters=400, alienName='Joe'}]", container.toString());
    }

    @Test
    @Order(29)
    public void toStringWithNullFromStartElement(){
        Alien[] arr = new Alien[]{null, new Alien(590, "Bill"), new Alien(400, "Joe")};
        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertEquals("[Alien{headSizeInMillimeters=590, alienName='Bill'}," +
                " Alien{headSizeInMillimeters=400, alienName='Joe'}]", container.toString());
    }

    @Test
    @Order(30)
    public void sortNonStatic(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100,"Bill");
        arr[1] = new Alien(500, "Henry");
        arr[2] = new Alien(320, "Joe");
        arr[3] = new Alien(180, "Nick");

        DataContainer<Alien> container = new DataContainer<>(arr);

        container.sort(new AliensComparator());

        Assertions.assertEquals("Bill", container.get(0).getAlienName());
        Assertions.assertEquals("Nick", container.get(1).getAlienName());
        Assertions.assertEquals("Joe", container.get(2).getAlienName());
        Assertions.assertEquals("Henry", container.get(3).getAlienName());
    }

    @Test
    @Order(31)
    public void sortStatic1(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100, "Nickolas");
        arr[1] = new Alien(500, "Bill");
        arr[2] = new Alien(320, "Joe");
        arr[3] = new Alien(180, "Henry");

        DataContainer<Alien> container = new DataContainer<>(arr);

        DataContainer.sort(container);

        Assertions.assertEquals("Bill", container.get(0).getAlienName());
        Assertions.assertEquals("Henry", container.get(1).getAlienName());
        Assertions.assertEquals("Joe", container.get(2).getAlienName());
        Assertions.assertEquals("Nickolas", container.get(3).getAlienName());
    }

    @Test
    @Order(32)
    public void sortStatic1WithNull(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100, "Nickolas");
        arr[1] = new Alien(500, "Bill");
        arr[2] = null;
        arr[3] = new Alien(180, "Henry");

        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertThrows(NullPointerException.class, () -> DataContainer.sort(container));
    }

    @Test
    @Order(33)
    public void sortStatic2(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100,"Bill");
        arr[1] = new Alien(500, "Henry");
        arr[2] = new Alien(320, "Joe");
        arr[3] = new Alien(180, "Nick");

        DataContainer<Alien> container = new DataContainer<>(arr);

        DataContainer.sort(container ,new AliensComparator());

        Assertions.assertEquals("Bill", container.get(0).getAlienName());
        Assertions.assertEquals("Nick", container.get(1).getAlienName());
        Assertions.assertEquals("Joe", container.get(2).getAlienName());
        Assertions.assertEquals("Henry", container.get(3).getAlienName());
    }

    @Test
    @Order(34)
    public void sortStatic2WithNull(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100,"Bill");
        arr[1] = null;
        arr[2] = new Alien(320, "Joe");
        arr[3] = new Alien(180, "Nick");

        DataContainer<Alien> container = new DataContainer<>(arr);

        Assertions.assertThrows(NullPointerException.class, () -> DataContainer.sort(container ,new AliensComparator()));
    }

    @Test
    @Order(35)
    public void forEachTest(){
        Alien[] arr = new Alien[4];
        arr[0] = new Alien(100,"Bill");
        arr[1] = new Alien(500, "Henry");
        arr[2] = new Alien(320, "Joe");
        arr[3] = new Alien(180, "Nick");

        DataContainer<Alien> container = new DataContainer<>(arr);

        String finalString = "";

        for (Alien alien : container) {
            finalString += alien.getAlienName() + " ";
        }

        Assertions.assertEquals("Bill Henry Joe Nick ", finalString);
    }
}