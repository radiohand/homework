package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation implements ICalculator {
    private CalculatorWithOperator calculatorOP;
    private CalculatorWithMathCopy calculatorMC;
    private CalculatorWithMathExtends calculatorME;

    private final int calcType;

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator calculator) {
        calculatorOP = calculator;
        calcType = 1;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy calculator) {
        calculatorMC = calculator;
        calcType = 2;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calculator) {
        calculatorME = calculator;
        calcType = 3;
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

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу exp выбранного объекта
     * @param b параметр b к методу exp выбранного объекта
     * @return возвращаемое значение метода exp выбранного объекта
     */
    public double exp(double a, int b) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.exp(a, b);}
        else if (calcType ==2) {return calculatorMC.exp(a, b);}
        else {return calculatorME.exp(a, b);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу mod выбранного объекта
     * @return возвращаемое значение метода mod выбранного объекта
     */
    public double mod(double a) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.mod(a);}
        else if (calcType ==2) {return calculatorMC.mod(a);}
        else {return calculatorME.mod(a);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу squareRoot выбранного объекта
     * @return возвращаемое значение метода squareRoot выбранного объекта
     */
    public double squareRoot(double a) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.squareRoot(a);}
        else if (calcType ==2) {return calculatorMC.squareRoot(a);}
        else {return calculatorME.squareRoot(a);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу add выбранного объекта
     * @param b параметр b к методу add выбранного объекта
     * @return возвращаемое значение метода exp выбранного объекта
     */
    public double add(double a, double b) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.add(a, b);}
        else if (calcType ==2) {return calculatorMC.add(a, b);}
        else {return calculatorME.add(a, b);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу subtract выбранного объекта
     * @param b параметр b к методу subtract выбранного объекта
     * @return возвращаемое значение метода subtract выбранного объекта
     */
    public double subtract(double a, double b) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.subtract(a, b);}
        else if (calcType ==2) {return calculatorMC.subtract(a, b);}
        else {return calculatorME.subtract(a, b);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу multiply выбранного объекта
     * @param b параметр b к методу multiply выбранного объекта
     * @return возвращаемое значение метода multiply выбранного объекта
     */
    public double multiply(double a, double b) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.multiply(a, b);}
        else if (calcType ==2) {return calculatorMC.multiply(a, b);}
        else {return calculatorME.multiply(a, b);}
    }

    /**
     * Вызвать соответствующий метод из экземпляра калькулятора, преданного в конструктор.
     * Инкрементировать счетчик вызова методов.
     * @param a параметр a к методу divide выбранного объекта
     * @param b параметр b к методу divide выбранного объекта
     * @return возвращаемое значение метода divide выбранного объекта
     */
    public double divide(double a, double b) {
        incrementCountOperation();
        if (calcType == 1) {return calculatorOP.divide(a, b);}
        else if (calcType ==2) {return calculatorMC.divide(a, b);}
        else {return calculatorME.divide(a, b);}
    }
}
