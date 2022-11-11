package additional.strings;

import java.util.*;

public class StringsConverter {

    private static final String [] FROM_ONE_TO_TWENTY = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
            "восемнадцать", "девятнадцать"};
    private static final String [] DOZENS = {"", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят",
            "девяносто"};
    private static final String [] HUNDREDS = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот",
            "девятьсот"};

    /**
     * Получить строку, содержащую конвертацию числового аргумента (от -999_999_999 до 999_999_999) в число прописью
     * @param number число, которое необходимо конвертировать
     * @return строка - число прописью
     */
    public static String toString (int number) {

        ArrayList <String> resultList = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        int category = 0;
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

        textNumbers [0] = FROM_ONE_TO_TWENTY;
        textNumbers [1] = DOZENS;
        textNumbers [2] = HUNDREDS;

        while (number != 0) {

            if (category == 1) {
                if (number % 10 == 1) {
                    resultList.add("тысяча");
                } else if ((number % 10 >= 2) && (number % 10 <=4)) {
                    resultList.add("тысячи");
                } else {
                    resultList.add("тысяч");
                }
                isThousand = true;
            }

            if (category == 2) {
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
            category++;
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
        int category = 0;
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

        textNumbers [0] = FROM_ONE_TO_TWENTY;
        textNumbers [1] = DOZENS;
        textNumbers [2] = HUNDREDS;

        while (longNumber != 0) {

            if (category == 0) {
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

            if (category == 1) {
                if (longNumber % 10 == 1) {
                    resultList.add("целая");
                } else {
                    resultList.add("целых");
                }
                isFeminine = true;
            }

            if (category == 2) {
                if (longNumber % 10 == 1) {
                    resultList.add("тысяча");
                } else if ((longNumber % 10 >= 2) && (longNumber % 10 <=4)) {
                    resultList.add("тысячи");
                } else {
                    resultList.add("тысяч");
                }
                isFeminine = true;
            }

            if (category == 3) {
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
            category++;
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
     * Посчитать количество прошедших недель по переданному числу дней
     * @param day число дней
     * @return количество недель
     */
    public static String toWeek (int day) {

        String str;

        int weeks = day/7;

        if (weeks % 10 == 1) {
            str = (weeks + " неделя");
        } else if ((weeks % 10 >= 2) && (weeks % 10 <=4)) {
            str = (weeks + " недели");
        } else {
            str = (weeks + " недель");
        }

        return str;
}

    /**
     * Конвертировать переданные миллисекунды в количество часов, минут, секунд и миллисекунд
     * @param millisecond количество миллисекунд
     * @param shortFormat булево значение, определяющее формат конвертации:
     *                    HH:mm:ss.SSS для true
     *                    прописной формат для false.
     * @return строка, содержащая результат конвертации
     */
    public static String toHoursMinuteSecondMillisecond (long millisecond, boolean shortFormat) {

        String str;
        StringBuilder builder = new StringBuilder();

        long hours = millisecond/3_600_000;
        millisecond -= hours * 3_600_000;
        int minutes = (int) millisecond/60_000;
        millisecond -= minutes * 60_000;
        int seconds = (int) millisecond/1_000;
        millisecond -= seconds * 1_000;
        int millis = (int) millisecond;

        if (shortFormat) {
            str = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, millis);
        } else {

            builder.append(hours).append(" ");
            if (hours % 10 == 1) {
                builder.append ("час");
            } else if ((hours % 10 >= 2) && (hours % 10 <= 4)) {
                builder.append("часа");
            } else {
                builder.append ("часов");
            }
            builder.append(" ");

            builder.append(minutes).append(" ");
            if (minutes % 10 == 1) {
                builder.append ("минута");
            } else if ((minutes % 10 >= 2) && (minutes % 10 <= 4)) {
                builder.append("минуты");
            } else {
                builder.append ("минут");
            }
            builder.append(" ");

            builder.append(seconds).append(" ");
            if (seconds % 10 == 1) {
                builder.append ("секунда");
            } else if ((seconds % 10 >= 2) && (seconds % 10 <= 4)) {
                builder.append("секунды");
            } else {
                builder.append ("секунд");
            }
            builder.append(" ");

            builder.append(millis).append(" ");
            if (millis % 10 == 1) {
                builder.append ("миллисекунда");
            } else if ((millis % 100 >= 11) && (millis % 100 <= 19)){
                builder.append ("миллисекунд");
            } else if ((millis % 10 >= 2) && (millis % 10 <= 4)) {
                builder.append("миллисекунды");
            } else {
                builder.append ("миллисекунд");
            }

            str = builder.toString();
        }
       return str;
    }
}