package home_work_4.home_work_2.loops;

import static home_work_2.loops.Loops5.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Loops5Test {

    @Tag("maxDigit")
    @Test
    @Order(0)
    @DisplayName("1.maxDigit.Проверка положительным числом")
    public void testPositive () {
        Assertions.assertEquals(8, maxDigit(1238043));
    }

    @Tag("maxDigit")
    @Test
    @Order(1)
    @DisplayName("2.maxDigit.Проверка отрицательным числом")
    public void testNegative () {
        Assertions.assertEquals(-1, maxDigit(-11234543));
    }

    @Tag("maxDigit")
    @Test
    @Order(2)
    @DisplayName("3.maxDigit.Проверка предельным положительным числом")
    public void testMaxInt () {
        Assertions.assertEquals(8, maxDigit(Integer.MAX_VALUE));
    }

    @Tag("maxDigit")
    @Test
    @Order(3)
    @DisplayName("4.maxDigit.Проверка числом с одинаковыми цифрами")
    public void testSameDigits () {
        Assertions.assertEquals(5, maxDigit(555555555));
    }

    @Tag("maxDigit")
    @Test
    @Order(4)
    @DisplayName("5.maxDigit.Проверка 0")
    public void testNull () {
        Assertions.assertEquals(0, maxDigit(0));
    }

    @Tag("parityProb")
    @RepeatedTest(5)
    @Order(5)
    @DisplayName("6.parityProb.Положительный размер выборки")
    public void testPositiveSample () {
        Assertions.assertTrue((parityProb(1000) > 45) && (parityProb(1000) < 55));
    }

    @Tag("parityProb")
    @Test
    @Order(6)
    @DisplayName("7.parityProb.Большой размер выборки")
    public void testMaxIntSample () {
        Assertions.assertTrue((parityProb(100000) > 48) && (parityProb(100000) < 52));
    }

    @Tag("parityProb")
    @Test
    @Order(7)
    @DisplayName("8.parityProb.Отрицательный размер выборки")
    public void testNegativeSample () {
        Assertions.assertEquals(-1, parityProb(-250));
    }

    @Tag("parityProb")
    @RepeatedTest(5)
    @Order(8)
    @DisplayName("9.parityProb.Маленький размер выборки")
    public void testSmallSample () {
        Assertions.assertFalse((parityProb(8) > 45) && (parityProb(8) < 55));
    }

    @Tag("parityProb")
    @Test
    @Order(9)
    @DisplayName("10.parityProb.Размер выборки 0")
    public void testNullSample () {
        Assertions.assertEquals(-1, parityProb(0));
    }

    @Tag("parityProb")
    @Test
    @Order(10)
    @DisplayName("11.parityProb.Размер выборки меньше 2")
    public void testOneSample () {
        Assertions.assertEquals(-1, parityProb(1));
    }

    @Tag ("digitsOfNum")
    @Test
    @Order(11)
    @DisplayName("12.digitsOfNum.Проверка положительным числом")
    public void testPositiveNumber () {
        int [] testArray = digitsOfNum(1324576890);
        Assertions.assertEquals(5, testArray [0]);
        Assertions.assertEquals(5, testArray [1]);
    }

    @Tag ("digitsOfNum")
    @Test
    @Order(12)
    @DisplayName("13.digitsOfNum.Проверка отрицательным числом")
    public void testNegativeNumber () {
        int [] testArray = digitsOfNum(-1324576890);
        Assertions.assertEquals(5, testArray [0]);
        Assertions.assertEquals(5, testArray [1]);
    }

    @Tag ("digitsOfNum")
    @Test
    @Order(13)
    @DisplayName("14.digitsOfNum.Проверка предельным положительным")
    public void testMaxNumber () {
        int [] testArray = digitsOfNum(Integer.MAX_VALUE);
        Assertions.assertEquals(6, testArray [0]);
        Assertions.assertEquals(4, testArray [1]);
    }

    @Tag ("digitsOfNum")
    @Test
    @Order(14)
    @DisplayName("15.digitsOfNum.Проверка нулем")
    public void testNullNumber () {
        int [] testArray = digitsOfNum(0);
        Assertions.assertEquals(1, testArray [0]);
        Assertions.assertEquals(0, testArray [1]);
    }

    @Tag ("fibonacci")
    @Test
    @Order(15)
    @DisplayName("16.fibonacci.Размер ряда 10")
    public void testSeries10 () {
        Assertions.assertEquals("1 1 2 3 5 8 13 21 34 55", fibonacci(10));
    }

    @Tag ("fibonacci")
    @Test
    @Order(16)
    @DisplayName("17.fibonacci.Размер ряда 0")
    public void testSeries0 () {
        Assertions.assertEquals(" ", fibonacci(0));
    }

    @Tag ("fibonacci")
    @Test
    @Order(17)
    @DisplayName("18.fibonacci.Отрицательный размер ряда")
    public void testSeriesNegative () {
        Assertions.assertEquals("NegativeNumberError", fibonacci(-1));
    }

    @Tag ("fibonacci")
    @Test
    @Order(18)
    @DisplayName("19.fibonacci.Размер ряда 10000")
    public void testBigSeries () {
        Assertions.assertTrue(fibonacci(10000).contains("Произошло переполнение типа long"));
    }

    @Tag ("stepSeries")
    @Test
    @Order(19)
    @DisplayName("20.stepSeries.Ряд от 1 до 20 с шагом 2")
    public void testNormalStepSeries () {
        Assertions.assertEquals("1 3 5 7 9 11 13 15 17 19 ", stepSeries(1, 20, 2));
    }

    @Tag ("stepSeries")
    @Test
    @Order(20)
    @DisplayName("21.stepSeries.Ряд от 20 до 1 с шагом 2")
    public void testNegativeSizeStepSeries () {
        Assertions.assertEquals("Ошибка! Отрицательный или нулевой размер диапазона.", stepSeries(20, 1, 2));
    }

    @Tag ("stepSeries")
    @Test
    @Order(21)
    @DisplayName("22.stepSeries.Ряд от 20 до 20 с шагом 2")
    public void testNullSizeStepSeries () {
        Assertions.assertEquals("Ошибка! Отрицательный или нулевой размер диапазона.", stepSeries(20, 20, 2));
    }

    @Tag ("stepSeries")
    @Test
    @Order(22)
    @DisplayName("23.stepSeries.Ряд от 20 до 80 с шагом 100")
    public void testBigStepSeries () {
        Assertions.assertEquals("Ошибка! Шаг превышает размер диапазона.", stepSeries(20, 80, 100));
    }

    @Tag ("rollNumber")
    @Test
    @Order(23)
    @DisplayName("24.rollNumber.Положительное число")
    public void testRoll () {
        Assertions.assertEquals(789321, rollNumber(123987));
    }

    @Tag ("rollNumber")
    @Test
    @Order(24)
    @DisplayName("25.rollNumber.Отрицательное число")
    public void testNegativeRoll () {
        Assertions.assertEquals(-1, rollNumber(-123987));
    }

    @Tag ("rollNumber")
    @Test
    @Order(25)
    @DisplayName("26.rollNumber.Ноль")
    public void testNullRoll () {
        Assertions.assertEquals(0, rollNumber(0));
    }

    @Tag ("rollNumber")
    @Test
    @Order(26)
    @DisplayName("27.rollNumber.Предельное положительное число")
    public void testMaxIntRoll () {
        Assertions.assertThrows(ArithmeticException.class, ()-> rollNumber(Integer.MAX_VALUE));
    }
}
