package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

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

    @Override
    public double exp(double a, int b) {
        incrementCountOperation();
        return super.exp(a, b);
    }

    @Override
    public double mod(double a) {
        incrementCountOperation();
        return super.mod(a);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        incrementCountOperation();
        return super.subtract(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }
}
