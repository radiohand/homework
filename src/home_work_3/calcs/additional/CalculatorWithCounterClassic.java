package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter;

    /**
     * Инкрементировать счетчик в поле counter при вызове
     */
    public void incrementCountOperation() {
        counter ++;
    }

    /**
     * Вернуть текущее значение счетчика из поля counter
     * @return значение хранящееся в counter
     */
    public long getCountOperation () {
        return counter;
    }
}
