package home_work_4.tests.home_work_1;

import home_work_1.Branching5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Branching5Test {
    @Test
    @DisplayName("Проверка с вводом буквы в нижнем регистре")
    public void testUpperCaseLetter () {
        Assertions.assertEquals("Вы ввели букву в нижнем регистре", Branching5.isLetter('k'));
    }

    @Test
    @DisplayName("Проверка с вводом буквы в верхнем регистре")
    public void testLowerCaseLetter () {
        Assertions.assertEquals("Вы ввели букву в верхнем регистре", Branching5.isLetter('H'));
    }

    @Test
    @DisplayName("Проверка с вводом не буквенного символа")
    public void testLetter () {
        Assertions.assertEquals("Введенный символ не является буквой (латиница)", Branching5.isLetter('='));
    }
}
