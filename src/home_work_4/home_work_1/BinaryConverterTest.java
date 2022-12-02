package home_work_4.home_work_1;

import home_work_1.BinaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class BinaryConverterTest {
    @Test
    @DisplayName("Проверка нижней границы принимаемых десятичных чисел")
    public void testLowerLimit () {
        Assertions.assertEquals("10000000", BinaryConverter.toBinaryString((byte) -128));
    }

    @Test
    @DisplayName("Проверка верхней границы принимаемых десятичных чисел")
    public void testUpperLimit () {
        Assertions.assertEquals("01111111", BinaryConverter.toBinaryString((byte) 127));
    }

    @Test
    @DisplayName("Проверка выхода за пределы границ принимаемых десятичных чисел")
    public void testGoBeyond () {
        Assertions.assertEquals("10000000", BinaryConverter.toBinaryString((byte) 128));
        Assertions.assertEquals("01111111", BinaryConverter.toBinaryString((byte) -129));
    }

    @Test
    @DisplayName("Проверка значения в границах принимаемых чисел")
    public void testInsideTheLimit () {
        Assertions.assertEquals("00100000", BinaryConverter.toBinaryString((byte) 32));
    }
}
