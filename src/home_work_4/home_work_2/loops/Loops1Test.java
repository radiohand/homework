package home_work_4.home_work_2.loops;

import home_work_2.loops.Loops1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class Loops1Test {
    @Tag("loopFactorial")
    @Test
    @DisplayName("Проверка на значении 5")
    public void testLoopFactorialOf5 () {
        Assertions.assertEquals(120, Loops1.loopFactorial(5));
    }

    @Tag("loopFactorial")
    @Test
    @DisplayName("Проверка на значении -5")
    public void testLoopFactorialOfNegative5 () {
        Assertions.assertEquals(1, Loops1.loopFactorial(-5));
    }

    @Tag("loopFactorial")
    @Test
    @DisplayName("Проверка на пределе long (ожидается переполнение)")
    public void testLoopFactorialOfMaxLong () {
        Assertions.assertEquals(-1, Loops1.loopFactorial(Long.MAX_VALUE-10));
    }

    @Tag("recursionFactorial")
    @Test
    @DisplayName("Проверка на значении 5")
    public void testRecFactorialOf5 () {
        Assertions.assertEquals(120, Loops1.recursionFactorial(5));
    }

    @Tag("recursionFactorial")
    @Test
    @DisplayName("Проверка на значении -5")
    public void testRecFactorialOfNegative5 () {
        Assertions.assertThrows(StackOverflowError.class, ()-> Loops1.recursionFactorial(Long.MAX_VALUE-10));
    }

    @Tag("recursionFactorial")
    @Test
    @DisplayName("Проверка на пределе long (ожидается переполнение)")
    public void testRecFactorialOfMaxLong () {
        Assertions.assertThrows(StackOverflowError.class, ()-> Loops1.recursionFactorial(Long.MAX_VALUE-10));
    }
}
