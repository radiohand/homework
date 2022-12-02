package home_work_4.home_work_1;

import home_work_1.BitwiseOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class BitwiseOperationsTest {
    @Test
    @DisplayName("Проверяем работу метода andOperator с аргументами в пределах int")
    public void testAndInsideTheLimit () {
        Assertions.assertEquals(66, BitwiseOperations.andOperator(198, 123));
    }

    @Test
    @DisplayName("Проверяем работу метода orOperator с аргументами в пределах int")
    public void testOrInsideTheLimit () {
        Assertions.assertEquals(255, BitwiseOperations.orOperator(198, 123));
    }

    @Test
    @DisplayName("Проверяем работу метода andOperator с аргументами на границах int")
    public void testAndUpperLimit () {
        Assertions.assertEquals(123, BitwiseOperations.andOperator(Integer.MAX_VALUE, 123));
        Assertions.assertEquals(0, BitwiseOperations.andOperator(Integer.MIN_VALUE, 123));
    }

    @Test
    @DisplayName("Проверяем работу метода orOperator с аргументами на границах int")
    public void testOrLowerLimit () {
        Assertions.assertEquals(2147483647, BitwiseOperations.orOperator(Integer.MAX_VALUE, 123));
        Assertions.assertEquals(-2147483525, BitwiseOperations.orOperator(Integer.MIN_VALUE, 123));
    }

    @Test
    @DisplayName("Проверяем работу метода andOperator с двумя аргументами на границах int")
    public void testAndUpperLowerLimit () {
        Assertions.assertEquals(0, BitwiseOperations.andOperator(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("Проверяем работу метода orOperator с двумя аргументами на границах int")
    public void testOrUpperLowerLimit () {
        Assertions.assertEquals(-1, BitwiseOperations.orOperator(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("Проверяем работу метода andOperator с выходом за границу int")
    public void testAndOverflowLimit () {
        Assertions.assertEquals(0, BitwiseOperations.andOperator(Integer.MAX_VALUE+1, 123));
        Assertions.assertEquals(123, BitwiseOperations.andOperator(Integer.MIN_VALUE-1, 123));
    }

    @Test
    @DisplayName("Проверяем работу метода orOperator с выходом за границу int")
    public void testOrOverflowLimit () {
        Assertions.assertEquals(-2147483525, BitwiseOperations.orOperator(Integer.MAX_VALUE+1, 123));
        Assertions.assertEquals(2147483647, BitwiseOperations.orOperator(Integer.MIN_VALUE-1, 123));
    }
}
