package home_work_4.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortUtilsTest {

    @Tag("sort")
    @Test
    @DisplayName("Проверка массива с положительными числами")
    @Order(0)
    public void testSortPositiveElements() {
        int[] testArray = new int[]{1, 14, 55, 34, 33, 21};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[1, 14, 21, 33, 34, 55]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка массива с отрицательными числами")
    @Order(1)
    public void testSortNegativeElements() {
        int[] testArray = new int[]{1, -14, -55, 34, -33, 21};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[-55, -33, -14, 1, 21, 34]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка массива содержащего предельное значение")
    @Order(2)
    public void testSortWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[-55, -14, 1, 21, 34, " + Integer.MAX_VALUE + "]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка вывода массива содержащего переполненное значение")
    @Order(3)
    public void testSortWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[" + Integer.MIN_VALUE + ", -55, -14, 1, 21, 34]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка пустого массива")
    @Order(4)
    public void testSortNullSize() {
        int[] testArray = new int[]{};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка массива заполненного нулями")
    @Order(5)
    public void SortNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(testArray));
    }

    @Tag("sort")
    @Test
    @DisplayName("Проверка массива заполненного одинаковыми числами")
    @Order(6)
    public void testSortSameElements() {
        int[] testArray = new int[]{25,25,25,25,25};
        SortsUtils.sort(testArray);
        Assertions.assertEquals("[25, 25, 25, 25, 25]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка массива с положительными числами")
    @Order(7)
    public void testShakePositiveElements() {
        int[] testArray = new int[]{1, 14, 55, 34, 33, 21};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[1, 14, 21, 33, 34, 55]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка массива с отрицательными числами")
    @Order(8)
    public void testShakeNegativeElements() {
        int[] testArray = new int[]{1, -14, -55, 34, -33, 21};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[-55, -33, -14, 1, 21, 34]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка массива содержащего предельное значение")
    @Order(9)
    public void testShakeWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[-55, -14, 1, 21, 34, " + Integer.MAX_VALUE + "]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка вывода массива содержащего переполненное значение")
    @Order(10)
    public void testShakeWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[" + Integer.MIN_VALUE + ", -55, -14, 1, 21, 34]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка пустого массива")
    @Order(11)
    public void testShakeNullSize() {
        int[] testArray = new int[]{};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка массива заполненного нулями")
    @Order(12)
    public void testShakeNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(testArray));
    }

    @Tag("shake")
    @Test
    @DisplayName("Проверка массива заполненного одинаковыми числами")
    @Order(13)
    public void testShakeSameElements() {
        int[] testArray = new int[]{25,25,25,25,25};
        SortsUtils.shake(testArray);
        Assertions.assertEquals("[25, 25, 25, 25, 25]", Arrays.toString(testArray));
    }
}