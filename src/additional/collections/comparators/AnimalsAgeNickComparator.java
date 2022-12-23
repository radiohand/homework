package additional.collections.comparators;

import additional.collections.dto.Animal;

import java.util.Comparator;

public class AnimalsAgeNickComparator implements Comparator <Animal>{
    @Override
    public int compare(Animal a1, Animal a2) {
        int compareResult = Integer.compare(a1.getAge(), a2.getAge());
        if (compareResult == 0) {
            return a1.getNick().compareTo(a2.getNick());
        }
        return compareResult;
    }
}
