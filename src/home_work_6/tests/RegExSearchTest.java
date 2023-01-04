package home_work_6.tests;

import home_work_6.searchers.RegExSearch;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegExSearchTest extends SearchersAbstractTest {
    {this.searcher = new RegExSearch();}
}
