package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;

public class CalculatorStringExpressionMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorStringExpression calculator = new CalculatorStringExpression (new CalculatorWithOperator());

        System.out.println("Введите математическое выражение для расчета: ");

        String str = scanner.nextLine();

        System.out.println(str + " = " + calculator.getResult(str));
    }
}
