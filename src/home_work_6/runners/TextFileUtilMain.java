package home_work_6.runners;

import home_work_6.utils.TextFileUtils;

import java.io.File;
import java.util.*;

public class TextFileUtilMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        File textFile = new File("src/home_work_6/source/war_and_peace.txt");
        System.out.println("Количество уникальных слов:" + TextFileUtils.fileToSet(set, textFile));

        System.out.println("Введите размер выборки самых используемых слов:");
        int topSize = scanner.nextInt();

        List<Map.Entry<String, Integer>> list = TextFileUtils.findTopOfWords(textFile, topSize);
        System.out.println("Топ " + list.size() + " слов по использованию:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Слово '" + entry.getKey() + "' используется в тексте " + entry.getValue() + " раз.");
        }
    }
}
