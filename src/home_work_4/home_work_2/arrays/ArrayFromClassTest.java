package home_work_4.home_work_2.arrays;

import home_work_2.arrays.ArrayFromClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayFromClassTest {

    @Test
    @DisplayName("Проверка массива с положительными числами")
    @Order(0)
    public void testPositiveElements() {
        int[] testArray = new int[]{1, 14, 55, 34, 33, 21};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("1 14 21 33 34 55", ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка массива с отрицательными числами")
    @Order(1)
    public void testNegativeElements() {
        int[] testArray = new int[]{1, -14, -55, 34, -33, 21};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("-55 -33 -14 1 21 34", ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка массива содержащего предельное значение")
    @Order(2)
    public void testWithMaxInt() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE, 21};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("-55 -14 1 21 34 " + Integer.MAX_VALUE, ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка вывода массива содержащего переполненное значение")
    @Order(3)
    public void testWithOverflow() {
        int[] testArray = new int[]{1, -14, -55, 34, Integer.MAX_VALUE + 1, 21};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals(Integer.MIN_VALUE + " -55 -14 1 21 34", ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка пустого массива")
    @Order(4)
    public void testNullSize() {
        int[] testArray = new int[]{};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("", ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка массива заполненного нулями")
    @Order(5)
    public void testNullElements() {
        int[] testArray = new int[]{0,0,0,0,0};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("0 0 0 0 0", ArrayFromClass.printArray(testArray));
    }

    @Test
    @DisplayName("Проверка массива заполненного одинаковыми числами")
    @Order(6)
    public void testSameElements() {
        int[] testArray = new int[]{25,25,25,25,25};
        ArrayFromClass.sort(testArray);
        Assertions.assertEquals("25 25 25 25 25", ArrayFromClass.printArray(testArray));
    }
}
