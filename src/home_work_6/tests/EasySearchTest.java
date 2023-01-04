package home_work_6.tests;

import home_work_6.searchers.EasySearch;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EasySearchTest extends SearchersAbstractTest{
    {this.searcher = new EasySearch();}
}