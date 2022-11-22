package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        double subResult1 = calc.multiply(b, c);
        double subResult2 = calc.add(a, subResult1);
        double subResult3 = calc.divide(d, e);
        double subResult4 = calc.exp(subResult3, f);

        double result = calc.add(subResult2, subResult4);

        System.out.println("Результат: " + result);
    }
}
