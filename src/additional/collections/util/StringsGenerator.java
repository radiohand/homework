package additional.collections.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class StringsGenerator {

    /**
     * Получить строку заданного размера из произвольных символов
     * @param length длина строки
     * @return рандомная строка
     */
    public String getStringUnicodeRandom(int length) {

        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            char nextChar = (char) rand.nextInt(Character.MAX_CODE_POINT);
            builder.append(nextChar);
        }

        return builder.toString();
    }

    /**
     * Получить строку заданного размера из букв в заданном диапазоне Unicode
     * @param alphabetStartSymbol первый символ промежутка
     * @param alphabetRange размер диапазона
     * @param length длина строки
     * @return рандомная строка из букв
     */
    public String getStringAlphabeticRandom(int alphabetStartSymbol, int alphabetRange, int length) {

        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            char nextChar = (char) (rand.nextInt(alphabetRange) + alphabetStartSymbol);
            if (!Character.isAlphabetic(nextChar)) {
                i--;
                continue;
            }
            builder.append(nextChar);
        }

        return builder.toString();
    }

    /**
     * Получить строку с рандомным индексом из переданного массива
     * @param strings принимаемый массив
     * @return строка из массива
     */
    public String getStringRandomFromArray(String [] strings) {

        Random rand = new Random();

        return strings [rand.nextInt(strings.length)];
    }

    /**
     * Получить строку с рандомным номером из переданного файла
     * @param file принимаемый файл
     * @return строка из файла
     */
    public String getStringRandomFromFile(File file) {

        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();

        try {
            String line;
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            while ((line = reader.readLine()) != null) {
                list.add(line);
            }

            reader.close();
        } catch (IOException e) {e.printStackTrace();}

        return list.get(random.nextInt(list.size()));
    }
}
