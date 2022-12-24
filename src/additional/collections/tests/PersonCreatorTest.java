package additional.collections.tests;

import additional.collections.dto.Person;
import additional.collections.exceptions.IncorrectDataException;
import additional.collections.exceptions.NotEnoughInformationException;
import additional.collections.util.PersonCreator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonCreatorTest {
    @Test
    @Order(0)
    public void testGetPersonCorrect () {
        PersonCreator creator = new PersonCreator();
        creator.setNameFromFile();
        creator.setNickFromFile();

        Person person = null;
        String regex = "^Peron: [А-Яа-я]+, with nickname: [A-Za-z]+[.] Password 123456$";

        try {
            creator.setPassword("123456");
            person = creator.getPerson();
        } catch (IncorrectDataException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughInformationException ex) {
            ex.printStackTrace();
        } finally {
            Assertions.assertNotNull(person);
            Assertions.assertTrue(person.toString().matches(regex));
        }
    }

    @Test
    @Order(1)
    public void testSetTooShortPassword () {
        PersonCreator creator = new PersonCreator();
        String message = "";

        try {
            creator.setPassword("123");
        } catch (IncorrectDataException e) {
            message = e.getMessage();
        } finally {
            Assertions.assertEquals("Некорректная длина пароля", message);
        }
    }

    @Test
    @Order(2)
    public void testSetTooLongPassword () {
        PersonCreator creator = new PersonCreator();
        String message = "";

        try {
            creator.setPassword("12345678910123");
        } catch (IncorrectDataException e) {
            message = e.getMessage();
        } finally {
            Assertions.assertEquals("Некорректная длина пароля", message);
        }
    }

    @Test
    @Order(3)
    public void testGetPersonNotEnoughData () {
        PersonCreator creator = new PersonCreator();
        Person person = null;
        creator.setNameFromFile();
        creator.setNickFromFile();

        String message = "";

        try {
            person = creator.getPerson();

        } catch (NotEnoughInformationException ex) {
            message = ex.getMessage();
        } finally {
            Assertions.assertNull(person);
            Assertions.assertEquals("Не все поля заполнены", message);
        }
    }
}
