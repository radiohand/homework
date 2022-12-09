package home_work_5.elements;

import java.util.Objects;

public class Alien implements Comparable <Alien> {

    private final int headSizeInMillimeters;

    private final String alienName;

    public Alien(int headSizeInMillimeters, String alienName) {
        this.headSizeInMillimeters = headSizeInMillimeters;
        this.alienName = alienName;
    }

    public Alien (String alienName) {
        this.alienName = alienName;
        this.headSizeInMillimeters = 0;
    }

    public String getAlienName() {
        return alienName;
    }

    public int getHeadSizeInMillimeters() {
        return headSizeInMillimeters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return Objects.equals(alienName, alien.alienName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alienName);
    }

    @Override
    public String toString() {
        return "Alien{" +
                "headSizeInMillimeters=" + headSizeInMillimeters +
                ", alienName='" + alienName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Alien o) {
        return this.alienName.compareTo(o.alienName);
    }
}
