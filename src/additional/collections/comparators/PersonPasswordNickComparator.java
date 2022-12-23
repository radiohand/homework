package additional.collections.comparators;

import additional.collections.dto.Person;

import java.util.Comparator;

public class PersonPasswordNickComparator implements Comparator <Person>{
    @Override
    public int compare(Person p1, Person p2) {
        int compareResult = Integer.compare(p1.getPassword().length(), p2.getPassword().length());
        if (compareResult == 0) {
            return p1.getNick().compareTo(p2.getNick());
        }
        return compareResult;
    }
}
