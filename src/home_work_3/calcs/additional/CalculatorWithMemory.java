package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private final ICalculator calculator;

    public CalculatorWithMemory (ICalculator calculator) {
        this.calculator = calculator;
    }
    private double buffer;

    private double memory;

    /**
     * Записать результат выполнения последнего вызванного метода в поле memory
     */
    public void saveToMemory () {
        memory = buffer;
    }

    /**
     * Получить значение поля memory, присвоить полю значение 0.
     * @return значение поля memory
     */
    public double loadFromMemory () {
        double memory = this.memory;
        this.memory = 0;
        return memory;
    }

    public double exp(double a, int b) {
        return buffer = calculator.exp(a, b);
    }

    public double mod(double a) {
        return buffer = calculator.mod(a);
    }

    public double squareRoot(double a) {
        return buffer = calculator.squareRoot(a);
    }

    public double add(double a, double b) {
        return buffer = calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        return buffer = calculator.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return buffer = calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        return buffer = calculator.divide(a, b);
    }
}