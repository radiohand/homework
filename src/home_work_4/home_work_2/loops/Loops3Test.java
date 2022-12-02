package home_work_4.tests.home_work_2.loops;

import home_work_2.loops.Loops3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Loops3Test {
    @Test
    @DisplayName("Проверка возведения 18 в 5 степень")
    public void test1Example () {
        Assertions.assertEquals(1889568, Loops3.pow(18, 5));
    }

    @Test
    @DisplayName("Проверка возведения 7.5 в 2 степень")
    public void test2Example () {
        Assertions.assertEquals(56.25, Loops3.pow(7.5, 2));
    }

    @Test
    @DisplayName("Проверка возведения отрицательного числа в четную степень")
    public void testNegativeBaseEvenExp () {
        Assertions.assertEquals(36, Loops3.pow(-6, 2));
    }

    @Test
    @DisplayName("Проверка возведения отрицательного числа в нечетную степень")
    public void testNegativeBaseOddExp () {
        Assertions.assertEquals(-216, Loops3.pow(-6, 3));
    }

    @Test
    @DisplayName("Проверка возведения в отрицательную степень")
    public void testNegativeExp () {
        Assertions.assertEquals(-1, Loops3.pow(29, -2));
    }

    @Test
    @DisplayName("Проверка возведения в 0 степень")
    public void testNullExp () {
        Assertions.assertEquals(1, Loops3.pow(398, 0));
    }

    @Test
    @DisplayName("Проверка возведения в очень большую степень")
    public void testBigExp () {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Loops3.pow(10, Integer.MAX_VALUE));
    }
}
