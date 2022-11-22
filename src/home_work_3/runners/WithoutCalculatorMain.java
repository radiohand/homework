package home_work_3.runners;

public class WithoutCalculatorMain {

    public static void main(String[] args) {

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        double result = a + b * c + Math.pow ((d / e), f); // 140.45999999999998

        System.out.println ("Результат: " + result);
    }
}
