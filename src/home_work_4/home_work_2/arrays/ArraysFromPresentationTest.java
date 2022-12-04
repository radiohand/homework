package home_work_4.home_work_2.arrays;

import home_work_2.arrays.ArrayFromClass;
import home_work_2.arrays.ArraysFromPresentation;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArraysFromPresentationTest {

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка массива с положительными числами")
    @Order(0)
    public void testSumOfElementsPositiveElements() {
        int[] testArray = new int[]{2, 4, 8, 42, 3, 9};
        Assertions.assertEquals(56, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка массива с отрицательными числами")
    @Order(1)
    public void testSumOfElementsNegativeElements() {
        int[] testArray = new int[]{-2, 4, -8, 42, -3, 9};
        Assertions.assertEquals(46, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка массива содержащего предельное значение")
    @Order(2)
    public void testSumOfElementsWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        Assertions.assertEquals(34, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка вывода массива содержащего переполненное значение")
    @Order(3)
    public void testSumOfElementsWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals(34, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка пустого массива")
    @Order(4)
    public void testSumOfElementsNullSize() {
        int[] testArray = new int[]{};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals(0, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка массива заполненного нулями")
    @Order(5)
    public void testSumOfElementsNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals(0, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("sumOfElements")
    @Test
    @DisplayName("sumOfElements.Проверка массива заполненного одинаковыми числами")
    @Order(6)
    public void testSumOfElementsSameElements() {
        int[] testArray = new int[]{8,8,8,8,8};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals(40, ArraysFromPresentation.sumOfElements(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка массива с положительными числами")
    @Order(7)
    public void testMaxEvenElementPositiveElements() {
        int[] testArray = new int[]{2, 4, 8, 42, 3, 9};
        Assertions.assertEquals(8, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка массива с отрицательными числами")
    @Order(8)
    public void testMaxEvenElementNegativeElements() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        Assertions.assertEquals(-3, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка массива содержащего предельное значение")
    @Order(9)
    public void testMaxEvenElementWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        Assertions.assertEquals(Integer.MAX_VALUE, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка вывода массива содержащего переполненное значение")
    @Order(10)
    public void testMaxEvenElementWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        Assertions.assertEquals(1, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка пустого массива")
    @Order(11)
    public void testMaxEvenElementNullSize() {
        int[] testArray = new int[]{};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка массива заполненного нулями")
    @Order(12)
    public void testMaxEvenElementNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        Assertions.assertEquals(0, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("maxEvenElement")
    @Test
    @DisplayName("maxEvenElement.Проверка массива заполненного одинаковыми числами")
    @Order(13)
    public void testMaxEvenElementSameElements() {
        int[] testArray = new int[]{8,8,8,8,8};
        Assertions.assertEquals(8, ArraysFromPresentation.maxEvenElement(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("maxEvenElement.Проверка массива с положительными числами")
    @Order(14)
    public void testLessThanAveragePositiveElements() {
        int[] testArray = new int[]{2, 4, 8, 42, 3, 9};
        int [] checkArray = {2, 4, 8, 3, 9};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка массива с отрицательными числами")
    @Order(15)
    public void testLessThanAverageNegativeElements() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        int [] checkArray = {-180, -42};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка массива содержащего предельное значение")
    @Order(16)
    public void testLessThanAverageWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        int [] checkArray = {1, -14, -55, 34, 21};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка вывода массива содержащего переполненное значение")
    @Order(17)
    public void testLessThanAverageWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        int [] checkArray = {Integer.MIN_VALUE};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка пустого массива")
    @Order(18)
    public void testLessThanAverageNullSize() {
        int[] testArray = new int[]{};
        int [] checkArray = {};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка массива заполненного нулями")
    @Order(19)
    public void testLessThanAverageNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        int [] checkArray = {};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("lessThanAverage")
    @Test
    @DisplayName("lessThanAverage.Проверка массива заполненного одинаковыми числами")
    @Order(20)
    public void testLessThanAverageSameElements() {
        int[] testArray = new int[]{8,8,8,8,8};
        int [] checkArray = {};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.lessThanAverage(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка массива с положительными числами")
    @Order(21)
    public void testTwoMinElementsPositiveElements() {
        int[] testArray = new int[]{2, 4, 8, 42, 3, 9};
        int [] checkArray = {2, 3};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка массива с отрицательными числами")
    @Order(22)
    public void testTwoMinElementsNegativeElements() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        int [] checkArray = {-180, -42};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка массива содержащего предельное значение")
    @Order(23)
    public void testTwoMinElementsWithMixInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MIN_VALUE, 21};
        int [] checkArray = {Integer.MIN_VALUE, -55};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка вывода массива содержащего переполненное значение")
    @Order(24)
    public void testTwoMinElementsWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        int [] checkArray = {Integer.MIN_VALUE, -55};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка пустого массива")
    @Order(25)
    public void testTwoMinElementsNullSize() {
        int[] testArray = new int[]{};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка массива заполненного нулями")
    @Order(26)
    public void testTwoMinElementsNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        int [] checkArray = {0,0};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("twoMinElements")
    @Test
    @DisplayName("twoMinElements.Проверка массива заполненного одинаковыми числами")
    @Order(27)
    public void testTwoMinElementsSameElements() {
        int[] testArray = new int[]{8,8,8,8,8};
        int [] checkArray = {8,0};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.twoMinElements(testArray));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка массива с положительными числами")
    @Order(28)
    public void testCompressArrayPositiveElements() {
        int[] testArray = new int[]{2, 4, 8, 42, 3, 9};
        int [] checkArray = {2, 4, 42, 3};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray, 5, 10));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка массива с отрицательными числами")
    @Order(29)
    public void testCompressArrayNegativeElements() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        int [] checkArray = {-180, -42, 9};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray,-10,5));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка пустого массива")
    @Order(30)
    public void testCompressArrayNullSize() {
        int[] testArray = new int[]{};
        int [] checkArray = {};
        Assertions.assertArrayEquals(checkArray,ArraysFromPresentation.compressArray(testArray,1,10));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка массива заполненного нулями")
    @Order(31)
    public void testCompressArrayNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        int [] checkArray = {};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray, -5, 5));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка массива заполненного одинаковыми числами")
    @Order(32)
    public void testCompressArraySameElements() {
        int[] testArray = new int[]{8,8,8,8,8};
        int [] checkArray = {8,8,8,8,8};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray, 10,100000));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка нулевого диапазона")
    @Order(33)
    public void testCompressArrayNullRange() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        int [] checkArray = {-180, 4, -8, -42, -3, 9};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray,4,4));
    }

    @Tag("compressArray")
    @Test
    @DisplayName("compressArray.Проверка отрицательного диапазона")
    @Order(33)
    public void testCompressArrayNegativeRange() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        int [] checkArray = {-180, 4, -8, -42, -3, 9};
        Assertions.assertArrayEquals(checkArray, ArraysFromPresentation.compressArray(testArray, 10,-10));
    }

    @Tag("digitsOfArray")
    @Test
    @DisplayName("digitsOfArray.Проверка массива с положительными числами")
    @Order(34)
    public void testDigitsOfArrayPositiveElements() {
        int[] testArray = new int[]{24, 4, 81, 42, 3, 9};
        Assertions.assertEquals(37, ArraysFromPresentation.digitsOfArray(testArray));
    }

    @Tag("digitsOfArray")
    @Test
    @DisplayName("digitsOfArray.Проверка массива с отрицательными числами")
    @Order(35)
    public void testDigitsOfArrayNegativeElements() {
        int[] testArray = new int[]{-180, 4, -8, -42, -3, 9};
        Assertions.assertEquals(39, ArraysFromPresentation.digitsOfArray(testArray));
    }

    @Tag("digitsOfArray")
    @Test
    @DisplayName("digitsOfArray.Проверка пустого массива")
    @Order(36)
    public void testDigitsOfArrayNullSize() {
        int[] testArray = new int[]{};
        Assertions.assertEquals(0, ArraysFromPresentation.digitsOfArray(testArray));
    }

    @Tag("digitsOfArray")
    @Test
    @DisplayName("digitsOfArray.Проверка массива заполненного нулями")
    @Order(37)
    public void testDigitsOfArrayNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        Assertions.assertEquals(0, ArraysFromPresentation.digitsOfArray(testArray));
    }

    @Tag("digitsOfArray")
    @Test
    @DisplayName("digitsOfArray.Проверка массива заполненного одинаковыми числами")
    @Order(38)
    public void testDigitsOfArraySameElements() {
        int[] testArray = new int[]{12,12,12,12,12};
        Assertions.assertEquals(15, ArraysFromPresentation.digitsOfArray(testArray));
    }
}