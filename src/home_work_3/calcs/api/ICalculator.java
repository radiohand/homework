package home_work_3.calcs.api;

public interface ICalculator {

    /**
     * Вычислить сумму двух дробных чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма
     */
    double add (double a, double b);

    /**
     * Вычислить разность двух дробных чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    double subtract (double a, double b);

    /**
     * Вычислить произведение двух дробных чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    double multiply (double a, double b);

    /**
     * Вычислить частное двух чисел
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    double divide (double a, double b);

    /**
     * Вычислить результат возведения дробного положительного числа в целую степень
     * @param a основание (возводимое в степень число)
     * @param b показатель степени
     * @return возведенное в степень число
     */
    double exp (double a, int b);

    /**
     * Получить модуль числа
     * @param a дробное число
     * @return модуль числа
     */
    double mod (double a);

    /**
     * Вычислить квадратный корень из числа
     * @param a дробное число
     * @return квадратный корень
     */
    double squareRoot (double a);
}
