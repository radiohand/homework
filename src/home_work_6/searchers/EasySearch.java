package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {

        int wordLength = word.length();
        long counter = 0;
        int nextIndex = 0;

        while ((nextIndex = text.indexOf(word, nextIndex)) >= 0) {
            if (nextIndex != 0) {
                if (Character.isLetterOrDigit(text.charAt(nextIndex - 1)) ||
                        (text.charAt(nextIndex - 1) == '-' && text.charAt(nextIndex - 2) != ' ')) {
                    nextIndex += wordLength;
                    continue;
                }
            }

            nextIndex += wordLength;

            if (nextIndex < text.length()) {
                if (Character.isLetterOrDigit(text.charAt(nextIndex)) || text.charAt(nextIndex) == '-') {
                    continue;
                }
            }
            counter++;
        }
        return counter;
    }
}