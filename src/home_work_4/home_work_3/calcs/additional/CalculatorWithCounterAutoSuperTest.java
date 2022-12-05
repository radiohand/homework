package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_4.home_work_3.api.CalculatorsAbstractTest;
import org.junit.jupiter.api.*;

public class CalculatorWithCounterAutoSuperTest extends CalculatorsAbstractTest {

    {this.calculator = new CalculatorWithCounterAutoSuper();}

    CalculatorWithCounterAutoSuper counterCalculator = new CalculatorWithCounterAutoSuper();

    @Tag("incrementCountOperation")
    @Test
    @DisplayName("Проверка счетчика до вызова методов калькулятора")
    @Order(19)
    public void testCounterAtNullPoint () {
        Assertions.assertEquals(0, counterCalculator.getCountOperation());
    }

    @Tag("incrementCountOperation")
    @Test
    @DisplayName("Проверка счетчика после вызова методов калькулятора")
    @Order(20)
    public void testCounterAfterUsing () {
        for (int i = 0; i < 5; i++) {
            counterCalculator.add(1,2);
        }
        for (int i = 0; i < 3; i++) {
            counterCalculator.exp(6,4);
        }
        Assertions.assertEquals(8, counterCalculator.getCountOperation());
    }
}
