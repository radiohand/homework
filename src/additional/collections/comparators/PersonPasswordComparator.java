package additional.collections.comparators;

import additional.collections.dto.Person;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator <Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getPassword().length(), p2.getPassword().length());
    }
}
