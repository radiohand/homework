package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double a,b,c,d,e;
        int f;
        double subResult1, subResult2, subResult3, subResult4, result;

        {
            a = 4.1; b = 15; c = 7;  d = 28; e = 5;
            f = 2;
        }

        subResult1 = calc.multiply(b, c);
        subResult2 = calc.add(a, subResult1);
        subResult3 = calc.divide(d, e);
        subResult4 = calc.exp(subResult3, f);

        result = calc.add(subResult2, subResult4);

        System.out.println("Результат: " + result);
        System.out.println("Текущее значение счетчика: " + calc.getCountOperation());
    }
}
