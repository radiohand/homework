package home_work_6.tests;

import home_work_6.api.ISearchEngine;
import home_work_6.searchers.RegExSearch;
import home_work_6.searchers.SearchEngineCaseNormalizer;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SearchEngineCaseNormalizerTest {

    String text = "вечера вечеров вечерам вечерами вечерах вече вечность вечерок";

    @ParameterizedTest (name = "Падеж: {0}; ищем слово: {1}")
    @MethodSource("searchEngineCaseNormalizerFabric")
    public void caseSingularTest (int caseFlag, String searchedWord) {
        ISearchEngine searcher = new SearchEngineCaseNormalizer(new RegExSearch(), caseFlag);
        Assertions.assertEquals(5, searcher.search(text, searchedWord));
    }

    public static Stream<Arguments> searchEngineCaseNormalizerFabric () {
        return Stream.of (
                Arguments.arguments(SearchEngineCaseNormalizer.NOMINATIVE_CASE, "вечер"),
                Arguments.arguments(SearchEngineCaseNormalizer.NOMINATIVE_CASE, "вечера"),
                Arguments.arguments(SearchEngineCaseNormalizer.GENITIVE_CASE, "вечера"),
                Arguments.arguments(SearchEngineCaseNormalizer.GENITIVE_CASE, "вечеров"),
                Arguments.arguments(SearchEngineCaseNormalizer.DATIVE_CASE, "вечеру"),
                Arguments.arguments(SearchEngineCaseNormalizer.DATIVE_CASE, "вечерам"),
                Arguments.arguments(SearchEngineCaseNormalizer.ACCUSATIVE_CASE, "вечер"),
                Arguments.arguments(SearchEngineCaseNormalizer.ACCUSATIVE_CASE, "вечера"),
                Arguments.arguments(SearchEngineCaseNormalizer.INSTRUMENTAL_CASE, "вечером"),
                Arguments.arguments(SearchEngineCaseNormalizer.INSTRUMENTAL_CASE, "вечерами"),
                Arguments.arguments(SearchEngineCaseNormalizer.PREPOSITIONAL_CASE, "вечере"),
                Arguments.arguments(SearchEngineCaseNormalizer.PREPOSITIONAL_CASE, "вечерах")
        );
    }
}
