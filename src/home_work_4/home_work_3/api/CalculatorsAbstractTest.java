package home_work_4.home_work_3.api;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class CalculatorsAbstractTest {

    public ICalculator calculator;

    @Tag("add")
    @Test
    @DisplayName("Проверка сложения")
    @Order(0)
    public void testAdd () {
        Assertions.assertEquals(147, calculator.add(75, 72));
    }

    @Tag("add")
    @Test
    @DisplayName("Проверка сложения с отрицательным числом")
    @Order(1)
    public void testAddNegative () {
        Assertions.assertEquals(3, calculator.add(75, -72));
    }

    @Tag("subtract")
    @Test
    @DisplayName("Проверка вычитания")
    @Order(2)
    public void testSubtract () {
        Assertions.assertEquals(55, calculator.subtract(93, 38));
    }

    @Tag("subtract")
    @Test
    @DisplayName("Проверка вычитания c отрицательным числом")
    @Order(3)
    public void testSubtractNegative () {
        Assertions.assertEquals(131, calculator.subtract(93, -38));
    }

    @Tag("multiply")
    @Test
    @DisplayName("Проверка умножения")
    @Order(4)
    public void testMultiply () {
        Assertions.assertEquals(105, calculator.multiply(3, 35));
    }

    @Tag("multiply")
    @Test
    @DisplayName("Проверка умножения на отрицательное число")
    @Order(5)
    public void testMultiplyNegative () {
        Assertions.assertEquals(-114, calculator.multiply(3, -38));
    }

    @Tag("divide")
    @Test
    @DisplayName("Проверка деления")
    @Order(6)
    public void testDivide () {
        Assertions.assertEquals(12.1, calculator.divide(36.3, 3));
    }

    @Tag("divide")
    @Test
    @DisplayName("Проверка деления на отрицательное число")
    @Order(7)
    public void testDivideNegative () {
        Assertions.assertEquals(-4, calculator.divide(10, -2.5));
    }

    @Tag("divide")
    @Test
    @DisplayName("Проверка деления на ноль")
    @Order(8)
    public void testDivideNull () {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.divide(10, 0));
    }

    @Tag("exp")
    @Test
    @DisplayName("Проверка возведения в степень")
    @Order(9)
    public void testExp () {
        Assertions.assertEquals(625, calculator.exp(5, 4));
    }

    @Tag("exp")
    @Test
    @DisplayName("Проверка возведения в нулевую степень")
    @Order(10)
    public void testExpNull () {
        Assertions.assertEquals(1, calculator.exp(10, 0));
    }

    @Tag("exp")
    @Test
    @DisplayName("Проверка возведения в отрицательную степень")
    @Order(11)
    public void testExpNegative () {
        Assertions.assertTrue((calculator.exp(10, -3) > 0.00099999) && (calculator.exp(10, -3) < 0.00100001));
    }

    @Tag("exp")
    @Test
    @DisplayName("Проверка возведения в степень отрицательного числа")
    @Order(12)
    public void testExpNegativeBase () {
        Assertions.assertEquals(-27, calculator.exp(-3, 3));
    }

    @Tag("mod")
    @Test
    @DisplayName("Проверка получения модуля")
    @Order(13)
    public void testMod () {
        Assertions.assertEquals(167, calculator.mod(167));
    }

    @Tag("mod")
    @Test
    @DisplayName("Проверка получения модуля от отрицательного числа")
    @Order(14)
    public void testModNegative () {
        Assertions.assertEquals(256, calculator.mod(-256));
    }

    @Tag("squareRoot")
    @Test
    @DisplayName("Проверка получения квадратного корня")
    @Order(15)
    public void testSquareRoot () {
        Assertions.assertEquals(12, calculator.squareRoot(144));
    }

    @Tag("squareRoot")
    @Test
    @DisplayName("Проверка получения квадратного корня от дробного числа")
    @Order(16)
    public void testSquareRootFractional () {
        Assertions.assertTrue((calculator.squareRoot(1043.29) > 32.29) && (calculator.squareRoot(1043.29) < 32.31));
    }

    @Tag("squareRoot")
    @Test
    @DisplayName("Проверка получения квадратного корня от отрицательного числа")
    @Order(17)
    public void testSquareRootNegative () {
        Assertions.assertEquals(Double.NaN, calculator.squareRoot(-144));
    }

    @Test
    @DisplayName("Проверка расчета выражения из задания 1 дз по калькуляторам")
    @Order(18)
    public void testExampleExpression () {
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        double subResult1 = calculator.multiply(b, c);
        double subResult2 = calculator.add(a, subResult1);
        double subResult3 = calculator.divide(d, e);
        double subResult4 = calculator.exp(subResult3, f);

        Assertions.assertEquals(140.45999999999998, calculator.add(subResult2, subResult4));
    }
}
