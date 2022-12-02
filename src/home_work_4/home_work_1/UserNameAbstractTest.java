package home_work_4.home_work_1;

import home_work_1.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public abstract class UserNameAbstractTest {

    ICommunicationPrinter userName;

    @Test
    @DisplayName("Проверяем имя Вася")
    public void testName1 () {
        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал", userName.welcome("Вася"));
    }

    @Test
    @DisplayName("Проверяем имя Анастасия")
    public void testName2 () {
        Assertions.assertEquals("Я тебя так долго ждал", userName.welcome("Анастасия"));
    }

    @Test
    @DisplayName("Проверяем имя не Вася и не Анастасия")
    public void testNameElse () {
        Assertions.assertEquals("Добрый день, а вы кто?", userName.welcome("Арамис"));
    }
}
