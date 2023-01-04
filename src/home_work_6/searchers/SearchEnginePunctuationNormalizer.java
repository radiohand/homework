package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private static final String PUNCTUATION_REGEX = "[\\s,.:;\n]";
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String [] strings = text.split(PUNCTUATION_REGEX);
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string).append(" ");
        }
        return searchEngine.search(builder.toString(), word);
    }
}
