package home_work_4.tests.home_work_2.loops;

import home_work_2.loops.Loops2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Loops2Test {
    @Test
    @DisplayName("Проверяем работу с числом 181232375")
    public void testFirstExampleNumber () {
        Assertions.assertEquals(10080, Loops2.multiply("181232375"));
    }

    @Test
    @DisplayName("Проверяем работу с числом 99.2")
    public void testSecondExampleNumber () {
        Assertions.assertEquals(-1, Loops2.multiply("99.2"));
    }

    @Test
    @DisplayName("Проверяем работу с нечисловыми символами")
    public void testThirdExampleNumber () {
        Assertions.assertEquals(-1, Loops2.multiply("Привет"));
    }

    @Test
    @DisplayName("Проверяем работу с большим числом")
    public void testBigNumber () {
        Assertions.assertEquals(-1, Loops2.multiply("9999999999999999999999999999999999999999999"));
    }

    @Test
    @DisplayName("Проверяем работу с отрицательным числом")
    public void testNegativeNumber () {
        Assertions.assertEquals(-1, Loops2.multiply("-181232375"));
    }
}
