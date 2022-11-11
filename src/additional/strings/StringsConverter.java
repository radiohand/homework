package additional.strings;

import java.util.ArrayList;
import java.util.Collections;

public class StringsConverter {

    /**
     * Получить строку, содержащую конвертацию числового аргумента (от -999_999_999 до 999_999_999) в число прописью
     * @param number число, которое необходимо конвертировать
     * @return строка - число прописью
     */
    public static String toString (int number) {

        ArrayList <String> resultList = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        int trio = 0;
        boolean isThousand = false;
        boolean isNegative = false;
        String resultString;

        if (number > 999_999_999 || number < -999_999_999) {
            System.out.println("Ошибка! Введите число из допустимого диапазона");
            return "BIG_NUMBER_ERROR";
        }

        if (number == 0) {
            return "Ноль";
        }

        if (number < 0) {
            isNegative = true;
            number *= (-1);
        }

        String [][] textNumbers = new String[3][];

        textNumbers [0] = new String[] {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
                "восемнадцать", "девятнадцать"};
        textNumbers [1] = new String[] {"", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят",
                "девяносто"};
        textNumbers [2] = new String[] {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот",
                "девятьсот"};

        while (number != 0) {

            if (trio == 1) {
                if (number % 10 == 1) {
                    resultList.add("тысяча");
                } else if ((number % 10 >= 2) && (number % 10 <=4)) {
                    resultList.add("тысячи");
                } else {
                    resultList.add("тысяч");
                }
                isThousand = true;
            }

            if (trio == 2) {
                if (number % 10 == 1) {
                    resultList.add("миллион");
                } else if ((number % 10 >= 2) && (number % 10 <=4)) {
                    resultList.add("миллиона");
                } else {
                    resultList.add("миллионов");
                }
            }

            for (int i = 0; i < 3; i++) {

                if (number % 10 == 0) {
                    number /= 10;
                    continue;
                }

                if (i == 0 && ((number % 100 > 9) && (number % 100 < 20))) {
                    resultList.add(textNumbers [i][(number % 100)-1]);
                    number /= 100;
                    i++;
                } else if (i == 0 && (isThousand && (number % 10 == 1))) {
                        resultList.add("одна");
                        number /= 10;
                    } else if (i == 0 && (isThousand && (number % 10 == 2))) {
                        resultList.add("две");
                        number /= 10;
                    } else {
                    resultList.add(textNumbers [i][(number % 10)-1]);
                    number /= 10;
                }
                if (number == 0) {break;}
            }
            isThousand = false;
            trio++;
        }

        if (isNegative) {
            resultList.add ("Минус");
        }

        Collections.reverse(resultList);

        for (String s : resultList) {
            builder.append(s).append(" ");
        }

        resultString = builder.toString();

        return resultString.substring(0,1).toUpperCase() + resultString.substring(1);
    }

    /**
     * Получить строку, содержащую конвертацию числового аргумента (от -999_999_999,99 до 999_999_999,99) в число прописью
     * @param number число, которое необходимо конвертировать
     * @return строка - число прописью
     */
    public static String toString(double number) {
        ArrayList <String> resultList = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        long longNumber;
        int trio = 0;
        boolean isFeminine = false;
        boolean isHundredths = false;
        boolean isNegative = false;
        String resultString;

        if (number > 999_999_999.99 || number < -999_999_999.99) {
            System.out.println("Ошибка! Введите число из допустимого диапазона");
            return "BIG_NUMBER_ERROR";
        }

        if (number == 0) {
            return "Ноль";
        }

        longNumber = (long) (number * 100);

        if (longNumber < 0) {
            isNegative = true;
            longNumber *= (-1);
        }

        String [][] textNumbers = new String[3][];

        textNumbers [0] = new String[] {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
                "восемнадцать", "девятнадцать"};
        textNumbers [1] = new String[] {"", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят",
                "девяносто"};
        textNumbers [2] = new String[] {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот",
                "девятьсот"};

        while (longNumber != 0) {

            if (trio == 0) {
                if (longNumber % 100 == 0) {
                    resultList.add("ноль сотых");
                } else if (longNumber % 10 == 1) {
                    resultList.add("сотая");
                } else {
                    resultList.add("сотых");
                }
                isHundredths = true;
                isFeminine = true;
            }

            if (trio == 1) {
                if (longNumber % 10 == 1) {
                    resultList.add("целая");
                } else {
                    resultList.add("целых");
                }
                isFeminine = true;
            }

            if (trio == 2) {
                if (longNumber % 10 == 1) {
                    resultList.add("тысяча");
                } else if ((longNumber % 10 >= 2) && (longNumber % 10 <=4)) {
                    resultList.add("тысячи");
                } else {
                    resultList.add("тысяч");
                }
                isFeminine = true;
            }

            if (trio == 3) {
                if (longNumber % 10 == 1) {
                    resultList.add("миллион");
                } else if ((longNumber % 10 >= 2) && (longNumber % 10 <=4)) {
                    resultList.add("миллиона");
                } else {
                    resultList.add("миллионов");
                }
            }

            for (int i = 0; i < 3; i++) {

                if (isHundredths && i == 2) {continue;}

                if (longNumber % 10 == 0) {
                    longNumber /= 10;
                    continue;
                }

                if (i == 0 && ((longNumber % 100 > 9) && (longNumber % 100 < 20))) {
                    resultList.add(textNumbers [i][(int) (longNumber % 100)-1]);
                    longNumber /= 100;
                    i++;
                } else if (i == 0 && (isFeminine && (longNumber % 10 == 1))) {
                    resultList.add("одна");
                    longNumber /= 10;
                } else if (i == 0 && (isFeminine && (longNumber % 10 == 2))) {
                    resultList.add("две");
                    longNumber /= 10;
                } else {
                    resultList.add(textNumbers [i][(int) (longNumber % 10)-1]);
                    longNumber /= 10;
                }
                if (number == 0) {break;}
            }
            isFeminine = false;
            isHundredths = false;
            trio++;
        }

        if (isNegative) {
            resultList.add ("Минус");
        }

        Collections.reverse(resultList);

        for (String s : resultList) {
            builder.append(s).append(" ");
        }

        resultString = builder.toString();

        return resultString.substring(0,1).toUpperCase() + resultString.substring(1);
    }

    public static String toWeek (int day) { return "";}

    public static String toHoursMinuteSecondMillisecond (long millisecond, boolean shortFormat) { return "";}
}
