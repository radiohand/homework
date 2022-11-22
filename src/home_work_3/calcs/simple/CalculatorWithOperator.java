package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Вычислить сумму двух дробных чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма
     */
    public double add (double a, double b) {
        return a + b;
    }

    /**
     * Вычислить разность двух дробных чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public double subtract (double a, double b) {
        return a - b;
    }

    /**
     * Вычислить произведение двух дробных чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public double multiply (double a, double b) {
        return a * b;
    }

    /**
     * Вычислить частное двух чисел
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public double divide (double a, double b) {
        return a / b;
    }

    /**
     * Вычислить результат возведения дробного положительного числа в целую степень
     * @param a основание (возводимое в степень число)
     * @param b показатель степени
     * @return возведенное в степень число
     */
    public double exp (double a, int b) {

        double result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    /**
     * Получить модуль числа
     * @param a дробное число
     * @return модуль числа
     */
    public double mod (double a) {
        if (a < 0) {
            a *= (-1);
        }
        return a;
    }

    /**
     * Вычислить квадратный корень из числа с максимальной погрешностью err = 0.00001
     * @param a дробное число
     * @return квадратный корень
     */
    public double squareRoot (double a) {

        double x0 = a;
        double x1;
        double d;
        double err = 0.00001;

        do {
            x1 = (x0+a/x0)/2;
            d = mod (x0-x1);
            x0 = x1;
        } while ((d >= 2 * err) || ((d * d) >= 2 * err));
        return x1;
    }
}
