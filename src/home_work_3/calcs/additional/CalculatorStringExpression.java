package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.ArrayList;

public class CalculatorStringExpression {

    private String stringToParse;
    private final ArrayList <String> units = new ArrayList<>();
    private final ICalculator calculator;
    public CalculatorStringExpression (ICalculator calculator) {
        this.calculator = calculator;
    }

     /**
     * Инициализировать поле stringToParse строкой, принимаемой в качестве аргумента к методу.
     * Инициировать выполнение всех необходимых проверок на валидность исходных данных,
     * для валидных данных произвести расчет, вернуть результат типа double.
     * При выявлении невалидных данных, вывести в консоль сообщение об ошибке, вернуть число 0 (double).
     * @param str строка, содержащая математическое выражение для расчета.
     * @return результат, либо Double.NaN.
     */
    public double getResult (String str) {

        stringToParse = str;
        double result;

        stringToList();

        if (checkString() && checkList()) {
            result = Double.parseDouble(calculate(units));
        } else {result = Double.NaN;}
        units.clear();
        return result;
    }

    /**
     * Проверить не содержит ли строка stringToParse невалидных символов, непарных скобок, или символов модуля.
     * @return true, если проверка пройдена; иначе - false.
     * При выявлении несоответствия выводится сообщение в консоль.
     */
    private boolean checkString () {

        int bracketCounter = 0;
        int modCounter = 0;

        if (!stringToParse.matches("[ EPI0-9.^|()*/+-]+")) {
            System.out.println("Ошибка! В выражении присутствуют недопустимые символы!");
            return false;
        }

        for (int i = 0; i < stringToParse.length(); i++) {
            if (stringToParse.charAt(i) == '(' || stringToParse.charAt(i) == ')') {bracketCounter++;}
            if (stringToParse.charAt(i) == '|') {modCounter++;}
            }

        if (bracketCounter%2 != 0) {
            System.out.println("Ошибка! В выражении присутствуют незакрытые скобки!");
            return false;
        }

        if (modCounter%2 != 0) {
            System.out.println("Ошибка! В выражении присутствуют незакрытые модули!");
            return false;
        }
        return true;
    }

    /**
     * Проверить не содержит ли список units идущих подряд чисел или операторов,
     * операторов открывающих, или закрывающих выражение.
     * @return true, если проверка пройдена; иначе - false.
     * При выявлении несоответствия выводится сообщение в консоль.
     */
    private boolean checkList () {
        int numCounter = 0;
        int operatorCounter = 0;

        for (String unit: units) {
            if (unit.matches("-?[EPI0-9.]+")) {
                operatorCounter = 0;
                numCounter ++;
            } else if (unit.matches("[-+*/^]")) {
                operatorCounter++;
                numCounter = 0;
            }

            if (numCounter > 1 || operatorCounter > 1) {
                System.out.println("Ошибка! Некорректный порядок операторов или операндов!");
                return false;
            }
        }

        if (units.get(0).matches("[-+*/^]") || units.get(units.size()-1).matches("[-+*/^]")) {
            System.out.println("Ошибка! Некорректный порядок операторов или операндов!");
            return false;
        }
        return true;
    }

    /**
     * Преобразовать строку, содержащуюся в поле stringToParse с математическим выражением в список,
     * состоящий из чисел, констант и операторов
     */
    private void  stringToList () {

        StringBuilder bufferString = new StringBuilder();

        char currentChar;

        for (int i = 0; i < stringToParse.length(); i++) {

            currentChar = stringToParse.charAt(i);

            if ((currentChar >= '0' && currentChar <= '9') || currentChar == '.'
                    || currentChar == 'P' || currentChar == 'I') {
                bufferString.append(stringToParse.charAt(i));
            } else {
                if (bufferString.length() > 0) {
                    units.add(bufferString.toString());
                    bufferString = new StringBuilder();
                } else if (currentChar == '-'){
                    bufferString.append(stringToParse.charAt(i));
                    continue;
                }

                if (stringToParse.charAt(i) == ' ') {continue;}
                units.add(String.valueOf(stringToParse.charAt(i)));
            }
        }
        if (bufferString.length() > 0) {
            units.add(bufferString.toString());
        }
    }

