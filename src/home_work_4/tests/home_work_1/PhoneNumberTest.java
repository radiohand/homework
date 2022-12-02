package home_work_4.tests.home_work_1;

import home_work_1.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class PhoneNumberTest {
    @Test
    @DisplayName("Проверка корректности форматирования")
    public void testFormat () {
        char [] phoneNumber = new char[] {'1','2','3','4','5','6','7','8','9','0'};
        Assertions.assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(phoneNumber));
    }

    @Test
    @DisplayName("Проверка с пустым массивом")
    public void testEmptyArray () {
        char [] phoneNumber = new char[] {};
        Assertions.assertThrows(StringIndexOutOfBoundsException.class,
                ()-> {PhoneNumber.createPhoneNumber(phoneNumber);});
    }

    @Test
    @DisplayName("Проверка с массивом, содержащим меньше 10 символов")
    public void testSmallArray () {
        char [] phoneNumber = new char[] {'1','2','3','4','5','6','7','8'};
        Assertions.assertThrows(StringIndexOutOfBoundsException.class,
                ()-> {PhoneNumber.createPhoneNumber(phoneNumber);});
    }
}
