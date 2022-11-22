package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

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
     * (используя методы класса java.lang.Math)
     * @param a основание (возводимое в степень число)
     * @param b показатель степени
     * @return возведенное в степень число
     */
    public double exp (double a, int b) {
        return Math.pow (a, b);
    }

    /**
     * Получить модуль числа
     * (используя методы класса java.lang.Math)
     * @param a дробное число
     * @return модуль числа
     */
    public double mod (double a) {
        return Math.abs(a);
    }

    /**
     * Вычислить квадратный корень из числа
     * (используя методы класса java.lang.Math)
     * @param a дробное число
     * @return квадратный корень
     */
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }
}
