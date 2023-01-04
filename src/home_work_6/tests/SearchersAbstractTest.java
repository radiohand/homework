package home_work_6.tests;

import home_work_6.api.ISearchEngine;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class SearchersAbstractTest {
    ISearchEngine searcher;

    @Test
    @Order(1)
    public void example1Test () {
        String text = "привет, как дела!";
        Assertions.assertEquals(1, searcher.search(text, "привет"));
        Assertions.assertEquals(1, searcher.search(text, "как"));
        Assertions.assertEquals(1, searcher.search(text, "дела"));
    }

    @Test
    @Order(2)
    public void example2Test () {
        String text = "привет,какдела!";
        Assertions.assertEquals(1, searcher.search(text, "привет"));
        Assertions.assertEquals(0, searcher.search(text, "как"));
        Assertions.assertEquals(0, searcher.search(text, "дела"));
        Assertions.assertEquals(1, searcher.search(text, "какдела"));
    }

    @Test
    @Order(3)
    public void example3Test () {
        String text = "привет;какдела!";
        Assertions.assertEquals(1, searcher.search(text, "привет"));
        Assertions.assertEquals(0, searcher.search(text, "как"));
        Assertions.assertEquals(0, searcher.search(text, "дела"));
        Assertions.assertEquals(1, searcher.search(text, "какдела"));
    }

    @Test
    @Order(4)
    public void example4Test () {
        String text = "как дела!.Что делаешь?";
        Assertions.assertEquals(1, searcher.search(text, "как"));
        Assertions.assertEquals(1, searcher.search(text, "дела"));
        Assertions.assertEquals(1, searcher.search(text, "Что"));
        Assertions.assertEquals(1, searcher.search(text, "делаешь"));

    }

    @Test
    @Order(5)
    public void example5Test () {
        String text = "Привет-привет";
        Assertions.assertEquals(1, searcher.search(text, "Привет-привет"));
        Assertions.assertEquals(0, searcher.search(text, "привет"));
        Assertions.assertEquals(0, searcher.search(text, "Привет"));
    }

    @Test
    @Order(6)
    public void example6Test () {
        String text = "Привет -привет";
        Assertions.assertEquals(0, searcher.search(text, "Привет-привет"));
        Assertions.assertEquals(1, searcher.search(text, "привет"));
        Assertions.assertEquals(1, searcher.search(text, "Привет"));
    }

    @Test
    @Order(7)
    public void example7Test () {
        String text = "4-х";
        Assertions.assertEquals(1, searcher.search(text, "4-х"));
        Assertions.assertEquals(0, searcher.search(text, "4"));
        Assertions.assertEquals(0, searcher.search(text, "х"));
    }

    @Test
    @Order(8)
    public void example8Test () {
        String text = "один и 1";
        Assertions.assertEquals(1, searcher.search(text, "один"));
        Assertions.assertEquals(1, searcher.search(text, "и"));
        Assertions.assertEquals(1, searcher.search(text, "1"));
    }

    @Test
    @Order(9)
    public void example9Test () {
        String text = "бабушка бабушке бабушку";
        Assertions.assertEquals(1, searcher.search(text, "бабушка"));
        Assertions.assertEquals(1, searcher.search(text, "бабушке"));
        Assertions.assertEquals(1, searcher.search(text, "бабушку"));
    }

    @Test
    @Order(10)
    public void casesTest1 () {
        String text = "Привет привет Привет";
        Assertions.assertEquals(2, searcher.search(text, "Привет"));
    }

    @Test
    @Order(11)
    public void casesTest2 () {
        String text = "Привет привет Привет";
        Assertions.assertEquals(1, searcher.search(text, "привет"));
    }

    @Test
    @Order(12)
    public void casesTest3 () {
        String text = "привет привет привет";
        Assertions.assertEquals(0, searcher.search(text, "Привет"));
    }

    @Test
    @Order(13)
    public void withDigitsTest () {
        String text = "Привет10";
        Assertions.assertEquals(0, searcher.search(text, "Привет"));
        Assertions.assertEquals(1, searcher.search(text, "Привет10"));
    }

    @Test
    @Order(14)
    public void withSymbolsTest () {
        String text = "!!!При^№%вет&&&;;;";
        Assertions.assertEquals(0, searcher.search(text, "Привет"));
        Assertions.assertEquals(1, searcher.search(text, "При"));
        Assertions.assertEquals(1, searcher.search(text, "вет"));
    }
}
