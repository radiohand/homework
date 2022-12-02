package home_work_4.home_work_1;

import home_work_1.OperatorPriority;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperatorPriorityTest {
    @Test
    @DisplayName("Проверка первой операции")
    public void testFirst () {
        Assertions.assertEquals(5, OperatorPriority.firstOperation());
    }

    @Test
    @DisplayName("Проверка второй операции")
    public void testSecond () {
        Assertions.assertEquals(0, OperatorPriority.secondOperation());
    }

    @Test
    @DisplayName("Проверка третьей операции")
    public void testThird () {
        Assertions.assertEquals(0, OperatorPriority.thirdOperation(2));
    }

    @Test
    @DisplayName("Проверка четвертой операции")
    public void testFourth () {
        Assertions.assertEquals(1, OperatorPriority.fourthOperation(8,2));
    }

    @Test
    @DisplayName("Проверка пятой операции")
    public void testFifth () {
        Assertions.assertEquals(0, OperatorPriority.fifthOperation(8, 2));
    }

    @Test
    @DisplayName("Проверка шестой операции")
    public void testSixth () {
        Assertions.assertEquals(11, OperatorPriority.sixthOperation(8, 2));
    }

    @Test
    @DisplayName("Проверка восьмой операции")
    public void testEighth () {
        Assertions.assertFalse(OperatorPriority.eighthOperation());
    }

    @Test
    @DisplayName("Проверка девятой операции")
    public void testNinth () {
        Assertions.assertFalse(OperatorPriority.ninthOperation());
    }
}
