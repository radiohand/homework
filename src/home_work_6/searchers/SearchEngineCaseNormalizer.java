package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    public static final int NOMINATIVE_CASE = 1;
    public static final int GENITIVE_CASE = 2;
    public static final int DATIVE_CASE = 3;
    public static final int ACCUSATIVE_CASE = 4;
    public static final int INSTRUMENTAL_CASE = 5;
    public static final int PREPOSITIONAL_CASE = 6;

    private final ISearchEngine searchEngine;
    private final String [] specificCaseEndings;

    private static final HashMap <Integer, String[]> everyCaseEndings = new HashMap<>();
    static {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/home_work_6/source/endingsOfCases"))) {
            everyCaseEndings.put(1, reader.readLine().split("\\s"));
            everyCaseEndings.put(2, reader.readLine().split("\\s"));
            everyCaseEndings.put(3, reader.readLine().split("\\s"));
            everyCaseEndings.put(4, reader.readLine().split("\\s"));
            everyCaseEndings.put(5, reader.readLine().split("\\s"));
            everyCaseEndings.put(6, reader.readLine().split("\\s"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine, int caseOfWord) {
        this.searchEngine = searchEngine;
        this.specificCaseEndings = Arrays.copyOf (everyCaseEndings.get(caseOfWord), everyCaseEndings.get(caseOfWord).length);
    }

    @Override
    public long search(String text, String word) {

        long counter = 0;

        for (String ending : specificCaseEndings) {
            if (word.length()>1 && word.endsWith(ending)) {
                word = word.substring(0, word.lastIndexOf(ending));
                break;
            }
        }

        for (int i = 1; i <= 6; i++) {
            for (String ending : everyCaseEndings.get(i)) {
                counter += searchEngine.search(text, word+ending);
            }
        }
        counter += searchEngine.search(text, word);

        return counter;
    }
}