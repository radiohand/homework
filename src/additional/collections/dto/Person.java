package additional.collections.dto;

public class Person implements Comparable<Person> {
    private final String nick;
    private final String password;
    private final String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Peron: " + name +
                ", with nickname: " + nick +
                ". Password " + password;
    }

    @Override
    public int compareTo(Person o) {
        int compareResult = Integer.compare(this.password.length(), o.getPassword().length());
        if (compareResult == 0) {
            return this.nick.compareTo(o.getNick());
        }
        return compareResult;
    }
}