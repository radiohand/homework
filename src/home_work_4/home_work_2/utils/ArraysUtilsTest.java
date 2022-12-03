package home_work_4.home_work_2.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArraysUtilsTest {

    @Test
    @DisplayName("Проверка корректного размера массива")
    @Order(0)
    public void testRandomSize() {
        int [] ints = ArraysUtils.arrayRandom(10, 20);

        Assertions.assertEquals(10, ints.length);
    }

    @RepeatedTest(20)
    @DisplayName("Проверка соответствия значений элементов заданному диапазону")
    @Order(1)
    public void testRandomValueLimits() {
        int [] ints = ArraysUtils.arrayRandom(10, 20);

        for (int element: ints) {
            Assertions.assertTrue(element<20);
            Assertions.assertTrue(element>-20);
        }
    }

    @Order(2)
    @DisplayName("Проверка нулевого размера массива")
    @Test
    public void testRandomNullSize() {
        int [] ints = ArraysUtils.arrayRandom(0, 20);

            Assertions.assertEquals(0, ints.length);
    }

    @Order(3)
    @DisplayName("Проверка отрицательного размера массива")
    @Test
    public void testRandomNegativeSize() {

        Assertions.assertThrows(NegativeArraySizeException.class, ()->{
            int [] ints = ArraysUtils.arrayRandom(-1, 20);
        });
    }
}
