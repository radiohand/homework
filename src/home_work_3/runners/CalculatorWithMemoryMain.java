package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithMemory calcOP = new CalculatorWithMemory(new CalculatorWithOperator());

        CalculatorWithMemory calcMC = new CalculatorWithMemory(new CalculatorWithMathCopy());

        CalculatorWithMemory calcME = new CalculatorWithMemory(new CalculatorWithMathExtends());

        calcOP.add(calcOP.add(4.1, calcOP.multiply(15, 7)), calcOP.exp(calcOP.divide(28,5), 2));
        calcOP.saveToMemory();
        System.out.println("Результат CalculatorWithOperator: " + calcOP.loadFromMemory());

        calcMC.add(calcMC.add(4.1, calcMC.multiply(15, 7)), calcMC.exp(calcMC.divide(28,5), 2));
        calcMC.saveToMemory();
        System.out.println("Результат CalculatorWithMathCopy: " + calcMC.loadFromMemory());

        calcME.add(calcME.add(4.1, calcME.multiply(15, 7)), calcME.exp(calcME.divide(28,5), 2));
        calcME.saveToMemory();
        System.out.println("Результат CalculatorWithMathCopy: " + calcME.loadFromMemory());
    }
}
