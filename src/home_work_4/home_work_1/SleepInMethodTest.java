package home_work_4.home_work_1;

import home_work_1.SleepInMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class SleepInMethodTest {
    @Test
    @DisplayName("Проверка буднего дня во время отпуска")
    public void testWeekdayOnVacation () {
        Assertions.assertTrue(SleepInMethod.sleepIn(true, true));
    }

    @Test
    @DisplayName("Проверка выходного дня во время отпуска")
    public void testWeekendOnVacation () {
        Assertions.assertTrue(SleepInMethod.sleepIn(false, true));
    }

    @Test
    @DisplayName("Проверка буднего дня не в отпуске")
    public void testWeekdayNotVacation () {
        Assertions.assertFalse(SleepInMethod.sleepIn(true, false));
    }

    @Test
    @DisplayName("Проверка выходного дня не в отпуске")
    public void testWeekendNotVacation () {
        Assertions.assertTrue(SleepInMethod.sleepIn(false, false));
    }

}
