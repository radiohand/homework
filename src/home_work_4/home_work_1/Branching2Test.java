package home_work_4.home_work_1;

import home_work_1.Branching2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Branching2Test {
    @Test
    @DisplayName("Проверка с положительными числами")
    public void testPositive () {
        Assertions.assertEquals (39, Branching2.averageNum(39,78,22));
    }

    @Test
    @DisplayName("Проверка с отрицательными числами")
    public void testNegative () {
        Assertions.assertEquals (-39, Branching2.averageNum(-39,-78,-22));
    }

    @Test
    @DisplayName("Проверка с  положительными и отрицательными числами")
    public void testPositiveAndNegative () {
        Assertions.assertEquals (-2, Branching2.averageNum(-123,78,-2));
    }

    @Test
    @DisplayName("Проверка с  переполнением")
    public void testOverflow () {
        Assertions.assertEquals (1091234, Branching2.averageNum(Integer.MIN_VALUE-1,10,1091234));
    }

    @Test
    @DisplayName("Проверка с 3мя одинаковыми числами")
    public void testAllSameNumbers () {
        Assertions.assertEquals (8, Branching2.averageNum(8,8,8));
    }

    @Test
    @DisplayName("Проверка с 2мя одинаковыми числами")
    public void testTwoSameNumbers () {
        Assertions.assertEquals (0, Branching2.averageNum(0,8,0));
    }
}
