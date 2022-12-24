package additional.collections.tests;

import additional.collections.util.StringsGenerator;
import org.junit.jupiter.api.*;

import java.io.File;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringGeneratorTest {

    @Test
    @Order(0)
    public void testUnicodeRandomLength () {
        StringsGenerator generator = new StringsGenerator();
        Assertions.assertEquals(10, generator.getStringUnicodeRandom(10).length());
    }

    @Test
    @Order(1)
    public void testAlphabeticRandomLength () {
        StringsGenerator generator = new StringsGenerator();
        Assertions.assertEquals(10, generator.getStringAlphabeticRandom('A', 20, 10).length());
    }

    @RepeatedTest(10)
    @Order(2)
    public void testAlphabeticRandomLetters () {
        StringsGenerator generator = new StringsGenerator();
        String stringToTest = generator.getStringAlphabeticRandom(0, 1000, 10);
        char [] arrayToTest = stringToTest.toCharArray();
        for (int i = 0; i < 10; i++) {
            Assertions.assertTrue(Character.isAlphabetic(arrayToTest[i]));
        }
    }

    @RepeatedTest(10)
    @Order(3)
    public void testRandomFromArray () {
        boolean contains = false;
        StringsGenerator generator = new StringsGenerator();
        String [] stringsArray = new String[] {"один", "два", "три", "четыре", "пятьсот тысяч"};

        String stringToTest = generator.getStringRandomFromArray(stringsArray);

        for (String s : stringsArray) {
            if (s.equals(stringToTest)) {
                contains = true;
                break;
            }
        }

        Assertions.assertTrue(contains);
    }

    @RepeatedTest(10)
    @Order(4)
    public void testRandomFromFile () {
        boolean contains = false;
        StringsGenerator generator = new StringsGenerator();
        String [] stringsArray = new String[] {"Петя", "Вася", "Саша", "Гоша", "Ваня", "Маша", "Света", "Вика", "Аня", "Юля"};
        File file = new File("src/additional/collections/txt/names.txt");

        String stringToTest = generator.getStringRandomFromFile(file);

        for (String s : stringsArray) {
            if (s.equals(stringToTest)) {
                contains = true;
                break;
            }
        }

        Assertions.assertTrue(contains);
    }
}
