package home_work_4.home_work_1;

import home_work_1.Branching4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Branching4Test {
    @Test
    @DisplayName("Проверка конвертации в килобайты")
    public void toKbytes () {
        Assertions.assertEquals(2, Branching4.bytesToKilobytes(3000));
    }

    @Test
    @DisplayName("Проверка конвертации в байты отрицательного значения")
    public void toBytesNegative () {
        Assertions.assertEquals(0, Branching4.kilobytesToBytes(-4));
    }

    @Test
    @DisplayName("Проверка конвертации в килобайты отрицательного значения")
    public void toKbytesNegative () {
        Assertions.assertEquals(0, Branching4.bytesToKilobytes(-3000));
    }

    @Test
    @DisplayName("Проверка конвертации в байты отрицательного значения")
    public void toBytes () {
        Assertions.assertEquals(4096, Branching4.kilobytesToBytes(4));
    }
}
