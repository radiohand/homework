package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calcOP = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

        CalculatorWithCounterAutoAgregationInterface calcMC = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

        CalculatorWithCounterAutoAgregationInterface calcME = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        double a,b,c,d,e;
        int f;
        double result;

        {
            a = 4.1; b = 15; c = 7;  d = 28; e = 5;
            f = 2;
        }

        result = calcOP.add(calcOP.add(a, calcOP.multiply(b, c)), calcOP.exp(calcOP.divide(d,e), f));
        System.out.println("Результат CalculatorWithOperator: " + result);
        System.out.println("Текущее значение счетчика CalculatorWithOperator: " + calcOP.getCountOperation());

        result = calcMC.add(calcMC.add(a, calcMC.multiply(b, c)), calcMC.exp(calcMC.divide(d,e), f));
        System.out.println("Результат CalculatorWithMathCopy: " + result);
        System.out.println("Текущее значение счетчика CalculatorWithMathCopy: " + calcMC.getCountOperation());

        result = calcME.add(calcME.add(a, calcME.multiply(b, c)), calcME.exp(calcME.divide(d,e), f));
        System.out.println("Результат CalculatorWithMathCopy: " + result);
        System.out.println("Текущее значение счетчика CalculatorWithMathExtends: " + calcME.getCountOperation());
    }
}
