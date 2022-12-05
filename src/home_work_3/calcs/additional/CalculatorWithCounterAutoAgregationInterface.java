package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator{

    private final ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    private long counter;

    /**
     * Инкрементировать счетчик при вызове
     */
    private void incrementCountOperation() {
        counter ++;
    }

    /**
     * Вернуть текущее значение счетчика
     * @return значение хранящееся в counter
     */
    public long getCountOperation () {
        return counter;
    }

    public double exp(double a, int b) {
        incrementCountOperation();
        return calculator.exp(a, b);
    }

    public double mod(double a) {
        incrementCountOperation();
        return calculator.mod(a);
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        return calculator.squareRoot(a);
    }

    public double add(double a, double b) {
        incrementCountOperation();
        return calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        incrementCountOperation();
        return calculator.subtract(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }
}
