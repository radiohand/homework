package additional.collections.comparators;

import additional.collections.dto.Animal;

import java.util.Comparator;

public class AnimalsAgeComparator implements Comparator <Animal>{
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
