package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_4.home_work_3.api.CalculatorsAbstractTest;
import org.junit.jupiter.api.*;

public class CalculatorWithMemoryDecoratorTest extends CalculatorsAbstractTest {

    {this.calculator = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());}

    CalculatorWithMemoryDecorator counterCalculator = new CalculatorWithMemoryDecorator (new CalculatorWithOperator());

    @Tag("loadFromMemory")
    @Test
    @DisplayName("Проверка состояния памяти до выполнения сохранения")
    @Order(19)
    public void testMemoryBeforeSave () {
        Assertions.assertEquals(0, counterCalculator.loadFromMemory());
    }

    @Tag("loadFromMemory")
    @Test
    @DisplayName("Проверка состояния памяти до выполнения сохранения")
    @Order(20)
    public void testMemoryAfterSave () {
        counterCalculator.add(29,39);
        counterCalculator.saveToMemory();
        Assertions.assertEquals(68, counterCalculator.loadFromMemory());
    }
}
