package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_4.home_work_3.api.CalculatorsAbstractTest;
import org.junit.jupiter.api.*;

public class CalculatorWithCounterClassicTest extends CalculatorsAbstractTest {

    {this.calculator = new CalculatorWithCounterClassic();}

    CalculatorWithCounterClassic counterCalculator = new CalculatorWithCounterClassic();

    @Tag("incrementCountOperation")
    @Test
    @DisplayName("Проверка счетчика до вызова методов калькулятора")
    @Order(19)
    public void testCounterAtNullPoint () {
        Assertions.assertEquals(0, counterCalculator.getCountOperation());
    }

    @Tag("incrementCountOperation")
    @Test
    @DisplayName("Проверка счетчика после вызова метода инкрементирования счетчика")
    @Order(20)
    public void testCounterAfterUsing () {
        for (int i = 0; i < 5; i++) {
            counterCalculator.incrementCountOperation();
        }
        Assertions.assertEquals(5, counterCalculator.getCountOperation());
    }
}
