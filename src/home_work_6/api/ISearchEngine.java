package home_work_6.api;

public interface ISearchEngine {
    /**
     * Вернуть информацию о количестве раз которое встречается слово в тексте.
     * @param text текст в котором ищем слово.
     * @param word слово, поиск которого осуществляется в text.
     * @return количество найденных word в text.
     */
    long search (String text, String word);
}
