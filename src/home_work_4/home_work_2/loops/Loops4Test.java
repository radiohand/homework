package home_work_4.tests.home_work_2.loops;

import home_work_2.loops.Loops4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Loops4Test {
    @Test
    @DisplayName("Проверка отлова переполнения при умножении на 3")
    public void test1Example () {
        long [] testResult = Loops4.multiply(1, 3);
        Assertions.assertThrows(ArithmeticException.class, ()-> Math.multiplyExact(testResult[0], 3));
    }

    @Test
    @DisplayName("Проверка отлова переполнения при умножении на 188")
    public void test2Example () {
        long [] testResult = Loops4.multiply(1, 188);
        Assertions.assertThrows(ArithmeticException.class, ()-> Math.multiplyExact(testResult[0], 188));
    }

    @Test
    @DisplayName("Проверка отлова переполнения при умножении на -19")
    public void test3Example () {
        long [] testResult = Loops4.multiply(1, -19);
        Assertions.assertThrows(ArithmeticException.class, ()-> Math.multiplyExact(testResult[0], -19));
    }

    @Test
    @DisplayName("Проверка отлова переполнения при умножении на предел long")
    public void testMaxLong () {
        long [] testResult = Loops4.multiply(1, Long.MAX_VALUE);
        Assertions.assertThrows(ArithmeticException.class, ()-> Math.multiplyExact(testResult[0], Long.MAX_VALUE));
    }

    @Test
    @DisplayName("Проверка отлова переполнения при умножении на 1")
    public void testOne () {
        long [] testResult = Loops4.multiply(1, 1);
        Assertions.assertTrue((testResult[0] == 0) && (testResult[1] == 0));
    }

    @Test
    @DisplayName("Проверка отлова переполнения при умножении на 0")
    public void testNull () {
        long [] testResult = Loops4.multiply(1, 0);
        Assertions.assertTrue((testResult[0] == 0) && (testResult[1] == 0));
    }
}
