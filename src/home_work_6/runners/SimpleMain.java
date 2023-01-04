package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.searchers.SearchEngineCaseNormalizer;
import home_work_6.searchers.SearchEngineIgnoreCase;
import home_work_6.searchers.SearchEnginePunctuationNormalizer;
import home_work_6.searchers.EasySearch;
import home_work_6.utils.TextFileUtils;
import home_work_6.searchers.RegExSearch;

import java.io.File;

public class SimpleMain {
    public static void main(String[] args) {

        File textFile = new File ("src/home_work_6/source/war_and_peace.txt");

        String textFromFile = TextFileUtils.fileToString(textFile);

        String [] words = new String[] {"война", "и", "мир"};

// обычный поиск с использованием EasySearch
        printCount(new EasySearch(), textFromFile, words);
// обычный поиск с использованием RegExSearch
        printCount(new RegExSearch(), textFromFile, words);
// обычный поиск c удалением лишних символов и использованием EasySearch
        SearchEnginePunctuationNormalizer punctuationNormalizerSearcherEasy
                = new SearchEnginePunctuationNormalizer(new EasySearch());
        printCount(punctuationNormalizerSearcherEasy, textFromFile, words);
// обычный поиск c удалением лишних символов и использованием RegExSearch
        SearchEnginePunctuationNormalizer punctuationNormalizerSearcherRegex =
                new SearchEnginePunctuationNormalizer(new RegExSearch());
        printCount(punctuationNormalizerSearcherRegex, textFromFile, words);

// поиск без учета регистра с использованием SearchEngineIgnoreCase и EasySearch
        SearchEngineIgnoreCase ignoreCaseSearchEasy = new SearchEngineIgnoreCase(new EasySearch());
        printCount(ignoreCaseSearchEasy, textFromFile, words);
// поиск без учета регистра с использованием SearchEngineIgnoreCase и RegExSearch
        SearchEngineIgnoreCase ignoreCaseSearchRegex = new SearchEngineIgnoreCase(new RegExSearch());
        printCount(ignoreCaseSearchRegex, textFromFile, words);

// поиск без учета падежа с использованием SearchEngineCaseNormalizer и EasySearch
        SearchEngineCaseNormalizer caseNormalizerSearchEasy =
                new SearchEngineCaseNormalizer(new EasySearch(), SearchEngineCaseNormalizer.NOMINATIVE_CASE);
        printCount(caseNormalizerSearchEasy, textFromFile, words);
// поиск без учета падежа с использованием SearchEngineCaseNormalizer и RegExSearch
        SearchEngineCaseNormalizer caseNormalizerSearchRegex =
                new SearchEngineCaseNormalizer(new RegExSearch(), SearchEngineCaseNormalizer.NOMINATIVE_CASE);
        printCount(caseNormalizerSearchRegex, textFromFile, words);
    }

    private static void printCount (ISearchEngine searcher, String text, String[] searchedWords) {
        System.out.println("Используется класс " + searcher.getClass());
        for (String searchedWord : searchedWords) {
            System.out.println("Слово '" + searchedWord + "' встречается в тесте " + searcher.search(text, searchedWord) + " раз");
        }
    }
}