package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Вычислить результат возведения дробного положительного числа в целую степень
     * (используя методы класса java.lang.Math)
     * @param a основание (возводимое в степень число)
     * @param b показатель степени
     * @return возведенное в степень число
     */
    @Override
    public double exp (double a, int b) {
        return Math.pow (a, b);
    }

    /**
     * Получить модуль числа
     * (используя методы класса java.lang.Math)
     * @param a дробное число
     * @return модуль числа
     */
    @Override
    public double mod (double a) {
        return Math.abs(a);
    }

    /**
     * Вычислить квадратный корень из числа
     * (используя методы класса java.lang.Math)
     * @param a дробное число
     * @return квадратный корень
     */
    @Override
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }
}
