package home_work_6.runners;

import home_work_6.utils.TextFileUtils;

import java.io.File;
import java.util.*;

public class TextFileUtilMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        File textFile = new File("src/home_work_6/source/war_and_peace.txt");
        System.out.println("Количество уникальных слов:");
        System.out.println(TextFileUtils.fileToSet(set, textFile));

        List<Map.Entry<String, Integer>> list = TextFileUtils.findTopOfWords(textFile, 10);
        System.out.println("Топ слов по использованию:");
        System.out.println(list);
    }
}
