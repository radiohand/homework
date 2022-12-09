package home_work_5.comparators;

import home_work_5.elements.Alien;

import java.util.Comparator;

public class AliensComparator implements Comparator <Alien> {
    @Override
    public int compare(Alien o1, Alien o2) {
        return Integer.compare (o1.getHeadSizeInMillimeters(), o2.getHeadSizeInMillimeters());
    }
}
