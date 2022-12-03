package home_work_4.home_work_2.arrays;

import home_work_2.arrays.IArraysOperation;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class ArraysOperationAbstractTest {

    IArraysOperation arraysOperation;

    @Tag("printAll")
    @Test
    @DisplayName("printAll.Проверка массива с положительными числами")
    @Order(0)
    public void testPrintAllPositive () {
        int [] testArray = new int [] {1,14,55,34,33,21};
        Assertions.assertEquals("1 14 55 34 33 21",arraysOperation.printAll(testArray));
    }

    @Tag("printAll")
    @Test
    @DisplayName("printAll.Проверка массива с отрицательными числами")
    @Order(1)
    public void testPrintAllNegative () {
        int [] testArray = new int [] {1,-14,-55,34,-33,21};
        Assertions.assertEquals("1 -14 -55 34 -33 21",arraysOperation.printAll(testArray));
    }

    @Tag("printAll")
    @Test
    @DisplayName("printAll.Проверка массива содержащего предельное значение")
    @Order(2)
    public void testPrintAllWithMaxInt () {
        int [] testArray = new int [] {1,-14,-55,34,Integer.MAX_VALUE,21};
        Assertions.assertEquals("1 -14 -55 34 " + Integer.MAX_VALUE + " 21",arraysOperation.printAll(testArray));
    }

    @Tag("printAll")
    @Test
    @DisplayName("printAll.Проверка вывода массива содержащего переполненное значение")
    @Order(3)
    public void testPrintAllWithOverflow () {
        int [] testArray = new int [] {1,-14,-55,34,Integer.MAX_VALUE+1,21};
        Assertions.assertEquals("1 -14 -55 34 " + Integer.MIN_VALUE + " 21",arraysOperation.printAll(testArray));
    }

    @Tag("printAll")
    @Test
    @DisplayName("printAll.Проверка пустого массива")
    @Order(4)
    public void testPrintAllNullSize () {
        int [] testArray = new int [] {};
        Assertions.assertEquals("", arraysOperation.printAll(testArray));
    }

    @Tag("printEverySecond")
    @Test
    @DisplayName("printEverySecond.Проверка массива с положительными числами")
    @Order(5)
    public void testPrintEverySecondPositive () {
        int [] testArray = new int [] {1,14,55,34,33,21};
        Assertions.assertEquals("14 34 21",arraysOperation.printEverySecond(testArray));
    }

    @Tag("printEverySecond")
    @Test
    @DisplayName("printEverySecond.Проверка массива с отрицательными числами")
    @Order(6)
    public void testPrintEverySecondNegative () {
        int [] testArray = new int [] {1,-14,-55,34,-33,21};
        Assertions.assertEquals("-14 34 21",arraysOperation.printEverySecond(testArray));
    }

    @Tag("printEverySecond")
    @Test
    @DisplayName("printEverySecond.Проверка массива содержащего предельное значение")
    @Order(7)
    public void testPrintEverySecondWithMaxInt () {
        int [] testArray = new int [] {1,-14,-55,Integer.MAX_VALUE,34,21};
        Assertions.assertEquals("-14 " + Integer.MAX_VALUE + " 21",arraysOperation.printEverySecond(testArray));
    }

    @Tag("printEverySecond")
    @Test
    @DisplayName("printEverySecond.Проверка вывода массива содержащего переполненное значение")
    @Order(8)
    public void testPrintEverySecondWithOverflow () {
        int [] testArray = new int [] {1,-14,-55,Integer.MAX_VALUE+1,34,21};
        Assertions.assertEquals("-14 " + Integer.MIN_VALUE + " 21",arraysOperation.printEverySecond(testArray));
    }

    @Tag("printEverySecond")
    @Test
    @DisplayName("printEverySecond.Проверка пустого массива")
    @Order(9)
    public void testPrintEverySecondNullSize () {
        int [] testArray = new int [] {};
        Assertions.assertEquals("", arraysOperation.printEverySecond(testArray));
    }

    @Tag("printReverse")
    @Test
    @DisplayName("printReverse.Проверка массива с положительными числами")
    @Order(10)
    public void testPrintReversePositive () {
        int [] testArray = new int [] {1,14,55,34,33,21};
        Assertions.assertEquals("21 33 34 55 14 1",arraysOperation.printReverse(testArray));
    }

    @Tag("printReverse")
    @Test
    @DisplayName("printReverse.Проверка массива с отрицательными числами")
    @Order(11)
    public void testPrintReverseNegative () {
        int [] testArray = new int [] {1,-14,-55,34,-33,21};
        Assertions.assertEquals("21 -33 34 -55 -14 1",arraysOperation.printReverse(testArray));
    }

    @Tag("printReverse")
    @Test
    @DisplayName("printReverse.Проверка массива содержащего предельное значение")
    @Order(12)
    public void testPrintReverseWithMaxInt () {
        int [] testArray = new int [] {1,-14,-55,34,Integer.MAX_VALUE,21};
        Assertions.assertEquals("21 " + Integer.MAX_VALUE + " 34 -55 -14 1",arraysOperation.printReverse(testArray));
    }

    @Tag("printReverse")
    @Test
    @DisplayName("printReverse.Проверка вывода массива содержащего переполненное значение")
    @Order(13)
    public void testPrintReverseWithOverflow () {
        int [] testArray = new int [] {1,-14,-55,34,Integer.MAX_VALUE+1,21};
        Assertions.assertEquals("21 " + Integer.MIN_VALUE + " 34 -55 -14 1",arraysOperation.printReverse(testArray));
    }

    @Tag("printReverse")
    @Test
    @DisplayName("printReverse.Проверка пустого массива")
    @Order(14)
    public void testPrintReverseNullSize () {
        int [] testArray = new int [] {};
        Assertions.assertEquals("", arraysOperation.printReverse(testArray));
    }
}
