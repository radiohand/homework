package home_work_4.home_work_1;

import home_work_1.MathExperiment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class MathExperimentTest {
    @Test
    @Tag("findPI")
    @DisplayName("Проверка соответствия полученного числа пи константе")
    public void testPI () {
        Assertions.assertTrue(MathExperiment.findPI(34)> Math.PI - 1E-10);
        Assertions.assertTrue(MathExperiment.findPI(34)< Math.PI + 1E-10);
    }

    @Test
    @Tag("getVolume")
    @DisplayName("Проверка рассчитанного объема")
    public void testVolume () {
        double pi = MathExperiment.findPI(34);
        Assertions.assertTrue(MathExperiment.getVolume(7, pi)> 1436.755040241732 - 1E-10);
        Assertions.assertTrue(MathExperiment.getVolume(7, pi)> 1436.755040241732 + 1E-10);
    }
}
