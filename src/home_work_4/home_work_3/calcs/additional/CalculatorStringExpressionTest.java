package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorStringExpressionTest {

    private final CalculatorStringExpression calculator = new CalculatorStringExpression(new CalculatorWithMathExtends());

    @Test
    @DisplayName("Проверка сложения")
    @Order(0)
    public void testAdd () {
        Assertions.assertEquals(12, calculator.getResult("5+7"));
    }

    @Test
    @DisplayName("Проверка сложения с отрицательным числом")
    @Order(1)
    public void testAddNegative () {
        Assertions.assertEquals(3, calculator.getResult("8 + -5"));
    }

    @Test
    @DisplayName("Проверка вычитания")
    @Order(2)
    public void testSubtract () {
        Assertions.assertEquals(7, calculator.getResult("10 - 3"));
    }

    @Test
    @DisplayName("Проверка вычитания c отрицательным числом")
    @Order(3)
    public void testSubtractNegative () {
        Assertions.assertEquals(13, calculator.getResult("10 - -3"));
    }

    @Test
    @DisplayName("Проверка умножения")
    @Order(4)
    public void testMultiply () {
        Assertions.assertEquals(57, calculator.getResult("3 * 19"));
    }

    @Test
    @DisplayName("Проверка умножения на отрицательное число")
    @Order(5)
    public void testMultiplyNegative () {
        Assertions.assertEquals(-35, calculator.getResult("7 * -5"));
    }

    @Test
    @DisplayName("Проверка деления")
    @Order(6)
    public void testDivide () {
        Assertions.assertEquals(11.1, calculator.getResult("33.3 / 3"));
    }

    @Test
    @DisplayName("Проверка деления на отрицательное число")
    @Order(7)
    public void testDivideNegative () {
        Assertions.assertEquals(-4, calculator.getResult("10 / -2.5"));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    @Order(8)
    public void testDivideNull () {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.getResult("10 / 0"));
    }

    @Test
    @DisplayName("Проверка возведения в степень")
    @Order(9)
    public void testExp () {
        Assertions.assertEquals(625, calculator.getResult("5 ^ 4"));
    }

    @Test
    @DisplayName("Проверка возведения в нулевую степень")
    @Order(10)
    public void testExpNull () {
        Assertions.assertEquals(1, calculator.getResult("10 ^ 0"));
    }

    @Test
    @DisplayName("Проверка возведения в отрицательную степень")
    @Order(11)
    public void testExpNegative () {
        double result = calculator.getResult("10 ^ -3");
        Assertions.assertTrue((result > 0.00099999) &&
                (result < 0.00100001));
    }

    @Test
    @DisplayName("Проверка возведения в степень отрицательного числа")
    @Order(12)
    public void testExpNegativeBase () {
        Assertions.assertEquals(-27, calculator.getResult("-3 ^ 3"));
    }

    @Test
    @DisplayName("Проверка получения модуля")
    @Order(13)
    public void testMod () {
        Assertions.assertEquals(167, calculator.getResult("|167|"));
    }

    @Test
    @DisplayName("Проверка получения модуля от отрицательного числа")
    @Order(14)
    public void testModNegative () {
        Assertions.assertEquals(256, calculator.getResult("|-256|"));
    }

    @Test
    @DisplayName("Проверка преобразования экспоненты")
    @Order(15)
    public void testE () {
        Assertions.assertEquals(Math.E, calculator.getResult("E"));
    }

    @Test
    @DisplayName("Проверка преобразования ПИ")
    @Order(16)
    public void testPI () {
        Assertions.assertEquals(Math.PI, calculator.getResult("PI"));
    }

    @Test
    @DisplayName("Проверка расчета выражения из задания 1 дз по калькуляторам")
    @Order(17)
    public void testExampleExpression () {
        Assertions.assertEquals(140.45999999999998, calculator.getResult("4.1 + 15 * 7 + (28 / 5) ^ 2"));
    }

    @Test
    @DisplayName("Проверка использования скобок")
    @Order(18)
    public void testBrackets () {
        Assertions.assertEquals(10, calculator.getResult("2 + (4*2)"));
    }

    @Test
    @DisplayName("Проверка использования вложенных скобок")
    @Order(19)
    public void testNestedBrackets () {
        Assertions.assertEquals(36, calculator.getResult("2 * ((4*2) + (8+2))"));
    }

    @Test
    @DisplayName("Проверка использования незакрытых скобок")
    @Order(20)
    public void testOpenBrackets () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("2 * ((4*2)"));
    }

    @Test
    @DisplayName("Проверка использования незакрытого модуля")
    @Order(21)
    public void testOpenMod () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("2 * |2 + 2"));
    }

    @Test
    @DisplayName("Проверка использования нескольких операторов подряд")
    @Order(22)
    public void testRepeatOperators () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("2 * + 2"));
    }

    @Test
    @DisplayName("Проверка использования нескольких чисел")
    @Order(23)
    public void testRepeatNumbers () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("2 2 + 3"));
    }

    @Test
    @DisplayName("Проверка использования оператора закрывающего выражение")
    @Order(24)
    public void testEndOnOperator () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("2 + 3 +"));
    }

    @Test
    @DisplayName("Проверка использования оператора открывающего выражение")
    @Order(25)
    public void testStartFromOperator () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("* 2 + 3"));
    }

    @Test
    @DisplayName("Проверка использования недопустимых символов")
    @Order(26)
    public void test () {
        Assertions.assertEquals(Double.NaN, calculator.getResult("abc + 3"));
    }

    @Test
    @DisplayName("Проверка использования возведения выражения в скобках в степень")
    @Order(27)
    public void testBracketsExp () {
        Assertions.assertEquals(25, calculator.getResult("(2+3)^2"));
    }

    @Test
    @DisplayName("Проверка выполнения приоритетов")
    @Order(28)
    public void testPriority () {
        Assertions.assertEquals(25, calculator.getResult("2 + 2 + 3 * (30-10) / 2^2 + 2 * |-3|"));
    }

    @Test
    @DisplayName("Проверка выполнения модуля выражения")
    @Order(29)
    public void testExpressionMod () {
        Assertions.assertEquals(8, calculator.getResult("|-10 + 2|"));
    }

    @Test
    @DisplayName("Проверка расчета с использованием всей функциональности")
    @Order(30)
    public void testFullFunctionality () {
        double controlResult = 2 + 22.3 + 3 * (30 - 10) / Math.pow(29.4, 2) + 2 * Math.abs(10 - 2) + Math.PI - Math.E;
        double calculatedResult = calculator.getResult("2 + 22.3 + 3 * (30-10) / 29.4^2 + 2 * |-10 + 2| + PI - E");
        Assertions.assertTrue(Math.abs(calculatedResult - controlResult) < 1E-10);
    }
}
