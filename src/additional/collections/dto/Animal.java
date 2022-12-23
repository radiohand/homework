package additional.collections.dto;

public class Animal implements Comparable<Animal> {
    private final int age;
    private final String nick;

    public Animal(String nick, int age) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int compareTo(Animal o) {
        int compareResult = Integer.compare(this.age, o.getAge());
        if (compareResult == 0) {
            return this.nick.compareTo(o.getNick());
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return "Animal: " + nick +
                ", age: " + age;
    }
}
