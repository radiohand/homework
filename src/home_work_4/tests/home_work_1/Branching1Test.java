package home_work_4.tests.home_work_1;

import home_work_1.Branching1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Branching1Test {
    @Test
    @DisplayName("Проверка с четным числом")
    public void testEven () {
        Assertions.assertTrue(Branching1.isEven(456));
    }

    @Test
    @DisplayName("Проверка с нечетным числом")
    public void testOdd () {
        Assertions.assertFalse(Branching1.isEven(13));
    }

    @Test
    @DisplayName("Проверка с четным числом и переполнением")
    public void testEvenOverflow () {
        Assertions.assertTrue(Branching1.isEven(Integer.MAX_VALUE+3));
    }

    @Test
    @DisplayName("Проверка с нечетным числом и переполнением")
    public void testOddOverflow () {
        Assertions.assertFalse(Branching1.isEven(Integer.MIN_VALUE-3));
    }
}
