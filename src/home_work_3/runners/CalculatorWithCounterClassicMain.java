package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double a,b,c,d,e;
        int f;
        double subResult1, subResult2, subResult3, subResult4, result;

        {
            a = 4.1; b = 15; c = 7;  d = 28; e = 5;
            f = 2;
        }

        subResult1 = calc.multiply(b, c);
        calc.incrementCountOperation();

        subResult2 = calc.add(a, subResult1);
        calc.incrementCountOperation();

        subResult3 = calc.divide(d,e);
        calc.incrementCountOperation();

        subResult4 = calc.exp(subResult3, f);
        calc.incrementCountOperation();

        result = calc.add(subResult2, subResult4);
        calc.incrementCountOperation();

        System.out.println("Результат: " + result);
        System.out.println("Текущее значение счетчика: " + calc.getCountOperation());
    }
}
