package home_work_6.utils;

import java.io.*;
import java.util.*;

public class TextFileUtils {

    private static final String SPLIT_REGEX = "(^|[^\\p{L}\\p{Mn}\\p{Nd}\\p{Pc}-]|(--)|(\\s-)|$)+";

    /**
     * Заполнить множество словами из переданного файла, вернуть количество уникальных слов
     * @param set заполняемое множество
     * @param textFile файл, слова из которого используются для заполнения множества
     * @return количество уникальных слов
     */

    public static int fileToSet (Set<String> set, File textFile) {

        set.addAll(Arrays.asList(fileToString(textFile).split(SPLIT_REGEX)));

        return set.size();
    }

    /**
     * Получить рейтинг по количеству использований,с заданным размером, связок слово-количество использований.
     * @param textFile файл, слова из которого используются для составления рейтинга
     * @param topSize количество связок, которое нужно получить
     * @return список Map.Entry, представляющий топ связок слово-количество
     */
    public static List <Map.Entry<String, Integer>> findTopOfWords (File textFile, int topSize) {

        Map <String, Integer> map = new HashMap<>();

        String [] arrayOfWords = fileToString(textFile).split(SPLIT_REGEX);

        for (String word : arrayOfWords) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word)+1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new EntryIntegerValueComparator());
        Collections.reverse(list);

        return list.subList(0, topSize);
    }

    /**
     * Преобразовать текстовое содержимое переданного файла в строку
     * @param textFile файл для обработки
     * @return строка с текстом из файла
     */
    public static String fileToString (File textFile) {

        StringBuilder builder = new StringBuilder();
        String nextLine;

        try (BufferedReader fileReader = new BufferedReader(new FileReader (textFile))) {
            while ((nextLine = fileReader.readLine()) != null) {
                builder.append(nextLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    /**
     * Comparator, реализующий сравнение Map.Entry по значению
     */
    private static class EntryIntegerValueComparator implements Comparator <Map.Entry<?, Integer>> {
        @Override
        public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
            return Integer.compare(o1.getValue(), o2.getValue());
        }
    }
}