package additional.collections.tests;

import additional.collections.dto.Animal;
import additional.collections.exceptions.IncorrectDataException;
import additional.collections.exceptions.NotEnoughInformationException;
import additional.collections.util.AnimalCreator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AnimalCreatorTest {
    @Test
    @Order(0)
    public void testGetAnimalCorrect () {
        AnimalCreator creator = new AnimalCreator();
        creator.setNickFromFile();

        Animal animal = null;
        String regex = "^Animal: [А-Яа-я]+, age: 8$";

        try {
            creator.setAge(8);
            animal = creator.getAnimal();
        } catch (IncorrectDataException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughInformationException ex) {
            ex.printStackTrace();
        } finally {
            Assertions.assertNotNull(animal);
            Assertions.assertTrue(animal.toString().matches(regex));
        }
    }

    @Test
    @Order(1)
    public void testSetNegativeAge () {
        AnimalCreator creator = new AnimalCreator();
        String message = "";

        try {
            creator.setAge(-123);
        } catch (IncorrectDataException e) {
            message = e.getMessage();
        } finally {
            Assertions.assertEquals("Некорректный возраст животного", message);
        }
    }

    @Test
    @Order(2)
    public void testSetNullAge () {
        AnimalCreator creator = new AnimalCreator();
        String message = "";

        try {
            creator.setAge(0);
        } catch (IncorrectDataException e) {
            message = e.getMessage();
        } finally {
            Assertions.assertEquals("Некорректный возраст животного", message);
        }
    }

    @Test
    @Order(3)
    public void testSetTooLongPassword () {
        AnimalCreator creator = new AnimalCreator();
        String message = "";

        try {
            creator.setAge(123456789);
        } catch (IncorrectDataException e) {
            message = e.getMessage();
        } finally {
            Assertions.assertEquals("Некорректный возраст животного", message);
        }
    }

    @Test
    @Order(4)
    public void testGetPersonNotEnoughData () {
        AnimalCreator creator = new AnimalCreator();
        Animal animal = null;
        creator.setNickFromFile();

        String message = "";

        try {
            animal = creator.getAnimal();

        } catch (NotEnoughInformationException ex) {
            message = ex.getMessage();
        } finally {
            Assertions.assertNull(animal);
            Assertions.assertEquals("Не все поля заполнены", message);
        }
    }
}
