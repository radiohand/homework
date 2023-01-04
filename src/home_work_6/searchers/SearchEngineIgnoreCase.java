package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

import java.util.Locale;
import java.util.regex.Pattern;

public class SearchEngineIgnoreCase implements ISearchEngine{
    private ISearchEngine searchEngine;

    public SearchEngineIgnoreCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return ((RegExSearch) searchEngine).search(text, word, Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        } else  {
            String inLowerCaseText = text.toLowerCase(Locale.ROOT);
            String inLowerCaseWord = word.toLowerCase(Locale.ROOT);
            return searchEngine.search(inLowerCaseText, inLowerCaseWord);
        }
    }
}
