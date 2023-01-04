package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        return search(text, word, 0);
    }

    public long search (String text, String word, int flag) {
        long counter = 0;
        //Pattern pattern = Pattern.compile("\\b(" + word + ")\\b", flag);
        Pattern pattern = Pattern.compile("(^|[^\\p{L}\\p{Mn}\\p{Nd}\\p{Pc}-]|(\\s-))(" +
                word +
                ")($|[^\\p{L}\\p{Mn}\\p{Nd}\\p{Pc}-])",
                flag);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            counter++;
            while (matcher.find(matcher.end()-1)) {
                counter++;
            }
        }
        return counter;
    }
}
