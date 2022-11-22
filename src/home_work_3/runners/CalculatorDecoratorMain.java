package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        CalculatorWithCounterAutoDecorator calculatorWithCounter = null;
        if (calculator instanceof  CalculatorWithCounterAutoDecorator) {
            calculatorWithCounter = (CalculatorWithCounterAutoDecorator) calculator;
        }

        CalculatorWithMemoryDecorator calculatorWithMemory = null;
        if (calculatorWithCounter.getCalculator() instanceof  CalculatorWithMemoryDecorator) {
            calculatorWithMemory = (CalculatorWithMemoryDecorator) calculatorWithCounter.getCalculator();
        }

        double result;

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        result = calculator.add(calculator.add(a, calculator.multiply(b, c)), calculator.exp(calculator.divide(d,e), f));

        assert calculatorWithMemory != null;
        calculatorWithMemory.saveToMemory();

        System.out.println("Результат: " + result);
        System.out.println("Текущее значение счетчика: " + calculatorWithCounter.getCountOperation());
        System.out.println("Значение в памяти: " + calculatorWithMemory.loadFromMemory());
    }
}
