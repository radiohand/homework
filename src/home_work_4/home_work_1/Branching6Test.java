package home_work_4.home_work_1;

import home_work_1.Branching6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Branching6Test {
    @Test
    @DisplayName("Проверка високосного года")
    public void testLeap () {
        Assertions.assertTrue(Branching6.isLeapYear(2024));
    }

    @Test
    @DisplayName("Проверка невисокосного года")
    public void testNotLeap () {
        Assertions.assertFalse(Branching6.isLeapYear(2037));
    }

    @Test
    @DisplayName("Проверка года кратного 100 и 400")
    public void testLeapCentury () {
        Assertions.assertTrue(Branching6.isLeapYear(2400));
    }

    @Test
    @DisplayName("Проверка года кратного 100 и не кратного 400")
    public void testNotLeapCentury () {
        Assertions.assertFalse(Branching6.isLeapYear(2300));
    }

    @Test
    @DisplayName("Проверка 0 года))")
    public void testLeapNullYear () {
        Assertions.assertTrue(Branching6.isLeapYear(0));
    }

    @Test
    @DisplayName("Проверка отрицательного года)))")
    public void testLeapNegativeYear () {
        Assertions.assertTrue(Branching6.isLeapYear(-2400));
    }
}
