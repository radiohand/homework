package home_work_4.tests.home_work_1;

import home_work_1.Branching3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
public class Branching3Test {

    @Test
    @DisplayName("Проверка наличия остатка")
    public void testWithRemainder () {
        Assertions.assertTrue (Branching3.hasRemainder(57, 30));
    }

    @Test
    @DisplayName("Проверка отсутствия остатка")
    public void testWithoutRemainder () {
        Assertions.assertFalse (Branching3.hasRemainder(60,30));
    }

    @Test
    @DisplayName("Проверка остатка от деления на 0")
    public void testRemainderNullDividing () {
        Assertions.assertTrue (Branching3.hasRemainder(60,0));
    }

    @Test
    @DisplayName("Проверка частного при делении с остатком")
    public void testDividingWithReminder () {
        Assertions.assertEquals (2.5,Branching3.divider(5, 2));
    }

    @Test
    @DisplayName("Проверка частного при делении без остатка")
    public void testDividingWithoutReminder () {
        Assertions.assertEquals (6,Branching3.divider(18, 3));
    }

    @Test
    @DisplayName("Проверка частного при делении на 0")
    public void testNull () {
        Assertions.assertEquals (Double.POSITIVE_INFINITY,Branching3.divider(18, 0));
    }
}
