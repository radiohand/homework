package home_work_1;

public class OperatorPriority {
    public static final int a = 8;
    public static final int b = 2;

    public static void main(String[] args) {

        System.out.println("Результаты выполнения операций: " + "\n 1: " + firstOperation() +
                "\n 2: " + secondOperation() + "\n 3: " + thirdOperation(b) + "\n 4: " + fourthOperation(a, b) +
                "\n 5: " + fifthOperation(a, b) +
                "\n 6: " + sixthOperation (a, b) + "\n 7: ошибка" +
                "\n 8: " + eighthOperation() + "\n 9: " + ninthOperation());
    }

    public static int firstOperation () {
        return 5 + 2 / 8;
        /* У деления приоритет: 2/8=0.25; затем сложени: 5+0.25=5.25;
        int сохраняет только целую часть - результат 5.*/
    }

    public static int secondOperation () {
        return (5 + 2) / 8;
        /* У операции в скобках приоритет: 5+2=7; далее деление: 7/8=0.875;
        int сохраняет только целую часть - результат 0.*/
    }

    public static int thirdOperation (int b) {
        return (5 + b++) /8;
        /* У операции в скобках приоритет: постинкремент сначала возвращает значение,
        затем инкрементирует, следовательно, в скобках получаем: 5+2=7; далее аналогично пред.выражению - результат 0 */
    }

    public static int fourthOperation (int a, int b) {
        return (5 + b++) / --a;
        /* У операции в скобках приоритет: постинкремент сначала возвращает значение,
        затем инкрементирует, следовательно, в скобках 7;
        преддекремент сначала декрементирует, затем возвращает значение, результат: 7/7 = 1 */
    }

    public static int fifthOperation (int a, int b) {
        return (5 * 2 >> b++) / --a;
       /* Сначала скобки: b++ возвращает 2, затем умножение: 5*2=10,
        потом сдвиг битов 10 (1010) на 2 позиции вправо - 2 (0010);
        преддекремент сначала декрементирует, затем возвращает значение, результат - 2/7 = 0 (int) */
    }

    public static int sixthOperation (int a, int b) {
        return (5 + 7 > 20 ? 68 : 22 * 2 >> b++);
       /* b++ возвращает 2; затем умножение: 22*2=44;
        потом сложение: 5+7=12; потом сдвиг битов: 44 (101100) >> 2 = 11 (1011); затем сравнение 12>20 возвр. false;
        выполняется выражение соответствующее ложному условию тернарного оператора, значит результат 11 */
    }

    /*public static boolean seventhOperation (int a, int b) {
        return (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a;
        // Вызывает ошибку при попытке использования объекта в качестве делимого в операции деления на примитивный тип
        // (при выполнении условия тернарного оператора возвращается boolean, при невыполнении - int)
    }*/

    public static boolean eighthOperation () {
        return 6 - 2 > 3 && 12 * 12 <= 119;
        /*результат false, т.к. условие (неравенство) в правой части
        условия возвращает false, а для получения значения true при использовании оператора логического И, обе части
        условия должны возвращать true. */
    }

    public static boolean ninthOperation () {
        return true && false;
        // результат false, т.к. правая часть условия - false.
    }

}