    /**
     * Посчитать математическое выражение переданное в виде списка
     * @param units список, содержащий члены и операторы математического выражения
     * @return строка, содержащая результат расчета
     */
    private String calculate (ArrayList <String> units) {

        do {
            handleConst(units);
            handleMod(units);
            handleBrackets(units);
            handleExp (units);
            handleMultiplication (units);
            handleDivide (units);
            handleAddition (units);
            handleSubtracting(units);
        } while (units.size() > 1);
        return units.get(0);
    }

    /**
     * Заменить текстовые обозначения констант в списке на числовые значения
     * @param list список, в котором производится замена
     */
    private void handleConst (ArrayList <String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("PI")) {
                list.set(i, Double.toString(Math.PI));
            }
            if (list.get(i).equals("E")) {
                list.set(i, Double.toString(Math.E));
            }
        }
    }

    /**
     * Заменить в переданном списке модульные выражения результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleMod (ArrayList <String> list) {

        ArrayList<String> subList = new ArrayList<>();

        double module;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("|")) {
                list.remove(i);
                while (i < list.size()) {
                    if (list.get(i).equals("|")) {
                        list.remove(i);
                        break;
                    }
                    subList.add(list.get(i));
                    list.remove(i);
                }
                module = calculator.mod(Double.parseDouble(calculate(subList)));
                list.add(i, Double.toString(module));
                subList.clear();
                i = 0;
            }
        }
    }

    /**
     * Заменить в переданном списке выражения в скобках результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleBrackets (ArrayList <String> list) {

        ArrayList<String> subList = new ArrayList<>();

        int bracketCounter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("(")) {
                bracketCounter++;
                list.remove(i);
                while (bracketCounter > 0) {
                    if (list.get(i).equals("(")) {
                        bracketCounter++;
                    }
                    if (list.get(i).equals(")")) {
                        if (bracketCounter == 1) {
                            list.remove(i);
                            bracketCounter--;
                            continue;
                        }
                        bracketCounter--;
                    }
                    subList.add(list.get(i));
                    list.remove(i);
                }
                list.add(i, calculate(subList));
                subList.clear();
                i = 0;
            }
        }
    }

    /**
     * Заменить в переданном списке операции возведения в степень результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleExp (ArrayList <String> list) {

        double result;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("^")) {
                result = calculator.exp(Double.parseDouble(list.get(i - 1)), Integer.parseInt(list.get(i + 1)));
                swap(list, Double.toString(result), i);
            }
        }
    }

    /**
     * Заменить в переданном списке операции умножения результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleMultiplication (ArrayList <String> list) {

        double result;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*")) {
                result = calculator.multiply(Double.parseDouble(list.get(i - 1)), Double.parseDouble(list.get(i + 1)));
                swap(list, Double.toString(result), i);
                i = 0;
            }
        }
    }

    /**
     * Заменить в переданном списке операции деления результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleDivide (ArrayList <String> list) {

        double result;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("/")) {
                result = calculator.divide(Double.parseDouble(list.get(i - 1)), Double.parseDouble(list.get(i + 1)));
                swap(list, Double.toString(result), i);
                i = 0;
            }
        }
    }

    /**
     * Заменить в переданном списке операции сложения результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleAddition (ArrayList <String> list) {

        double result;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
                result = calculator.add(Double.parseDouble(list.get(i - 1)), Double.parseDouble(list.get(i + 1)));
                swap(list, Double.toString(result), i);
            }
        }
    }

    /**
     * Заменить в переданном списке операции вычитания результатом их выполнения
     * @param list список, в котором производится замена
     */
    private void handleSubtracting (ArrayList <String> list) {

        double result;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("-")) {
                result = calculator.subtract(Double.parseDouble(list.get(i - 1)), Double.parseDouble(list.get(i + 1)));
                swap(list, Double.toString(result), i);
            }
        }
    }

    /**
     * Заменить элемент списка по заданному индексу, удалить предыдущий и следующий элементы
     * @param result значение, на которое нужно заменить
     * @param i индекс, по которому необходимо произвести замену
     */
    private void swap (ArrayList <String> list, String result, int i) {
        list.set(i, result);
        list.remove(i-1);
        list.remove(i);
    }
}